jetty-embedded
==============

Example of the use of embedded jetty REST server in an application
using dependency injection and Jackson for the serialization/deserialization.

1. Clone the repository
2. Go to the directory "jetty-embedded"
3. mvn clean package
4. mvn exec:java

Checks the request to server using curl:
`curl http://localhost:8090/things`
