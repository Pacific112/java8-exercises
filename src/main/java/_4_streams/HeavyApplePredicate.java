package _4_streams;

public class HeavyApplePredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 300;
    }
}
