package top.chengyunlai.architecture.factory.chat;

import java.util.Objects;

/**
 * @author Chengyunlai
 * @description: TODO
 * @date 2023/7/25
 */
public enum ChatEnum {
    CHAT_3_5(1,"chat3"),
    CHAT_4_0(2,"chat4");

    private Integer flag;
    private String serverName;

    ChatEnum(Integer flag, String serverName) {
        this.flag = flag;
        this.serverName = serverName;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public static String getStrategyServiceByType(Integer type) {
        for (ChatEnum d : ChatEnum.values()) {
            if (Objects.equals(type, d.getFlag())) {
                return d.getServerName();
            }
        }
        // 兜底处理
        return "chat3";
    }
}
