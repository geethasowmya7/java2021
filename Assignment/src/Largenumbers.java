
public class Largenumbers {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int l1,l2,t;
		l1=a[0];
		l2=a[1];
		if(l1<l2)
		{
			t=l1;
			l1=l2;
			l2=t;
		}
		for (int i=0;i<a.length;i++) {
			
			if(a[i]>l1)
			{
				l2=l1;
				l1=a[i];
			}
			else if (a[i]>l2 && a[i]!=l1)
			
			{
			l2=a[i];	
			}
		
		}
		System.out.println("the first highest is :"+l1);
		System.out.println("the second highest is :"+l2);
	}

}



