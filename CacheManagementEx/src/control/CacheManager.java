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
		// Busca o objeto Colaborador na cache. Se encontrar, atualiza o atributo ultimaConsulta do objeto e retorna o objeto. 
		// Se não encontrar na cache, vai buscar no servidor.
		// Se encontrar no servidor, adiciona o objeto na cache e retorna o objeto.
		// Se não encontrar no servidor, retorna null.
		
		return null;
		
	}	

}
