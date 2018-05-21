package java_1_spring_core;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;
    private int time;

    public BaseballCoach(FortuneService theFortuneService, int time) {
        this.fortuneService = theFortuneService;
        this.time = time;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend " + time + " minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
