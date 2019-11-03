package com.pwh.pub.rpc;

import com.pwh.pub.rpc.net.ScoketBIOServer;

import java.io.IOException;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class BootStrap
{
    public static void main( String[] args )
    {
        try {
            ScoketBIOServer.startServer(7777);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
