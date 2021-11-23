public class Character{
  private int health;
  private int strength;
  private int defense;
  private double attackRating;

  // returns boolean indicating living or dead
  public boolean isAlive() {
    return health <= 0;
  }
}

// returns value of defense attribute
public int getDefense() {
  return defense;
}

// takes an int parameter, decreases health attribute by that amount
public int lowerHP(int r) {
  return (health-r);
}

// takes a Character as a parameter
// calculates damage using this formula: damage = (strength * attack rating) - other Character's defense
// damage should be an integer value
public int attack(Character) {

}

} // end class Character
