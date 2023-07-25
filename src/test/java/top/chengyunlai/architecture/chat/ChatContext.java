package top.chengyunlai.architecture.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Chengyunlai
 * @description: 对话上下文，属于对话中间件，根据条件选择对应的真实对话服务
 * @date 2023/7/25
 */
@Service
public class ChatContext {
    @Autowired
    private Map<String,ChatService> chatServiceMap;

    public String getReplyInfo(User user){
        return chatServiceMap.get(ChatEnum.getStrategyServiceByType(user.getIsChatGPTType())).getReplyInfo();
    }
}
