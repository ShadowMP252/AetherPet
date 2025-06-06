package aetherpet.ui;

public class Art {
    public static String getMood(String mood) {
        return switch (mood) {
            case "Hungry." -> "( ⚆ _ ⚆ )" + "  " + mood;
            
            case "Sad."    -> "(︶︹︺)" + "  " + mood;
            
            case "Tired."  -> "(－_－) zzZ" + "  " + mood;
            
            case "Happy"  -> "(＾◡＾)っ ♥" + "  " + mood;
            
            case "Stuffed" -> "(๑ᵔ⤙ᵔ๑)" + "  " + mood;
            
            case "Ecstatic" -> "◝(ᵔᗜᵔ)◜" + "  " + mood;
            
            case "Animated" -> "⸜(｡˃ ᵕ ˂ )⸝♡ " + "  " + mood;
            
            case "Famished..." -> "( ⚆ _ ⚆ )" + "  " + mood;
            
            case "Anxious..." -> "(๑•́ -•̀)" + "  " + mood;
            
            case "Exhausted..." -> "(｡•́︿•̀｡)" + "  " + mood;
            
            case "Dead!" -> "(×_×)" + "  " + "  " + mood;
            
            case "Depressed!" -> "(ᴗ_ ᴗ。)" + "  " + mood;
            
            case "Pass Out!" -> "(⸝⸝ᴗ﹏ᴗ⸝⸝) ᶻ 𝗓zZzzZ" + "  " + mood;
            
            default       -> "(•‿•)";
        };
    }
}

