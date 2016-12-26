package coffeeqode.translationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import coffeeqode.translationapp.adapters.WordAdapter;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("A","aa",0));
        words.add(new Word("The","Thaa",0));
        words.add(new Word("There","Three",0));
        words.add(new Word("Here","Heere",0));

        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.activity_phrases_list_view);

        listView.setAdapter(itemsAdapter);
    }
}
