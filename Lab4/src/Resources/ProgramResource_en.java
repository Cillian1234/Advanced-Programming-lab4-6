package Resources;

public class ProgramResource_en {
    public Object handleGetObject(String key) {
        String returnString = "";

        switch (key) {
            case "MikeButton" -> returnString = "Mike";
            case "CatButton" -> returnString = "Cat";
            case "CrowbarButton" -> returnString = "Crowbar";
            case "FrenchButton" -> returnString = "French";
            case "EnglishButton" -> returnString = "English";
            case "JapaneseButton" -> returnString = "Japanese";
        }

        return returnString;
    }
}
