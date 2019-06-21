package com.cafe_pol.server;


import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class server {

    DefaultListModel name= new DefaultListModel();
    DefaultListModel num= new DefaultListModel();
    DefaultListModel cup= new DefaultListModel();
    DefaultListModel size= new DefaultListModel();
    DefaultListModel shot= new DefaultListModel();
    DefaultListModel ice= new DefaultListModel();
    //int index = 0;

    public static void main(String[] args) {


        server ss = new server();
        ss.ServerRun();

    }

    public void ServerRun() {
        int i =999;
        ServerSocket server = null;
        int port = 4201;
        Socket socket = null;
        int commitindex=0;

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        ServerApp_main sm = new ServerApp_main();
        sm.setVisible(true);
        ServerApp_commit sc = new ServerApp_commit();
        sc.setVisible(true);




        try {
            server = new ServerSocket(port);

            while (true) {
                System.out.println("-------접속 대기중------");
                socket = server.accept();         // 클라이언트가 접속하면 통신할 수 있는 소켓 반환
                System.out.println(socket.getInetAddress() + "로 부터"+commitindex+"번째 연결요청이 들어옴");

                String data = null;

                is = socket.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
                // 클라이언트로부터 데이터를 받기 위한 InputStream 선언

                //String date = LocalDate.now().toString()+ LocalTime.now().toString();
                data = br.readLine();

                System.out.println("클라이언트로 부터 받은 데이터:" + data);


                //sm.addItem(i,data);


                //받는 데이터 형식  string(OrderNUM+"/"+Product_label.getText() + "/" +price+"/"+num+"/"+cup+"/"+Size+"/"+shot+"/"+ice);


               String str = data;
                String[] values = str.split("/"); // '/'를 구분자로 사용하셔 문자열 짜르기
                for (int x = 0; x < values.length; x++) {
                    System.out.println("문자" + (x + 1) + " = " + values[x]);
                }

                if(Integer.parseInt(values[0])==i){
                    commitindex++;
                    System.out.println("commitIndex : "+commitindex+ "/ i : "+i);
                } else {
                    commitindex=0;
                    sc.removeItem();
                    i=Integer.parseInt(values[0]);
                    System.out.println("commitIndex : "+commitindex+ "/ i : "+i);
                }

                String kstr="";
                /*name.add(i, values[1]);
                num.add(i,values[3]);
                cup.add(i,values[4]);
                size.add(i,values[5]);
                shot.add(i,values[6]);
                ice.add(i,values[7]);*/


                String OrderNumStr = values[0];
                int OrderNum = Integer.parseInt(OrderNumStr);

                for(int n=1;n<values.length;n++) {
                    kstr = kstr+values[n];
                    System.out.println("kstr : "+kstr);
                }
                for(int x=0;x<values.length;x++){
                    System.out.println(x+"번째 valuse[]값 : "+values[x]);
                }
                sm.addItem(commitindex+1,Integer.parseInt(values[0]),kstr);

                sc.addItem(commitindex,values[1],values[2],values[3],values[4],values[5],values[6],values[7]);

                //i=i+1;



                System.out.println(data);

                //receiveData(data, socket);         // 받은 데이터를 그대로 다시 보내기
                if(socket.isClosed()){ System.out.println("소캣 차단 완료"); break;}
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                br.close();
                isr.close();
                is.close();
                server.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    public void receiveData(String data, Socket socket) {
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = socket.getOutputStream();
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            // 클라이언트로부터 데이터를 보내기 위해 OutputStream 선언

            bw.write(data);            // 클라이언트로 데이터 전송
            bw.flush();
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                bw.close();
                osw.close();
                os.close();
                socket.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
}