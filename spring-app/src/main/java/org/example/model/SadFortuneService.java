package org.example.model;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "bad day be aware of friends";
    }
}
