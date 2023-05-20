class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        for (int i = 0; i <= numRows - 1; i++) {
            List<Integer> ret2 = new ArrayList<Integer>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    ret2.add(1);
                } else {
                    ret2.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }

            ret.add(ret2);
        }

        return ret;
    }
}
