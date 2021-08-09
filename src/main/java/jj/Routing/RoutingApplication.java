package jj.Routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RoutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingApplication.class, args);
	}
	
	@RestController
	@RequestMapping("/coding")
	public class CodingController {
	    @RequestMapping("")
	    public String hello(){
	      return "Hello Coding Dojo!";
	    }
	    @RequestMapping("/python")
	    public String languages(){
	      return "Python/Django was awesome!";
	    }
	    @RequestMapping("/java")
	    public String world(){
	      return "Java/Spring is better!";
	    }
	    
	    
	 @RestController
	 public class DojoController {
		 @RequestMapping("/dojo")
		    public String dojo(){
		      return "The dojo is awesome!";
		 }
		 @RequestMapping("/{location}/")
	   public String dojos(@PathVariable("location") String input){
			 System.out.println(input);
	    	 if(input.equals("burbank-dojo")) {return "Burbank Dojo is located in Southern California";}
	    	 else if (input.equals("san-jose")) {return "SJ dojo is the headquarters";}
	    	 else {return "hello";}
		
	        
	        }
	    }
	
	
	
	}
}
