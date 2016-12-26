package coffeeqode.translationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import coffeeqode.translationapp.adapters.WordAdapter;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Dad","Dada"));
        words.add(new Word("Mom","Mummy"));
        words.add(new Word("Sister","Sis"));
        words.add(new Word("Brother","Bro"));

        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.activity_family_list_view);

        listView.setAdapter(itemsAdapter);
    }
}
