public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        } catch (Exception e) {
            System.out.println("General exception: " + e);
        }
    }
}
