public class Programa {
    public static void main(String[] args) {

        OperacaoMatematica adicao = new Adicao();
        OperacaoMatematica subtracao = new Subtracao();
        OperacaoMatematica multiplicacao = new Multiplicacao();
        OperacaoMatematica divisao = new Divisao();

        System.out.println(adicao.calcular(60,5));
        System.out.println(adicao.calcular(4,6));
        System.out.println(adicao.getHistorico());
        System.out.println("_____________");

        System.out.println(subtracao.calcular(60,5));
        System.out.println(subtracao.calcular(4,6));
        System.out.println(subtracao.getHistorico());
        System.out.println("_____________");

        System.out.println(multiplicacao.calcular(60,5));
        System.out.println(multiplicacao.calcular(4,6));
        System.out.println(multiplicacao.getHistorico());
        System.out.println("_____________");

        System.out.println(divisao.calcular(60,5));
        System.out.println(divisao.calcular(4,6));
        System.out.println(divisao.getHistorico());
        System.out.println("_____________");
    }
}