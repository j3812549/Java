package com.bjsxt.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.IIOException;


/**
 * ������������������������byte����post����
 * @author Administrator
 *
 */

public class Server2 {
	private ServerSocket server;
	/**
	 * @param args
	 */
	public static void  main(String[] args) {
		Server2 server = new Server2();
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
			
			byte[] data = new byte[20480];
			int len = client.getInputStream().read(data);
			
			// ���ܿͻ��˵�����
			String requestInfo = new String(data, 0, len).trim();
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