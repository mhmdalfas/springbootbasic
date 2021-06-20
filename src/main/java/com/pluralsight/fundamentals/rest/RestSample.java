package com.pluralsight.fundamentals.rest;

	import java.time.LocalDateTime;

	//import org.springframework.beans.factory.annotation.Value;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;


			
	@RestController
	public class RestSample {

		
		@GetMapping("/")
		public String sayHello() {
			return "Hello World! Time on server is " + LocalDateTime.now();
		}
		
		
		
		@GetMapping("/stringone")
		public String getFirstString() {
			return "This is the First String";
		}
		
		@GetMapping("/stringtwo")
		public String getSecondString() {
			return "This is the Second String";
		}
		
	}




	

