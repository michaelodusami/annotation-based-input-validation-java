package dev.michaelodusami;

import dev.michaelodusami.model.User;
import dev.michaelodusami.processor.Validator;

public class Main {
    public static void main(String[] args) {
        User user = new User(null);
        Validator.validate(user);
        System.out.println(user.getName());
    }
}