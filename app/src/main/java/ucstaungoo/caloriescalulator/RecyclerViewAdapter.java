package ucstaungoo.caloriescalulator;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.nyViewHolder> {

    private Context context;
    private List<Book> nData;

    public RecyclerViewAdapter(Context context, List<Book> nData) {
        this.context = context;
        this.nData = nData;
    }

    @NonNull
    @Override
    public nyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        view=layoutInflater.inflate(R.layout.activity_cardview__ite,parent,false);

        return new nyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull nyViewHolder holder, final int position) {

        holder.tv_book_title.setText(nData.get(position).getTitle());
        holder.book_thunbail.setImageResource(nData.get(position).getThunbail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Book_Activity.class);
                intent.putExtra("Title",nData.get(position).getTitle());
                intent.putExtra("Description",nData.get(position).getDescription());
                intent.putExtra("Thunbail",nData.get(position).getThunbail());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return nData.size();
    }

    public static class nyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_book_title;
        ImageView book_thunbail;
        CardView cardView;

        public nyViewHolder(@NonNull View itemView) {
            super(itemView);


            tv_book_title=(TextView)itemView.findViewById(R.id.book_title);
            book_thunbail=(ImageView)itemView.findViewById(R.id.book_ing_id);
            cardView=(CardView)itemView.findViewById(R.id.cardview_id);

        }
    }
}
