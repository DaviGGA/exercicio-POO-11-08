import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos carros você irá registrar?");
        int numeroDeCarros = sc.nextInt();

        String[] nomes = new String[numeroDeCarros];
        int[] quantidades = new int[numeroDeCarros];
        double[] precosDeCompra = new  double[numeroDeCarros];
        double[] precoDeVenda = new double[numeroDeCarros];
        String[] categoria = new String[numeroDeCarros];


        for (int i = 0; i < numeroDeCarros; i++) {
            System.out.println("NOME:");
            nomes[i] = sc.next();

            System.out.println("QUANTIDADE:");
            quantidades[i] = sc.nextInt();

            System.out.println("PREÇO DE COMPRA:");
            precosDeCompra[i] = sc.nextDouble();

            System.out.println("PREÇO DE VENDA:");
            precoDeVenda[i] = sc.nextDouble();

            System.out.println("CATEGORIA:");
            categoria[i] = sc.next();

        }

        System.out.println("========================================");

        for (int i = 0 ; i < numeroDeCarros; i++) {
            System.out.println(nomes[i] + " " + quantidades[i] + " "
            + precosDeCompra[i] + " " + precoDeVenda[i] + " " + categoria[i]
            );
        }

        System.out.println("========================================");

        for ( int i = 0 ; i < numeroDeCarros; i++) {
            double lucroUnitario = precoDeVenda[i] - precosDeCompra[i];
            boolean obteveLucro = lucroUnitario > 0;

            if (obteveLucro) {
                System.out.println("O colecionador obteve lucro na venda do carro " + nomes[i]);
            } else {
                System.out.println("O colecionador obteve prejuizo na venda do carro " + nomes[i]);
            }

        }

        System.out.println("========================================");

        int maiorQuantidade = quantidades[0];
        String maiorQuantidadeNome = nomes[0];
        for ( int i = 0 ; i < numeroDeCarros; i++) {
            
            if (quantidades[i] > maiorQuantidade) {
                maiorQuantidade = quantidades[i];
                maiorQuantidadeNome = nomes[i];
            }
        }

        int menorQuantidade = quantidades[0];
        String menorQuantidadeNome = nomes[0];
        for ( int i = 0 ; i < numeroDeCarros; i++) {
            
            if (quantidades[i] < menorQuantidade) {
                menorQuantidade = quantidades[i];
                menorQuantidadeNome = nomes[i];
            }
        }

        System.out.println("O Carro com maior quantidade foi o " + maiorQuantidadeNome + 
        " e o com menor foi o " + menorQuantidadeNome
        );



    }


}
