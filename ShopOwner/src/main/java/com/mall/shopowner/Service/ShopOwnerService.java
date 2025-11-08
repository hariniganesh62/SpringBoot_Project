package com.mall.shopowner.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mall.shopowner.Entity.ShopOwner;
import com.mall.shopowner.Repository.ShopOwnerRepository;

@Service
public class ShopOwnerService {

    @Autowired
    private ShopOwnerRepository repo;

    public List<ShopOwner> getAllOwners() {
        return repo.findAll();
    }

    public ShopOwner addOwner(ShopOwner owner) {
        return repo.save(owner);
    }

    public ShopOwner getOwnerById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteOwner(Long id) {
        repo.deleteById(id);
    }

    public ShopOwner updateOwner(Long id, ShopOwner updatedOwner) {
        ShopOwner existingOwner = repo.findById(id).orElse(null);
        if (existingOwner != null) {
            existingOwner.setName(updatedOwner.getName());
            existingOwner.setShopName(updatedOwner.getShopName());
            existingOwner.setEmail(updatedOwner.getEmail());
            existingOwner.setPassword(updatedOwner.getPassword());
            existingOwner.setPhoneNumber(updatedOwner.getPhoneNumber());
            existingOwner.setAddress(updatedOwner.getAddress());
            return repo.save(existingOwner);
        }
        return null;
    }
}
