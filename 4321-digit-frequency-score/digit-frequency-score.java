class Solution {
    public int digitFrequencyScore(int n) {
     HashMap<Integer, Integer> hp = new HashMap<>();
int sum=0;
while (n > 0) {
    int rem = n % 10;

    if (hp.containsKey(rem)) {
        hp.put(rem, hp.get(rem) + 1);
    } else {
        hp.put(rem, 1);
    }

    n = n / 10;
}
for (Map.Entry<Integer, Integer> entry : hp.entrySet()) {
    int key = entry.getKey();
    int value = entry.getValue();
    int res=key*value;
    sum=sum+res;
    }
    return sum;
}
}