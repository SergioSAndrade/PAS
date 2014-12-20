package test;

import static org.junit.Assert.assertEquals;
import model.Funcionario;
import model.Gerente;

import org.junit.Test;

import control.FactoryMethod;

public class FactoryMethodTeste {

	@Test
	public void testCreate() {
		FactoryMethod fm = new FactoryMethod();
		Funcionario f = new Funcionario();
		Gerente g = new Gerente();
		
		assertEquals(f.toString(),fm.create(fm.FUNCIONARIO).toString());
		assertEquals(g.toString(),fm.create(fm.GERENTE).toString());
	}

}
