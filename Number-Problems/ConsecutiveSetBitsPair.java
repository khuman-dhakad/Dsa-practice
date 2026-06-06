class ConsecutiveSetBitsPair {
    public boolean consecutiveSetBits(int n) {

        String pair = Integer.toBinaryString(n);
        int count = 0;

        for(int i = 0; i < pair.length() - 1; i++) {

            if(pair.charAt(i) == '1' &&
               pair.charAt(i + 1) == '1') {

                count++;
            }
        }

        return count == 1;
    }
}