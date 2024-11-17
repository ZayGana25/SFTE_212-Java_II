package week4;

// import java.text.SimpleDateFormat; 
// import java.util.Date; 
  

interface Printable { 
    default void printString() {
        System.out.println( "default implementation" );
    }
}

class WithDefault implements Printable{}

class OverrideDefault implements Printable { 
    @Override
    public void printString() {
            System.out.println( "overridden implementation" );
        }
    }

class OverrideDefault2 implements Printable { 
    @Override
    public void printString() {
            System.out.println(java.time.LocalDate.now());
        }
    }

public class DefaultMethods {
    public static void main(String[] args){
        new WithDefault().printString();
        new OverrideDefault().printString();
        new OverrideDefault2().printString();
    }
}
