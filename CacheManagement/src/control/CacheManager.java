package control;
import java.util.ArrayList;
import java.util.Date;

import banco.Servidor;
import model.Colaborador;
import model.ColaboradorID;

public class CacheManager {

	private Servidor server = new Servidor();
	private Cache cache = new Cache();
	
	public Colaborador buscarColaborador(ColaboradorID id) {
		Colaborador profile = cache.buscarColaborador(id);
		if (profile == null) { 
			System.out.println("\nNão encontrado na cache. Buscando no servidor ...");
			profile = server.buscarColaborador(id);
			if (profile != null) {
				System.out.println("Encontrado no servidor. Adicionando a cache ...");
				cache.addColaborador(profile);
			}
			return profile;
		}
		else{
			profile.setUltimaConsulta(new Date().getTime());
			System.out.println("\nEncontrado na cache");
			return profile;
		}
		
	}	

}
