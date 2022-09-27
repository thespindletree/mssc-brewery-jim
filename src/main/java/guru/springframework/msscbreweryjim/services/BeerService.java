package guru.springframework.msscbreweryjim.services;

import guru.springframework.msscbreweryjim.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerID);

    BeerDto saveNewBeer(BeerDto beerDto);
}
