mvn install:install-file -Dfile=/programs/Java-Oracle-Project/src/libs/ojdbc8-12.2.0.1.jar -DgroupId=com.oracle.database.jdbc -DartifactId=ojdbc8 -Dversion=12.2.0.1 -Dpackaging=jar
mvn clean compile
mvn exec:java -Dexec.mainClass="com.oracle.StartedEntry"