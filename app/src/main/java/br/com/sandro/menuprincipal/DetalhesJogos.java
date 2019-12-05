package br.com.sandro.menuprincipal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalhesJogos extends AppCompatActivity {

    private TextView tv_titulo, tv_descricao, tv_categoria;
    private ImageView img_jogo, imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogos);
        getSupportActionBar().hide();

        tv_titulo = findViewById(R.id.txttitle);
        tv_descricao = findViewById(R.id.txtDesc);
        tv_categoria = findViewById(R.id.txtCat);
        img_jogo = findViewById(R.id.bookthumbnail);
        imagem = findViewById(R.id.imagem);

        // getExtras recebe os valores que foram passados no putExtras da Activity ListaJogos
        Intent intent = getIntent();
        String Titulo = intent.getExtras().getString("Titulo");
        String Descricao = intent.getExtras().getString("Descricao");
        int Imagem = intent.getExtras().getInt("ImagemGrande");

        // Passando valores para as views
        tv_titulo.setText(Titulo);
        tv_descricao.setText(Descricao);
        img_jogo.setImageResource(Imagem);
        imagem.setImageResource(Imagem);


    }
}
