/**
  class Protagonist -- protagonist of Ye Olde RPG
  **/

public class Protagonist extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected String _name = "J. Doe";

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public Protagonist(){
         _hitPts = 100;
    }



    /**
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      **/
    public Protagonist( String name ) {
        this();
        _name = name;
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }

    public int getDefense() { return _defense; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~





    //prepare a Protagonist for a special attack
    public void specialize() {
        _attack = .75;
        _defense = 20;
    }

    //revert to normal mode
    public void normalize() {
        _attack = .4;
        _defense = 40;
    }

}//end class Protagonist
