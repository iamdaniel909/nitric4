package ch.fhnw.broom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.fhnw.broom.business.service.MenuService;
import ch.fhnw.broom.data.domain.Broom;
import ch.fhnw.broom.data.domain.Accessory;
import ch.fhnw.broom.data.domain.Robe;
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
		broom.setId(1);
		broom.setBroomName("Nimbus 3000");
		broom.setBroomColour("Hazelnut");
		broom.setBroomPrice(1000);
		menuService.addBroom(broom);

		broom = new Broom();
		broom.setId(2);
		broom.setBroomName("Firebolt 2");
		broom.setBroomColour("Hickory");
		broom.setBroomPrice(2000);
		menuService.addBroom(broom);

		Accessory accessory = new Accessory();
		accessory.setId(1);
		accessory.setAccessoryName("Broomstick Servicing Kit");
		accessory.setAccessoryPrice(100);
		menuService.addAccessory(accessory);

		Robe robe = new Robe();
		robe.setId(1);
		robe.setRobeSize("M");
		robe.setRobeColour("Black");
		robe.setRobePrice(100);
		
	}

}
