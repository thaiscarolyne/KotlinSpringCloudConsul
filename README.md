# SpringRefreshScope

### This project uses Kotlin and the framework Spring Boot with it's functionality of cloud consul to refresh properties without restart application, and using Configuration file injected on others classes

For starting Consul, open local folder, and run the command:

* docker-compose up -d --build consul

Now, access Consul on http://localhost:8500/ui, and inside Key/Values you should create a folder with this pattern:

 * /config/myApp/data
 
 * And inside data key you put the same properties especified inside application.properties, with your prefered values
 
 * Obs.: 'myApp' is the application name defined in bootstrap file

Then, just run the application with default profile, call the endpoints defined in the collection, and change some properties on Consul, so if you call the endpoint again, the value must be changed without restarting the application

______________

If you don't want use Consul, you can also setup your own Config Server, and use the /actuator/refresh endpoint to refresh your keys, example:

* https://spring.io/guides/gs/centralized-configuration/

  Here you can see all actuator endpoint available:

  * https://www.baeldung.com/spring-boot-actuators

In following link you can also see an example project using Refresh Scope on controller for just one config injected directly on class:

https://github.com/newry/spring-examples

______________

Refs:

https://stackoverflow.com/questions/45953118/kotlin-spring-boot-configurationproperties/50377412#50377412
https://www.consul.io/docs/intro
