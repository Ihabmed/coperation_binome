package coperation_binome;

import java.util.ArrayList;

public class Fichier {
	
	public ArrayList<Integer> fichier;
	
	Fichier(int nombre_exercice){
		this.fichier = new ArrayList<Integer>(nombre_exercice);
		for (int i = 0; i < nombre_exercice; i++)
		{
			this.fichier.add(-1);
		}
	}
}
