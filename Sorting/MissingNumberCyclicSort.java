class Solution {
    public int missingNumber(int[] arr) {
        sort(arr);

        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i) return i;
            i++;
        }

        return arr.length;
    }

    public void sort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == arr.length || arr[i] == i) {
                i++;
            } else {
                swap(arr, i, arr[i]);
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}