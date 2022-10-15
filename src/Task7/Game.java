package Task7;

import java.util.*;

public class Game {
    static Scanner sc = new Scanner(System.in);

    static void stackGame(){
        Stack<Integer> deck1 = new Stack<>();
        Stack<Integer> deck2 = new Stack<>();
        Stack<Integer> tmpDeck = new Stack<>();

        String[] input = sc.nextLine().split(" ");
        for (int i = input.length-1; i >= 0; i--){
            deck1.push(Integer.valueOf(input[i]));
        }

        input = sc.nextLine().split(" ");
        for (int i = input.length-1; i >= 0; i--){
            deck2.push(Integer.valueOf(input[i]));
        }

        int moveCnt = 0;
        String output = "botva";
        while (moveCnt < 106){
            if (deck1.empty()) {
                output = "Second " + moveCnt;
                break;
            } else if (deck2.empty()) {
                output = "First " + moveCnt;
                break;
            }

            if ((deck1.peek() == 0 && deck2.peek() == 9 || deck1.peek() > deck2.peek()) &&
                    deck1.peek() == 9 && deck2.peek() != 0) {
                while (!deck1.empty()) {
                    tmpDeck.push(deck1.pop());
                }
                tmpDeck.push(deck2.pop());

                while (!tmpDeck.empty()) {
                    deck1.push(tmpDeck.pop());
                }
            } else {
                int tmpCard = deck2.pop();
                while (!deck2.empty()) {
                    tmpDeck.push(deck2.pop());
                }
                tmpDeck.push(deck1.pop());
                tmpDeck.push(tmpCard);

                while (!tmpDeck.empty()) {
                    deck2.push(tmpDeck.pop());
                }
            }
            moveCnt++;
        }
        System.out.println(output);
    }

    static void dequeGame(){
        Deque<Integer> deck1 = new ArrayDeque<>();
        Deque<Integer> deck2 = new ArrayDeque<>();

        String[] input = sc.nextLine().split(" ");
        for (String val : input){
            deck1.addLast(Integer.valueOf(val));
        }

        input = sc.nextLine().split(" ");
        for (String val : input){
            deck2.addLast(Integer.valueOf(val));
        }

        int moveCnt = 0;
        String output = "botva";
        while (moveCnt < 106){
            if (deck1.isEmpty()) {
                output = "Second " + moveCnt;
                break;
            } else if (deck2.isEmpty()) {
                output = "First " + moveCnt;
                break;
            }

            if ((deck1.peek() == 0 && deck2.peek() == 9 || deck1.peek() > deck2.peek()) &&
                    deck1.peek() == 9 && deck2.peek() != 0) {
                deck1.addLast(deck1.pop());
                deck1.addLast(deck2.pop());
            } else {
                deck2.addLast(deck1.pop());
                deck2.addLast(deck2.pop());
            }
            moveCnt++;
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        stackGame();
        //dequeGame();
    }



}
