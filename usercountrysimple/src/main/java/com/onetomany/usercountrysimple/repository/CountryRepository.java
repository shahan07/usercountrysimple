package com.onetomany.usercountrysimple.repository;


import com.onetomany.usercountrysimple.entity.Country;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
    Country findByCountryName(String CountryName);
}
