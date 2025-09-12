class Score {
    int score;

    Score(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Score score1)) return false;
        return this.score == score1.score;
    }
}

public class A {
    public static void main(String[] args) {
        Score perfect = new Score(100);
        Score myScore = new Score(100);

        System.out.println(myScore.equals(perfect));
    }
}
