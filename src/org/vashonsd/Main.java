package org.vashonsd;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello World.");
        Bot newBot = new Bot();
        System.out.println(newBot.randomGreeting());
        System.out.println(newBot.insult1());
        System.out.println(newBot.leaving());
    }
}
