package Controller;

import Maintance_Monitor.Monitor_SLM.Controller.MessageController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageControllerTest {
    @Test
    void getDefaultMessageTest() {
        MessageController controller = new MessageController();
        String defaultMessage = controller.getMessage();

        assertEquals("Everything works as expected", defaultMessage);
    }

    @Test
    void setMessageTest() {
        MessageController controller = new MessageController();
        String shouldBeOk = controller.setMessage("new message");
        String newMessage = controller.getMessage();

        assertEquals("ok", shouldBeOk);
        assertEquals("new message", newMessage);
        assertNotEquals("Everything works as expected", newMessage);
    }
}