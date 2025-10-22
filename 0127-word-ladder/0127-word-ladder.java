import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0;

        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int level = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                String word = q.poll();
                char[] arr = word.toCharArray();

                for (int j = 0; j < arr.length; j++) {
                    char first = arr[j];

                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == first) continue;
                        arr[j] = c;
                        String second = new String(arr);

                        if (second.equals(endWord)) return level + 1;

                        if (wordSet.contains(second)) {
                            q.offer(second);
                            wordSet.remove(second); 
                        }
                    }

                    arr[j] = first; 
                }
            }

            level++;
        }

        return 0;
    }
}
