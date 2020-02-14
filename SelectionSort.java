public class SelectionSort implements Practice03Sort{
	public void sort(int [] a){
		int n = a.length-1; //SORT IS GOOD FOR LAST PLACE
		int min_index = 0;
		int temp 	  = 0;

		for(int i = 0; i< n; i++){ // LOOK AT EVERYTHING ONE BY ONE
			min_index = i;

			for (int j = i+1; j< n;j++){ // AND IF ANYTHING TO THE RIGHT IS SMALLER
				if(a[j]< a[min_index])//SWAP THE CURRENT INDEX WITH THE ONE ON THE RIGHT
					min_index = j;
			}

			//SWAP
			temp = a[min_index];
			a[min_index] = a[i];
			a[i] =temp;
		}
	}
}
//GEEKS FOR GEEEEKS
//https://www.geeksforgeeks.org/selection-sort/