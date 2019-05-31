package com.cafe_pol.server;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    ServerSocket server = null;
    int port = 4201;
    Socket socket = null;


    public static void main(String[] args) {
        server ss = new server();
    }


    server(){
        boolean alpha=true;
        String data=null;
        InputStream is=null;
        InputStreamReader isr=null;
        BufferedReader br=null;
        try{
            server = new ServerSocket(port);
            while(true){
                System.out.println("-------접속 대기중------");
                socket = server.accept();         // 클라이언트가 접속하면 통신할 수 있는 소켓 반환
                System.out.println(socket.getInetAddress() + "로 부터 연결요청이 들어옴");

                is = socket.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);

                if(alpha==true) {

                    data = br.readLine();
                    System.out.println("클라이언트로 부터 받은 데이터:" + data);
                    //받는 데이터 형식  string(Product_label.getText() + "/" +price+"/"+num+"/"+cup+"/"+Size+"/"+shot+"/"+ice);
                    MessageRecive(data);
                    alpha=false;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void MessageRecive(String data) {

                    String str = data;
                    String[] values=str.split("/"); // '/'를 구분자로 사용하셔 문자열 짜르기
                    for(int x=0;x<values.length;x++){
                        System.out.println("문자"+(x+1)+" = "+values[x]);
                    }

                    //receiveData(data, socket);         // 받은 데이터를 그대로 다시 보내기
                    //System.out.println("****** 전송 완료 ****");



    }


    public void receiveData(String data, Socket socket){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try{
            os = socket.getOutputStream();
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            // 클라이언트로부터 데이터를 보내기 위해 OutputStream 선언

            bw.write(data);            // 클라이언트로 데이터 전송
            bw.flush();
        }catch(Exception e1){
            e1.printStackTrace();
        }finally {
            try{
                bw.close();
                osw.close();
                os.close();
                socket.close();
            }catch(Exception e1){
                e1.printStackTrace();
            }
        }

    }
}
