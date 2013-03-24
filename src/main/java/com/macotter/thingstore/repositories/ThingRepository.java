package com.macotter.thingstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macotter.thingstore.entities.Thing;

public interface ThingRepository extends JpaRepository<Thing, Integer> {

}
