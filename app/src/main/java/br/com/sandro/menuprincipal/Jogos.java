package br.com.sandro.menuprincipal;

public class Jogos {

    private String Titulo, Categoria, Descricao, Genero, Desenvolvedora;
    private int ImagemPequena, ImagemGrande, JogoFavorito, Avaliacao;

    public Jogos() {
    }

    public Jogos(String titulo, String categoria, String descricao, String genero, String desenvolvedora, int imagemPequena, int imagemGrande, int avaliacao, int jogoFavorito) {
        Titulo = titulo;
        Categoria = categoria;
        Descricao = descricao;
        ImagemPequena = imagemPequena;
        ImagemGrande = imagemGrande;
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

    public int getImagemPequena() {
        return ImagemPequena;
    }

    public void setImagemPequena(int imagemPequena) {
        ImagemPequena = imagemPequena;
    }

    public int getImagemGrande() {
        return ImagemGrande;
    }

    public void setImagemGrande(int imagemGrande) {
        ImagemGrande = imagemGrande;
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
