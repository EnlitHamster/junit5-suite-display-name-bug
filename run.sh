#!/bin/bash
set -ex

javac -cp "junit5.jar::." *.java

java -jar "junit5.jar" execute -cp "junit5.jar:." --reports-dir reports --select-class TestSuite
