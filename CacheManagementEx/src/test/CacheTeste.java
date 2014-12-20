package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Colaborador;
import model.ColaboradorID;
import control.Cache;
import control.FactoryMethod;

public class CacheTeste {

	@Test
	public void testAddColaborador(){
		Cache cache = new Cache();
		FactoryMethod fm = new FactoryMethod();
		
		Colaborador c1 = fm.create(fm.FUNCIONARIO);
		c1.setId(new ColaboradorID("1000"));
		c1.setNome("Colaborador Teste1");
		cache.addColaborador(c1);
		assertEquals(1, cache.getCurrentCacheSize());
		try {
			Thread.sleep(3213);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		Colaborador c2 = fm.create(fm.FUNCIONARIO);
		c2.setId(new ColaboradorID("1100"));
		c2.setNome("Colaborador Teste2");
		cache.addColaborador(c2);
		assertEquals(2, cache.getCurrentCacheSize());
		
		Colaborador c3 = fm.create(fm.FUNCIONARIO);
		c3.setId(new ColaboradorID("1110"));
		c3.setNome("Colaborador Teste3");
		cache.addColaborador(c3);
		assertEquals(3, cache.getCurrentCacheSize());
		
		Colaborador c4 = fm.create(fm.GERENTE);
		c4.setId(new ColaboradorID("1111"));
		c4.setNome("Colaborador Teste4");
		cache.addColaborador(c4);
		assertEquals(4, cache.getCurrentCacheSize());
		
		Colaborador c5 = fm.create(fm.GERENTE);
		c5.setId(new ColaboradorID("0100"));
		c5.setNome("Colaborador Teste5");
		cache.addColaborador(c5);
		assertEquals(5, cache.getCurrentCacheSize());
		
		Colaborador c6 = fm.create(fm.GERENTE);
		c6.setId(new ColaboradorID("0110"));
		c6.setNome("Colaborador Teste6");
		cache.addColaborador(c6);
		assertEquals(5, cache.getCurrentCacheSize());
		
		assertEquals(null, cache.buscarColaborador(new ColaboradorID("1000")));
		
	}
		
	
	@Test
	public void testBuscarColaborador() {
		Cache cache = new Cache();
		FactoryMethod fm = new FactoryMethod();
		
		Colaborador c1 = fm.create(fm.FUNCIONARIO);
		c1.setId(new ColaboradorID("1000"));
		c1.setNome("Colaborador Teste1");
		cache.addColaborador(c1);
		
		Colaborador c2 = fm.create(fm.GERENTE);
		c2.setId(new ColaboradorID("1100"));
		c2.setNome("Colaborador Teste2");
		cache.addColaborador(c2);
		
		assertEquals(2, cache.getCurrentCacheSize());
						
		assertEquals(c1, cache.buscarColaborador(new ColaboradorID("1000")));
		assertEquals(c2, cache.buscarColaborador(new ColaboradorID("1100")));
		assertEquals(null, cache.buscarColaborador(new ColaboradorID("0010")));
		assertEquals(null, cache.buscarColaborador(new ColaboradorID("001")));
		
	}
}
