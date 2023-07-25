package top.chengyunlai.architecture.chat.impl;

import org.springframework.stereotype.Service;
import top.chengyunlai.architecture.chat.ChatService;

/**
 * @author Chengyunlai
 * @description: TODO
 * @date 2023/7/25
 */
@Service("chat3")
public class ChatServiceImpl3_5 implements ChatService {
    @Override
    public String getReplyInfo() {
        return "chat3.5";
    }
}
