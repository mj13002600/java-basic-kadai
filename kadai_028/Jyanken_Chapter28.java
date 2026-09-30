package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分のじゃんけんの手を入力するメソッド
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");

            // 入力値を読み込む
            input = scanner.nextLine();

            // 正しい入力値（r, s, p）であるか判定
            if (input.equals("r") || input.equals("s") || input.equals("p")) {
                break;
            } else {
                System.out.println("エラー: r、s、pのいずれかを入力してください。");
            }
        }

        return input;
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶメソッド
    public String getRandom() {
        // 配列にじゃんけんの手をセット
        String[] hands = {"r", "s", "p"};

        // 0以上3未満の乱数を取得し、Math.floorで切り捨てて0〜2の整数を取得
        int index = (int) Math.floor(Math.random() * 3);

        return hands[index];
    }

    // じゃんけんを行うメソッド
    public void playGame() {
        // HashMapの作成と要素の追加
        HashMap<String, String> jankenMap = new HashMap<>();
        jankenMap.put("r", "グー");
        jankenMap.put("s", "チョキ");
        jankenMap.put("p", "パー");

        // 自分と相手の手を取得
        String myChoice = getMyChoice();
        String opponentChoice = getRandom();

        // 自分と対戦相手のじゃんけんの手を出力
        System.out.println("自分の手は" + jankenMap.get(myChoice) + ",対戦相手の手は" + jankenMap.get(opponentChoice));

        // じゃんけんの結果を出力
        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}