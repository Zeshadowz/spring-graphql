# GraphQL + H2 + Spring-boot Application

This Standalone Spring boot project demonstrates the crud operations on Tour services using H2 Database and GraphQL as
API.

## Requirements

or building and running the application you need:

- [JDK 21](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3.9.x](https://maven.apache.org) or later

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method
in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use
the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html)
like so:

```shell
mvn spring-boot:run
```

Once the application is running, you can access Graphiql under http://localhost:8080/graphiql

## Testing the Application

### Retrieve:

#### GraphQL Syntax

```graphql
query get_addresses{
    allAddresses{
        id
        street
        number
        zipcode
        city
        country
        addressType
    }
}
```

#### JSON Syntax

```json
{
  "query": "{authors{id name}}"
}
```

### Create Address

#### GraphQL Syntax

```graphql
mutation create_address{
    createAddress(address:{
        street: "Langenbergweg"
        # additional: "String"
        number: "2a"
        zipcode: "90785"
        city: "Fürth"
        # state: "String"
        country: "Deutschland"
        addressType: "WORK"
    }){
        id
        street
        number
        zipcode
        city
        country
    }
}
```

#### JSON Syntax

```json
{
  "query": "{authors{id name}}"
}
```