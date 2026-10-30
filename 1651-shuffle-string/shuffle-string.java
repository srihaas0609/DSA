class Solution {
    public String restoreString(String s, int[] indices) {

        HashMap<Integer, Character> mp = new HashMap<>();

        for(int i = 0; i < indices.length; i++) {
            mp.put(indices[i], s.charAt(i));
        }

        TreeMap<Integer, Character> hp = new TreeMap<>(mp);

        String s1 = "";

        for(int i : hp.keySet()) {
            s1 += hp.get(i);
        }

        return s1;
    }
}