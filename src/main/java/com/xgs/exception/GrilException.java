package com.xgs.exception;

import com.xgs.enums.ResultEnum;

public class GrilException extends RuntimeException{

    private Integer code;

    public GrilException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
