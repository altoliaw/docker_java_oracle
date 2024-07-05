# Introduction
Due to the third party software (ojdbc8) used in this application, to ensure that the compiled phase can be executed well,
here, the users shall install the JAR to the local repository. The installation command is:
```shell
mvn install:install-file -Dfile=/programs/Java-Oracle-Project/src/libs/ojdbc8-12.2.0.1.jar -DgroupId=com.oracle.database.jdbc -DartifactId=ojdbc8 -Dversion=12.2.0.1 -Dpackaging=jar
```
The command will do nothing when the JAR has already been installed in the local repository.
> Maven provides a immediate layer to distinguish between the JAR files and the project. When the project requires the package,
> the only way is to import by using the dependency declaration denoted in the **pom.xml**.

> If someone feels like removing the repository that install in the local repository, users shall remove the folders manually.
> The default path of the local repository is "**~/.m2repository**" or users can find the location denoted in the file, "**~/.m2/settings.xml**".

After users finished the setting above, users can use the following command to compile the codes.
```shell
mvn clean compile
```
Then the user can use the following command to run the main program
```shell
mvn exec:java -Dexec.mainClass="com.oracle.StartedEntry"
```

For decreasing the time to execute the project, here the editor add a shell script, namely **compile.sh**, to 
execute the commands mentioned previously. As a result, users can use the following command to compile and run the code.
```shell
./complie.sh
```