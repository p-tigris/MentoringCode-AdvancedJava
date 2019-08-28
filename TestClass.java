package examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestClass {

    public enum Continents {
        ASIA, NORTHAMERICA, SOUTHAMERICA, EUROPE, AUSTRALIA, AFRICA, ANTARCTICA
    }


       Continents continents;

       public TestClass(Continents continents) {
           this.continents = continents;
       }

    public static void main(String[] args) {
        TestClass testClass = new TestClass(Continents.ANTARCTICA);

        switch (testClass.continents) {
            case NORTHAMERICA:
                System.out.println("This is the continent we are on now");
                break;
            case ASIA:
            case AFRICA:
            case EUROPE:
            case AUSTRALIA:
            case SOUTHAMERICA:
                System.out.println("This is not the continent we are on now");
                break;
            default:
                System.out.println("Nobody lives on this continent");
    }

//        final int variable = 30;
//
//        public TestClass(int number) {
//            this.variable = number;
//        }
//        LinkedList<Integer> numbers = new LinkedList<>();
//        numbers.add(3);
//        numbers.add(45);
//        numbers.add(78);
//        try {
//            System.out.println(numbers.get(3));
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Error in code");
//        } finally {
//            System.out.println("End of code");
//        }
//        System.out.println("Not the end of the code");

    }
}
