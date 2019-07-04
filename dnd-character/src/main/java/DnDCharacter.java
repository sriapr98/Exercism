import java.util.*;

class DnDCharacter {
	List<Integer> strength=new ArrayList<>();
	List<Integer> dexterity=new ArrayList<>();
	List<Integer> constitution=new ArrayList<>();
	List<Integer> intelligence=new ArrayList<>();
	List<Integer> wisdom=new ArrayList<>();
	List<Integer> charisma=new ArrayList<>();

	List<Integer> addRandom(){
		Random rand=new Random();
		List<Integer> randList=new ArrayList<Integer>(List.of(rand.nextInt(5)+1,rand.nextInt(5)+1,rand.nextInt(5)+1,rand.nextInt(5)+1));
		return randList;
	}

	DnDCharacter(){
		strength=addRandom();
		dexterity=addRandom();
		constitution=addRandom();
		intelligence=addRandom();
		wisdom=addRandom();
		charisma=addRandom();
		Collections.sort(strength);
		Collections.sort(dexterity);
		Collections.sort(constitution);
		Collections.sort(intelligence);
		Collections.sort(wisdom);
		Collections.sort(charisma);

	}

    int ability() {
    	return sumOfMaxThree(strength);
    }

    int sumOfMaxThree(List<Integer> sumList){
    	return sumList.get(1)+sumList.get(2)+sumList.get(3);
    }

    int modifier(int input) {
        return (int)(Math.floor((input-10)/2.0));
    }

    int getStrength() {
        return sumOfMaxThree(strength);
    }

    int getDexterity() {
    	return sumOfMaxThree(dexterity);
    }

    int getConstitution() {
    	return sumOfMaxThree(constitution);
    }

    int getIntelligence() {
    	return sumOfMaxThree(intelligence);
    }

    int getWisdom() {
		return sumOfMaxThree(wisdom);
    }

    int getCharisma() {
    	return sumOfMaxThree(charisma);
    }

    int getHitpoints() {
        return 10+modifier(getConstitution());
    }

}
