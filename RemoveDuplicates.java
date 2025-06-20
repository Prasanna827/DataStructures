class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int length = removeDuplicates(arr);
        
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int rd = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[rd] != arr[i]) {
                rd++;
                arr[rd] = arr[i];
            }
        }
        return rd + 1;
    }
}
