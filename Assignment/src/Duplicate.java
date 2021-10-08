public class Duplicate {

	public static void main(String[] args)
	{
		 int [] arr = new int [] {1,2,5,6,7,3,6,7,3,7,9,0};   
         
	        System.out.println("Duplicate elements in given array: ");  
	      
	        for(int g= 0; g < arr.length; g++)
	        {  
	        	
	            for(int h = g + 1; h < arr.length; h++)
	            {  
	                if(arr[g] == arr[h]) 
	                	
	                    System.out.println(arr[h]);  
	                
	                
	                
	                
	            }
	            
	        }

	}

}
