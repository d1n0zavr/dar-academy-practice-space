public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] charArray = new char[indices.length];

        int count = 0;
        for (int i : indices) {
            charArray[i] = s.charAt(count++);
        }

        return new String(charArray);
    }
}
