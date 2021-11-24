package org.example.model;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    /* public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "practice batting today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
