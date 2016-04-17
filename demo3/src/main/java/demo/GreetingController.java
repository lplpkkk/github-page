package demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @MessageMapping("/sock1")
    @SendTo("/topic/mail_box_1")
    public String greeting(String name) throws Exception {

        return name ;
    }

}
