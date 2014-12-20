package test;

import static org.junit.Assert.*;
import model.Colaborador;
import model.ColaboradorID;
import model.Funcionario;
import model.Gerente;

import org.junit.Test;

import banco.Servidor;
import control.Cache;
import control.CacheManager;
import control.FactoryMethod;

public class CacheManagerTeste {

	@Test
	public void testFetchEmployee() {
		CacheManager manager = new CacheManager();
		FactoryMethod fm = new FactoryMethod();
		Servidor server = new Servidor();
		
		Colaborador c1 = fm.create(fm.FUNCIONARIO);
		c1.setId(new ColaboradorID("0110"));
		c1.setNome("Funcionário Teste");
		Colaborador c2 = fm.create(fm.GERENTE);
		c2.setId(new ColaboradorID("1111"));
		c2.setNome("Funcionário Gerente");
		server.addColaborador(c1);
		server.addColaborador(c2);
		
		assertEquals(c1, manager.buscarColaborador(new ColaboradorID("0110")));
		assertEquals(c2, manager.buscarColaborador(new ColaboradorID("1111")));
		assertEquals(null, manager.buscarColaborador(new ColaboradorID("0111")));
		assertEquals(null, manager.buscarColaborador(new ColaboradorID("001")));
		
	}

}