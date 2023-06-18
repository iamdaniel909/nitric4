package ch.fhnw.broom.controller;

import ch.fhnw.broom.business.service.MenuService;
import ch.fhnw.broom.data.domain.Menu;
import jakarta.persistence.Access;
import ch.fhnw.broom.data.domain.Broom;
import ch.fhnw.broom.data.domain.Accessory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(path="/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    //get and post constructs for broom entity

    @GetMapping(path="/broom/{id}", produces = "application/json")
    public ResponseEntity<Broom> getBroom(@PathVariable("id") Long id) {
        try{
            Broom broom = menuService.findBroomById(id);
            return ResponseEntity.ok(broom);
        }
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @GetMapping(path="/broom", produces = "application/json")
    public List<Broom> getBroomList() {
        List<Broom> broomList = menuService.getAllBrooms();

        return broomList;
    }

    @PostMapping(path="/broom", consumes="application/json", produces = "application/json")
    public ResponseEntity<Broom> addBroom(@RequestBody Broom broom) {
        try{
            broom = menuService.addBroom(broom);
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());

        }
        return ResponseEntity.ok(broom);
        
    }

    //get and post constructs for accessory entity

    @GetMapping(path="/accessory/{id}", produces = "application/json")
    public ResponseEntity<Accessory> getAccessory(@PathVariable("id") Long id) {
        try{
            Accessory accessory = menuService.findAccessoryById(id);
            return ResponseEntity.ok(accessory);
        }
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @GetMapping(path="/accessory", produces = "application/json")
    public List<Accessory> getAccessoryList() {
        List<Accessory> accessoryList = menuService.getAllAccessories();

        return accessoryList;
    }

    @PostMapping(path="/accessory", consumes="application/json", produces = "application/json")
    public ResponseEntity<Accessory> addAccessory(@RequestBody Accessory accessory) {
        try{
            accessory = menuService.addAccessory(accessory);
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());

        }
        return ResponseEntity.ok(accessory);
        
    }

    //get construct for house entity (NOT YET DEFINED)

    @GetMapping(path="", produces = "application/json")
    public Menu getMenu(@RequestParam(value="house") String house) {

        return menuService.getMenuByHouse(house);
    }
    
}
