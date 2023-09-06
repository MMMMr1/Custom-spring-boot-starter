# Spring Boot Custom Starter
greeter-spring-boot-starter:  The library with the custom starter.

This library takes in the user's name and messages for different times
of day as configuration parameters and outptus the greeting messge. 
For example it will take the name John and the message for morning time as Good Morning and output the message Hello Mary, Good Morning.

Usage
Create and populate the class GreetingConfig, instantiate a Greeter using the GreetingConfig and use it get greeting messages:

GreetingConfig greetingConfig = new GreetingConfig();
greetingConfig.put(USER_NAME, "World");
greetingConfig.put(MORNING_MESSAGE, "Good Morning");
greetingConfig.put(AFTERNOON_MESSAGE, "Good Afternoon");
greetingConfig.put(EVENING_MESSAGE, "Good Evening");
greetingConfig.put(NIGHT_MESSAGE, "Good Night");

Greeter greeter = new Greeter(greetingConfig);
greeter.greet();


greeter-spring-boot-application: The sample project that uses the custom starter.
