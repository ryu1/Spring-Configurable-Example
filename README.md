Sample project to show how to work with Spring's @Configurable capability to inject dependencies into classes not instantiated by Spring.

This implementation requires Maven to perform compile time weaving.

To run from the command line using Maven:

1. `mvn clean compile`
2. `mvn exec:java -Dexec.mainClass="com.brightdome.sample.spring.HelloWorld"`

* AspectJ required AJDT in order to build in eclipse indigo. 

    `update site : http://download.eclipse.org/tools/ajdt/37/update`