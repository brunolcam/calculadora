public class Subtracao extends OperacaoMatematica {
    @Override
    public float calcular(float a, float b) {
        setHistorico("\nSubtração: " + a + " - " + b + " = " + (a - b));
        return a - b;
    }
}
