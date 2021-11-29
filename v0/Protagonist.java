public class Protagonist extends Character{
	private int health;
	private int strength;
	private int defense;
	private double attackRating;
	private String name;

	public Protagonist(String protagonistName){
		health = 100;
		strength = 50;
		defense = 50;
		name = protagonistName;
		attackRating = 0.5;
}


	public void specialize(){
		strength = 75;
		defense = 75;

}
	public void normalize(){
		strength = 50;
		defense = 50;
}

	public String getName(){
		return name;
	}
}
