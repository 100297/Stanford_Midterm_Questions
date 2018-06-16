package animal_hipster;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;

public class AnimalHipster {

	public AbstractCollection<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network,
			HashMap<String, String> favoriteAnimals) {
		ArrayList<String> AnimalHipsterss;
		AnimalHipsterss = new ArrayList<String>();
		boolean isAnimalHipster = true;
		System.out.println(favoriteAnimals.size());
		System.out.println(network.size());
		for (int i = 0; i < favoriteAnimals.size(); i++) {
			if (network.get(i) != null) {
				for (int j = 0; j < network.get(i).size(); j++) {
					if (favoriteAnimals.get(network.get(i)).equals(favoriteAnimals.get(network.get(j)))) {
						isAnimalHipster = false;
					}
					if (j == network.get(i).size() - 1 && isAnimalHipster == false) {

						AnimalHipsterss.addAll(network.get(i));
					}
				}
			}
		}
		return AnimalHipsterss;
	}

}
