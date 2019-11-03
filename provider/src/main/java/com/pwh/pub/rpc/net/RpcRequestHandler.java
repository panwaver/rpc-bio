package com.pwh.pub.rpc.net;

import com.pwh.pub.rpc.dispatch.ServiceDispatch;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author Waver
 * @date 2019/11/2 23:05
 */
public class RpcRequestHandler implements Runnable {
    private Socket socket;
    public RpcRequestHandler(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try {
            ois = new ObjectInputStream(socket.getInputStream());
            Object reqObj = ois.readObject();
            //调用服务的分发模块进行服务调用
            Object responObj = ServiceDispatch.dispatch(reqObj);
            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(responObj);
            oos.flush();
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

    }
}
