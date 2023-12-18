package coperation_binome;

import java.util.ArrayList;

public class Fiche {
	
	//public ArrayList<ArrayList<ArrayList<boolean[]>>> fiches;
	public ArrayList<ArrayList<boolean[]>> fiches;
	
	Fiche(ArrayList<ArrayList<boolean[]>> fiches){
		this.fiches = fiches;
		for(ArrayList<boolean[]>fiche : fiches)
			for(boolean[] exercice : fiche.)
				set
		
	}

	public boolean[] getExercice(int fiche, int exo){
		return fiches.get(fiche).get(exo);
	}
	
	public void setSolved(int fiche, int exo, int etu){
		fiches.get(fiche).get(exo)[etu] = true;
	}
}
