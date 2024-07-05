# Introduction
Due to the third party software (ojdbc8) used in this application, to ensure that the compiled phase can be executed well,
here, the users shall install the JAR to the local repository. The installation command is:

```shell
mvn install:install-file -Dfile=/programs/Java-Oracle-Project/src/libs/ojdbc8-12.2.0.1.jar -DgroupId=com.oracle.database.jdbc -DartifactId=ojdbc8 -Dversion=12.2.0.1 -Dpackaging=jar
```

After users finished the setting above, users can use the following command to compile the codes.
```shell
mvn clean compile
```
Then the user can use the following command to run the main program
```shell
mvn exec:java -Dexec.mainClass="com.oracle.StartedEntry"
```