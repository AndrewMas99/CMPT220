//Andrew Masone


import  java.util.Scanner;
import  java.util.Random;
import  java.util.Arrays;

public class class2023_3_1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int arraysize = 20;
        int array[] = new int[arraysize];
        System.out.print("What value are you searching for: ");
        int searchvalue = sc1.nextInt();
        int counter = 0;
        while (counter < arraysize) {
            int rand = (int) (Math.random() * 10);
            //System.out.println("rand="+rand);
            array[counter] = rand;
            counter++;
        }
        Arrays.sort(array);



        //LinearSearch(searchvalue,array);
        if(LinearSearch(searchvalue,array)==-1) System.out.println("Value Not Found");
        System.out.println("Testing Linear Search");
        System.out.println(LinearSearch(searchvalue, array));
        System.out.println("Done Linear Search");
        //BinarySearch(searchvalue,array);
        //if(BinarySearch(searchvalue,array)==-1) System.out.println("Value Not Found");//Not neccessary as if Linear search cant find it then Binary wont either.
        System.out.println("Testing Binary Search");
        System.out.println(BinarySearch(searchvalue, array));
        System.out.println("Done Binary Search");
    }

    public static int LinearSearch(int searchvalue, int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (searchvalue == array[i])
                System.out.println("Value found at array[" + (i) + "] " + array[i]);
            return i;
            //System.out.println(array[i]);
        }
        return -1;
    }

    public static int BinarySearch(int searchvalue, int array[]){
        int low = 0;
        int high = array.length-1;
        while (low<high){
            int mid = (low+high/2);
            if (searchvalue==array[mid]){
                return mid;
            }
            else if(searchvalue < array[mid]){
                high=mid-1;
            }
            else if (searchvalue>array[mid]){
                low=mid+1;
            }
        }
        return -1;
    }
}
