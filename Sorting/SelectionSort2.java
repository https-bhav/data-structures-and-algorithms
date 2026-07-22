public class SelectionSort2 {
    public static void selectSort(int[] arr){
        int n = arr.length;

        for(int i=n-1; i>0; i--){
            int max = Integer.MIN_VALUE;
            int maxdx = -1;
            for(int j=i; j>=0; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxdx = j;
                }
            }

            swap(arr, i, maxdx);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        selectSort(arr);

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
