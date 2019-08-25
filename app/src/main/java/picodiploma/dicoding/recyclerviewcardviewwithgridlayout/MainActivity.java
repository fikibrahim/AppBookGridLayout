package picodiploma.dicoding.recyclerviewcardviewwithgridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        lstBook = new ArrayList<>();
        lstBook.add( new Book("Android Notes For Professional","Categorie Book" ,"Description Book",R.drawable.img1));
        lstBook.add( new Book("Beginning Android","Categorie Book" ,"Description Book",R.drawable.img2));
        lstBook.add( new Book("Android Aplication Deplovment","Categorie Book" ,"Description Book",R.drawable.img3));
        lstBook.add( new Book("Beginning CSS Web Deplovment","Categorie Book" ,"Description Book",R.drawable.img4));
        lstBook.add( new Book("To the Point Current the Affairs" ,"Categorie Book" ,"Description Book",R.drawable.img5));
        lstBook.add( new Book("Kisah Cinta Soekarno","Categorie Book" ,"Description Book",R.drawable.img6));
        lstBook.add( new Book("Android Notes For Professional","Categorie Book" ,"Description Book",R.drawable.img1));
        lstBook.add( new Book("Beginning Android","Categorie Book" ,"Description Book",R.drawable.img2));
        lstBook.add( new Book("Android Aplication Deplovment","Categorie Book" ,"Description Book",R.drawable.img3));
        lstBook.add( new Book("Beginning CSS Web Deplovment","Categorie Book" ,"Description Book",R.drawable.img4));
        lstBook.add( new Book("To the Point Current the Affairs" ,"Categorie Book" ,"Description Book",R.drawable.img5));
        lstBook.add( new Book("Kisah Cinta Soekarno","Categorie Book" ,"Description Book",R.drawable.img6));

        RecyclerView myrv = (RecyclerView) findViewById( R.id.recyclerview_id );
        RecyclerviewAdapter myAdapter = new RecyclerviewAdapter( this,lstBook );
        myrv.setLayoutManager( new GridLayoutManager( this,3 ) );
        myrv.setAdapter( myAdapter );
    }
}
