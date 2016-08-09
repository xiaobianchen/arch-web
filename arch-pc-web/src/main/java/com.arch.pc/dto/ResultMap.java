package com.arch.pc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

import java.io.Serializable;

/**
 * Created by chenxiaobian on 16/7/4.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultMap implements Serializable {
    private String msg;
    private Object data;
}
