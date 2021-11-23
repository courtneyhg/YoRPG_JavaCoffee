public class Character{
  protected int health;
  protected int strength;
  protected int defense;
  protected double attackRating;

  // returns boolean indicating living or dead
  public boolean isAlive() {
    return health > 0;
  }

  // returns value of defense attribute
  public int getDefense() {
    return defense;
  }

  // takes an int parameter, decreases health attribute by that amount
  public int lowerHP(int r) {
    health = health-r;
    return health;
  }

  // takes a Character as a parameter
  // calculates damage using this formula: damage = (strength * attack rating) - other Character's defense
  // damage should be an integer value
  public int attack(Character player) {
    int damage = ( (int) ((strength * attackRating) - player.defense) );
    return damage;
  }

} // end class Character
