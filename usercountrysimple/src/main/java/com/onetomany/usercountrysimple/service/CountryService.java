package com.onetomany.usercountrysimple.service;


import com.onetomany.usercountrysimple.entity.Country;
import com.onetomany.usercountrysimple.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country saveCountry(Country country) {

        return countryRepository.save(country);
    }

    public List<Country> saveCountry(List<Country>country) {

        return countryRepository.saveAll(country);
    }

    public List<Country> getCountry() {

        return countryRepository.findAll();
    }

    public Country getCountryById(int cid) {

        return countryRepository.findById(cid).orElse(null);
    }

    public Country getCountryByName(String countryName) {


        return countryRepository.findByCountryName(countryName);
    }

    public String deleteCountry(int cid) {
        countryRepository.deleteById(cid);
        return "Country removed !! " + cid;
    }

    public Country updateCountry(Country country) {
        Country existingCountry = countryRepository.findById(country.getCid()).orElse(null);
        existingCountry.setCountryName(country.getCountryName());

        return countryRepository.save(existingCountry);
    }




}