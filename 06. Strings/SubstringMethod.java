
public class SubstringMethod {
    public static String substringDemo(String str,int si ,int ei) {
        String substr = "";
        for(int i=si;i<ei;i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String [] args) {
        String str = "Akhilesh";
        System.out.println(substringDemo(str, 4, 8));
    }
}
