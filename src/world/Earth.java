package world;
import people.Person;
import places.City;

public class Earth {
	static Person mark = new Person("Mark", 36);
	static City home = new City("Champlin", "Minnesota");
//	public static void main(String args[]) {
//		meetMark();
//	}
	
	public static void meetMark(){
	System.out.println("This is "+ mark.getName() + ", from " + home.getName() + ", he is " + mark.getAge() + " years old.");
	}
}
