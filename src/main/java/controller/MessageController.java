package controller;

import org.springframework.web.bind.annotation.*;

public class MessageController {

    private final String defaultMessage = "Everything works as expected";

    private String currentMessage;

    @GetMapping("/api/message")
    public String getMessage() {
        return currentMessage != null ? currentMessage : defaultMessage;
    }

    @GetMapping("/api/message/set")
    public String setMessage(@RequestParam String m) {
        this.currentMessage = m;
        return "ok";
    }

}
