package com.pwh.pub.rpc.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author Waver
 * @date 2019/11/3 15:54
 */
public class SocketBIOClient {

    public Object callRemoteService(Object reqObj,String host,int port){

        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        Object respObj = null;
        try {
            Socket socket = new Socket(host,port);
            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(reqObj);
            oos.flush();

            ois = new ObjectInputStream(socket.getInputStream());
            respObj = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return respObj;
    }
}
