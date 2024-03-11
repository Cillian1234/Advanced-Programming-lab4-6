package Resources;

public class ProgramResource_ja {
    public Object handleGetObject(String key) {
        String returnString = "";

        switch (key) {
            case "MikeButton" -> returnString = "Mike 日本語で";
            case "CatButton" -> returnString = "猫";
            case "CrowbarButton" -> returnString = "バール";
            case "FrenchButton" -> returnString = "フランス語";
            case "EnglishButton" -> returnString = "英語";
            case "JapaneseButton" -> returnString = "日本語";
        }

        return returnString;
    }
}
