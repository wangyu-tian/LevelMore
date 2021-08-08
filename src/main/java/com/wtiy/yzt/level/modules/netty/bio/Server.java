package com.wtiy.yzt.level.modules.netty.bio;

import cn.hutool.core.util.ObjectUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author wangyu
 * @Create: 2021/7/20 3:22 下午
 * @Description:
 */
@Slf4j
public class Server {

    /**
     * 服务端默认端口号
     */
    private static int DEFAULT_PORT = 7777;

    private static ServerSocket serverSocket;

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        if (ObjectUtil.isNotNull(serverSocket)) {
            return;
        }
        try {
            serverSocket = new ServerSocket(DEFAULT_PORT);
            log.info("server is started_port:{}", DEFAULT_PORT);
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new ServerHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
