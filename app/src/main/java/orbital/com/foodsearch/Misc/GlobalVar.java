package orbital.com.foodsearch.misc;

/**
 * Created by zhiyong on 25/7/2016.
 */

public class GlobalVar {
    public static String OCR_KEY = null;
    public static String IMAGE_KEY = null;
    public static String TRANSLATE_KEY = null;

    public static String getOcrKey() {
        return OCR_KEY;
    }

    public static void setOcrKey(String ocrKey) {
        OCR_KEY = ocrKey;
    }

    public static String getImageKey() {
        return IMAGE_KEY;
    }

    public static void setImageKey(String imageKey) {
        IMAGE_KEY = imageKey;
    }

    public static String getTranslateKey() {
        return TRANSLATE_KEY;
    }

    public static void setTranslateKey(String translateKey) {
        TRANSLATE_KEY = translateKey;
    }

    public static boolean hasKeyValues() {
        return OCR_KEY != null && IMAGE_KEY != null && TRANSLATE_KEY != null;
    }
}
