public class LastOccurrence {

	public static int lastOccu(int [] arr,int i,int key) {
		if(i == arr.length) {
			return -1;
		}
		System.out.println("Calling lastOccu(nums,"+i+","+key+")");
		
		int isFound = lastOccu(arr,i+1,key);
		
		System.out.println("Returning Value : "+isFound);
	
		if(isFound == -1 && arr[i] == key) {
			return i;
		}		
		return isFound;
		
	}

	public static void main(String [] args) {
		int [] nums = {10,20,30,10,30,20,80,20};
		System.out.println(lastOccu(nums,0,20));
	} 
}