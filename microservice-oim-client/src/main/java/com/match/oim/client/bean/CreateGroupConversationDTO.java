package com.match.oim.client.bean;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author zhangchao
 * @Date 2019/5/28 11:18
 * @Version v1.0
 */
@Getter
@Setter
public class CreateGroupConversationDTO {

    @NotNull
    private List<String> messageUserIds;
}
