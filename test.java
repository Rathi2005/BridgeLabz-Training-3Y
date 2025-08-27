public class test {
    public static void main(String[] args) {
        String s1 = "abs";
        String s2 = "abs";
        String s3 = new String("abs");

        System.out.println("s1: " + System.identityHashCode(s1)+ " " + "s2: " + System.identityHashCode(s2) + " "
                + "s3: " + System.identityHashCode(s3));

        System.out.println(s1==s2); // this checks memory location
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3)); // this checks the value of the strings

        // Implicit conversion char to int
        int a = 'c';
        System.out.println(a);

        // int to float conversion
        float b = 20;
        System.out.println(b);
    }
}
