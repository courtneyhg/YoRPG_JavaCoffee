/*
  class Monster -- Represents random incarnations of
  the adventurer's natural enemy in Ye Olde RPG
**/

public class Goblin extends Monster{



  /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
  **/
  public Monster() {
    _hitPts = 200;
    _strength = 20 + (int)( Math.random() * 45 ); // [20,65)
    _defense = 20;
    _attack = 3;
  }


  public static String about(){
    return "This mischievous animal has an increased attack rating.";
    }
}//end class Goblin
