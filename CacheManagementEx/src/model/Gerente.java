package model;
import java.util.Date;

public class Gerente implements Colaborador{
	
	private ColaboradorID id;      
	private String nome;
	private String setorResponsavel;
	private long ultimaConsulta;
	
	/*public Gerente(ColaboradorID id, String name){
		this.id = id;
		this.name = name;
		//this.ultimaConsulta = new Date().getTime();
	}
*/
	public ColaboradorID getID(){
		return id;
	}
	
	public String getNome(){
		return nome;
	}
	
	public long getUltimaConsulta(){
		return ultimaConsulta;
	}
	
	public String getSetorResponsavel(){
		return setorResponsavel;
	}

	@Override
	public String toString() {
		return "Gerente: " + id + "-" + nome + "-" + ultimaConsulta;
	}
	
	public void setId(ColaboradorID _id){
		this.id = _id;
	}
	public void setNome(String _nome){
		this.nome = _nome;
	}
	public void setUltimaConsulta(long ultimaConsulta_){
		this.ultimaConsulta = ultimaConsulta_;
	}
	
	public void setSetorResponsavel(String setorResponsavel_){
		this.setorResponsavel = setorResponsavel_;
	}

	
}
