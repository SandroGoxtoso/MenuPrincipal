package br.com.sandro.menuprincipal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalhesJogos extends AppCompatActivity {

    private TextView tv_titulo, tv_descricao, tv_categoria, tv_min_valor, tv_max_valor;
    private ImageView img_grande, img_pequena_1, img_pequena_2, img_pequena_3, img_pequena_4, img_pequena_5, fav_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogos);
        // Deixa a Action Bar invisível
        getSupportActionBar().hide();

        tv_titulo = findViewById(R.id.tv_titulo);
        tv_min_valor = findViewById(R.id.tv_min_valor);
        tv_max_valor = findViewById(R.id.tv_max_valor);
        img_grande = findViewById(R.id.img_grande);
        img_pequena_1 = findViewById(R.id.img_pequena_1);
        img_pequena_2 = findViewById(R.id.img_pequena_2);
        img_pequena_3 = findViewById(R.id.img_pequena_3);
        img_pequena_4 = findViewById(R.id.img_pequena_4);
        img_pequena_5 = findViewById(R.id.img_pequena_5);
        fav_icon = findViewById(R.id.fav_icon);

        // getExtras recebe os valores que foram passados no putExtras da Activity ListaJogos
        Intent intent = getIntent();
        String titulo = intent.getExtras().getString("Titulo");
        int minVal = intent.getExtras().getInt("MinValor");
        int maxVal = intent.getExtras().getInt("MaxValor");
        int ig = intent.getExtras().getInt("ImagemGrandeTDJ");
        int ip1 = intent.getExtras().getInt("ImagemPequena1TDJ");
        int ip2 = intent.getExtras().getInt("ImagemPequena2TDJ");
        int ip3 = intent.getExtras().getInt("ImagemPequena3TDJ");
        int ip4 = intent.getExtras().getInt("ImagemPequena4TDJ");
        int ip5 = intent.getExtras().getInt("ImagemPequena5TDJ");
        int ficon = intent.getExtras().getInt("JogoFavorito");

        // Passando valores para as views
        tv_titulo.setText(titulo);
        tv_min_valor.setText("Min     R$ " + minVal);
        tv_max_valor.setText("Max     R$ " + maxVal);
        img_grande.setImageResource(ig);
        img_pequena_1.setImageResource(ip1);
        img_pequena_2.setImageResource(ip2);
        img_pequena_3.setImageResource(ip3);
        img_pequena_4.setImageResource(ip4);
        img_pequena_5.setImageResource(ip5);
        fav_icon.setImageResource(ficon);
    }

    public void alteraImagem1(View view) {
        Intent intent = getIntent();
        img_grande = findViewById(R.id.img_grande);
        img_pequena_1 = findViewById(R.id.img_pequena_1);
        int ip1 = intent.getExtras().getInt("ImagemPequena1TDJ");
        img_grande.setImageResource(ip1);
    }

    public void alteraImagem2(View view) {
        Intent intent = getIntent();
        img_grande = findViewById(R.id.img_grande);
        img_pequena_1 = findViewById(R.id.img_pequena_1);
        int ip1 = intent.getExtras().getInt("ImagemPequena2TDJ");
        img_grande.setImageResource(ip1);
    }

    public void alteraImagem3(View view) {
        Intent intent = getIntent();
        img_grande = findViewById(R.id.img_grande);
        img_pequena_1 = findViewById(R.id.img_pequena_1);
        int ip1 = intent.getExtras().getInt("ImagemPequena3TDJ");
        img_grande.setImageResource(ip1);
    }

    public void alteraImagem4(View view) {
        Intent intent = getIntent();
        img_grande = findViewById(R.id.img_grande);
        img_pequena_1 = findViewById(R.id.img_pequena_1);
        int ip1 = intent.getExtras().getInt("ImagemPequena4TDJ");
        img_grande.setImageResource(ip1);
    }

    public void alteraImagem5(View view) {
        Intent intent = getIntent();
        img_grande = findViewById(R.id.img_grande);
        img_pequena_1 = findViewById(R.id.img_pequena_1);
        int ip1 = intent.getExtras().getInt("ImagemPequena5TDJ");
        img_grande.setImageResource(ip1);
    }

}
