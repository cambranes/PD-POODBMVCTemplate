# BDConnection
Completar las clases que sean necesarias para poder ejecutar el proyecto en local.


# BDInicialTest

A minimal Java 17 project using Maven and JUnit 5.

## Requirements
- JDK 17+
- Maven 3.8+

## Quick start

Build and run tests:

```sh
mvn -q -v
mvn -q clean test
```

Run the app:

```sh
mvn -q -DskipTests exec:java
```

Or run the compiled jar:

```sh
mvn -q -DskipTests package
java -jar target/bdinicialtest-0.0.1-SNAPSHOT.jar
```

## Project layout
- `src/main/java/com/example/App.java` — main application entry point
- `src/test/java/com/example/AppTest.java` — sample JUnit test
- `pom.xml` — Maven configuration
