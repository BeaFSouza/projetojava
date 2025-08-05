public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2010;
        boolean icluidoNoPlano = true;
        double notaDoFilme = 9.5;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2025){
            System.out.println("Lançamentos do ano!");
        } else {
            System.out.println("Filme antigos, mais curtidos!");
        }
        if (icluidoNoPlano == true || tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado!");
        } else{
            System.out.println("Filme precisa ser alugado!");
        }
    }
}
