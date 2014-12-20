package model;


public interface Colaborador {

	public ColaboradorID getID();
	public String getNome();
	public void setId(ColaboradorID _id);
	public void setNome(String _nome);
	public long getUltimaConsulta();
	public void setUltimaConsulta(long ultimaConsulta_);
	
}
