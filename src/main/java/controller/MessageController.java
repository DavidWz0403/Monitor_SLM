package controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MessageController {

    private final String defaultMessage = "Everything works as expected";

    private String currentMessage;

    @GetMapping("/api/message")
    public String getMessage() {
        return currentMessage != null ? currentMessage : defaultMessage;
    }
}
