//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Gente Grande");

        int anoDeLancamento = 2010;
        System.out.println("Ano de lançamento: "  + anoDeLancamento);
        boolean icluidoNoPlano = true;
        double notaDoFilme = 9.5;

        // Média calculada pelas 3 notas abaixo.
        double media = (5.0 + 7.9 + 6.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme: Gente Grande
                Filme de comédia do Adam Slander, para assistir com a Família
                Muito bom
                Ano de lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

        }
    }
