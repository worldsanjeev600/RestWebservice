# RestWebservice
Hi,

This is the source code to know how to integrate Swagger in you APIs.
You need following framework and tools-

a.JAX-RS
           b.Maven
                c.JBOSS Server

Download this project and follow the follwing steps-
Step1. Build class path using following commands-
mvn eclipse:clean
mvn eclipse:eclipse

Step2. Cretae war file-
mvn clean install

Step3. Deploy the swaager.webservice war file in Jboss Server

Step4. When the war file will be successfully deployed the use following URL in postman, if API is working fine or not
URL: http://localhost:8080/swagger.webservice/employees
Request Method: POST
Content Type: JSON
Request Body:
{
      "name": "John Malhotra",
      "dateOfBirth": "19-02-1994",
      "age": 22,
      "jobProfile": "SDE1"
}

After hitting this API you will be find response like this-
{
      "employeeId": 9,
      "name": "John Malhotra",
      "dateOfBirth": "19-02-1994",
      "age": 22,
      "jobProfile": "SDE1"
}

It means API is working fine.

Step5: Now it's time to see the final result. So download the Swagger-UI chrome extension and enter the url :http://localhost:8080/swagger.webservice
Now you will be  able to see your API in Swagger UI.


Enjoy and keep learning as you can, and aslo share you knowledges
!!!!!!!!!!!!!!!!!!!Happy Coding and Happy Learning!!!!!!!!!!!!!!!!!!!!!!
