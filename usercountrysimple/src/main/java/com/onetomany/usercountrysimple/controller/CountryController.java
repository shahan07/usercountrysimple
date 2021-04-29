package com.onetomany.usercountrysimple.controller;

import com.onetomany.usercountrysimple.entity.Country;
import com.onetomany.usercountrysimple.repository.CountryRepository;
import com.onetomany.usercountrysimple.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {


    @Autowired
    private CountryService countryService;

    @Autowired
    private CountryRepository countryRepository;



    @PostMapping("/addCountry")
    public Country addCountry (@RequestBody Country country)  {

        return countryService.saveCountry(country);
    }



    @GetMapping("/Country")
    public List<Country> findAllCountry() {

        return countryService.getCountry();
    }

    @GetMapping("/CountryById/{id}")
    public Country findCountryById(@PathVariable int id) {
        return countryService.getCountryById(id);
    }


    @PutMapping("/update")
    public Country updateCountry(@RequestBody Country country) {

        return countryService.updateCountry(country);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUsers(@PathVariable int id) {

        return countryService.deleteCountry(id);
    }

}
