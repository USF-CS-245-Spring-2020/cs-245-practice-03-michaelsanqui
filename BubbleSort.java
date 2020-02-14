public class BubbleSort implements Practice03Sort{
	public void sort(int [] a){
		int n = a.length, temp=0;

		for (int i = 0; i< n-1; i++){
			for (int j = 0; j < n-i-1; j++){// Compare everything next to each other
				if (a[j] > a[j+1]){
					//SWAPP
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
//I KNOW I KNOW IT"S ONLY BUBBLES BUT I STILL CHEATED
//https://www.geeksforgeeks.org/bubble-sort/