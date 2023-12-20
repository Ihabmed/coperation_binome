package moniteur;

import java.util.ArrayList;

import coperation_binome.Fichier;

public class Monitor {
	boolean libre;
	ArrayList<Fichier> fichiers;
	String nom;
	Monitor(ArrayList<Fichier> fichiers, String nom)
	{
		this.fichiers = fichiers;
		libre = false;
		this.nom = nom;
	}
	int[] trouverExerciceNonResoudre(long l)
	{
		int[] indices = new int[2];
		int n = fichiers.size();
		for (int i = 0; i < n; i++)
		{
			int m = fichiers.get(i).fichier.size();
			for (int j = 0; j < m; j++)
			{
				if (fichiers.get(i).fichier.get(j) != -2 && fichiers.get(i).fichier.get(j) != l)
				{
					indices[0] = i;
					indices[1] = j;
					return indices;
				}
			}
		}
		indices[0] = fichiers.size();
		indices[1] = -1;
		return indices;
	}
	void expliquer(int i, int j)
	{
		libre = false;
		try {
			Thread.sleep(15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fichiers.get(i).fichier.set(j, -2);
		System.out.println(nom + " fait l'exercice " + (j + 1) + " de fiche TP " + (i + 5) + " apres explication");
		libre = true;
	}
	synchronized public void resoudre()
	{
		int[] indices = new int[2];
		for (int i = 0; i < fichiers.size(); i++)
		{
			for (int j = 0; j < fichiers.get(i).fichier.size(); j++)
			{
				if (fichiers.get(i).fichier.get(j) == -1)
				{
					fichiers.get(i).fichier.set(j, (int) Thread.currentThread().getId());
					System.out.println(nom + " fait l'exercice " + (j + 1) + " de fiche TP " + (i + 5) + " sans explication");
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					continue;
				}
			}
		}
		libre = true;
		indices = trouverExerciceNonResoudre(Thread.currentThread().getId());
		while (indices[0] < fichiers.size())
		{
			if (libre)
			{
				expliquer(indices[0], indices[1]);
				indices = trouverExerciceNonResoudre(Thread.currentThread().getId());
				notify();
			}
			else
			{
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

