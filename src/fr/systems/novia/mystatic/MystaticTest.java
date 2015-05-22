package fr.systems.novia.mystatic;


/**
 * Created by formation2 on 21/05/15.
 */
public class MystaticTest {
    public static void main(String[] args)

    {
        Mystatic st1 = new Mystatic();
        Mystatic st2 = new Mystatic();
        int a = st1.x;
        int b = st2.x;

        System.out.printf("a, b are %d\t%d\n", a, b);

        Mystatic.x++;

        System.out.printf("Mystatic is %d\n",st1.x);

    }


}
