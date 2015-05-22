package fr.systems.novia.staticimport;

/**
 * Created by formation2 on 22/05/15.
 */

import static java.lang.Math.*;

public class StaticImportTest {
    public static void main(String[] args) {
        System.out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0));
        System.out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8));
        System.out.printf("E = %f%n", E);
        System.out.printf("PI = %f%n", PI);
    }
} // end class StaticImportTest

    /*
    Static imports allow the static items of one class to be referenced in another without qualification.
    Used indiscriminately, this will likely make code more difficult to understand, not easier to understand.
     */
