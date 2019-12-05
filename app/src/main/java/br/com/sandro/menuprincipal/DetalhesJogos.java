package br.com.sandro.menuprincipal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalhesJogos extends AppCompatActivity {

    private TextView tv_titulo, tv_descricao, tv_categoria;
    private ImageView img_grande, img_pequena_1, img_pequena_2, img_pequena_3, img_pequena_4, img_pequena_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogos);
        // Deixa a Action Bar invisível
        getSupportActionBar().hide();

        img_grande = findViewById(R.id.img_grande);
        img_pequena_1 = findViewById(R.id.img_pequena);
        img_pequena_2 = findViewById(R.id.img_pequena_2);
        img_pequena_3 = findViewById(R.id.img_pequena_3);
        img_pequena_4 = findViewById(R.id.img_pequena_4);
        img_pequena_5 = findViewById(R.id.img_pequena_5);

        // getExtras recebe os valores que foram passados no putExtras da Activity ListaJogos
        Intent intent = getIntent();
        int ig = intent.getExtras().getInt("ImagemGrandeTDJ");
        int ip1 = intent.getExtras().getInt("ImagemPequena1TDJ");
        int ip2 = intent.getExtras().getInt("ImagemPequena2TDJ");
        int ip3 = intent.getExtras().getInt("ImagemPequena3TDJ");
        int ip4 = intent.getExtras().getInt("ImagemPequena4TDJ");
        int ip5 = intent.getExtras().getInt("ImagemPequena5TDJ");

        // Passando valores para as views
        img_grande.setImageResource(ig);
        img_pequena_1.setImageResource(ip1);
        img_pequena_2.setImageResource(ip2);
        img_pequena_3.setImageResource(ip3);
        img_pequena_4.setImageResource(ip4);
        img_pequena_5.setImageResource(ip5);
    }
}
