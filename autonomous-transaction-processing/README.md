# autonomous-transaction-processing

Demo about how to connect to ATP Oracle database

# Requirements
1. JDK 8 or latest
2. MAVEN
3. Next oracle libraries (ojdbc8, ons, oraclepkl, osdt_cert, osdt_core, ucp) registered in your local maven repository
4. Wallet of ATM, this must be in / directory (you could change it on application.properties) 

> You could get oracle libraries from ojdbc8-full.tar.gz file which is in the resources directory of this project
> You also have a Wallet test in resources directory of this project

# Building

`mvn clean package -Dmaven.test.skip=true`

# Running

`java -jar target/autonomous-transaction-processing-0.0.1-SNAPSHOT.jar` 

#Endpoints

1. /application/find-all *example:* http://localhost:8097/application/find-all
2. /application/save *example: * http://localhost:8097/application/save?id=1&name=preferred-seats-waiver

See the ApplicationController for more information about what arguments you must pass it.