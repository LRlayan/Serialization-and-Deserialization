package com.example.serializableanddeserializable.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonDTO implements Serializable {
    private String name;
    private String age;
    private String email;
    private String mobile;
}
