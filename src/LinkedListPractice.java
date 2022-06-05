import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> linkedColors = new LinkedList<>();
        linkedColors.add("Black");
        linkedColors.add("White");
        linkedColors.add("Red");
        linkedColors.add("Blue");
        linkedColors.add("Green");
        System.out.println(linkedColors);

//        for(String colors : linkedColors){
//            System.out.println(colors);
//        }

        Iterator iterateColors = linkedColors.listIterator(2);
        while(iterateColors.hasNext()) {
            System.out.println(iterateColors.next());
        }

        Iterator reverseColors = linkedColors.descendingIterator();
        while(reverseColors.hasNext()) {
            System.out.println(reverseColors.next());
        }

        linkedColors.add(5, "Yellow");
        linkedColors.addFirst("Gray");
        linkedColors.addLast("Pink");
        linkedColors.offerFirst("Orange");

        System.out.println(linkedColors);
    }
}
