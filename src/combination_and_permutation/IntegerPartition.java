package combination_and_permutation;

import java.util.*;

public class IntegerPartition {

    /*
    자연수 n을 길이 r인 배열에 나누어 배치하기
     */
    public List<int[]> getPartitionSet(int n, int r) {
        List<int[]> result = new ArrayList<>();
        recursion(n, 0, new int[r], result, new HashSet<>());
        return result;
    }

    private void recursion(int n, int index, int[] arr, List<int[]> result, Set<String> set) {
        if (n == 0 && index == arr.length) {
            if (!set.contains(Arrays.toString(arr))) {
                result.add(arr.clone());
                set.add(Arrays.toString(arr));
            }
            return;
        }
        if (n < 0 || index == arr.length) return;

        for (int i = 0; i <= n; i++) {
            arr[index] = i;
            recursion(n - i, index + 1, arr, result, set);
        }
    }

}
