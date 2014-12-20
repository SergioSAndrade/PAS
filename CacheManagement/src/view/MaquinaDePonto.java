package view;
import java.util.Scanner;

import javax.swing.JOptionPane;

import model.Colaborador;
import model.ColaboradorID;
import control.CacheManager;

public class MaquinaDePonto {
	
	public static void main(String[] args){
		
		Scanner ent = new Scanner(System.in);
		CacheManager manager = new CacheManager();
		
		while(true){
			
			/*System.out.println("*************************\n"
					+ "Maquina de Ponto\n\n"
					+ "*************************\n\n"
					+ "Digite seu ID: ");
			String s = ent.nextLine();*/
			String s = JOptionPane.showInputDialog("Digite seu ID:");
			
			Colaborador c = manager.buscarColaborador(new ColaboradorID(s));
			
			if (c == null) JOptionPane.showMessageDialog(null, "Colaborador não cadastrado no sistema. Por favor, procure o RH.");
			else JOptionPane.showMessageDialog(null, "Bem-vindo Sr(a) " + c.getNome() + " !");
		}
		
	}
}
