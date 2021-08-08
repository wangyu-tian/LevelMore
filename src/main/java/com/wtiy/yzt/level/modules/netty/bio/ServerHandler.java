package com.wtiy.yzt.level.modules.netty.bio;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.Socket;

/**
 * @Author wangyu
 * @Create: 2021/8/8 9:54 下午
 * @Description:
 */
@Slf4j
public class ServerHandler implements Runnable {

    private Socket socket;

    public ServerHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), false)) {
            String message;
            while (true) {
                if ((message = bufferedReader.readLine()) == null) {
                    break;
                }
                log.info("server accept thread:{}_message:{}", Thread.currentThread().getId(), message);
                printWriter.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
            log.error(e.getLocalizedMessage());
        }
    }
}
