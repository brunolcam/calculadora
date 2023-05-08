public class Multiplicacao extends OperacaoMatematica {
    @Override
    public float calcular(float a, float b) {
        setHistorico("\nMultiplicação: " + a + " x " + b + " = " + (a * b));
        return a * b;
    }
}
