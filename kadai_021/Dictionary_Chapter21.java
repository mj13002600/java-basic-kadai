package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    // 英単語 → 日本語 の辞書
    public HashMap<String, String> dictionary = new HashMap<>();

    // コンストラクタで10個の単語を登録
    public Dictionary_Chapter21() {
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }
}
