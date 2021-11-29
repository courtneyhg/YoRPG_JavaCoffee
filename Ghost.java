
public class Ghost extends Monster{




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

  public static String about(){
    return "Increased health, attack and defense at the cost of strength.";
  }




}//end class Ghost
