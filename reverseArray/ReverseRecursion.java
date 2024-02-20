//time-complexity-O(n) -- the recursion goes through each element once so its linear
// space-complexity-O(logn) For in-place algorithms, the space complexity can be less than O(n) because you're modifying the input array itself without using additional data structures. 
// However, due to the recursion stack, there is still some overhead in terms of space, and if the depth of recursion is logarithmic, you express it as O(log n)
package reverseArray;

public class ReverseRecursion {
    public static void reverseRecursiveFunction(int[] arr, int start, int end){
        int temp;
        if(start >= end){
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseRecursiveFunction(arr, start+1, end-1);
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        reverseRecursiveFunction(arr, 0, arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
