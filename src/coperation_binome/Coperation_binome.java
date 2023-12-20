package coperation_binome;

import java.util.ArrayList;

public class Coperation_binome {
	
	
	public static void main(String[] args) {
		Thread Ihab = new Thread();
		Thread Yassine = new Thread();
		
		ArrayList<ArrayList<boolean[]>> fichiers = new ArrayList<>();
		ArrayList<boolean[]> fichier5 = new ArrayList<>();
		boolean[] exo = new boolean[2];
		exo[0] = false;
		exo[1] = false;
		fichier5.add(exo);
		fichier5.add(exo);
		fichier5.add(exo);
		for (int i = 0; i < fichier5.size(); i++)
		{
			System.out.println(fichier5.get(i));
		}
		ArrayList<boolean[]> fichier6 = new ArrayList<>();
		fichier6.add(exo);
		fichier6.add(exo);	
	}

}
