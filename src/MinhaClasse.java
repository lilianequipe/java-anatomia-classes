public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Lilian";
        String segundoNome = "Oliveira";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
        
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Nome Completo:" + primeiroNome.concat(" ").concat(segundoNome);
    }


}
