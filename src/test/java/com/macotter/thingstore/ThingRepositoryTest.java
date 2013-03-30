package com.macotter.thingstore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.macotter.thingstore.entities.Thing;
import com.macotter.thingstore.entities.ThingKey;
import com.macotter.thingstore.repositories.ThingRepository;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations="classpath:META-INF/application-context.xml")
@ContextConfiguration(locations = "classpath:META-INF/test-context.xml")
public class ThingRepositoryTest {

	@Autowired
	ThingRepository repository;

	@After
	public void clear() {
		repository.deleteAll();
	}

	@Test
	public void testPut() {
		Thing thing = new Thing();
		thing.setUser("testuser");
		thing.setName("MyThing");

		repository.save(thing);

		Thing dbthing = repository.findOne(new ThingKey(thing.getUser(), thing
				.getName()));
		assertNotNull(dbthing);
		System.out.println(dbthing);
	}

	@Test
	public void findByUser() {
		Thing thing = new Thing();
		thing.setUser("testuser");
		thing.setName("First Thing");

		repository.save(thing);

		Thing thing2 = new Thing();
		thing2.setUser("testuser");
		thing2.setName("Second Thing");

		repository.save(thing2);

		List<Thing> expected = new ArrayList<Thing>();
		expected.add(thing);
		expected.add(thing2);

		List<Thing> things = repository.findByThingKeyUser("testuser");
		assertEquals(expected, things);

	}
}
