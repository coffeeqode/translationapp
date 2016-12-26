package coffeeqode.translationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import coffeeqode.translationapp.adapters.WordAdapter;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Black","Blaak",0));
        words.add(new Word("Red","Reed",0));
        words.add(new Word("Orange","Oraang",0));
        words.add(new Word("Yellow","Yelloo",0));

        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.activity_colors_list_view);

        listView.setAdapter(itemsAdapter);
    }
}
