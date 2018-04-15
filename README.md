# simple-spring-retry
A simple spring retry demo in spring-boot

#how to build
mvn clean install 

#end points
```
http://localhost:8080/ok
http://localhost:8080/format
http://localhost:8080/null
```

#Result
```
calling ok

calling null
calling null
calling null
calling null
calling null
Recover method - Null point exception

calling format 
calling format 
calling format 
calling format 
calling format 
Recover method - Number of Format Exception
```
