package com.cafe_pol.kiosk;

import sun.awt.geom.AreaOp;
import sun.swing.table.DefaultTableCellHeaderRenderer;

import java.io.*;
import java.net.Socket;

public class Client {

    Socket socket = null;
    OutputStream os = null;
    OutputStreamWriter osw = null;
    BufferedWriter bw = null;

    InputStream is = null;
    InputStreamReader isr = null;
    BufferedReader br = null;

    Shop_basket sb = new Shop_basket();


    public static void main(String[] args) {
        Client cl = new Client();
        try{
            cl.SocketStart(); // 소캣 개설
            cl.ClientRun("alpha Data");  // 데이터 전송
            cl.SocketClose();  // 소캣 해제
            Thread.sleep(10);

        } catch(Exception e){
            e.printStackTrace();
        }

        //cl.ClientRun("0/alpha/beta/C/D/E/F/G");
        //cl.ClientRun("1/A/B/ce/de/ee/fe/ge");
        //cl.ClientRun("quit");
    }

    public void SocketStart(){
        try {
            socket = new Socket("localhost", 4201);
            System.out.println("Socket Open");
            //Main ma = new Main();
            //ma.setVisible(true);

        } catch (Exception e) {e.printStackTrace();}
    }

    public void ClientRun(String data) {
        try {
            //socket = new Socket("localhost", 4201);
            /*
            String SBdata = sb.model.get(0).toString();
            System.out.println(SBdata);*/

            os = socket.getOutputStream();
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            //서버로 전송을 위한 OutputStream
            System.out.println("os, osw, bs 생성완료");
            //is = socket.getInputStream();
            //isr = new InputStreamReader(is);
            //br = new BufferedReader(isr);        // 서버로부터 Data를 받음

            bw.write(data);
            bw.newLine();
            bw.flush();

            System.out.println("to server : "+data);

            //String receiveData = "";
            //receiveData = br.readLine();        // 서버로부터 데이터 한줄 읽음
            //System.out.println("서버로부터 받은 데이터 : " + receiveData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void SocketClose(){
        try {
            bw.close();
            osw.close();
            os.close();
            System.out.println("Socket Close");
        } catch (Exception e) {e.printStackTrace();}
    }
}