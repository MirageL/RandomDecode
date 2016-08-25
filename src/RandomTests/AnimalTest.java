package RandomTests;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println((byte)1);

		ArrayList<Animal> AnimalList = new ArrayList<Animal>();
		//a bit confused why i can initiate a type animal but i can initialize
		//a an ArrayList of type Animal
		
		AnimalList.add(new Cow());
		AnimalList.add(new Dog());
		AnimalList.add(new Cat());
		
		
		for(Animal animal: AnimalList) {
			animal.makenoise();
		}
	}

}
