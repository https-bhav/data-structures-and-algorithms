public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            boolean flag = true;
            for(int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    flag = false;
                    break;
                }
            }
            if(flag) break;
        }
    }

    public static void main(String[] args) {

        int[] arr = {4,1,2,3,5};

        bubbleSort(arr);

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}

// Time Complexity : O(n^2)
