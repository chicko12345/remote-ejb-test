package org.problem.example;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.example.IRemoteEjbInterface;

@Stateless
public class TestEjbBean implements IRemoteEjbInterface {

	@Override
	public void method() {
		System.out.println("It's me, TestEjbBean");
	}

}
