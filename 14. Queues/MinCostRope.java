public class MinCostRope {

    public static void minimumCostRope(int arr[]) {
        int n = arr.length;
        
    }


    public static void main(String [] args) {
        int [] arr = {4,3,2,6};
        int firstSmall = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] < firstSmall) {
                secondSmall = firstSmall;
                firstSmall = arr[i];
            } else if(arr[i] > firstSmall && arr[i] < secondSmall) {
                secondSmall = arr[i];
            }
        }
        System.out.println("FSMALL : " + firstSmall);
        System.out.println("SSMALL : " + secondSmall);
    }

}