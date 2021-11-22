public class Monster extends Character{
	public boolean status;
	public int health;
	public int damage;
	public int defense;

	public Monster(){
	health = 200;
	damage = 50;
	defense = 25;
	status = true;
	}

	public boolean isAlive(){
		return (health <= 0);
}

	public int attack( Protagonist protagonistname){
	int d = damage - protagonistname.defense;
	protagonistname.health = protagonistname.health - d;
	if (protagonistname.health <= 0){
		protagonistname.status = false;
	}
	return d;
}

	public void setHealth(int a){
	health = a;
}
}
