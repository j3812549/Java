package com.bjsxt.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.IIOException;


/**
 * 创建服务器，并启动，只可接受get请求的数据，数据点处理有问题
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
	 * 停止
	 */
	public void stop () {
		
	}

}
