public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int iF = 0;
        int iS = 0;
        int arrF = 0;
        int arrS = 0;

        while (true) {
            // stop loop
            if (word1.length <= arrF && word2.length <= arrS) {
                break;
            }

            // check
            if(word1[arrF].charAt(iF++) != word2[arrS].charAt(iS++)) {
                return false;
            }

            // next array
            if(word1[arrF].length() <= iF) {
                arrF++;
                iF = 0;
            }
            if(word2[arrS].length() <= iS) {
                arrS++;
                iS = 0;
            }


            if((word1.length > arrF && word2.length <= arrS) || (word2.length > arrS && word1.length <= arrF)) {
                return false;
            }
        }

        return true;
    }
}
