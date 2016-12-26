package coffeeqode.translationapp.adapters;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import coffeeqode.translationapp.R;
import coffeeqode.translationapp.Word;

/**
 * Created by sandesh on 17/12/16.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int bgColorResourceId;

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        Word w = getItem(position);

        TextView originalTextView = (TextView) listItemView.findViewById(R.id.original_name_text_view);
        originalTextView.setText(w.getOrignalName());

        TextView translatedTextView = (TextView) listItemView.findViewById(R.id.translated_name_text_view);
        translatedTextView.setText(w.getTranslatedName());

        ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.item_image_view);
        if(w.hasImageResource()){
            itemImageView.setImageResource(w.getImgResourceId());
            itemImageView.setVisibility(View.VISIBLE);
        }
        else {
            itemImageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(),bgColorResourceId));

        return listItemView;
    }

    public WordAdapter(Activity context, ArrayList<Word> words,int bgColorResourceId) {
        super(context, 0, words);
        this.bgColorResourceId = bgColorResourceId;
    }


}
