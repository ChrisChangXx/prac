package com.chris.prac.netty;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.logging.Logger;

/**
 * 时间客户端处理程序
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/20
 * @描述
 * @date 2021/06/20
 */
public class TimeClientHandler extends ChannelInboundHandlerAdapter {

    private static final Logger logger = Logger.getLogger(TimeClientHandler.class.getName());

    //private final ByteBuf firstMessage;

    private byte[] req;

    private int counter;

    public TimeClientHandler() {
        /*byte[] */
        req = ("QUERY TIME ORDER" + System.getProperty("line.separator")).getBytes();
        /*firstMessage = Unpooled.buffer(req.length);
        firstMessage.writeBytes(req);*/
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ByteBuf message = null;
        for (int i = 0; i < 100000000; i++) {
            message = Unpooled.buffer(req.length);
            message.writeBytes(req);
            ctx.writeAndFlush(message);
        }
        ctx.alloc().directBuffer();

    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        String body = (String) msg;
        /*byte[] req = new byte[buf.readableBytes()];
        buf.readBytes(req);
        String body = new String(req, "UTF-8");*/
        System.out.println("Now is : " + body + ";the counter is :" + ++counter);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        if (counter == 100){
            ctx.close();
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
