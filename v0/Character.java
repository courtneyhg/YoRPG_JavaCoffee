public class Character {
  private int health;
  private int strength;
  private int defense;
  private double attackRating;

  public Boolean isAlive(){
    return (health > 0);
  }

  public int getDefense(){
    return defense;
  }

  public void lowerHP(int a){
    health = health - a;
  }

  public int attack (Character b){
    int damage;
    damage = ( (int) (b.strength * b.attackRating) - b.getDefense());
    if (damage < 0){
      damage = 0;
    }
    b.lowerHP(damage);
    return damage;
  }

}
