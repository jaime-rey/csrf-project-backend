package dev.jaimerey.csrf.backend.controllers;

import dev.jaimerey.csrf.backend.dtos.ContentDto;
import dev.jaimerey.csrf.backend.services.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ContentController {

    private final ContentService contentService;

    @GetMapping("/messages")
    public ResponseEntity<List<ContentDto>> messages(){
        return ResponseEntity.ok(contentService.getMessages());
    }

    @PostMapping("/messages")
    public ResponseEntity<ContentDto> createMessages(@RequestBody ContentDto contentDto){
        return ResponseEntity.ok(contentService.createMessages(contentDto));
    }
}
