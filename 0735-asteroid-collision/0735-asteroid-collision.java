class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;

        for (int i = 0; i < n; i++) {
            if (asteroids[i] > 0) {
                st.push(asteroids[i]);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])) {
                    st.pop(); // smaller positive asteroid destroyed
                }

                if (!st.isEmpty() && st.peek() > 0 && st.peek() == Math.abs(asteroids[i])) {
                    st.pop(); // both destroyed
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]); // no collision or top is negative
                }
            }
        }

        int[] res = new int[st.size()];
        int i = 0;
        while (!st.isEmpty()) {
            res[i++] = st.pop();
        }

        reverse(res);
        return res;
    }

    public void reverse(int[] res) {
        int n = res.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left++;
            right--;
        }
    }
}
