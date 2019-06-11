package com.cafe_pol.orderview;

import com.cafe_pol.server.ServerApp_main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class RecieveServer {

    public static void main(String[] args){
        RecieveServer rs = new RecieveServer();
        rs.ServerRun();
    }


    public void ServerRun() {
        int i = 1;
        ServerSocket server = null;
        int port = 4202;
        Socket socket = null;
        System.out.println("Server Port : "+port);

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        Recieve_form rf = new Recieve_form();
        rf.setVisible(true);

        try {
            server = new ServerSocket(port);
            while (true) {
                System.out.println("-------접속 대기중------");
                socket = server.accept();         // 클라이언트가 접속하면 통신할 수 있는 소켓 반환
                System.out.println(socket.getInetAddress() + "로 부터" + i + "번째 연결요청이 들어옴");

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
                String kstr = "";

                String OrderNumStr = values[0];
                int OrderNum = Integer.parseInt(OrderNumStr);
                for (int n = 1; n < values.length; n++) {
                    kstr = kstr + values[n];
                    System.out.println(kstr);
                }
                //sm.addItem(i, OrderNum, kstr);
                //i = i + 1;


                System.out.println(data);

                //receiveData(data, socket);         // 받은 데이터를 그대로 다시 보내기
                if (socket.isClosed()) System.out.println("소캣 차단 완료");


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
}
