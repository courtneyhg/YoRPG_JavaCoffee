public class mushroomNuker extends Protagonist {

      /**
        default constructor
        pre:  instance vars are declared
        post: initializes instance vars.
        **/
      public mushroomNuker() {
          _hitPts = 100;
          _strength = 150;
          _defense = 50;
          _attack = .6;
      }


      /**
        overloaded constructor
        pre:  instance vars are declared
        post: initializes instance vars. _name is set to input String.
        **/
      public mushroomNuker( String name ) {
          this();
          _name = name;
      }



      public static String about(){
        return "This hero ate a radioactive mushroom that increases attack drastically at the cost of health and defense.";
        }

  }//end class mushroomNuker
