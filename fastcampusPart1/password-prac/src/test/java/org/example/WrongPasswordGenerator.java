package org.example;

public class WrongPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "ab"; // 8글자
    }
}
