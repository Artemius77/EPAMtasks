package SecondPractise.SeventhPractise.Models.Internationalization;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public enum ResourceManager {
    INSTANCE;
    private ResourceBundle resourceBundle;
    private final String resourseName = "SecondPractise.SeventhPractise.resources.location.text";

     ResourceManager() {
        resourceBundle = ResourceBundle.getBundle(
                resourseName, Locale.getDefault());
    }

    public void changeResource() {
       if (resourceBundle.getLocale().toString().equals(Locale.getDefault().getLanguage()))
            resourceBundle = ResourceBundle.getBundle(resourseName, new Locale("en","EN"));
       else resourceBundle = ResourceBundle.getBundle(resourseName, Locale.getDefault());
    }

    public String getString(String key) {
        return resourceBundle.getString(key);
    }

    public Enumeration getSetKey() {
        return resourceBundle.getKeys();
    }

}
