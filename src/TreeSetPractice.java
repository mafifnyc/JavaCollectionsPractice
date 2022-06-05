import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<String> colorTree = new TreeSet<>();
        colorTree.add("Black");
        colorTree.add("White");
        colorTree.add("Red");
        colorTree.add("Blue");
        colorTree.add("Yellow");
        System.out.println(colorTree);

//        for(String eachColor : colorTree) {
//            System.out.println(eachColor);
//        }

//        TreeSet<String> newColorTree = new TreeSet<>();           //Add elements from one tree to the other
//        newColorTree.addAll(colorTree);
//        System.out.println(newColorTree);

//        Iterator colorIterator = colorTree.descendingIterator();  //Iterating reverse order
//        while(colorIterator.hasNext()) {
//            System.out.println(colorIterator.next());
//        }

//        TreeSet<String> newColorTree = new TreeSet<>();
//        newColorTree = (TreeSet<String>)colorTree.clone();
//        System.out.println(newColorTree);

        TreeSet<String> smallColorTree = new TreeSet<>();
        smallColorTree.add("White");
        smallColorTree.add("Pink");
        smallColorTree.add("Orange");
        smallColorTree.add("Blue");
        System.out.println(smallColorTree);

//        TreeSet<String> comparisonTree = new TreeSet<>();
//        for(String color : colorTree) {                                           //Comparing two TreeSet
//            System.out.println(smallColorTree.contains(color) ? "Yes" : "No");
//        }

        TreeSet<Integer> smallNumbers = new TreeSet<>();
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(23);
        numbers.add(11);
        numbers.add(54);
        numbers.add(4);
        numbers.add(11);
        numbers.add(9);
        numbers.add(2);
        numbers.add(7);
        numbers.add(6);
        System.out.println(numbers);
//        smallNumbers = (TreeSet)numbers.headSet(7);                 //Find number less than 7
//        Iterator numberIt = smallNumbers.iterator();
//        while(numberIt.hasNext()) {
//            System.out.println(numberIt.next());
//        }

//        System.out.println(numbers.ceiling(15));                    //Find element greater than or less than given element (15,5)
//        System.out.println(numbers.floor(5));

        System.out.println(numbers.pollFirst());                    //Removing first last and given(9) element
        System.out.println(numbers.pollLast());
        System.out.println(numbers.remove(9));
        System.out.println(numbers);

        System.out.println(colorTree);
    }
}
