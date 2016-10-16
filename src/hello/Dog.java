package hello;

public class Dog {
	private int legs;
	private Boolean tail;
	private String hair;
	private String name;

		public Dog(String hair, int legs, boolean tail, String name){
			this.hair = hair;
			this.tail = tail;
			this.legs = legs;
			this.name = name;
					
		}

		public String getName(){
			return name;
		}
		public int getlegs(){
			return legs;
		}
		public Boolean getTail(){
			return tail;
		}
		public String getHair(){
			return hair;
		}
		public void setLegs(int legs){
			this.legs = legs;
		}
		public void setTail(boolean tail){
			this.tail = tail;
		}
		public void setHair(String hair){
			this.hair = hair;
		}
		public void setName(String name){
			this.name= name;
		}
}
