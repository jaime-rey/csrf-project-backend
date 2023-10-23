package dev.jaimerey.csrf.backend.services;

import dev.jaimerey.csrf.backend.dtos.ContentDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentService {

    private static final List<ContentDto> messages = new ArrayList<>();

    public List<ContentDto> getMessages() {
        return messages;
    }

    public ContentDto createMessages(ContentDto contentDto) {
        messages.add(contentDto);
        return contentDto;
    }
}
