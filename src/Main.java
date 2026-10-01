// TODO: musimy dodac brakujace klasy!
// OK, ja dodam ‘Adder‘, a s12345 doda ‘Subtractor‘
class Adder {
    public int add(int a, int b) {
        return a + b;
    }
}

class Subtractor {
    public int subtract(int a, int b) {
        return a - b;
    }
}

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));
        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6, 3));
    }

}
