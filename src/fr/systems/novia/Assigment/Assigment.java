package fr.systems.novia.Assigment;

/**
 * Created by formation1 on 03/06/15.
 */
public class Assigment {
        public static void main(String[] args) {
            Tank t1 = new Tank();
            Tank t2 = new Tank();

            t1.level = 9;
            t2.level = 47;

            System.out.println("1: t1.level: " + t1.level +
                    ", t2.level: " + t2.level);
            t1 = t2;
            System.out.println("2: t1.level: " + t1.level +
                    ", t2.level: " + t2.level);
            t1.level = 27;
            System.out.println("3: t1.level: " + t1.level +
                    ", t2.level: " + t2.level);
        }
    }
// call aliasing  c'est un aspect fondamental de la maniere de java à utiliser les objets