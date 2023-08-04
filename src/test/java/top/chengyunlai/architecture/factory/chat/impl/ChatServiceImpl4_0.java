package top.chengyunlai.architecture.factory.chat.impl;

import org.springframework.stereotype.Service;
import top.chengyunlai.architecture.factory.chat.ChatService;

/**
 * @author Chengyunlai
 * @description: TODO
 * @date 2023/7/25
 */
@Service("chat4")
public class ChatServiceImpl4_0 implements ChatService {
    @Override
    public String getReplyInfo() {
        return "chat4.0";
    }
}
