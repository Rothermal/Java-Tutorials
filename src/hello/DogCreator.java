package hello;

public class DogCreator {

	public static void main(String args[]){
		Dog fluffy = new Dog("Scruffy", 4, true,"Fluffy");
//		fluffy.setLegs(4);
//		fluffy.setHair("SCruffy");
//		fluffy.setTail(true);
//		fluffy.setName("Fluffy");
		
		System.out.println("We Named this dog "+fluffy.getName() +", because his hair is so " + fluffy.getHair());
	}
}
