public class MinhaClasse {
    
    public static void main(String[] args) {
        String primeironome = "Marcelo";
        String segundonome = "Duarte";
        String nomecompleto = nomeCompleto(primeironome, segundonome);

        System.out.println(nomecompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
