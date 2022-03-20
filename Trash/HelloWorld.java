package Trash;

/**
 * A program that prints <code>Hello World</code>
 *
 * @author GODless
 * @version 1.0
 */
public class HelloWorld {
    /**
     * Program entry point
     * @param args comand-line arguments
     */
    public static void main(String[] args) {

        System.out.println( "A" + ('\t' + '\u0003') );

        System.out.println( "A" + 12 );

        System.out.println( 'A' + "12" );

        System.out.println( 'А' + '1' + "2" );

        System.out.println("Hello World!");
        // single line comment Ctrl+Alt+L
        /*
         multi-line comment
        */

    }
}
