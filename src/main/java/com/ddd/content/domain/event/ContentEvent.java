package com.ddd.content.domain.event;

import java.util.EventObject;

import com.ddd.content.domain.bean.ContentAgg;

//领域事件。领域中产生的一些消息事件，通过事件通知/订阅的方式，可以在�?�能和解耦层面得到好处�??
public class ContentEvent extends EventObject {

    private static final long serialVersionUID = -8782266188158353210L;

    //新增待审�?
    public final static int ADD_CONTENT_AUDIT = 0x01;
    //新增待注�?
    public final static int ADD_CONTENT_INJECT = 0x02;
    //新增注入可播�?
    public final static int ADD_CONTENT_TRAN = 0x03;
    //新增注入完成
    public final static int ADD_CONTENT_COMPLETE = 0x04;
    //修改待审�?
    public final static int UPDATE_CONTENT_AUDIT = 0x05;
    //修改待注�?
    public final static int UPDATE_CONTENT_FILE = 0x06;
    //修改价格
    public final static int UPDATE_CONTENT_PRICE = 0x07;
    //修改媒资信息
    public final static int UPDATE_CONTENT_METEDATA = 0x08;
    //删除待审�?
    public final static int DELETE_CONTENT_AUDIT = 0x09;
    //删除
    public final static int DELETE_CONTENT = 0x0a;
    //删除完成
    public final static int DELETE_CONTENT_COMPLETE = 0x0b;

    public ContentEvent(ContentAgg change) {
        super(change);
        // TODO Auto-generated constructor stub
    }

}
