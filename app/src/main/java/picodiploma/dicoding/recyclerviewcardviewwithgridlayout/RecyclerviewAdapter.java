package picodiploma.dicoding.recyclerviewcardviewwithgridlayout;

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

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Book> mData;

    public RecyclerviewAdapter(Context mContext, List<Book> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from( mContext );
        view = mInflater.inflate( R.layout.card_view_item_book,parent,false);
        return new MyViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int i) {

        holder.tv_book_title.setText( mData.get( i ).getTitle() );
        holder.img_book_thumbnail.setImageResource( mData.get( i ).getThumbnail() );
        holder.cardView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                passing data to the book activity
                Intent intent = new Intent( mContext,Book_Activity.class );
                intent.putExtra( "Title",mData.get( i ).getTitle() );
                intent.putExtra( "Description",mData.get( i ).getDescription() );
                intent.putExtra( "Thumbnail",mData.get( i ).getThumbnail() );
//                star the activity
                mContext.startActivity( intent );

            }
        } );

//        set click listener

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView;

    public MyViewHolder(@NonNull View itemView) {
        super( itemView );

        tv_book_title = (TextView) itemView.findViewById( R.id.book_title_id );
        img_book_thumbnail = (ImageView) itemView.findViewById( R.id.book_img_id );
        cardView = (CardView) itemView.findViewById( R.id.cardview_id);

    }
}

}
