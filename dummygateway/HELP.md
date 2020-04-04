# How to use 

1. Dummy Eureka (Port : 8761)
		url: http://localhost:8761/
2. Dummy Gateway (Port : 8090) (Its uses zuul proxy to route the request to specific micro service)
	
	###In case you define routes in application.yml
	*http://localhost:8090/student/api/getStudentDetailsForSchool/xyzschool (Calling student micro service using zull)
	*http://localhost:8090/school/api/getSchoolDetails/xyzschool (Calling school micro service using zuul and school call student micro service using resttemplate)
	* http://localhost:8090/school/api/feign/getSchoolDetails/xyzschool (Calling school micro service using zuul and school call student micro service using feign client)
	
	###In case you haven't define routes in application.yml (default microservices names are used)
	*http://localhost:8090/student-microservice/api/getStudentDetailsForSchool/xyzschool (Calling student micro service using zull)
	*http://localhost:8090/school-microservice/api/getSchoolDetails/xyzschool (Calling school micro service using zuul and school call student micro service using resttemplate)
	* http://localhost:8090/school-microservice/api/feign/getSchoolDetails/xyzschool (Calling school micro service using zuul and school call student micro service using feign client)
	
3. Student Micro-service (Port : 8081)
4. School Micro-service (Port : 8082)
	 School micro service call student micro-service to get student details
	
	* SchoolController.java (Its based on RestTemplate to call student micro-service end-point )
			Url: http://localhost:8082/api/getSchoolDetails/xyzschool
	* SchoolControllerFeign.java (Its based on feign client to call student micro-service end-point )
			url : http://localhost:8082/api/feign/getSchoolDetails/xyzschool




