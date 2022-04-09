/**
 * Задание 2 от 24.02
 */
package дом;

public class Pig extends Animals implements AnialColor{

    public Pig(String name) {
        super(name);
    }

    public void say(){
        System.out.println("Hru");
    }

    @Override
    public void getColor() {
        System.out.println("Pink");
    }
}
