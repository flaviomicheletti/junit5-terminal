# JUnit 5 in Command Line


Compiling

    javac -d bin -sourcepath src -cp ".;lib/junit-platform-console-standalone-1.1.0.jar" src/FooTest.java

Running (gitbash)

    java -jar lib/junit-platform-console-standalone-1.1.0.jar --cp bin/ -c FooTest


