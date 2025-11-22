package com.directi.training.lsp.exercise_refactored;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        electricDuck.turnOn();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Quackable... quackers)
    {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }

    private void swim(Swimmable... swimmers)
    {
        for (Swimmable swimmer : swimmers) {
            swimmer.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
