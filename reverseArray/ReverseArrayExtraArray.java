// time_complexity : O(n) -- copying elements to new array is a linear operation
// Space_complexity : O(n) -- space is used to store new array

package reverseArray;
public class ReverseArrayExtraArray{
    public static void reverseArrayExtraArray(int[] arr)
    {
        int[] reversed_array = new int[arr.length];
        for(int i = 0;i < arr.length; i++){
            reversed_array[i] = arr[arr.length-i-1];
        }

        // Print reversed array
        System.out.print("Reversed Array:");
        for(int i : reversed_array){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] originalArr = {1,2,3,4,5};
        reverseArrayExtraArray(originalArr);
    }

}