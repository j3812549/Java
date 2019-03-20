package com.bjsxt.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.IIOException;


/**
 * ��������������������ֻ�ɽ���get��������ݣ����ݵ㴦��������
 * @author Administrator
 *
 */

public class Server {
	private ServerSocket server;
	/**
	 * @param args
	 */
	public static void  main(String[] args) {
		Server server = new Server();
		server.start();
		server.receive();
		
	}
	/**
	 * ��������
	 */
	public void  start () {
		try {
			server = new ServerSocket(8888);
			this.receive();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * ���ܿͻ���
	 */
	private void receive() {
		try {
			Socket client = server.accept();
			String msg = null; // ���ܿͻ��˵�������Ϣ
			StringBuilder sb = new StringBuilder();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
			while((msg = br.readLine()).length() > 0) {
				sb.append(msg);
				sb.append("\r\n");
				if (null == msg) {
					break;
				}
			}
			String requestInfo = sb.toString().trim();
			System.out.println(requestInfo);
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	/**
	 * ֹͣ
	 */
	public void stop () {
		
	}

}
