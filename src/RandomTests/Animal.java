package RandomTests;

public abstract class Animal {
	String sound;
	public Animal(){
	}
	
	abstract String getSound();
	
	public void makenoise(){
		System.out.println(getSound());
	}
	
}
