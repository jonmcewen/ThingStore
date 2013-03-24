package com.macotter.thingstore;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.macotter.thingstore.entities.Thing;
import com.macotter.thingstore.repositories.ThingRepository;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(locations="classpath:META-INF/application-context.xml")
@ContextConfiguration(locations = "classpath:META-INF/test-context.xml")
public class ThingRepositoryTest {

	@Autowired
	ThingRepository repository;

	@Test
	public void test() {
		Thing thing = new Thing();
		thing.setCreateDate(new Date());
		thing.setTitle("First Post");

		repository.save(thing);

		Thing dbthing = repository.findOne(thing.getThingId());
		assertNotNull(dbthing);
		System.out.println(dbthing.getTitle());
	}

}
