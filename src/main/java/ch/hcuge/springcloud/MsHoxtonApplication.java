package ch.hcuge.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class MsHoxtonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsHoxtonApplication.class, args);
	}
	
	@RestController
	@RequestMapping
	class ControllerTest {
		
		@GetMapping("/hello")
		public String test() {
			return "Hello World";
		}
		
	}

}
