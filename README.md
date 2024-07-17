                                                          Serialization and Deserialization
What is Serialization? 

Serialization is the process of converting an object or data structure into a format that can be easily stored or transmitted. This format can be a binary format, a text format 
(such as JSON or XML), or any other suitable format. The primary purpose of serialization is to enable the storage of complex data structures in a way that they can be later 
recreated, or to allow for the data to be transmitted over a network.

What is Deserialization? 

Deserialization is the reverse process of serialization. It involves converting the serialized format back into a live object or data structure. This process allows for the 
reconstruction of the original data from the serialized format, making it usable again in its original form.

Importance of Serialization and Deserialization

Data Persistence: Serialization allows objects to be saved to a file or a database and later restored. This is useful for applications that need to maintain state between sessions.

Communication: In distributed systems, serialized objects can be transmitted over a network between different components of the system, even if they are written in different programming
languages.

Caching: Serialized objects can be stored in a cache to speed up repeated access to the same data.

Logging and Debugging: Serialized data can be logged for debugging purposes, providing a snapshot of the application's state at a particular moment.

Benefits of Serialization and Deserialization
1.	Data Persistence and Storage
•	Long-term Storage
•	Backup and Security
2.	Data Transmission
•	Interoperability
•	Network Communications
3.	Performance Optimization
•	Caching
•	Efficient Data Transfer
5.	Ease of Use and Development
•	Simplified Data Handling
•	Debugging and Logging
6.	Cross-Language and Cross-Platform Compatibility
•	Language-Agnostic Data Exchange
•	Platform Independence
7.	Security and Integrity
•	Data Integrity
•	Controlled Access
8.	Versioning and Extensibility
•	Backward and Forward Compatibility
•	Extensible Data Models
9.	Reduced Complexity
•	Simplified API Design
•	Automation

Explain the mechanism - 
Java uses serialization and deserialization to convert objects to a format that can be easily stored or transmitted and then reconstructed later. This mechanism is particularly useful 
when dealing with data storage, remote method invocation (RMI), and communication between different parts of a distributed system.

Serialization - 
Serialization is the process of converting an object into a stream of bytes that can be saved to a file, sent over a network, or stored in a database. In Java, this is achieved using 
the Serializable interface and classes like ObjectOutputStream. We can easily do this using JSON.

Deserialization - 
Deserialization is the process of reconstructing an object from a byte stream. In Java, this is done using classes like ObjectInputStream. We can easily do this using JSON.

*If using json, yasson dependency must be added.



