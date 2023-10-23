package dev.jaimerey.csrf.backend.services;

import dev.jaimerey.csrf.backend.controllers.dtos.SignInDto;
import dev.jaimerey.csrf.backend.controllers.dtos.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.CharBuffer;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final PasswordEncoder passwordEncoder;
    private static final String HASHED_PASSWORD = "$2a$10$I6li6W7Tli6KVv5535YlHe.CeG.YuEW3VPwMogylpxWxKsYt5OaGq";
    public UserDto signIn(SignInDto signInDto) {
        if (passwordEncoder.matches(CharBuffer.wrap(signInDto.password()), HASHED_PASSWORD)){
            return new UserDto(1L, "login", "jaime");
        }
        throw new RuntimeException("Invalid Password");
    }
}
