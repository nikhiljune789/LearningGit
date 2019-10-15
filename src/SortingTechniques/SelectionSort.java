package SortingTechniques;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {21,33,2,9,4,66};
		
		int min;
		int temp=0;
		for (int i = 0; i < a.length; i++)
		{
			min=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);	
		}
		
	}

}
