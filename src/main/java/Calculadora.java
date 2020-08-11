public class Calculadora {

    public int somar (int number1, int number2) {
        return number1 + number2;
    }

    public int dividir (int number1, int number2) throws Exception {
        if (number2 == 0) {
            throw new Exception ("Numero 2 nao pode ser 0 para divisao.");
        } else {
            return number1 / number2;
        }
    }

    public double multiplicar (int number1, int number2) {
        return number1 * number2;
    }
}
