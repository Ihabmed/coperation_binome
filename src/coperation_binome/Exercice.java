package coperation_binome;

public class Exercice {
	boolean[] exercice;
	Exercice()
	{
		exercice = new boolean[2];
		exercice[0] = false;
		exercice[1] = false;
	}
	public void setSolved(int index_etudiant){
		 exercice[index_etudiant] = true;
	}
	public void printExercice(int index_fichier, int index_exercice)
	{
		if (exercice[0])
		{
			System.out.println("Ihab a fait l'exercice " + (index_exercice + 1) + "de fiche TP " + (index_fichier + 5) );
		}
		if (exercice[1])
		{
			System.out.println("Yassine a fait l'exercice " + (index_exercice  + 1) + "de fiche TP " + (index_fichier + 5) );
		}
	}
}
