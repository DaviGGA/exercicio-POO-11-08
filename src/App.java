import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos objetos você irá registrar?");
        int numeroDeObjetos = sc.nextInt();

        String[] nomes = new String[numeroDeObjetos];
        int[] quantidades = new int[numeroDeObjetos];
        double[] precosDeCompra = new  double[numeroDeObjetos];
        double[] precoDeVenda = new double[numeroDeObjetos];
        String[] categorias = new String[numeroDeObjetos];

        for (int i = 0; i < numeroDeObjetos; i++) {
            System.out.println("NOME:");
            nomes[i] = sc.next();

            System.out.println("QUANTIDADE:");
            quantidades[i] = sc.nextInt();

            System.out.println("PREÇO DE COMPRA:");
            precosDeCompra[i] = sc.nextDouble();

            System.out.println("PREÇO DE VENDA:");
            precoDeVenda[i] = sc.nextDouble();

            System.out.println("CATEGORIA:");
            categorias[i] = sc.next();

        }

        System.out.println("========================================");

        for (int i = 0 ; i < numeroDeObjetos; i++) {
            System.out.println(nomes[i] + " " + quantidades[i] + " "
            + precosDeCompra[i] + " " + precoDeVenda[i] + " " + categorias[i]
            );
        }

        System.out.println("========================================");

        for ( int i = 0 ; i < numeroDeObjetos; i++) {
            double lucroUnitario = precoDeVenda[i] - precosDeCompra[i];
            boolean obteveLucro = lucroUnitario > 0;

            if (obteveLucro) {
                System.out.println("O colecionador obteve lucro na venda do objeto " + nomes[i]);
            } else {
                System.out.println("O colecionador obteve prejuizo na venda do objeto " + nomes[i]);
            }

        }

        System.out.println("========================================");

        int maiorQuantidade = quantidades[0];
        String maiorQuantidadeNome = nomes[0];
        
        for ( int i = 0 ; i < numeroDeObjetos; i++) {
            
            if (quantidades[i] > maiorQuantidade) {
                maiorQuantidade = quantidades[i];
                maiorQuantidadeNome = nomes[i];
            }
        }

        int menorQuantidade = quantidades[0];
        String menorQuantidadeNome = nomes[0];
        
        for ( int i = 0 ; i < numeroDeObjetos; i++) {         
            if (quantidades[i] < menorQuantidade) {
                menorQuantidade = quantidades[i];
                menorQuantidadeNome = nomes[i];
            }
        }

        System.out.println("O objeto com maior quantidade foi o " + maiorQuantidadeNome + 
        " e o com menor foi o " + menorQuantidadeNome
        );

        System.out.println("========================================");

        double somaPrDeCompraTransportes = 0;
        int objetosDeTransporte = 0;

        for ( int i = 0 ; i < numeroDeObjetos; i++) { 

            if (categorias[i].equals("Transporte")) {
                somaPrDeCompraTransportes += precosDeCompra[i];
                objetosDeTransporte++;
            }     
        }

        double mediaPrDeCompraTransportes = somaPrDeCompraTransportes / objetosDeTransporte;
        System.out.println("A média do preço de compra de produtos de transporte é " + mediaPrDeCompraTransportes);

        System.out.println("========================================");

        int monetariosPrDeVendaMaiorQueCinco = 0;
        
        for ( int i = 0 ; i < numeroDeObjetos; i++) {   
            if(categorias[i].toLowerCase() == "monetário" && precoDeVenda[i] > 5.00) {
                monetariosPrDeVendaMaiorQueCinco += quantidades[i];
            }
        }

        System.out.println("Exitem " + monetariosPrDeVendaMaiorQueCinco + " objetos monetários com preço de venda superior a 5");

        System.out.println("========================================");

        double lucroTotal = 0;
        
        for ( int i = 0 ; i < numeroDeObjetos; i++) {   
            lucroTotal += (precoDeVenda[i] - precosDeCompra[i]) * quantidades[i];
        }

        boolean obteveLucro = lucroTotal > 0;

        if (obteveLucro) {
            System.out.println("O colecionador obteve um lucro total de R$" + lucroTotal);
        } else {
            System.out.println("O colecionador obteve um prejuízo total de R$" + lucroTotal);
        }


    }


}
