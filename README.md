# Web application 
## How to use
- Git clone the whole project 
- Run the main to start Spring Boot server
- Open any browser to access localhost:8080/generate \
  -> keep refreshing to generate new JSON
#### Side note: 
In order to use previous code as Java library, we need to export as `.jar` file, then import to this new project. 
We also need to define the existence of the new `.jar` file in `pom.xml`.

## Jenkins pipeline
- Create a file, name it `Jenkinsfile`
- Pipeline script from SCM
- On Jenkins server, configure the Tools settings to set the path for MAVEN (or JDK).
