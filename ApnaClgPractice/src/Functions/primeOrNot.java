class Solution {
    public static int solution(String s, int m, int n) {
        String original = s;
        String current = s;
        int turns = 0;
        
        while (true) {
            // Perform Harry's turn: rotate by m
            int len = current.length();
            m = m % len; // Handle cases where m is greater than the length of the string
            current = current.substring(len - m) + current.substring(0, len - m);
            turns++;

            // Perform Ron's turn: rotate by n
            n = n % len; // Handle cases where n is greater than the length of the string
            current = current.substring(len - n) + current.substring(0, len - n);
            turns++;

            // Check if we've returned to the original string
            if (current.equals(original)) {
                return turns;
            }
        }
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "abcdef";
        int m1 = 2;
        int n1 = 3;

        String s2 = "xyz";
        int m2 = 1;
        int n2 = 2;

        String s3 = "helloworld";
        int m3 = 4;
        int n3 = 5;

        // Print results
        System.out.println("Turns for s1: " + solution(s1, m1, n1));
        System.out.println("Turns for s2: " + solution(s2, m2, n2));
        System.out.println("Turns for s3: " + solution(s3, m3, n3));
    }
}