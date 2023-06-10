package ch.fhnw.broom.controller;

import ch.fhnw.broom.business.service.MenuService;
import ch.fhnw.broom.data.domain.Menu;
import ch.fhnw.broom.data.domain.Broom;

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

    @GetMapping(path="", produces = "application/json")
    public Menu getMenu(@RequestParam(value="house") String house) {

        return menuService.getMenuByHouse(house);
    }
    
}
