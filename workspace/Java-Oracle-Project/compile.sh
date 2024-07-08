clear
# Versions, libs/ojdbc8-12.2.0.1.jar
ojdbcVersion="libs/ojdbc8-18.3.0.0.jar"

if [[ "$1" = "-c" ]]
then
    # Removing the existing class files
    rm -rf app/*.class
else
    # Removing the existing class files
    rm -rf app/*.class

    # Compiling the files with the specified class path
    javac -cp $ojdbcVersion app/StartedEntry.java

    java -cp .:$ojdbcVersion app.StartedEntry
fi