clear
# Versions, libs/ojdbc8-12.2.0.1.jar, libs/ojdbc7-12.1.0.2.jar
ojdbcVersion="libs/ojdbc6-11.2.0.4.jar"

if [[ "$1" = "-c" ]]
then
    # Removing the existing class files
    rm -rf app/*.class
else
    # Removing the existing class files
    rm -rf app/*.class

    # Compiling the files with the specified class path
    # javac -cp $ojdbcVersion app/StartedEntry.java

    # java -cp .:$ojdbcVersion app.StartedEntry
    # Compiling the files with the specified class path
    javac -cp $ojdbcVersion app/StartedEntryVersion6.java

    java -cp .:$ojdbcVersion app.StartedEntryVersion6

fi