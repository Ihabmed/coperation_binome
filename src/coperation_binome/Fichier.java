package coperation_binome;

import java.util.ArrayList;

public class Fichier {
	
	//public ArrayList<ArrayList<ArrayList<boolean[]>>> fiches;
	public ArrayList<boolean[]> fichier;
	
	Fichier(int nombre_exercice){
		this.fichier = new ArrayList<>();
		for (int i = 0; i < nombre_exercice; i++)
		{
			Exercice exercice = new Exercice();
			this.fichier.add(exercice);
		}
	}

	public boolean[] getExercice(int fiche, int exo){
		return fiches.get(fiche).get(exo);
	}
	

	

	public void printfiches ()
	{
		for (int i = 0; i < fiches.size(); i++)
		{
			for (int j = 0; j < fiches.get(i).size(); j++)
			{
				printExercice(i, j);
			}
		}
	}
}
