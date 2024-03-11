package Resources;

public class ProgramResource_fr extends ProgramResource {
    public Object handleGetObject(String key) {
        String returnString = "";

        switch (key) {
            case "MikeButton" -> returnString = "Mike en français";
            case "CatButton" -> returnString = "Chat";
            case "CrowbarButton" -> returnString = "Pied de biche";
            case "FrenchButton" -> returnString = "Français";
            case "EnglishButton" -> returnString = "Anglais";
            case "JapaneseButton" -> returnString = "Japonais";
        }

        return returnString;
    }
}
