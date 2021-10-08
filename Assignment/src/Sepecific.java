
public class Sepecific {

		 public static boolean contains(int[] arr, int item) {
		      for (int n : arr) {
		         if (item == n) {
		            return true;
		         }
		      }
		      return false;
		   }
		   public static void main(String[] args)
		   {
		          int[] my_array1 = {12,56,87,90,88,75,99,45,68,97,84};
		          
		      System.out.println(contains(my_array1, 78));
		      System.out.println(contains(my_array1, 90));

	}

}
