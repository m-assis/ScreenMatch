public class principal {
    public static void main(String[] args) {
        filme meufilme = new filme();

        meufilme.setNome("O pederoso chefão");
        meufilme.setAnoDelancamento(1970);
        meufilme.setDuracaoEmMinutos(180);

        meufilme.exibeFichaTecnica();
        meufilme.avalia(8);
        meufilme.avalia(5);
        meufilme.avalia(10);
        System.out.println("Total de avaliações" + meufilme.getTotalDeAvaliacoes());
        System.out.println(meufilme.pegaMedia());
        //meufilme.somaDasAvaliacoes = 10;
        //meufilme.totalDeAvaliacoes = 1;
        //System.out.println(meufilme.pegaMedia());


    }
}
