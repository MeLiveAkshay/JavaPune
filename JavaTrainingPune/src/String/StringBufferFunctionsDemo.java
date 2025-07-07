package String;

public class StringBufferFunctionsDemo {
    public static void main(String[] args) {
        // Create a StringBuffer with initial content
        StringBuffer buffer = new StringBuffer("Hello");

        // 1. append(String str) – Appends the string to the end
        buffer.append(" World");
        System.out.println("append(): " + buffer); // Hello World

        // 2. insert(int offset, String str) – Inserts a string at the specified index
        buffer.insert(5, ",");
        System.out.println("insert(): " + buffer); // Hello, World

        // 3. replace(int start, int end, String str) – Replaces the content between start and end
        buffer.replace(6, 11, "Java");
        System.out.println("replace(): " + buffer); // Hello,Java

        // 4. delete(int start, int end) – Deletes content from start to end-1
        buffer.delete(5, 6); // remove comma
        System.out.println("delete(): " + buffer); // HelloJava

        // 5. deleteCharAt(int index) – Deletes a single character at index
        buffer.deleteCharAt(5);
        System.out.println("deleteCharAt(): " + buffer); // Helloava

        // 6. reverse() – Reverses the entire buffer
        buffer.reverse();
        System.out.println("reverse(): " + buffer); // avaolleH

        // Reverse back to original
        buffer.reverse(); // Helloava

        // 7. capacity() – Returns the current capacity (allocated size)
        System.out.println("capacity(): " + buffer.capacity());

        // 8. ensureCapacity(int minimumCapacity) – Increases capacity if needed
        buffer.ensureCapacity(50); // Sets minimum capacity to 50
        System.out.println("ensureCapacity(50): " + buffer.capacity());

        // 9. charAt(int index) – Returns character at the specified index
        System.out.println("charAt(1): " + buffer.charAt(1)); // 'e'

        // 10. setCharAt(int index, char ch) – Changes character at given index
        buffer.setCharAt(1, 'A');
        System.out.println("setCharAt(1, 'A'): " + buffer); // HAlloava

        // 11. length() – Returns the length of the string
        System.out.println("length(): " + buffer.length());

        // 12. setLength(int newLength) – Sets the length (truncates or pads with \u0000)
        buffer.setLength(5);
        System.out.println("setLength(5): " + buffer); // HAllo

        // 13. substring(int start) – Returns substring from start
        System.out.println("substring(2): " + buffer.substring(2)); // llo

        // 14. substring(int start, int end) – Returns substring between start and end-1
        System.out.println("substring(1, 4): " + buffer.substring(1, 4)); // All
    }
}
