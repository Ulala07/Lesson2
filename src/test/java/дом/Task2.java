/**
 * Задание 1 от 24.02
 */
package дом;

public class Task2 {
    public static void main(String[] args) {
        int number = 10;
        int [] numbers = new int [5];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = i*10;
        }
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
