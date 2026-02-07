package Array;

public class Program4 {

	public static void main(String[] args) {
int[] arr = {7, 2, 10, 5}; 
      
        if (arr.length == 0) return;


        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }

        System.out.println(max);

	}

}
