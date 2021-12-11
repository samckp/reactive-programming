Compile time Error :
java: error reading C:\Users\sam\.m2\repository\net\bytebuddy\byte-buddy\1.11.22\byte-buddy-1.11.22.jar; zip END header not found

Solution :
Change the Spring Boot version 2.6.1 to 2.5.7 and JDK-1.8.

<properties>
		<java.version>1.8</java.version>
</properties>

<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.5.7</version>
</parent>
