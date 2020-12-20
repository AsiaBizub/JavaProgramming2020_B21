package day29_Methods;

/* AM - Access Modifier,
Specifier
returnType
methodName
(Parameter)
{ statements to complete the functionality of the method = body
 */

import java.util.Arrays;

public class VoidMethodPractice_1_1 {

    public static void main(String[] args) {

        int [] a1 ={ 100, -200, 300, 50, 40, 59, 700, 0, 1, 2 };

        arrayMaxNum(a1); // call method and pass the array through the parameter, which then gets assigned to the int max,

        int [] a2 = {1, 2, 3, 4, 5, 6, 800, 9, 0 , 1, 12, 13, 4};
        arrayMaxNum(a2);
    }

    public static void arrayMaxNum (int []arr){
/*
        Arrays.sort(arr); // sorts in ascending order, last index number is the maximum
        System.out.println("Maximum number: " +arr[arr.length-1]); // maximum number of this array is the last index number

 */
        int max = arr[0];
        for (int each  : arr ) { // on the right side of the colon, data collection, each represents every single element in the array
            // we then compare first element with the next, and then assign if they are greater
            if (each > max) {
                max = each;
            }
        }
        System.out.println("Maximum nunber is: "+max);

        }

}


/*
task:
	1. create a function that can print out the maximum number from any given integer array

	2. create a function that can print out the minimum number from any given integer array

	3. create a function that can print the unique elements from the array

 */