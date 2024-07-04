clear
if [[ "$1" = "-c" ]]
then
    # Removing the existing class files
    rm -rf app/*.class
else
    # Removing the existing class files
    rm -rf app/*.class

    # Compiling the files with the specified class path
    javac -cp libs/ojdbc8-12.2.0.1.jar app/StartedEntry.java

    java -cp .:libs/ojdbc8-12.2.0.1.jar app.StartedEntry
fi