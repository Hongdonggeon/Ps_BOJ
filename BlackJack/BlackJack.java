import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class BlackJack {
    static final Scanner input = new Scanner(System.in);

    public static int computeScoreUser(ScoreTable table, Vector<Card> cards) {
        int sum = 0;
        for (int i = 0; i < cards.size(); i++) {
            if (!"A".equals(cards.get(i).getRank())) {
                sum += table.score(cards.get(i))[0];
            }
        }
        return sum;
    }

    public static int computeScoreDealer(ScoreTable table, Vector<Card> cards) {
        int sum = 0;
        int check = 0;
        for (int i = 0; i < cards.size(); i++) {
            if ("A".equals(cards.get(i).getRank())) {
                if (check == 0)
                    sum += 11;
                else
                    sum += 1;
                check++;
            } else {
                sum += table.score(cards.get(i))[0];
            }
        }
        return sum;
    }

    public static boolean is_bust(int score) {
        if (score > 21)
            return true;
        else
            return false;
    }

    public static boolean checkBlackjack(Vector<Card> cards) {
        boolean A_flag = "A".equals(cards.get(0).getRank()) || "A".equals(cards.get(1).getRank());
        boolean J_flag = "J".equals(cards.get(0).getRank()) || "J".equals(cards.get(1).getRank());
        boolean Q_flag = "Q".equals(cards.get(0).getRank()) || "Q".equals(cards.get(1).getRank());
        boolean k_flag = "k".equals(cards.get(0).getRank()) || "k".equals(cards.get(1).getRank());

        if (A_flag && (J_flag || Q_flag || k_flag))
            return true;
        else
            return false;
    }

    public static void sleep(int time) {

    }

    public static boolean checkA(Card card) {
       if("A".equals(card.getRank()))
            return true;
       else
           return false;
    }

    public static void main(String[] args) {
        Player user = new Player(); // 유저
        Player dealer = new Player(); // 딜러
        ScoreTable table = new ScoreTable();
        int user_num = 0;
        int dealer_num = 0;
        int a_chocie=0;


        System.out.print("사용할 덱의 개수를 입력해주세요 >> ");
        int numofdeque = input.nextInt();
        CardPool deque = new CardPool(numofdeque);
        System.out.println(numofdeque + "의 덱, " + 52 * numofdeque + "의 카드를 사용합니다.\n");

        for (int i = 0; i < 2; i++) {
            user.addCard(deque.drawCard());
            dealer.addCard(deque.drawCard());
            user_num++;
            dealer_num++;
        }


        System.out.println("당신의 카드는 [" + user.get(0).toString() + ", " + user.get(1).toString() + "] 입니다.");
        System.out.println("딜러가 공개한 카드는 " + dealer.get(0).toString() + "] 입니다.\n");
        System.out.println("당신의 차례입니다.");
        for (int i=0; i<user_num; i++){
            if(checkA(user.get(i))){
                System.out.println(user.get(i)+"의 점수를 선택해주세요. (1/ 11) >> ");
                a_chocie+= input.nextInt();
            }
        }

        while (true) {
            if (checkBlackjack(user.getHand())) {
                System.out.println("당신의 BlackJack으로 승리했습니다.");
                break;
            }
            if(is_bust(computeScoreUser(table, user.getHand())+a_chocie)){
                System.out.println("패의 총합이 21을 초과하여 패배했습니다.");
                break;
            }

            System.out.print("카드를 더 받으시겠습니까 ? (hit/stand) >> ");
            String answer = input.next();
            System.out.println();
            if ("hit".equals(answer)) {
                user.addCard(deque.drawCard());
                System.out.println(user.get(user_num++) + "를 받았습니다.");
                if(checkA(user.get(user_num-1))){
                    System.out.println(user.get(user_num-1)+"의 점수를 선택해주세요. (1/ 11) >> ");
                    a_chocie+= input.nextInt();
                }
                System.out.println("당신의 카드는 " + user.getHand() + " 입니다.\n");
            } else if ("stand".equals(answer)) {
                System.out.println("당신의 차례가 끝났습니다.");
                break;
            }
        }
        if (!checkBlackjack(user.getHand()) && !is_bust(computeScoreUser(table, user.getHand()))) {
            System.out.println("딜러의 차례입니다.");
            System.out.println("딜러의 카드는 " + dealer.getHand() + " 입니다.\n");
            while (true) {
                if (checkBlackjack(dealer.getHand())) {
                    System.out.println("딜러의 BlackJack으로 패배했습니다.");
                    break;
                }
                if(is_bust(computeScoreDealer(table, dealer.getHand()))){
                    System.out.println("딜러 패의 총합이 21을 초과하여 승리했습니다.");
                    break;
                }
                if(computeScoreDealer(table,dealer.getHand()) > 17) {
                    System.out.println("딜러의 차례가 끝났습니다.");
                    break;
                }
                else if (computeScoreDealer(table, dealer.getHand()) <= 16) {
                    dealer.addCard(deque.drawCard());
                    System.out.println("딜러는 "+ dealer.get(dealer_num++) + "를 받았습니다.");
                    System.out.println("당신의 카드는 " + dealer.getHand() + " 입니다.\n");

                }
            }
            int user_score = computeScoreUser(table, user.getHand())+a_chocie;
            int dealer_score = computeScoreDealer(table, dealer.getHand());
            System.out.println("유저: " + user_score + "vs" + "딜러: " + dealer_score);
            if (user_score > dealer_score)
                System.out.println("승리했습니다.");
            else if (user_score == dealer_score)
                System.out.println("무승부");
            else
                System.out.println("패배했습니다.");
        }


    }
}
