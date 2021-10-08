public class Countduplicates {
	public static void main(String[] args) {
		int a[]= {1,5,2,4,6,2,5,1,3,8,};
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
					count++;
				}
				
			}
		}
		System.out.println("count of repeated balues is :"+count);
	}

}


