package String;

public class InternMethodString {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = "Hello"; // String literal

        System.out.println("Before Intern");
        System.out.println("str1 == str2: " + (str1 == str2)); // false, different memory locations

        str1 = str1.intern(); // Moves str1 to the string pool if not already there

        System.out.println("After Intern");
        System.out.println("str1 == str2: " + (str1 == str2)); // true, both point to the same pooled string
    }
}
