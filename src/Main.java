public class Main{
    public static void main(String[] args) {

        // fluxo de atraso

        int diasAtraso = 5;
        double valorMultaPorDia = 1.00; // double caso futuramente tenha alteração de preço e tenha centavos

        double valorTotal = diasAtraso * valorMultaPorDia;

        if (diasAtraso > 0) {
            System.out.printf("Valor da multa: R$ %.2f", valorTotal);

        } else {
            System.out.println("Você não tem pendências.");
        }
    }
}