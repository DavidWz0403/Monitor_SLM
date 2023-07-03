package Maintance_Monitor.Monitor_SLM.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
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

    @GetMapping("/api/message/reset")
    public String resetMessage() {
        this.currentMessage = null;
        return "ok";
    }
}