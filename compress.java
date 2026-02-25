class Solution {
    public int compress(char[] chars) {
        int write = 0; // where we write
        int i = 0;     // where we read

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            // Count duplicates
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // Write the character
            chars[write++] = current;

            // Write count if more than 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
