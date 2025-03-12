package model;

public class AtError extends Error {
    public AtError(){
        super("There should be exactly one @ in your email");
    }
}
