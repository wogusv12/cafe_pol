package com.cafe_pol.server;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Client cl = new Client();
        cl.ClientRun("alpha/beta/C/D/E/F/G");
        System.out.println("CR 1 실행완");
        cl.ClientRun("A/B/ce/de/ee/fe/ge");
        System.out.println("CR2실행완");
        //cl.ClientRun("quit");
    }
    public void ClientRun(String data) {

        Socket socket = null;
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            socket = new Socket("localhost", 4201);
            os = socket.getOutputStream();
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);            //서버로 전송을 위한 OutputStream

            //is = socket.getInputStream();
            //isr = new InputStreamReader(is);
            //br = new BufferedReader(isr);        // 서버로부터 Data를 받음

            bw.write(data);
            bw.newLine();
            bw.flush();

            //String receiveData = "";
            //receiveData = br.readLine();        // 서버로부터 데이터 한줄 읽음
            //System.out.println("서버로부터 받은 데이터 : " + receiveData);
            System.out.println("소캣통신 종료실행");
            bw.close();
            osw.close();
            os.close();
            socket.close();
            System.out.println("소캣통신 종료완료");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}
