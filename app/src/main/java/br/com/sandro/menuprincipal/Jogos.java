package br.com.sandro.menuprincipal;

public class Jogos {

    private String Titulo, Categoria, Descricao, Genero, Desenvolvedora;
    private int ImagemPequenaTP, ImagemGrandeTP, JogoFavorito, Avaliacao;

    public Jogos() {
    }

    // Define o construtor da classe passando como parametro os dados do jogo
    // TP = Tela Principal
    // TDJ = Tela Detalhes Jogos

    public Jogos(String titulo, String categoria, String descricao, String genero, String desenvolvedora, int img_pequena_TP, int img_grande_TP, int avaliacao, int jogoFavorito) {
        Titulo = titulo;
        Categoria = categoria;
        Descricao = descricao;
        ImagemPequenaTP = img_pequena_TP;
        ImagemGrandeTP = img_grande_TP;
        JogoFavorito = jogoFavorito;
        Genero = genero;
        Desenvolvedora = desenvolvedora;
        Avaliacao = avaliacao;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getDesenvolvedora() {
        return Desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        Desenvolvedora = desenvolvedora;
    }

    public int getImagem_Pequena_TP() {
        return ImagemPequenaTP;
    }

    public void setImagem_Pequena_TP(int imagem_Pequena_TP) {
        ImagemPequenaTP = imagem_Pequena_TP;
    }

    public int getImagemGrandeTP() {
        return ImagemGrandeTP;
    }

    public void setImagemGrandeTP(int imagemGrandeTP) {
        ImagemGrandeTP = imagemGrandeTP;
    }

    public int getAvaliacao() {
        return Avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        Avaliacao = avaliacao;
    }

    public int getJogoFavorito() {
        return JogoFavorito;
    }

    public void getJogoFavorito(int jogoFavorito) {
        JogoFavorito = jogoFavorito;
    }

}
