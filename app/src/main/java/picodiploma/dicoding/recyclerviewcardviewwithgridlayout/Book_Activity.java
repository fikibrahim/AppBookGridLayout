package picodiploma.dicoding.recyclerviewcardviewwithgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Book_Activity extends AppCompatActivity {

    private TextView tvTitle,tvDescription,tvCategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_book_ );

        tvTitle = (TextView) findViewById( R.id.txtTitle_id );
        tvDescription = (TextView) findViewById( R.id.txtDesc_id );
        tvCategory = (TextView) findViewById( R.id.txtCat_id );
        img = (ImageView) findViewById( R.id.book_thumbnail);

//        Receive Data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString( "Title" );
        String Description = intent.getExtras().getString( "Description" );
        int image = intent.getExtras().getInt( "Thumbnail" );

        tvTitle.setText( Title );
        tvDescription.setText( Description );
        img.setImageResource( image );
    }
}
