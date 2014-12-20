package control;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import model.Colaborador;
import model.ColaboradorID;
public class Cache {

	private HashMap<ColaboradorID, Colaborador> cache = new HashMap();
	private final int MAX_CACHE_SIZE = 5;
	private int currentCacheSize = 0;

	public void addColaborador(Colaborador c) {
		if (currentCacheSize >= MAX_CACHE_SIZE){ //Verifica se a cache está cheia. Se estiver, remove o objeto que 
												 //tem mais tempo sem ser utilizado, isto é, adicionado ou consultado.
												 //Senão, apenas adiciona o objeto à cache.
			Set<ColaboradorID> chaves = cache.keySet();
			ColaboradorID chaveaux = new ColaboradorID("0000");
			long aux = new Date().getTime();
			
			for (ColaboradorID chave : chaves){
				Colaborador colaux = cache.get(chave);
				if (colaux.getUltimaConsulta() < aux){ //se for mais antigo em cache
					aux = colaux.getUltimaConsulta();
					chaveaux = chave;
				}
			}
			
			cache.remove(chaveaux);
			System.out.println("Funcionário de ID " + chaveaux + " foi removido da cache.");
			ColaboradorID id = c.getID();
			c.setUltimaConsulta(new Date().getTime());
			cache.put(id, c);
		}
		else{
			ColaboradorID id = c.getID();
			c.setUltimaConsulta(new Date().getTime());
			cache.put(id, c);
			currentCacheSize++;
		}
	}

	public Colaborador buscarColaborador(ColaboradorID id) {
		Set<ColaboradorID> keys = cache.keySet();
		for (ColaboradorID k : keys){
			if (id.equals(k)) return cache.get(k);
		}
		return null;		
	}

	public void imprimirCache(){
		Collection collection = this.cache.values();
		Iterator it = collection.iterator();
		System.out.println();
		
		while(it.hasNext()){
			Colaborador c = (Colaborador)it.next();
			System.out.println(c.getNome());
		}
	}
	
	public int getCurrentCacheSize(){
		return this.currentCacheSize;
	}

}


