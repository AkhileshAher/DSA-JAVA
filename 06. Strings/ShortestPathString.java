
public class ShortestPathString {

    public static void shortestPath(String direction) {
        int x=0;
        int y=0;
        for(int i=0;i<direction.length();i++) {
            if(direction.charAt(i) == 'N') {
                y+=1;
            } else if(direction.charAt(i) == 'S') {
                y-=1;
            } else if(direction.charAt(i) == 'E') {
                x+=1;
            } else  {
                x-=1;
            }
        }
        float distance = (float)Math.sqrt((x*x) + (y*y));
        System.out.println(distance);
    }

    public static void main(String[] args) {
        String direction = "WNEENESENNN";
        shortestPath(direction);
    }
}
