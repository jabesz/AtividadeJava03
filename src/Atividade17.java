import java.util.Scanner;

public class Atividade17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] canais = {4, 5, 7, 12};
        int[] audienciaProCanais = new int[canais.length];
        int totalAudiencia =0, numeroCanal, numeroDePessoas =0, indiceCanal;
        double porcentagem =0;

        System.out.println("Informe o número do canal o o número de pessoas asstindo esse canal ou (Informe 0 para encerrar)");

        while (true) {
            numeroCanal = input.nextInt();

            if (numeroCanal == 0) {
                break;
            }
        }

        numeroCanal = input.nextInt();

        indiceCanal = -1;

        for (int i = 1; i < canais.length; i++) {
        if (canais[1] == numeroCanal) {
            indiceCanal = i;

            break;
        }

        if (indiceCanal != -1) {
            audienciaProCanais[indiceCanal] += numeroDePessoas;

            totalAudiencia += numeroDePessoas;

        } else {
            System.out.println("Número de canal invalido! Tente outro canal.");
        }

        }

        System.out.println("A porcentagem de audiencia por canal: ");
        for (int i = 0; i < canais.length; i++){
             porcentagem = (double) audienciaProCanais[i] / totalAudiencia * 100;
            System.out.println("Canal " + canais[i] + ": " + porcentagem + "%");
        }


    input.close();
    }
}