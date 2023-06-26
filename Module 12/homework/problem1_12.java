//Andrew Masone
/*
Create two linked hash sets “George”, “Jackie”, “John”, “Lisa”, “Tim”, “Michelle” and “George”,
“Katie”, “Kevin”, “Michelle”, “Ryan” and find the union, difference, and intersection. (You can clone
the sets to preserve the original sets from being changed by these set methods.)
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class problem1_12 {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("George");
        set1.add("Jackie");
        set1.add("John");
        set1.add("Lisa");
        set1.add("Tim");
        set1.add("Michelle");
        set1.add("George");

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        Set<String> union = new LinkedHashSet<>(set1);
        union.addAll(set2);

        Set<String> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);

        Set<String> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Union: " + union);
        System.out.println("Difference: " + difference);
        System.out.println("Intersection: " + intersection);
    }
}