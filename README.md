# PCFDemo

This is sample application which is can be deployed on Pivotal Cloud and Connect to MySql service

steps to be executed- 

1. gradle build

2. it will generate jar file in build\libs folder

3. login pcf account using cf command line tool 

before step 4 you should have service for mysql for your organization under one the space where your pushing this app

Make sure Mysql service name is - AMITMYSQL

4. cf push AMITSPRINGMYSQL(--this is application name) -p build\libs\demo-0.0.1-SNAPSHOT.jar

#TEST Deployed Application

1. once application is deployed with success, hit application URL as shown on PCF e.g. http://amitspringmysql.cfapps.io/

2. hit post request with below json body using postman or restclient

POST  http://applicationURL/user

{
    "firstName": "amit1",
  "lastName": "ghorpade1",
  "userName": "amitg1",
  "password": "password1",
  "emailId": "amitg1@gmail.com"
    
}

on success it will return you userId, to test user is created or not check below step

3. GET http://applicationURL/user/{id}

