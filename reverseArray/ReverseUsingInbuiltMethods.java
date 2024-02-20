// int is primitive data type and cannot be used with collections
//integer is an object and can be used in collections--integer is wrapper class of primitive type 'int'
//time-complexity = O(n)
//space-colexity = O(1)
package reverseArray;

import java.util.Arrays;
import java.util.Collections;



public class ReverseUsingInbuiltMethods {
    public static void reverse(Integer[] arr){
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }
    public static void main(String[] args){
        Integer[] arr = {10,20,30,40,50};
        reverse(arr);
    }
}
