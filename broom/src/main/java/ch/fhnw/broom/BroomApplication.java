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

		broom = new Broom();
		broom.setId(3);
		broom.setBroomName("Nimbus 2001");
		broom.setBroomColour("Ebony");
		broom.setBroomPrice(1500);
		menuService.addBroom(broom);

		broom = new Broom();
		broom.setId(4);
		broom.setBroomName("Firebolt Supreme");
		broom.setBroomColour("Mahogany");
		broom.setBroomPrice(2500);
		menuService.addBroom(broom);

		broom = new Broom();
		broom.setId(5);
		broom.setBroomName("Thunderstrike");
		broom.setBroomColour("Silver");
		broom.setBroomPrice(1800);
		menuService.addBroom(broom);

		broom = new Broom();
		broom.setId(6);
		broom.setBroomName("Moonshadow");
		broom.setBroomColour("Lavender");
		broom.setBroomPrice(1200);
		menuService.addBroom(broom);

		broom = new Broom();
		broom.setId(7);
		broom.setBroomName("Swiftwind");
		broom.setBroomColour("Sapphire");
		broom.setBroomPrice(900);
		menuService.addBroom(broom);

		broom = new Broom();
		broom.setId(8);
		broom.setBroomName("Starfire");
		broom.setBroomColour("Golden");
		broom.setBroomPrice(3000);
		menuService.addBroom(broom);

		broom = new Broom();
		broom.setId(9);
		broom.setBroomName("Shadowcaster");
		broom.setBroomColour("Obsidian");
		broom.setBroomPrice(1400);
		menuService.addBroom(broom);

		broom = new Broom();
		broom.setId(10);
		broom.setBroomName("Aurora");
		broom.setBroomColour("Amethyst");
		broom.setBroomPrice(1700);
		menuService.addBroom(broom);

		broom = new Broom();
		broom.setId(11);
		broom.setBroomName("Whisperwind");
		broom.setBroomColour("Pearlescent");
		broom.setBroomPrice(1100);
		menuService.addBroom(broom);

		broom = new Broom();
		broom.setId(12);
		broom.setBroomName("Blazefury");
		broom.setBroomColour("Crimson");
		broom.setBroomPrice(2000);
		menuService.addBroom(broom);

// initial load of accessories

		Accessory accessory = new Accessory();
		accessory.setId(1);
		accessory.setAccessoryName("Broomstick Servicing Kit");
		accessory.setAccessoryPrice(100);
		menuService.addAccessory(accessory);

		accessory = new Accessory();
		accessory.setId(2);
		accessory.setAccessoryName("Quidditch Gloves");
		accessory.setAccessoryPrice(50);
		menuService.addAccessory(accessory);

		accessory = new Accessory();
		accessory.setId(3);
		accessory.setAccessoryName("Flying Broom Polish");
		accessory.setAccessoryPrice(20);
		menuService.addAccessory(accessory);

 		accessory = new Accessory();
		accessory.setId(4);
		accessory.setAccessoryName("Broomstick Repair Manual");
		accessory.setAccessoryPrice(80);
		menuService.addAccessory(accessory);

		accessory = new Accessory();
		accessory.setId(5);
		accessory.setAccessoryName("Anti-Fog Goggles");
		accessory.setAccessoryPrice(60);
		menuService.addAccessory(accessory);

		accessory = new Accessory();
		accessory.setId(6);
		accessory.setAccessoryName("Weatherproof Broom Cover");
		accessory.setAccessoryPrice(30);
		menuService.addAccessory(accessory);

		accessory = new Accessory();
		accessory.setId(7);
		accessory.setAccessoryName("Broomstick Enchantment Kit");
		accessory.setAccessoryPrice(150);
		menuService.addAccessory(accessory);


// initial load of robes

		Robe robe = new Robe();
		robe.setId(1);
		robe.setRobeName("Invisibility Cloak");
		robe.setRobeColour("Black");
		robe.setRobePrice(100);
		menuService.addRobe(robe);
		
robe = new Robe();
robe.setId(2);
robe.setRobeName("Phoenix Feather Robe");
robe.setRobeColour("Crimson");
robe.setRobePrice(150);
menuService.addRobe(robe);

robe = new Robe();
robe.setId(3);
robe.setRobeName("Dragon Scale Robe");
robe.setRobeColour("Emerald");
robe.setRobePrice(200);
menuService.addRobe(robe);

robe = new Robe();
robe.setId(4);
robe.setRobeName("Moonstone Robe");
robe.setRobeColour("Silver");
robe.setRobePrice(120);
menuService.addRobe(robe);

robe = new Robe();
robe.setId(5);
robe.setRobeName("Enchanted Velvet Robe");
robe.setRobeColour("Purple");
robe.setRobePrice(180);
menuService.addRobe(robe);

robe = new Robe();
robe.setId(6);
robe.setRobeName("Starlight Silk Robe");
robe.setRobeColour("Blue");
robe.setRobePrice(250);
menuService.addRobe(robe);

robe = new Robe();
robe.setId(7);
robe.setRobeName("Gilded Gryffin Robe");
robe.setRobeColour("Gold");
robe.setRobePrice(300);
menuService.addRobe(robe);

robe = new Robe();
robe.setId(8);
robe.setRobeName("Shadowcaster Cloak");
robe.setRobeColour("Obsidian");
robe.setRobePrice(160);
menuService.addRobe(robe);

robe = new Robe();
robe.setId(9);
robe.setRobeName("Whispering Winds Robe");
robe.setRobeColour("Silver-Gray");
robe.setRobePrice(140);
menuService.addRobe(robe);


	}

}
