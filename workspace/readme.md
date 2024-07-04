# Introduction

To build the application for the ojdbc verification, here the editor use the following command to generate a new project, namely "**Java-Oracle-Project**" by maven. If the project already exists, the following command can not be used. This file is the history that the editor denoted.

> ```
> mvn archetype:generate -DgroupId=com.oracle -DartifactId=Java-Oracle-Project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
> ```

After generating the project, the architecture will be displayed as belows.
```plaintext
Java-Oracle-Project/
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── oracle
│   │               └── App.java
│   └── test
│       └── java
│           └── com
│               └── oracle
│                   └── AppTest.java
...
```
Next, the editor created the file in the location, '**src/main/java/com/oracle**', and all codes are implmented into the file, **StartedEntry.java**. When the file has been created already, the next **pom.xml** shoull be revised because of the usages of the depedencies. All insertions in the file can refer the definitions in the **pom.xml**.

# Compiling and Linking JARS by Using Maven Commands
Please refer to the readme.md in the project,[** Java-Oracle-Project**](Java-Oracle-Project/readme.md).