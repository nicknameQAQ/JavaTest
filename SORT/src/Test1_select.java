public class Test1_select {
    public static void main(String[] args) {
        int[] arr = {94,32,235,525,123,23};
        Code01_SelectionSort.selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
