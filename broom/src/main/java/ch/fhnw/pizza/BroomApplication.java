package ch.fhnw.broom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.fhnw.broom.business.service.MenuService;
import ch.fhnw.broom.data.domain.Broom;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class BroomApplication {

	@Autowired
	private MenuService menuService;

	public static void main(String[] args) {
		SpringApplication.run(BroomApplication.class, args);
	}

	@GetMapping(value="/")
    public String getWelcomeString() {
        
        return "Ye ole broom shoppe, welcome!";
    } 

	// Use this method to initialize placeholder data without using Postman
	// If you are persisting data in a file (see application.properties), initializing data that already exists will cause an error during starting the application
	// To resolve the error, delete the file and restart the application
	@PostConstruct
	private void initPlaceholderData() throws Exception {
		Broom broom = new Broom();
		broom.setBroomName("Nimbus 3000");
		broom.setBroomColour("Hazelnut");
		menuService.addBroom(broom);

		Broom = new Broom();
		broom.setBroomName("Firebolt 2");
		broom.setBroomColour("Hickory");
		menuService.addBroom(broom);
		
	}

}
