package coffeeqode.translationapp;

/**
 * Created by sandesh on 17/12/16.
 */

public class Word {

    String orignalName;
    String translatedName;
    int imgResourceId = -1;


    public Word(String orignalName, String translatedName, int imgResourceId) {
        this.orignalName = orignalName;
        this.translatedName = translatedName;
        this.imgResourceId = imgResourceId;
    }

    public Word(String orignalName, String translatedName) {
        this.orignalName = orignalName;
        this.translatedName = translatedName;
    }

    public String getOrignalName() {
        return orignalName;
    }

    public String getTranslatedName() {
        return translatedName;
    }

    public int getImgResourceId() {
        return imgResourceId;
    }

    public void setOrignalName(String orignalName) {
        this.orignalName = orignalName;
    }

    public void setTranslatedName(String translatedName) {
        this.translatedName = translatedName;
    }

    public void setImgResourceId(int imgResourceId) {
        this.imgResourceId = imgResourceId;
    }

    public boolean hasImageResource(){
        return (imgResourceId != -1);

    }
}
