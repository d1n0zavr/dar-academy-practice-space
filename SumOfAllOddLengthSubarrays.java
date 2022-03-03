public class SumOfAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        if(arr.length == 1) {
            return arr[0];
        }

        int[] arrPrefix = new int[arr.length];

        int sum = 0;

        // define prefix
        for(int i = 0; i < arr.length; ++i) {
            arrPrefix[i] = arr[i];
            if (i > 0) {
                arrPrefix[i] += arrPrefix[i - 1];
            }
        }

        // subarray size [1]
        sum += arrPrefix[arrPrefix.length - 1];

        // if arr size odd
        if (arr.length % 2 == 1) {
            sum += arrPrefix[arrPrefix.length - 1];
        }

        int curSize = arr.length % 2 == 0 ? arr.length - 1 : arr.length - 2;
        int l = 0;
        int r = curSize - 1;

        while (curSize > 2) {
            if(r >= arr.length) {
                curSize -= 2;
                l = 0;
                r = curSize - 1;
                continue;
            }
            sum += l == 0 ? arrPrefix[r] : arrPrefix[r] - arrPrefix[l - 1];
            l++;
            r++;
        }
        return sum;
    }
}
