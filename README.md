<h1>Simple CRUD</h1>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
 ![Spring](https://img.shields.io/badge/Spring-6DB33F.svg?style=for-the-badge&logo=Spring&logoColor=white)
 ![Postgres](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
 
<p></p>This repository houses a simple CRUD project developed using Java, Spring Boot, and PostgreSQL as the database. It's designed to offer practice with all CRUD operations: Create, Read, Update, and Delete.</p>
<h2>Table of Contents</h2>
<ul>
  <li>Installation</li>
  <li>Configuration</li>
  <li>API Endpoints</li>
  <li>Database</li>
</ul>
<h2>Installation</h2>
<p>
  <ol>
    <li>Clone the repository:</li>
    
    $ git clone https://github.com/sthevenalves/java-spring-crud.git
    
   <li>Install dependencies with Maven</li>
  </ol>
</p>
<h2>Usage</h2>
<p>
  <ol>
    <li>Start the application with Maven</li>
    <li>The API will be accessible at http://localhost:8080/</li>
  </ol>
</p>
  <h2>API Endpoints</h2>
  <p>
    The API provides the following endpoints:
    
  GET / product - Retrieve a list of all data.

    [
        {
            "id": "93891579-3260-4295-b30b-1eee717b4220",
            "name": "camiseta",
            "prince_in_cents": 2000,
            "active": true
        }
    ]
    
  POST / product - Register a new data.
  
     {
        "name": "calça sarja",
        "prince_in_cents": 150000,
     }
        
  PUT / product - Alter data.

     {
        "id": "37be800c-f460-4460-b2a8-526d1bbf1c28",
        "name": "calça sarja",
        "prince_in_cents": 50000,
     }

  <br>
  
    DELETE / product / id - Delete data.
  
  </p>

  <h2>Database</h2>
  <p>
  The project utilizes PostgresSQL as the database. The necessary database migrations are managed using Flyway. <br>
  To [install PostgresSQL])(https://www.postgresql.org/download/) you can install here.
  </p>
