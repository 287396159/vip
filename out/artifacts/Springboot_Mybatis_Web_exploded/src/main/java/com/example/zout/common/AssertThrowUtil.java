package com.example.zout.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *@class_name：AssertThrowUtil
 *@param:impl下的验证工具类
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月14日
 */
public class AssertThrowUtil {
	public static String assertNotBlank(String message,String target){
		if(target==null||(target=target.trim()).length()==0){
			throw new ThisSystemException(message);
		}
		return target; 
	}
	//使用$符号代替throwIfBlank方法,简化表达。
	public static String $(String message,String target){
		return assertNotBlank(message, target);
	}
	//断言用户不是空。是空就抛出异常。
	public static void assertNotNull(String message,Object o){
    	if(o==null){
    		throw new ThisSystemException(message);
    	}
    }
	//断言用户是空。不是空就抛出异常。
	public static void assertNull(String message,Object o){
    	if(o!=null){
    		throw new ThisSystemException(message);
    	}
    }
	//断言用户是相等的，不相等就抛出异常。
    public static void assertEquals(String message,Object a,Object b){
    	if(a==null?a!=b:!a.equals(b)){
    		throw new ThisSystemException(message);
    	}
    }
  //断言新旧密码不一致的，一致就抛出异常。
    public static void assertNotEquals(String message,Object a,Object b){
    	if(a==null?a==b:a.equals(b)){
    		throw new ThisSystemException(message);
    	}
    }
    
    public static void assertTrue(String message,boolean b){
    	if(!b){
    		throw new ThisSystemException(message);
    	}
    	
    }
    public static void assertFalse(String message,boolean b){
    	if(b){
    		throw new ThisSystemException(message);
    	}
    }
    
    public static void assertPatternMatch(String message,String reg,String target){
    	Pattern pattern=Pattern.compile(reg);
    	Matcher matcher = pattern.matcher(target);
    	if(!matcher.matches()){
    		throw new ThisSystemException(message);
    	}
    }
    public static void main(String[] args) {
    	
    	Pattern pattern=Pattern.compile("[\u4e00-\u9fa5]{2,}");
    	Matcher matcher = pattern.matcher("张飞");
    	if(matcher.matches()){
    		System.out.println("ddd");
    		
    	}
	}
}
