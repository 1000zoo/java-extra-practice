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

    /*
    String array 의 원소들 나열 (array 내에 중복된 원소는 없다고 가정)
     */

    public List<List<String>> getAllListOfPermutations(String[] arr) {
        List<List<String>> result = new ArrayList<>();
        recursion(arr, new ArrayList<>(), result);
        return result;
    }

    private void recursion(String[] arr, List<String> currList, List<List<String>> result) {
        if (currList.size() == arr.length) {
            result.add(new ArrayList<>(currList));
            return;
        }

        for (String s : arr) {
            if (currList.contains(s)) continue;
            currList.add(s);
            recursion(arr, currList, result);
            currList.remove(currList.size() - 1);
        }
    }

    public List<List<Integer>> getListPermutationsWithDuplicates(int[] arr, int length) {
        List<List<Integer>> result = new ArrayList<>();
        recursionForDuplicates(arr, length, new ArrayList<>(), result);
        return result;
    }

    private void recursionForDuplicates(int[] arr, int length, List<Integer> currList, List<List<Integer>> result) {
        if (currList.size() == length) {
            result.add(new ArrayList<>(currList));
            return;
        }

        for (int i : arr) {
            currList.add(i);
            recursionForDuplicates(arr, length, currList, result);
            currList.remove(currList.size() - 1);
        }
    }

}
