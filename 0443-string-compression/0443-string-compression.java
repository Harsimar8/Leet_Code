class Solution {
    public int compress(char[] chars) {
        int anchor = 0; // Starting point of the current character sequence
        int write = 0; // Index for writing the compressed characters

        for (int read = 0; read < chars.length; read++) {
            // If this is the last character or the next character is different
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor]; // Write the character

                // If the sequence has more than one character, write the count
                if (read > anchor) {
                    for (char c : Integer.toString(read - anchor + 1).toCharArray()) {
                        chars[write++] = c;
                    }
                }

                anchor = read + 1; // Move the anchor to the next sequence
            }
        }

        return write; // Return the length of the compressed array
    }
}