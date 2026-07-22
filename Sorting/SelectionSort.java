public class SelectionSort {

    public static void selectSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;

            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }

            swap(arr, i, mindx);
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