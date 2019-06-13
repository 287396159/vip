package com.example.zout.common;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.UUID;

/**
 *@class_name：ThisSystemUtil  
 *@param:  公共工具类
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月16日
 */

public class ThisSystemUtil {	
	/**
	 *MD5加密算法
	 *@param:inputStr
	 *@return: 密码加密
	 *@author:Zoutao
	 *@createtime:2018年3月17日
	 */
	public static  String  md5(String inputStr){
		System.out.println("=======加密前的数据:"+inputStr);
        BigInteger bigInteger=null;
        try {
         MessageDigest md = MessageDigest.getInstance("MD5");   
         byte[] inputData = inputStr.getBytes(); 
         md.update(inputData);   
         bigInteger = new BigInteger(md.digest());
         //防止产生的加密数据是负数，直接求绝对值
         bigInteger=bigInteger.abs();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        System.out.println("MD5加密后:" + bigInteger.toString(16));   
        //16进制
        return bigInteger.toString(16);
    }
	//测试md5加密完成否？
	/*public static void main(String[] args) {
		System.out.println(md5("12345"));
	}*/
	
	
	
    
    public static int parseInt(String target,int defaultValue){
    	try{
    		return Integer.parseInt(target.trim());
    	}catch(Exception e){
    		
    		return defaultValue;
    	}
    	
    }
    //使用UUID
    public static String uuid(){
    	//生成的是34位的UUID，带有-
    	String uuid= UUID.randomUUID().toString();
    	//减去-，得到32位的UUID
    	char[] cs=new char[32];
    	char c=0;
    	for(int i=uuid.length(),j=0;i-->0;){
    		if((c=uuid.charAt(i))!='-'){
    			cs[j++]=c;
    		}
    	}
    	return new String(cs);
    }
    //测试：生成10个UUID
    public static void main(String[] args) {
    	for(int i=10;i-->0;){
    		String u = uuid();
    		System.out.println(u);
    	}
	}
}
