//time-complexity: O(n) -
//space-complexity: O(1)
package reverseArray;
public class ReverseArrayLoop{
    public static void reverseArrayUsingLoop(int[] arr){
        // two pointers approach
        int start = 0;
        int end = arr.length-1;
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;

        }

        System.out.println("Reversed Array");
        for(int i: arr){
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        int[] original_array = {2,3,4,5};
        reverseArrayUsingLoop(original_array);
    }

}