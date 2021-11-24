/*
  class Monster -- Represents random incarnations of
  the adventurer's natural enemy in Ye Olde RPG
**/

public class Ghost extends Monster{

~~


  /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
  **/
  public Ghost() {
    _hitPts = 175;
    _strength = 15 + (int)( Math.random() * 40 ); // [20,65)
    _defense = 40;
    _attack = 2;
  }

  public Ghost(String name){
    this();
    _name = name;
    
  }





}//end class Monster
