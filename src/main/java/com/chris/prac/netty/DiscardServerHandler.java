package com.chris.prac.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * 丢弃服务器处理程序
 * Handles a server-side channel.
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/6/20
 * @描述
 * @date 2021/06/20
 */
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //Discard the received data silently
        /*ByteBuf in = (ByteBuf) msg;
        try {
            while (in.isReadable()) {
                System.out.print(((char) in.readByte()));
                System.out.flush();
            }
        } finally {
            ReferenceCountUtil.release(msg);
        }*/
        /*ctx.write(msg);
        ctx.flush();*/
        final ByteBuf time = ctx.alloc().buffer(4);
        time.writeInt(((int) (System.currentTimeMillis() / 1000L + 2208988800L)));

        final ChannelFuture f = ctx.writeAndFlush(time);
        f.addListener((ChannelFutureListener) future -> {
            assert f == future;
            ctx.close();
        });
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        //Close the connection when an exception is raised
        cause.printStackTrace();
        ctx.close();
    }
}
