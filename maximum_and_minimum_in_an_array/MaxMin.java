package maximum_and_minimum_in_an_array;

public class MaxMin {

    public static int[] maxmin(int[] arr){
        int n = arr.length;
        int minn, maxx;
        int i;
        if(n % 2 != 0){
            minn = arr[0];
            maxx = arr[0];
            i = 1;
        }
        else{
            if(arr[0] > arr[1]){
                minn = arr[1];
                maxx = arr[0];
            }
            else{
                minn = arr[0];
                maxx = arr[1];
            }
            i = 2;
        }
        while(i < n-1){
            if(arr[i] > arr[i+1]){
                if(minn > arr[i+1]){
                    minn = arr[i+1];
                }
                if(maxx < arr[i]){
                    maxx = arr[i];
                }
            }
            else{
                if(minn > arr[i]){
                    minn = arr[i];
                }
                if(maxx < arr[i+1]){
                    maxx = arr[i+1];
                }
            }
        i += 2;
        }
        int[] result = {minn,maxx};
        return result;
    }
    public static void main(String[] args){
        int[] arr = {10,12,1,19,20,-1,100,-1000};
        int[] result = maxmin(arr);
        System.out.printf("Max element is %d\n",result[1]);
        System.out.printf("Min element is %d",result[0]);


    }
    
}
// Time complexity : O(n)
// Space Complexity : O(1)
// number of comparisons : 
// if n  is odd then it will be 3*(n-1)/2
// if n is even then it will be 1 + 3*(n-2)/2