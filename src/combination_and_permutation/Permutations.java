package combination_and_permutation;

import java.util.*;

public class Permutations {

    /*
    1 부터 n 까지의 수 중, r 개를 나열하는 모든 경우
     */

    public List<List<Integer>> getAllListOfPermutations(int n, int r) {
        List<List<Integer>> result = new ArrayList<>();
        recursion(n, r, new ArrayList<>(), result);
        return result;
    }

    private void recursion(int n, int r, List<Integer> currList, List<List<Integer>> results) {
        if (currList.size() == r) {
            results.add(new ArrayList<>(currList));
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (currList.contains(i)) continue;
            currList.add(i);
            recursion(n, r, currList, results);
            currList.remove(currList.size() - 1);
        }
    }

}
