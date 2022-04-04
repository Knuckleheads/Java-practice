public class Array {
    public static void main(String[] args) {
        char[] array = {'a','b','c','d'};

        reverseArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static char[] reverseArray(char[] array) {
        for (int i = 0 ; i < array.length/2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
