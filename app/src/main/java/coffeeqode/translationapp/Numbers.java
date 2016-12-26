package coffeeqode.translationapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import coffeeqode.translationapp.adapters.WordAdapter;

public class Numbers extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("1", "One", R.mipmap.ic_launcher));
        words.add(new Word("2", "Two", R.mipmap.ic_launcher));
        words.add(new Word("3", "Three", 0));
        words.add(new Word("4", "Four", 0));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.activity_numbers_list_view);

        listView.setAdapter(itemsAdapter);

        mediaPlayer = MediaPlayer.create(this, R.raw.iktara);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Word word = words.get(position);
                mediaPlayer.start();
            }
        });


        /*ImageView imageView = (ImageView) listView.findViewById(R.id.item_image_view);
        imageView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaPlayer.start();
                    }
                }

        );


        View container = findViewById(R.id.text_container);
        container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();

            }
        });*/
    }

}
