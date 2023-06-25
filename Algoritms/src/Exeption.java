public class Exeption {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int symm = 0;
        try {
            for (int i = 0; i < 6; i++) {
                symm += arr[i];
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("массив закончился");
        }

        System.out.println(symm);
    }

}
