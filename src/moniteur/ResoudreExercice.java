package moniteur;

import java.util.ArrayList;

import coperation_binome.Fichier;

public class ResoudreExercice extends Thread
{
	Monitor M;
	public ResoudreExercice (ArrayList<Fichier> fichiers, String nom)
	{
		M = new Monitor(fichiers, nom);
	}
	public void run()
	{
		M.resoudre();
	}
}
