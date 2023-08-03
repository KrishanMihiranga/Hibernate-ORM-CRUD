# Hibernate ORM Assignment

This is a Java project demonstrating the use of Hibernate ORM (Object-Relational Mapping) to manage  one-to-one, one-to-many, many-to-many relationship between entities `Author` and `Book`. The project uses JavaFX for the user interface to add, update, delete, and fetch authors and books from a MySQL database.

## Prerequisites

- Java 11
- MySQL database server
- Maven

## Setup

1. Clone the GitHub repository:

```bash
git clone https://github.com/KrishanMihiranga/Hibernate-ORM-CRUD.git
```


## Set up the MySQL database:
- Create a new database named book (you can choose a different name if desired).

## Configure the database connection:

- Open the src/main/resources/hibernate.cfg.xml file.
- Replace your_database_username and your_database_password with your MySQL database credentials.
- Make sure the JDBC URL is set to the correct database name and server.


## Important Notes
- The application assumes you have a MySQL database server running, and the credentials provided in hibernate.cfg.xml have appropriate permissions to create and modify the tables.

- The provided dependencies in the pom.xml file include JavaFX, MySQL connector, Lombok, and Hibernate. Make sure you have internet access to download the required dependencies.

- The project uses Lombok for automatic generation of getters, setters, constructors, and other boilerplate code. Ensure that your IDE has Lombok plugin installed to avoid any compilation issues.

- The project demonstrates a one-to-many relationship between Author and Book entities using Hibernate ORM. The entities are mapped to the database tables, and Hibernate handles the relationship between the entities automatically.

## Dependencies

```bash
 <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-controls</artifactId>
            <version>11.0.2</version>
        </dependency>

        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-fxml</artifactId>
            <version>11.0.2</version>
        </dependency>

        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.32</version>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.26</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.hibernate.orm</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>6.2.7.Final</version>
        </dependency>
```
