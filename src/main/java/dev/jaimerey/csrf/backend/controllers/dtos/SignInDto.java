package dev.jaimerey.csrf.backend.controllers.dtos;

public record SignInDto(String login, char[] password) {
}
