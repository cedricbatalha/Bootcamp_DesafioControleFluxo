import java.util.Scanner;
import java.util.Locale;

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametroInvalidoException e) {
            //imprimir a mensagem
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametroInvalidoException {
        if(parametroUm > parametroDois)
          throw new ParametroInvalidoException();   //valida se parametroUm é MAIOR que parametroDois e lançar a exceção

        int contagem = parametroDois - parametroUm;

        //realizar o for para imprimir os números com base na variável contagem
        for (int indice=0; indice < contagem; indice++){
            System.out.println("Imprimindo o número " + (indice+1));
        }

    }
}