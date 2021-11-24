public class Guardian extends Protagonist {


      /**
        default constructor
        pre:  instance vars are declared
        post: initializes instance vars.
        **/
      public Guardian() {
          _hitPts = 200;
          _strength = 50;
          _defense = 75;
          _attack = .2;
      }


      /**
        overloaded constructor
        pre:  instance vars are declared
        post: initializes instance vars. _name is set to input String.
        **/
      public Guardian( String name ) {
          this();
          _name = name;
      }


      public static String about(){
        return "This hero has a holy armor and shield to decrease incoming damage. However, he isn't exactly the heaviest hitter.";
        }

  }//end class Guardian
