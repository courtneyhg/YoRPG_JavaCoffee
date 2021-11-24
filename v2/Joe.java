public class Joe extends Protagonist {

      /**
        default constructor
        pre:  instance vars are declared
        post: initializes instance vars.
        **/
      public Joe() {
        _hitPts = 100;
        _strength = 100;
        _defense = 40;
        _attack = .4;
      }


      /**
        overloaded constructor
        pre:  instance vars are declared
        post: initializes instance vars. _name is set to input String.
        **/
      public Joe( String name ) {
          this();
          _name = name;
      }



      public static String about(){
      	  return "Your perfectly average Joe with balanced stats.";
      	  }

  }//end class Joe
