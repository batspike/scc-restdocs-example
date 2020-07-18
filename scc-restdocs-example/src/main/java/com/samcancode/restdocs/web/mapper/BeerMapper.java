package com.samcancode.restdocs.web.mapper;

import org.mapstruct.Mapper;

import com.samcancode.restdocs.domain.Beer;
import com.samcancode.restdocs.web.model.BeerDto;

@Mapper(uses= {DateMapper.class})
public interface BeerMapper {
	BeerDto beerToBeerDto(Beer beer);
	Beer    beerDtoToBeer(BeerDto beerDto);
}
