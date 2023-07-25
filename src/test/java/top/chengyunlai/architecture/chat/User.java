package top.chengyunlai.architecture.chat;

import lombok.Data;

/**
 * @author Chengyunlai
 * @description: TODO
 * @date 2023/7/25
 */
public class User {
    // 是否开启 ChatGPT4，1 为不开启；2 为开启
    private Integer chatGPTType;

    public void setChatGPTType(Integer chatGPTType) {
        this.chatGPTType = chatGPTType;
    }

    public Integer getIsChatGPTType(){
        return this.chatGPTType;
    }
}
