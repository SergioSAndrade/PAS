package control;

import model.Colaborador;
import model.Funcionario;
import model.Gerente;

public class FactoryMethod {

	 public static final int FUNCIONARIO = 0;
	 public static final int GERENTE = 1;
	 
		 public Colaborador create(int tipoColaborador){
			 if(tipoColaborador == FactoryMethod.FUNCIONARIO)
				 return new Funcionario();
			 if(tipoColaborador == FactoryMethod.GERENTE)
				 return new Gerente();
			 return null;
		 }

}
