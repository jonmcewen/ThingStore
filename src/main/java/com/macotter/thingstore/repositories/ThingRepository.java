package com.macotter.thingstore.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macotter.thingstore.entities.Thing;
import com.macotter.thingstore.entities.ThingKey;

public interface ThingRepository extends JpaRepository<Thing, ThingKey> {

	public List<Thing> findByThingKeyUser(String user);
}
