public class Character{
  protected int _hitPts;
  protected int _strength;
  protected int _defense;
  protected double _attack;

  // returns boolean indicating living or dead
  public boolean isAlive() {
    return _hitPts > 0;
  }

  // returns value of defense attribute
  public int getDefense() {
    return _defense;
  }

  // takes an int parameter, decreases health attribute by that amount
  public void lowerHP(int r) {
    _hitPts = _hitPts - r;
  }

  // takes a Character as a parameter
  // calculates damage using this formula: damage = (strength * attack rating) - other Character's defense
  // damage should be an integer value
  public int attack(Character player) {
    int damage = ( (int) ((_strength * _attack) - player._defense) );
    if (damage < 0){
      damage = 0;
    }
    player.lowerHP(damage);
    return damage;
  }

} // end class Character
