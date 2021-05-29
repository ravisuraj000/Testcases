in yor env variable
JAVA_HOME=<JAVA_11>  // this should be a jdk
PATH
   <java11location>\bin
   <maven>\bin

open a fresh command prompt
   java -version  // 11
   mvn -v     // 3.8

i have corrected all the support for java11  and pom.xml

SET SONAR_TOKEN=d913e36b732b5df09327b7c054b42ca081de1b41


1.  Whether my code is good or not would require a code review :
    Static Code analysis you will do at your ned

	Sonar Lint is on the developer


2.

Requirement :
1.  Properties file to hold Resource Locations Configurations
2.  Externalized Property file
git clone https://nileshdevdas@bitbucket.org/nileshdevdas/tcs1.git

IController
	   You are using this controller in you WebService-->
		CUT--> WebService--

	class WebService {

	   WebService (IController controller){

	   }

	   public Response getAirports(){

		//l1
		 controller.doSomething(); // get mocked
		// ln
		//ln 1000..
	   }
	}


	IDAO

	IService

	IController

	1. CodeCoverage = 80 %
	2. Code Grade  = B / C ...
	3. Vulnerability = 0
	4. Sonalint Issue should be mininum
	6. 10 Test Case Should  have passed during the week end

Usage with SOLID -->
Applied Interface Driven Design -->
Exception Handling
Use of Enum
Use of Streams is mandatory
Use of Property (no hard Coding)
Document is required
You will mock only non CUT -> Dependencies
Site and Sonar Has to be Updated on every commit :
You Project has be on Git-> BitBucket->
Mocking is required in your test cases
We are platform agnostic and hence we don't c:/ c:\ /opt
Loggers ---> Application should audit logging