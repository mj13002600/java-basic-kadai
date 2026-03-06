package kadai_021;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {

        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        String[] words = {"apple", "banana", "grape", "orange"};

        for (String word : words) {
            if (dictionary.dictionary.containsKey(word)) {
                System.out.println(word + "の意味は" + dictionary.dictionary.get(word));
            } else {
                System.out.println(word + "は辞書に存在しません。");
            }
        }
    }
}
