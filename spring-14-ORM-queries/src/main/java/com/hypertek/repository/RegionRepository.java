package com.hypertek.repository;

import com.hypertek.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {

    List<Region> findByCountry(String country);

    List<Region> findDistinctByCountry(String region);

    List<Region> findByCountryContaining(String country);

    List<Region> findByCountryContainingOrderByRegion(String country);

    List<Region> findTopByCountry(String country);
}
