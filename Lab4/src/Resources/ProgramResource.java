package Resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.ResourceBundle;

public class ProgramResource extends ResourceBundle {

    private String[] keys = {"MikeButton, CatButton, CrowbarButton, FrenchButton, EnglishButton, JapaneseButton"};

    @Override
    protected Object handleGetObject(String key) {
        return keys;
    }

    @Override
    public Enumeration getKeys() {
        return Collections.enumeration(Arrays.asList(keys));
    }
}
