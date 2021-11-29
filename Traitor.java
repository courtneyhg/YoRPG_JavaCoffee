
public class Traitor extends Monster{

  /**
     default constructor
     pre:  instance vars are declared
     post: initializes instance vars.
  **/
  public Traitor() {
    _hitPts = 200;
    _strength = 18 + (int)( Math.random() * 50 ); // [20,65)
    _defense = 20;
    _attack = 4;
  }

  public static String about(){
    return "Increased attack, defense suffered for being unloyal.";
  }

}//end class Traitor
