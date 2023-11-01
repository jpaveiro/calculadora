package entities;

public class Calculadora {

    public float processar(float n1, String operador, float n2) {
        float resultado;

        switch (operador) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            default:
                System.out.println("Ocorreu um erro ao executar a conta!");
                resultado = 0;
                break;
        }
        return resultado;
    }
}