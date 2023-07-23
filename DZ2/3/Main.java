public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 2;

        shiftArray(array, n);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void shiftArray(int[] array, int n) {
        int length = array.length;
        int[] temp = new int[length];

        for (int i = 0; i < length; i++) {
            temp[(i + n) % length] = array[i];
        }

        for (int i = 0; i < length; i++) {
            array[i] = temp[i];
        }
    }
}