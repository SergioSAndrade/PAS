package banco;
import java.util.ArrayList;
import java.util.Iterator;

import control.FactoryMethod;
import model.Colaborador;
import model.ColaboradorID;
import model.Funcionario;
import model.Gerente;
 
public class Servidor {
	
	static ArrayList<Colaborador> ListaColaborador = new ArrayList();
	
	public Servidor(){
		
		FactoryMethod fm = new FactoryMethod();
		
		Colaborador[] c = new Colaborador[9]; 
				
		c[0] = fm.create(fm.FUNCIONARIO);
		c[0].setId(new ColaboradorID("0001"));
		c[0].setNome("Marcelo");
				
		c[1] = fm.create(fm.FUNCIONARIO);
		c[1].setId(new ColaboradorID("0002"));
		c[1].setNome("Railan");
				
		c[2] = fm.create(fm.FUNCIONARIO);
		c[2].setId(new ColaboradorID("0003"));
		c[2].setNome("Lucas");
				
		c[3] = fm.create(fm.FUNCIONARIO);
		c[3].setId(new ColaboradorID("0004"));
		c[3].setNome("Titi");
				
		c[4] = fm.create(fm.FUNCIONARIO);
		c[4].setId(new ColaboradorID("0005"));
		c[4].setNome("Rafael");
		
		c[5] = fm.create(fm.FUNCIONARIO);
		c[5].setId(new ColaboradorID("0006"));
		c[5].setNome("Guilherme");
				
		c[6] = fm.create(fm.FUNCIONARIO);
		c[6].setId(new ColaboradorID("0007"));
		c[6].setNome("Fahel");
				
		c[7] = fm.create(fm.GERENTE);
		c[7].setId(new ColaboradorID("0008"));
		c[7].setNome("Bruno");
				
		c[8] = fm.create(fm.GERENTE);
		c[8].setId(new ColaboradorID("0009"));
		c[8].setNome("Kieza");
		
		this.addColaborador(c[0]);
		this.addColaborador(c[1]);
		this.addColaborador(c[2]);
		this.addColaborador(c[3]);
		this.addColaborador(c[4]);
		this.addColaborador(c[5]);
		this.addColaborador(c[6]);
		this.addColaborador(c[7]);
		this.addColaborador(c[8]);
	}
	
	public Colaborador buscarColaborador(ColaboradorID id) {
		for (int i=0; i<ListaColaborador.size(); i++){
			if ( id.equals( ListaColaborador.get(i).getID())) {
				return ListaColaborador.get(i);
			}
		}
		return null;	
	}
	
	public boolean addColaborador(Colaborador c) {
		if(!this.ListaColaborador.contains(c)){
			this.ListaColaborador.add(c);
			return true;
		}
		return false;
	}
	
	public String toString(){
		String s = "Lista de colaboradores: ";
		Iterator it = this.ListaColaborador.iterator();
		while(it.hasNext()){
			Colaborador c = (Colaborador) it.next();
			s += "Nome:"+c.getNome();
			s +="\n";
		}
		return s;
	}

	/*static public void addColaborador(Colaborador c){
		ListaColaborador.add(c);
	}*/

}
