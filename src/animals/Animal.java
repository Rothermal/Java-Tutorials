package animals;
// abstract classes cannot be made into objects. 
// so if i want to make an animal with this  "superclass"
// i will need to use inheritance and extend a separate class.

public abstract class Animal {
	public boolean isAPet = true;
	public String owner ="Mark";
	
	public void sleep(){
		System.out.println("Sleeping");
	}
	public void eat(){
		System.out.println("Eating");
	}
	// abstract functions need to be used in any class extended from this one.
	public abstract void move();
	
}
