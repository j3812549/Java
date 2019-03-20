package com.bjsxt.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.IIOException;


/**
 * 创建服务器，并启动，利用byte处理post数据
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
	 * 启动方法
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
	 * 接受客户端
	 */
	private void receive() {
		try {
			Socket client = server.accept();
			String msg = null; // 接受客户端的请求信息
			StringBuilder sb = new StringBuilder();
			
			byte[] data = new byte[20480];
			int len = client.getInputStream().read(data);
			
			// 接受客户端的数据
			String requestInfo = new String(data, 0, len).trim();
			System.out.println(requestInfo);
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	/**
	 * 停止
	 */
	public void stop () {
		
	}

}
