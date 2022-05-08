public class MinMax {
    int [] array;

    public int[] getMinMax(int[] Arr) {
        int n = Arr.length;
        int[] min_max = new int[]{Arr[0], Arr[0]};

        for(int i = 1; i < n; i++) {
            if (Arr[i] <= min_max[0]) {
                min_max[0] = Arr[i];
            } else if (Arr[i] >= min_max[1]) {
                min_max[1] = Arr[i];
            }
        }

        return min_max;
    }
}
