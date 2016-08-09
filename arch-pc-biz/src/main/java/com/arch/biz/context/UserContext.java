package com.arch.biz.context;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

/**
 * Created by chenxiaobian on 16/7/1.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserContext {

    private int userId;
    private int customerId;
}
