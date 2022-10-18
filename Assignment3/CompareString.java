package assignment3;

public class CompareString {

    public static int customCompareTo(String s1, String s2) {

        for(int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }

        return s1.length() - s2.length();

    }

    public static void main(String arg[]) {

        String s1 = "Jatin";
        String s2 = "Bansal";
        System.out.println(s1.compareTo(s2));
        System.out.println(customCompareTo(s1, s2));

    }


}
