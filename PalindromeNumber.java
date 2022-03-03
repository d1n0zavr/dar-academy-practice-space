public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 ==  0 && x != 0)) {
            return false;
        }

        int rPart = 0;

        while(x > rPart) {
            rPart = rPart * 10 + x % 10;
            x /= 10;
        }

        return x == rPart / 10 || x == rPart;
    }
}
