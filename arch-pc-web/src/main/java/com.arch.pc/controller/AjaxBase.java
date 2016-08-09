package com.arch.pc.controller;

import com.arch.pc.dto.ResultMap;

/**
 * Created by chenxiaobian on 16/7/1.
 */
public class AjaxBase {
    protected final static String SAVE_SUCCESS = "保存成功";
    protected final static String CREATE_SUCCESS = "创建成功";
    protected final static String DELETE_SUCCESS = "删除成功";
    protected final static String EDIT_SUCCESS = "编辑成功";
    protected final static String PARAM_ERROR = "参数有误";
    protected final static String UPLOAD_SUCCESS = "上传成功";
    protected final static String DELETE_GROUP_DELETE = "删除分组成功";
    protected final static String BATCH_DELETE_IMAGE = "批量删除图片成功";
    protected final static String GROUP_SUCCESS = "移动分组成功";
    protected final static String BATCH_GROUP_SUCCESS = "批量分组成功";
    protected final static String CREATE_GROUP_SUCCESS = "创建分组成功";
    protected final static String CANCEL_AUTHORIZATION = "取消授权成功";


    protected ResultMap generateResultMap(String msg) {
        return ResultMap.builder().msg(msg).build();
    }

    protected ResultMap generateResultMap(String msg, Object data) {
        return ResultMap.builder().msg(msg).data(data).build();
    }

    protected ResultMap generateDataResultMap(Object data) {
        return ResultMap.builder().msg("").data(data).build();
    }
}
