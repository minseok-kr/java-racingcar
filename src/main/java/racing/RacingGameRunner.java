package racing;

public class RacingGameRunner {

    public static void main(String[] args) {
        RacingGame game = new RacingGame(
                Prompter.getStringsPrompt("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."),
                Prompter.getIntPrompt("시도할 회수는 몇 회 인가요?")
        );
        game.startRacing();
    }
}
