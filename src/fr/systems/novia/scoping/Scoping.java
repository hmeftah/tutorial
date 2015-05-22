package fr.systems.novia.scoping;

/**
 * Created by formation2 on 21/05/15.
 */
public class Scoping {
    public static void main(String[] args)

    {
        int x = 12;
        System.out.printf("x is %d\n", x);
// Only x available
        {
            int q = 96;
            System.out.printf("x, q are %d\t%d\n", x, q);
// Both x & q available
        }
        System.out.printf("x, q are %d\t\n", x);
// Only x available
// q is "out of scope"
    }

}
