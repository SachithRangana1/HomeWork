

public static void main(String[] args) {
    int rows = 5;
    int i = 1;

    while (i <= rows) {
        int j = 1;
        while (j <= rows) {
            System.out.print(j <= i ? "*" : " ");
            j++;
        }
        System.out.println();
        i++;
    }
}