package controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageControllerTest {
    @Test
    void getDefaultMessageTest() {
        MessageController controller = new MessageController();
        String defaultMessage = controller.getMessage();

        assertEquals("Everything works as expected", defaultMessage);
    }
}