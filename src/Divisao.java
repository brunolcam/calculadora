public class Divisao extends OperacaoMatematica {
    @Override
    public float calcular(float a, float b) {
        if (b != 0) {
            setHistorico("\nDivisão: " + a + " / " + b + " = " + (a / b));
            return a / b;
        } else {
            System.out.println("Não é possível dividir por zero");
            return 0;
        }
    }
}
