public class Adicao extends OperacaoMatematica {
    @Override
    public float calcular(float a, float b) {
        setHistorico("\nAdição: " + a + " + " + b + " = " + (a + b));
        return a + b;
    }
}
