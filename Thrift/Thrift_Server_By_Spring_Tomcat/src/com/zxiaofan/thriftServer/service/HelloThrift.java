/*
 * 文件名：HelloThrift.java
 * 版权：Copyright 2007-2016 zxiaofan.com. Co. Ltd. All Rights Reserved. 
 * 描述： HelloThrift.java
 * 修改人：yunhai
 * 修改时间：2016年7月15日
 * 修改内容：新增
 */
package com.zxiaofan.thriftServer.service;

import org.apache.thrift.TException;
import org.springframework.stereotype.Component;

import com.zxiaofan.thrift.IThriftService.Iface;

/**
 * 
 * @author yunhai
 */
@Component("helloThrift")
public class HelloThrift implements Iface {

    /**
     * {@inheritDoc}.
     */
    @Override
    public String sayHello(String username) throws TException {
        return "hello " + username + " ,I'm github.zxiaofan.com !";
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public String getRandom() throws TException {
        return "github.zxiaofan.com";
    }

}
