package com.cafe_pol.server;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Client cl = new Client();
        cl.ClientRun("alpha");
        cl.ClientRun("beta");
        cl.ClientRun("quit");
    }
    public void ClientRun(String data) {

        Socket socket = null;
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            socket = new Socket("localhost", 4201);
            os = socket.getOutputStream();
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);            //서버로 전송을 위한 OutputStream

            is = socket.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);        // 서버로부터 Data를 받음

            bw.write(data);
            bw.newLine();
            bw.flush();

            String receiveData = "";
            receiveData = br.readLine();        // 서버로부터 데이터 한줄 읽음
            System.out.println("서버로부터 받은 데이터 : " + receiveData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                osw.close();
                os.close();
                br.close();
                isr.close();
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
