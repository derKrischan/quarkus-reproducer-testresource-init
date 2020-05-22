package org.acme.rest.testresource;

import java.util.Map;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

public class HelloTestResource implements QuarkusTestResourceLifecycleManager {

	@Override
	public Map<String, String> start() {
		System.out.println(">>>>>>>Starting HelloTestResource");
		return null;
	}

	@Override
	public void stop() {
		System.out.println("<<<<<<<Stopping HelloTestResource");
	}
    
}