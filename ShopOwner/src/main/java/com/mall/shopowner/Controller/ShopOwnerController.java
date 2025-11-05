package com.mall.shopowner.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.mall.shopowner.Entity.ShopOwner;
import com.mall.shopowner.Service.ShopOwnerService;

@RestController
@RequestMapping("/api/shopowners")
public class ShopOwnerController {

    @Autowired
    private ShopOwnerService service;

    @GetMapping
    public List<ShopOwner> getAllOwners() {
        return service.getAllOwners();
    }

    @PostMapping
    public ShopOwner addOwner(@RequestBody ShopOwner owner) {
        return service.addOwner(owner);
    }

    @GetMapping("/{id}")
    public ShopOwner getOwnerById(@PathVariable Long id) {
        return service.getOwnerById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteOwner(@PathVariable Long id) {
        service.deleteOwner(id);
        return "ShopOwner deleted successfully!";
    }
}
