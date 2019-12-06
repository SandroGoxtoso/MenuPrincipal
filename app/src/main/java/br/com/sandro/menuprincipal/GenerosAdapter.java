package br.com.sandro.menuprincipal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class GenerosAdapter extends PagerAdapter {

    private List<Generos> generos;
    private LayoutInflater layoutInflater;
    private Context context;

    public GenerosAdapter(List<Generos> generos, Context context) {
        this.generos = generos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return generos.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.generos_swipe, container, false);

        Button generos;
        generos = view.findViewById(R.id.btn_generos);
        generos.setText(this.generos.get(position).getGenero());

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