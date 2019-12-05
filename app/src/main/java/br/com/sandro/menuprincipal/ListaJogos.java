package br.com.sandro.menuprincipal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListaJogos extends RecyclerView.Adapter<ListaJogos.MyViewHolder> {

    private Context context;
    private List<Jogos> listaJogos;


    public ListaJogos(Context context, List<Jogos> listaJogos) {
        this.context = context;
        this.listaJogos = listaJogos;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(context);
        view = mInflater.inflate(R.layout.lista_jogos, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tv_titulo.setText(listaJogos.get(position).getTitulo());
        holder.tv_desenvolvedora.setText(listaJogos.get(position).getDesenvolvedora());
        holder.tv_genero.setText(listaJogos.get(position).getGenero());
        holder.img_pequena.setImageResource(listaJogos.get(position).getImagemPequena());
        holder.img_grande.setImageResource(listaJogos.get(position).getImagemGrande());
        holder.rb_avaliacao.setRating(listaJogos.get(position).getAvaliacao());
        holder.img_favorito.setImageResource(listaJogos.get(position).getJogoFavorito());
        holder.card_jogos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, JogosActivity.class);
                // Passando dados para a activity "Jogos Activity"
                intent.putExtra("Titulo", listaJogos.get(position).getTitulo());
                intent.putExtra("Descricao", listaJogos.get(position).getDescricao());
                intent.putExtra("ImagemPequena", listaJogos.get(position).getImagemPequena());
                intent.putExtra("ImagemGrande", listaJogos.get(position).getImagemGrande());
                intent.putExtra("Desenvolvedora", listaJogos.get(position).getDesenvolvedora());
                intent.putExtra("Genero", listaJogos.get(position).getGenero());
                intent.putExtra("Avaliacao", listaJogos.get(position).getAvaliacao());
                intent.putExtra("JogoFavorito", listaJogos.get(position).getJogoFavorito());
                // Inicia a activity
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaJogos.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_titulo;
        TextView tv_desenvolvedora;
        TextView tv_genero;
        RatingBar rb_avaliacao;
        ImageView img_pequena, img_grande;
        CardView card_jogos;
        ImageView img_favorito;

        public MyViewHolder(View itemView) {
            super(itemView);
            // Atribui os valores das views
            tv_titulo = itemView.findViewById(R.id.tv_titulo);
            tv_desenvolvedora = itemView.findViewById(R.id.tv_desenvolvedora);
            tv_genero = itemView.findViewById(R.id.tv_genero);
            img_pequena = itemView.findViewById(R.id.img_pequena);
            img_grande = itemView.findViewById(R.id.img_grande);
            rb_avaliacao = itemView.findViewById(R.id.rb_avaliacao);
            img_favorito = itemView.findViewById(R.id.favorito_icon);
            card_jogos = itemView.findViewById(R.id.card_jogo);
        }
    }
}
