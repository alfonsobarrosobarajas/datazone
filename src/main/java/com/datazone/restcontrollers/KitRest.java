package com.datazone.restcontrollers;

import com.datazone.models.Kit;
import com.datazone.services.KitService;
import com.datazone.utils.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UrlConstants.KIT)
public class KitRest {

    @Autowired
    KitService service;

    @GetMapping(UrlConstants.LIST)
    public List<Kit> list(){
        return service.list();
    }

    @GetMapping(UrlConstants.GET)
    public Kit get(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(UrlConstants.ADD)
    public void save(@RequestBody Kit kit) {
        service.add(kit);
    }

    @PutMapping(UrlConstants.UPDATE)
    public void update(@RequestBody Kit kit, @PathVariable int id){
       service.update(kit, id);
    }

    @DeleteMapping(UrlConstants.REMOVE)
    public void delete(@PathVariable int id){
        service.remove(id);
    }

}
