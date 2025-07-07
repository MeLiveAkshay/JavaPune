package String;

public class StringDemo {
    public static void main(String[] args) {
        // Creating strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "   Java Programming   ";

        // 1. length() - Returns the length of the string
        System.out.println("Length of str1: " + str1.length()); // 5

        // 2. concat() - Concatenates one string to another
        String result = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + result); // Hello World

        // 3. toUpperCase() - Converts to uppercase
        System.out.println("Uppercase: " + str1.toUpperCase()); // HELLO

        // 4. toLowerCase() - Converts to lowercase
        System.out.println("Lowercase: " + str2.toLowerCase()); // world

        // 5. charAt(index) - Returns character at the specified index
        System.out.println("Character at index 1 in str1: " + str1.charAt(1)); // 'e'

        // 6. substring(start, end) - Extracts substring from start to end-1
        System.out.println("Substring of str2 (1 to 4): " + str2.substring(1, 4)); // "orl"

        // 7. equals() - Compares two strings for equality
        System.out.println("str1 equals 'Hello': " + str1.equals("Hello")); // true

        // 8. equalsIgnoreCase() - Case-insensitive comparison
        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello")); // true

        // 9. contains() - Checks if the string contains a specific sequence
        System.out.println("str3 contains 'Java': " + str3.contains("Java")); // true

        // 10. trim() - Removes leading and trailing whitespace
        System.out.println("Trimmed str3: '" + str3.trim() + "'");

        // 11. replace() - Replaces characters or substrings
        System.out.println("Replace 'a' with 'x' in str3: " + str3.replace("a", "x"));

        // 12. split() - Splits the string around matches of the given regex
        String csv = "red,green,blue";
        String[] colors = csv.split(",");
        System.out.println("Split colors:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 13. startsWith() and endsWith()
        System.out.println("str1 starts with 'He': " + str1.startsWith("He")); // true
        System.out.println("str2 ends with 'ld': " + str2.endsWith("ld")); // true
    }
}
