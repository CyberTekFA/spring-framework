package com.hypertek.repository;

import com.hypertek.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {
}
