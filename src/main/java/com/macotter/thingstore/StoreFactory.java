package com.macotter.thingstore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.macotter.thingstore.repositories.ThingRepository;

public class StoreFactory {

	private final ApplicationContext context = new GenericXmlApplicationContext(
			"classpath:META-INF/test-context.xml");

	public ThingRepository getRepository() {
		return context.getBean(ThingRepository.class);
	}
}
