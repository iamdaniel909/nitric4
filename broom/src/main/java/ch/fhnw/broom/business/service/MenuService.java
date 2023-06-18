package ch.fhnw.broom.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.fhnw.broom.data.domain.Menu;
import ch.fhnw.broom.data.domain.Accessory;
import ch.fhnw.broom.data.domain.Broom;
import ch.fhnw.broom.data.repository.BroomRepository;
import ch.fhnw.broom.data.repository.AccessoryRepository;

@Service
public class MenuService {

//bean for broom repository

    @Autowired
    private BroomRepository broomRepository;

    public Broom findBroomById(Long id) {
        Broom broom = broomRepository.findById(id).get();
        return broom;
    }

    public List<Broom> getAllBrooms() {
        List<Broom> broomList = broomRepository.findAll();
        return broomList;
    }

    public Broom addBroom(Broom broom) throws Exception {
        if(broom.getBroomName() != null) {
            if (broomRepository.findByBroomName(broom.getBroomName()) == null)
                return broomRepository.save(broom);
            throw new Exception("Broom " + broom.getBroomName() + " already exists");
        }
        throw new Exception("Invalid Broom name ");
    }

    //Business Logic to get current offer according to the location of the user requesting the menu
    private String getCurrentOffer(String house) {
        String currentOffer = "No special offer";
        if("Griffindor".equalsIgnoreCase(house))
            currentOffer = "10% discount on all brooms";
        else if("Slytherin".equalsIgnoreCase(house))
            currentOffer = "15% discount on all brooms";
        else if("Hufflepuff".equalsIgnoreCase(house))
            currentOffer = "20% discount on all brooms";
        else if("Ravenclaw".equalsIgnoreCase(house))
            currentOffer = "25% discount on all brooms";
        return currentOffer;
    }



    public Menu getMenuByHouse(String house) {
        String currentOffer = getCurrentOffer(house);
        List<Broom> broomList = getAllBrooms();
        Menu menu = new Menu();
        menu.setBroomList(broomList);
        menu.setCurrentOffer(currentOffer);
        return menu;
    }

    //bean for accessory repository

    @Autowired
    private AccessoryRepository accessoryRepository;

    public Accessory findAccessoryById(Long id) {
        Accessory accessory = accessoryRepository.findById(id).get();
        return accessory;
    }

    public List<Accessory> getAllAccessories() {
        List<Accessory> accessoryList = accessoryRepository.findAll();
        return accessoryList;
    }

    public Accessory addAccessory(Accessory accessory) throws Exception {
        if(accessory.getAccessoryName() != null) {
            if (accessoryRepository.findByAccessoryName(accessory.getAccessoryName()) == null)
                return accessoryRepository.save(accessory);
            throw new Exception("Accessory " + accessory.getAccessoryName() + " already exists");
        }
        throw new Exception("Invalid Accessory name ");
    }
    
}
