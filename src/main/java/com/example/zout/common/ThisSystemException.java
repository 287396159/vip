package com.example.zout.common;


/**
 *@class_name：ThisSystemException  
 *@param:impl下自定义异常。分清系统异常和业务异常
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月14日
 */

@SuppressWarnings("serial")
public class ThisSystemException extends RuntimeException{
	//覆盖父类方法--这是异常机制自带的
	public ThisSystemException(String message) {
        super(message);
    }

    public ThisSystemException(String message, Throwable cause) {
        super(message, cause);
    }
}
