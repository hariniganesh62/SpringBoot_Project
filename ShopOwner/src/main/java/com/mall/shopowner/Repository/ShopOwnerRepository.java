package com.mall.shopowner.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.mall.shopowner.Entity.ShopOwner;

public interface ShopOwnerRepository extends JpaRepository<ShopOwner, Long> {
}
