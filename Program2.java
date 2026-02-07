package Array;

public class Program2 {

	public static void main(String[] args) {
		int[] arr = {2, 3, 4};
        long product = 1;

        for (int num : arr) {
            product *= num;
        }

        System.out.println(product);

	}

}
