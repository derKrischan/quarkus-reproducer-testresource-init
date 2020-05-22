package org.acme.rest.testresource;

import java.util.Map;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

public class FruitTestResource implements QuarkusTestResourceLifecycleManager {

	@Override
	public Map<String, String> start() {
		System.out.println(">>>>>>>Starting FruitTestResource");
		return null;
	}

	@Override
	public void stop() {
		System.out.println("<<<<<<<Stopping FruitTestResource");
	}
    
}