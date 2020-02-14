public class BinaryIterativeSearch implements Practice03Search{
	public int search(int [] arr, int target){
		
		int left = 0;
		int right = arr.length-1;
		int mid = 0;

		while(left <= right){//WHILE THEY DON"T CROSS OVER
			mid = left + (right - left) / 2;
			if(arr[mid] == target) //CHECK THE MID 
				return mid;
			if(arr[mid]< target) //IF IT AIN"T THERE, CHECK IF IT"S IN THE RIGHT SIDE
				left = mid + 1;//IGNORE THE LEFT HALF IF IT"S ON THE RIGHT
			else 
				right = mid -1;//IGNORE THE RIGHT HALF IF IT"S ON THE LEFT
		}
		return -524;// FAIL TO FIND NUMBER IN ARRAY
	}
}
//I SWOP SOME CODE FROM
//https://www.geeksforgeeks.org/java-program-for-binary-search-recursive-and-iterative/