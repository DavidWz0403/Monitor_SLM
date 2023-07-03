package Controller;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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



    @Test
    void resetMessageTest(){
        MessageController controller = new MessageController();

        String shouldBeSet = controller.setMessage("new message");
        String shouldBeReset = controller.resetMessage();
        String defaultMessage = controller.getMessage();

        assertEquals("ok", shouldBeSet);
        assertEquals("ok", shouldBeReset);
        assertEquals("Everything works as expected", defaultMessage);
    }

    @Test
    void resetMessageTest2(){
        MessageController controller = new MessageController();

        String shouldBeSet = controller.setMessage("new message");
        String shouldBeReset = controller.resetMessage();
        String defaultMessage = controller.getMessage();

        assertEquals("ok", shouldBeSet);
        assertEquals("ok", shouldBeReset);
        assertNotEquals("new message", defaultMessage);
    }
}