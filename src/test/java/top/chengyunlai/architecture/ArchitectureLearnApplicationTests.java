package top.chengyunlai.architecture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.chengyunlai.architecture.factory.chat.ChatContext;
import top.chengyunlai.architecture.factory.chat.User;

@SpringBootTest
class ArchitectureLearnApplicationTests {

    @Autowired
    ChatContext context;

    @Test
    void contextLoads() {
        User user = new User();
        user.setChatGPTType(2);
        System.out.println(context.getReplyInfo(user));
    }

}
