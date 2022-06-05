import java.util.*;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> hashSetColors = new HashSet<>();
        hashSetColors.add("Black");
        hashSetColors.add("White");
        hashSetColors.add("Red");
        hashSetColors.add("Blue");
        hashSetColors.add("Yellow");
        System.out.println(hashSetColors);

//        for(String iterateColors : hashSetColors) {
//            System.out.println(iterateColors);
//        }
//        System.out.println(hashSetColors.size());

//        hashSetColors.removeAll(hashSetColors);

//        System.out.println(hashSetColors.isEmpty());

//        HashSet<String> newHashedColors = new HashSet<>();        //Cloned properly
//        newHashedColors = (HashSet)hashSetColors.clone();
//        System.out.println(newHashedColors);

//        String[] colorArray = new String[hashSetColors.size()];   //Convert HashSet to Array
//        hashSetColors.toArray(colorArray);
//        for(String elements: colorArray) {
//            System.out.println(elements);
//        }

//        Set<String> treedColors = new TreeSet<String>(hashSetColors); //Convert HashSet to TreeSet
//        for(String elements : treedColors) {
//            System.out.println(elements);
//        }

//        List<String> listedColors = new ArrayList<>(hashSetColors); //Convert HashSet to Arraylist
//        for(String elements : listedColors) {
//            System.out.println(elements);
//        }

        HashSet<String> comparisonSet = new HashSet<>();      //Compare two HashSet
        comparisonSet.add("Yellow");
        comparisonSet.add("Red");
        comparisonSet.add("Pink");
        comparisonSet.add("Gray");
//        HashSet<String> compareSet = new HashSet<>();
//        for(String element : hashSetColors) {
//            System.out.println(comparisonSet.contains(element) ? "Yes" : "No");
//        }

//        hashSetColors.retainAll(comparisonSet);           //Retain common elements from two HashSet



        System.out.println(hashSetColors);
    }
}
