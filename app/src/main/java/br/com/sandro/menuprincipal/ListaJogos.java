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

    /**
     * Classe para listar novos jogos
     * <p>
     * Este método utiliza uma lista do tipo Jogos para inflar a view com as informações dos jogos
     *
     * @param context    Define o contexto
     * @param listaJogos Defina uma lista do tipo Jogos
     * @Author Sandro Diego Adão
     */
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

    /**
     * Método abstrato da classe asbtrata MyViewHolder
     * <p>
     * Utiliza-se esse método para exibir um jogo novo lista, para informar um jogo a ser exibido
     * utilize os métodos abaixo:
     * <p>
     * Insira no método OnBindViewHolder <code>holder.nome_da_variavel.atributo(listaJogos.get(position).getNomeDaVariavel());</code>
     * Insira no método onClick <code>intent.putExtra("Nome_Da_Chave", listaJogos.get(position).getNomeDaVariavel());</code>
     * Insira no método MyViewHolder<code>nome_variavel = itemView.findViewById(R.id.id_view);</code>
     *
     * @param holder   Descreve uma exibição de item e metadados sobre seu local no RecyclerView
     * @param position posição dos elementos
     * @void
     * @Author Sandro Diego Adão
     */

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tv_titulo.setText(listaJogos.get(position).getTitulo());
        holder.tv_desenvolvedora.setText(listaJogos.get(position).getDesenvolvedora());
        holder.tv_genero.setText(listaJogos.get(position).getGenero());
        holder.img_pequena.setImageResource(listaJogos.get(position).getImagemPequenaTP());
        holder.img_grande.setImageResource(listaJogos.get(position).getImagemGrandeTP());
        holder.rb_avaliacao.setRating(listaJogos.get(position).getAvaliacao());
        holder.img_favorito.setImageResource(listaJogos.get(position).getJogoFavorito());
        holder.card_jogos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetalhesJogosActivity.class);
                // Passando dados para a activity "Jogos Activity"
                // Passa os valores no intent.putExtra

                // Salva os valores das intentes por indice na Tela Principal
                intent.putExtra("Titulo", listaJogos.get(position).getTitulo());
                intent.putExtra("Descricao", listaJogos.get(position).getDescricao());
                intent.putExtra("Desenvolvedora", listaJogos.get(position).getDesenvolvedora());
                intent.putExtra("Genero", listaJogos.get(position).getGenero());
                intent.putExtra("Avaliacao", listaJogos.get(position).getAvaliacao());
                intent.putExtra("JogoFavorito", listaJogos.get(position).getJogoFavorito());
                intent.putExtra("ImagemPequenaTP", listaJogos.get(position).getImagemPequenaTP());
                intent.putExtra("ImagemGrandeTP", listaJogos.get(position).getImagemGrandeTP());
                // Salva os valores das intentes por indice na Tela Detalhes Jogos
                intent.putExtra("MinValor", listaJogos.get(position).getMinValor());
                intent.putExtra("MaxValor", listaJogos.get(position).getMaxValor());
                intent.putExtra("ImagemPequena1TDJ", listaJogos.get(position).getImagemPequena1TDJ());
                intent.putExtra("ImagemPequena2TDJ", listaJogos.get(position).getImagemPequena2TDJ());
                intent.putExtra("ImagemPequena3TDJ", listaJogos.get(position).getImagemPequena3TDJ());
                intent.putExtra("ImagemPequena4TDJ", listaJogos.get(position).getImagemPequena4TDJ());
                intent.putExtra("ImagemPequena5TDJ", listaJogos.get(position).getImagemPequena5TDJ());
                intent.putExtra("ImagemGrandeTDJ", listaJogos.get(position).getImagemGrandeTDJ());

                // Inicia a activity
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaJogos.size();
    }

    // Ao extender a classe asbtrata RecyclerView.ViewHolder é nescessário implementar seu método abstrato MyViewHolder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_titulo;
        TextView tv_desenvolvedora;
        TextView tv_genero;
        RatingBar rb_avaliacao;
        ImageView img_pequena, img_grande;
        CardView card_jogos;
        ImageView img_favorito;

        // Método da classe abstrata ViewHolder
        public MyViewHolder(View itemView) {
            super(itemView);
            // Atribuição
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
