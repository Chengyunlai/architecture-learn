package top.chengyunlai.architecture.factory.chat;

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
        // 通过 Map 拿到名字对应的容器实例
        return chatServiceMap.get(
                // 通过枚举获得对应的容器名字
                ChatEnum.getStrategyServiceByType(
                        // 条件
                        user.getIsChatGPTType()
                )
        ).getReplyInfo();
    }
}
