#!/bin/bash

qualified_java_file=io.javabrains.reactiveworkshop.Exercise1

if [[ $1 == io.* ]]
then
    qualified_java_file=$1
    qualified_java_file=${qualified_java_file%.java}
    qualified_java_file=${qualified_java_file%.class}
    shift
fi

echo "Running java file ${qualified_java_file} .."
echo "------------"
mvn compile exec:java -Dexec.mainClass=${qualified_java_file} \
     -Dexec.args="$@"
