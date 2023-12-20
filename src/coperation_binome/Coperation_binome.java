package coperation_binome;

import java.util.ArrayList;
import moniteur.ResoudreExercice;

public class Coperation_binome {
	
	
	public static void main(String[] args) {
<<<<<<< Updated upstream
		Thread etu_1 = new Thread();
		Thread etu_2 = new Thread();
		
		ArrayList<ArrayList<ArrayList<int[]>>> fiche = new ArrayList<>();
		//fiche.get(0).get(2).get(0)[1] = 0;
		
=======
		ArrayList<Fichier> fichiers = new ArrayList<Fichier>();
		Fichier fichier5 = new Fichier(3);
		Fichier fichier6 = new Fichier(2);
		fichiers.add(fichier5);
		fichiers.add(fichier6);
		
		ResoudreExercice Ihab = new ResoudreExercice(fichiers, "Ihab");
		ResoudreExercice Yassine = new ResoudreExercice(fichiers, "Yassine");
		
		Ihab.start();
		Yassine.start();
>>>>>>> Stashed changes
	}

}
