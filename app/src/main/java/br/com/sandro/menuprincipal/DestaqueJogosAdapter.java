package br.com.sandro.menuprincipal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class DestaqueJogosAdapter extends PagerAdapter {

    private List<DestaqueJogos> destaqueJogos;
    private LayoutInflater layoutInflater;
    private Context context;

    public DestaqueJogosAdapter(List<DestaqueJogos> destaqueJogos, Context context) {
        this.destaqueJogos = destaqueJogos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return destaqueJogos.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.model_item, container, false);

        ImageView imagem_jogo;
        TextView titulo, descricao;

        imagem_jogo = view.findViewById(R.id.imagem_jogo);
        titulo = view.findViewById(R.id.btn_generos);
        descricao = view.findViewById(R.id.descricao);

        imagem_jogo.setImageResource(destaqueJogos.get(position).getImagem());
        titulo.setText(destaqueJogos.get(position).getTitulo());
        descricao.setText(destaqueJogos.get(position).getDescricao());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Metodo onClick do card
            }
        });

        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}