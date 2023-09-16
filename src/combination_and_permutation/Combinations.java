package combination_and_permutation;

import java.util.*;

public class Combinations {

    /*
    1 부터 n 사이의 수를 r 개 뽑기
     */
    public List<List<Integer>> getAllListOfCombinations(int n, int r) {
        List<List<Integer>> result = new ArrayList<>();
        recursion(n, r, 1, new ArrayList<>(), result);
        return result;
    }

    private void recursion(int n, int r, int index, List<Integer> currList, List<List<Integer>> result) {
        if (currList.size() == r) {
            result.add(new ArrayList<>(currList));
            return;
        }

        for (int i = index; i <= n; i++) {
            currList.add(i);
            recursion(n, r, i + 1, currList, result);
            currList.remove(currList.size() - 1);
        }
    }

}
