package com.macotter.thingstore;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.macotter.thingstore.repositories.ThingRepository;

public class StoreFactoryTest {

	@Test
	public void test() {
		StoreFactory fac = new StoreFactory();
		ThingRepository repo = fac.getRepository();
		assertNotNull(repo);

	}

}
