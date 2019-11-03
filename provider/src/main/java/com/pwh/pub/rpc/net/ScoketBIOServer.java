package com.pwh.pub.rpc.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Waver
 * @date 2019/11/2 22:59
 */
public class ScoketBIOServer {
    static ExecutorService threadPool = Executors.newFixedThreadPool(100);

    public static void startServer(int port) throws IOException {
        //TODO

        ServerSocket serverSocket = new ServerSocket(port);

        //BIO
        while (true){
            Socket socket = serverSocket.accept();//waiting...  util connected
            threadPool.execute(new RpcRequestHandler(socket));
        }

    }
}
