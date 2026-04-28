public class HouseRobber {

	public static int houseRob(int [] houses,int hIdx){
		// base Case
		
		if(hIdx >= houses.length) {
			return 0;
		}


		// recursion 
		int evenMoney = houses[hIdx] + houseRob(houses,hIdx+2);
		int oddMoney = 0 + houseRob(houses,hIdx+1);
		System.out.println(" ODD MONEY : " + oddMoney);
		System.out.println("EVEN MONEY : " + evenMoney);	
		 return Math.max(evenMoney,oddMoney);

	}

	public static void main(String [] args) {
		int [] houses = {2,7,9,3,1};
		int ans = houseRob(houses,0);
		System.out.println("Maximum Money : " + ans);
	}
}