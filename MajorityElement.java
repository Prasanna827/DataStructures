class MajorityElement {
    public static void main(String[] args) {
        int[] num = {2, 2, 1, 1, 1, 2, 2};
        int majority = findMajorityElement(num);
        System.out.println("Majority Element: " + majority);
    }

    public static int findMajorityElement(int[] num) {
        int majority = num[0];
        int votes = 1;

        for (int i = 1; i < num.length; i++) {
            if (votes == 0) {
                majority = num[i];
                votes = 1;
            } else if (majority == num[i]) {
                votes++;
            } else {
                votes--;
            }
        }

        return majority;
    }
}
