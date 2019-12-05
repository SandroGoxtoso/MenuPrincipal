package br.com.sandro.menuprincipal;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Jogos> listaJogos;
    List<Model> models;
    ViewPager viewPager;
    Adapter adapter;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        models = new ArrayList<>();
        models.add(new Model(R.mipmap.modern_warfare_logo_foreground, "Call of Duty - Modern Warfare", "Call of Duty: Modern Warfare é um jogo eletrônico de tiro em primeira pessoa prod..."));
        models.add(new Model(R.mipmap.farcry5_logo_foreground, "Far Cry 5", "Far Cry 5 é um jogo eletrônico de tiro em primeira pessoa de ação-aventura ambien..."));
        models.add(new Model(R.mipmap.battlefield5_logo_foreground, "Battlefield V", "Battlefield V é um jogo eletrônico de tiro em primeira pessoa, desenvolvido pela Crite..."));
        models.add(new Model(R.mipmap.reddead_logo_foreground, "Red Dead Redemption II", "Red Dead Redemption 2 é um jogo eletrônico de ação-aventura desenvolvido e publicado pela..."));


        adapter = new Adapter(models, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 0, 130, 0);

        Integer[] colors_temp = {
                /*
                * Define as cores do background em values -> colors.xml
                * */
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position < (adapter.getCount() - 1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor(
                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                } else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });


        listaJogos = new ArrayList<>();
        /*
         * new Jogos() - criar um novo card
         * */
        listaJogos.add(new Jogos("Fallout IV - Standart Edition", "Jogos", "", "• RPG", "Bethesda Game Studios", R.mipmap.fallout4_logo, R.mipmap.fallout4_logo, 2, R.mipmap.nao_favorito_icon_foreground));
        listaJogos.add(new Jogos("Super Mario World", "Jogos", "", "• Plataforma  • Ação", "Nintendo Co., Ltd.", R.mipmap.supermario_logo, R.mipmap.supermario_logo, 5, R.mipmap.favorito_icon_foreground));
        listaJogos.add(new Jogos("Grand Theft Auto V", "Jogos", "", "• Ação  • Aventura", "Rockstar North.", R.mipmap.gta5_logo, R.mipmap.gta5_logo, 5, R.mipmap.favorito_icon_foreground));
        listaJogos.add(new Jogos("The last of us", "Jogos", "", "• Ação  • Aventura  • Sobrevivência", "Konami", R.mipmap.tlou_logo, R.mipmap.tlou_logo, 3, R.mipmap.nao_favorito_icon_foreground));

        RecyclerView mrcv = findViewById(R.id.recyclerview_id);
        ListaJogos myAdapter = new ListaJogos(this, listaJogos);

        /*
         * spanCount Define a quantidade de cards que irá aparecer na horizontal
         * */
        mrcv.setLayoutManager(new GridLayoutManager(this, 1));
        mrcv.setAdapter(myAdapter);


    }
}
