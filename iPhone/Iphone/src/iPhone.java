public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        // Testando ReprodutorMusical
        meuIphone.selecionarMusica("Minha Música Favorita");
        meuIphone.tocar();
        meuIphone.pausar();
        
        // Testando AparelhoTelefonico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        // Testando NavegadorInternet
        meuIphone.exibirPagina("www.exemplo.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
