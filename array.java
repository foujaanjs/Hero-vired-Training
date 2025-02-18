
import java.util.Arrays;


public class array{
    public static void main(String [] args){
    int[] arr = {1,2,3,4,5};

    System.out.println("given array" + Arrays.toString(arr));
    
    int[] arr1 = new int[arr.length-1];
    int j = 3;
    for(int i =0, k=0; i<arr.length;i++){
        if(i!=j){
            arr1[k] = arr[i];
            k++;
        }
    }

    
    System.out.println("removed array" + Arrays.toString(arr1));

    arr[2] = 10;

    System.out.println("the updated array" + Arrays.toString(arr));


    }
}
