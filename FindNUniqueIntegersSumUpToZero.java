public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] ans = new int[n];

        int k = 0;
        int index = 0;
        int val = 1;
        while (k < n / 2) {
            ans[index] = val;
            ans[index + 1] = -val;

            ++k;
            ++val;
            index += 2;
        }

        if(ans.length % 2 == 1) {
            ans[ans.length - 1] = 0;
        }

        return ans;
    }
}
