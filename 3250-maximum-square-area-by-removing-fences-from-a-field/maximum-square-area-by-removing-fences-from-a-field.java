class Solution {
    private int MOD = (int)1e9 + 7;
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        Arrays.sort(hFences);
        Arrays.sort(vFences);
        Set<Integer> horSet = new HashSet<>();
        horSet.add(hFences[0]-1);
        for (int i=1; i<=hFences.length; i++) {
            int curr = (i==hFences.length) ? m : hFences[i];
            for (int j=i-1; j>=0; j--) {
                horSet.add(curr-hFences[j]);
            }
            horSet.add(curr-1);
        }
        long area = -1;
        if (horSet.contains(vFences[0]-1)) area = (long)(vFences[0]-1)*(long)(vFences[0]-1);
        for (int i=1; i<=vFences.length; i++) {
            int curr = (i==vFences.length) ? n : vFences[i];
            for (int j=i-1; j>=0; j--) {
                if (horSet.contains(curr-vFences[j])) area = Math.max(area, (long)(curr-vFences[j])*(long)(curr-vFences[j]));
            }
            if (horSet.contains(curr-1)) area = Math.max(area, (long)(curr-1)*(long)(curr-1));
        }
        return (int)(area % MOD);
    }
}