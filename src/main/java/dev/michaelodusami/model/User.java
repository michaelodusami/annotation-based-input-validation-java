package dev.michaelodusami.model;

import dev.michaelodusami.annotations.NonNull;

public class User {
    
    @NonNull(message = "Username must not be null")
    String name;

    public User(String username)
    {
        this.name = username;
    }

    public String getName()
    {
        return name;
    }
}
