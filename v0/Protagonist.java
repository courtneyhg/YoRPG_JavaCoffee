public class Protagonist extends Character{
	public String name;
	public boolean status;
	public int health;
	public int damage;
	public int defense;

	public Protagonist(String protagonistname){
	health = 500;
	damage = 60;
	defense = 100;
	name = protagonistname;
	status = true;
	}

	public boolean isAlive(){
	return (health <= 0);
}

	public void specialize(){
	damage = 1000;
	defense = 10;

}
	public void normalize(){
	damage = 5;
	defense = 1;

	}

	public int attack(Monster monstername ){
	int d = damage - monstername.defense;
	monstername.health = monstername.health - d;
	if (monstername.health <= 0){
		monstername.status = false;
		}
	return d;
	}

	public String getName(){
	return name;
	}
	}
