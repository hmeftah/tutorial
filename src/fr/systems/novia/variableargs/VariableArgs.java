package fr.systems.novia.variableargs;

/**
 * Created by formation2 on 22/05/15.
 */
public class VariableArgs {
    public static void main(String[] args)
    {
        double d1, d2, d3, d4, d5, maximum;
        d1 = 10.5;
        d2 = 20.5;
        d3 = 30.5;
        d4 = 40.5;
        d5 = 50.5;
        maximum = findMax(d1, d2);
        System.out.println("Max(10.5, 20,5) = " + maximum);
        maximum = findMax(d2, d4, d5, d1, d3);
        System.out.println("Max(20.5, 40.5, 50.5, 10.5, 30.5) = " + maximum);

        double [] x = {5, 10, 15, 30, 40};
        maximum = findMax(x);
        System.out.println("Max in array x is " + maximum);

    }
    //******************
    public static double findMax(double...values)
    {
        double largest = Double.MIN_VALUE;

        for(double v : values)
            if(v > largest)
                largest = v;
        return largest;
    }
}
