import java.util.ArrayList;
import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> colors = new java.util.ArrayList<>();

        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Gray");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Ash");
        colors.add("Brown");
        colors.add("Turquoise");
        colors.add("Magenta");

        System.out.println(colors);

//        for(int i=0; i< colors.size(); i++) {         //Basic Iteration
//            System.out.println(colors.get(i));
//        }
//        for(String element: colors) {                 //Enhanced Iteration
//            System.out.println(element);
//        }

//        colors.add(6, "Pink");                        //Add element
//        System.out.println(colors.get(1));
//
//        colors.set(0, "Blaack");                      //Update element
//        System.out.println(colors.indexOf("Blaack"));
//
//        if(colors.contains("Pink")) {                 //Search for element
//            System.out.println("Found Element");
//        }
//        else {
//            System.out.println("Element not found");
//        }

//        Collections.sort(colors);                     //Sort elements

        ArrayList<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        letters.add("H");
        letters.add("I");
        letters.add("J");
        letters.add("K");
        letters.add("L");
//        System.out.println(letters);
//        Collections.copy(letters,colors);             //Copy one list to another (colors into letters)
//        Collections.shuffle(colors);
//        Collections.reverse(colors);
        List<String> subColors = colors.subList(1,9);   //Extract a portion of ArrayList
//        System.out.println(subColors);
        ArrayList<String> compareColors = new ArrayList<>(); //Compare Lists
        for(String comparison : colors) {
            compareColors.add(subColors.contains(comparison) ? "Yes" : "No");
        }
//        System.out.println(compareColors);

//        Collections.swap(colors, 3,1);                //Swap Elements
//        for(String swapped : colors) {
//            System.out.println(swapped);
//        }
        ArrayList<String> joinedList = new ArrayList<>();    //Join two lists
        joinedList.addAll(colors);
        joinedList.addAll(letters);
//        System.out.println(joinedList);
//        List<String> clonedList = (ArrayList<>())colors.clone();  //Clone Lists!?!?!?!?
//        joinedList.removeAll(joinedList);             //Remove all elements
//        System.out.println(joinedList);
//        System.out.println(colors.isEmpty());           //Testing if list is empty or not
        colors.ensureCapacity(18);              //Not sure how it works

        colors.trimToSize();                                //Not sure how it works

        System.out.println(colors);
    }
}
