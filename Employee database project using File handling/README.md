
# Employee database

Create a menu-based Java application with the following options:

1. Add an Employee

2. Display All

3. Exit

If option 1 is selected, the application should gather details of the employee like employee name, employee id, designation, and salary and store it in a file.

If option 2 is selected, the application should display all the employee details.

If option 3 is selected the application should exit.



## Features



Serialization:
- Serialization in Java is a mechanism of writing the state of an object into a byte-stream.
- It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.
- The reverse operation of serialization is called deserialization where byte-stream is converted into an object.
- The serialization and deserialization process is platform-independent, it means you can serialize an object in a platform and deserialize in different platform.
- For serializing the object, we call the  writeObject() method ObjectOutputStream, and for deserialization we call the readObject() method of ObjectInputStream class.

 java.io.Serializable interface:
- Serializable is a marker interface (has no data member and method).
- The String class and all the wrapper classes implement the java.io.Serializable interface by default.