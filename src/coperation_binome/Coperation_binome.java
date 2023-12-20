package coperation_binome;

import java.util.ArrayList;
import moniteur.ResoudreExercice;

public class Coperation_binome {
	
	
	public static void main(String[] args) {
		ArrayList<Fichier> fichiers = new ArrayList<Fichier>();
		Fichier fichier5 = new Fichier(3);
		Fichier fichier6 = new Fichier(2);
		fichiers.add(fichier5);
		fichiers.add(fichier6);
		
		ResoudreExercice Ihab = new ResoudreExercice(fichiers, "Ihab");
		ResoudreExercice Yassine = new ResoudreExercice(fichiers, "Yassine");
		
		Ihab.start();
		Yassine.start();
	}

}
