package Task10.Ex2;

import java.awt.*;

public class MagicChair implements Chair{
    private String magicWord;

    MagicChair(String magicWord) {
        this.magicWord = magicWord;
    }

    public void setMagicWord(String magicWord){
        this.magicWord = magicWord;
    }

    public void guessWord(String word) {
        if (word.equals(magicWord)) {
            System.out.println("Стул расколдован, можете садиться");
        } else {
            System.out.println("Садиться запрещено, слово не угадали!!");
        }
    }

    @Override
    public String getChairType() {
        return "Magic Chair";
    }
}
