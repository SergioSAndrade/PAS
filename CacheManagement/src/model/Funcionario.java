package model;
import java.util.Date;

public class Funcionario implements Colaborador {

	private ColaboradorID id;      
	private String nome;
	private long ultimaConsulta;
	
	public void setUltimaConsulta(long ultimaConsulta_){
		this.ultimaConsulta = ultimaConsulta_;
	}
	
	public ColaboradorID getID(){
		return id;
	}
	
	public long getUltimaConsulta(){
		return ultimaConsulta;
	}
	
	public String getNome(){
		return nome;
	}

	@Override
	public String toString() {
		return "Funcionario: " + id + "-" + nome + "-" + ultimaConsulta;
	}

	@Override
	public void setId(ColaboradorID _id) {
		this.id = _id;
	}

	@Override
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	
}