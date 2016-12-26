package coffeeqode.translationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numberTextField = (TextView) findViewById(R.id.number_text_field);
        numberTextField.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Numbers.class);
                        startActivity(intent);
                    }
                }

        );



        TextView colorTextField = (TextView) findViewById(R.id.colors_text_field);
        colorTextField.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Colors.class);
                        startActivity(intent);
                    }
                }

        );



        TextView familyTextField = (TextView) findViewById(R.id.family_text_field);
        familyTextField.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Family.class);
                        startActivity(intent);
                    }
                }

        );



        TextView phrasesTextField = (TextView) findViewById(R.id.phrases_text_field);
        phrasesTextField.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Phrases.class);
                        startActivity(intent);
                    }
                }

        );
    }

}
