package br.com.sandro.menuprincipal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JogosActivity extends AppCompatActivity {

    private TextView tv_titulo, tv_descricao, tv_categoria;
    private ImageView img_jogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogos);

        tv_titulo = findViewById(R.id.txttitle);
        tv_descricao = findViewById(R.id.txtDesc);
        tv_categoria = findViewById(R.id.txtCat);
        img_jogo = findViewById(R.id.bookthumbnail);

        // Receber dados
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Titulo");
        String Description = intent.getExtras().getString("Descricao");
        int image = intent.getExtras().getInt("ImagemJogo");

        // Passando valores
        tv_titulo.setText(Title);
        tv_descricao.setText(Description);
        img_jogo.setImageResource(image);


    }
}
