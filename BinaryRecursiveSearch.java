public class BinaryRecursiveSearch implements Practice03Search{
	public int search(int [] arr, int target){
		// I DUNNO HOW TO DO THIS SEACH WITH ONLY 2 PARAMETERS :(
		return binary_search(arr, 0,arr.length, target );
	}


	public int binary_search(int [] arr, int left, int right, int target){
		if(right >= left){ //IF RIGHT SIDE DOESN"T CROSS LEFT
			int mid = left + (right - left) / 2; //MID IS MID RELATIVELY 
			if(arr[mid] == target){  // CHECK IF IT"S AT MID
				return mid;
			}

			if(arr[mid] > target)	// IF ON LEFT SIDE
				return binary_search(arr,left,mid - 1, target); // NEW RIGHT SIDE IS MID-1

			if(mid +1 != arr.length) 	
				return binary_search(arr,mid +1, right,target);//IF ON RIGHT SIDE NEW LEFT SIDE IS MID +1
			return -1;
		}
		return -1;
	}
}

//I STOLE CODE FROM
//https://www.geeksforgeeks.org/java-program-for-binary-search-recursive-and-iterative/