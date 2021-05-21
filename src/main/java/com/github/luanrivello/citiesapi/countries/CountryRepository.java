package com.github.luanrivello.citiesapi.countries;

import com.github.luanrivello.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
