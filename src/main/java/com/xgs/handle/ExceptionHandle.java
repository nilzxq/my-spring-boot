package com.xgs.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xgs.domain.Result;
import com.xgs.exception.GrilException;
import com.xgs.utils.ResultUtil;

@ControllerAdvice
public class ExceptionHandle {
	 private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

	    @ExceptionHandler(value = Exception.class)
	    @ResponseBody
	    public Result handle(Exception e) {
	        if (e instanceof GrilException) {
	            GrilException grilException = (GrilException) e;
	            return ResultUtil.error(grilException.getCode(), grilException.getMessage());
	        }else {
	            logger.error("【系统异常】{}", e);
	            return ResultUtil.error(-1, "未知错误");
	        }
	    }
}
