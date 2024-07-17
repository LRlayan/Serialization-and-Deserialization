package com.example.serializableanddeserializable.controller;

import java.io.*;

import com.example.serializableanddeserializable.dto.PersonDTO;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/person")
public class PersonController extends HttpServlet {

    @Override
    public void init() {

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Serializable
        PersonDTO personDTO = new PersonDTO("Ramesh","23","ramesh4@gmail.com","0765826895");
        Jsonb jsonb = JsonbBuilder.create();
        String person = jsonb.toJson(personDTO);
        response.getWriter().write(person.toString());
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
        if (!request.getContentType().toLowerCase().startsWith("application/json") || request.getContentType() == null){
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }

        //deserializable
        Jsonb jsonb = JsonbBuilder.create();
        PersonDTO personDTO = jsonb.fromJson(request.getReader(), PersonDTO.class);
        System.out.println(personDTO);
    }
}