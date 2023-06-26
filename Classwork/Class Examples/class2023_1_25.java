import java.util.Random;
import java.util.ArrayList;


public class class2023_1_25 {
    public static void main (String[] args){
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int n = rand.nextInt(1000) + 1;
            numbers.add(n);
        }
        numbers.sort(null); // sort the list
        System.out.println("Generated Numbers: " + numbers);
        int target = rand.nextInt(1000) + 1; // generate target number
        System.out.println("Target Number: " + target);
        int left = 0;
        int right = numbers.size() - 1;
        boolean found = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers.get(mid) == target) {
                System.out.println("Target Number found at index: " + mid);
                found = true;
                break;
            }
            if (numbers.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Target Number not found in the list.");
        }
    }
}