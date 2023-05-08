public abstract class OperacaoMatematica {
    private static int qtdeObjetos;
    private static String historico="";

    public OperacaoMatematica() {
        qtdeObjetos++;
    }

    public static int getQtdeObjetos() {
        return qtdeObjetos;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico += historico;
    }

    public abstract float calcular(float a, float b);
}
