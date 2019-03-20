package com.bjsxt.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;

/**
   * ��װ��Ӧ��Ϣ
 * @author Administrator
 *
 */

public class Response {
	// �����������س��Ϳո�
	public static final String CRLF = "\r\n";
	public static final String BLANK = " ";
	// ��
	private BufferedWriter bw;
	// ����
	private StringBuilder content;
	
	// �洢ͷ��Ϣ
	private StringBuilder headInfo;
	// �洢���³���
	private int len = 0;
	
	
	public Response() {
		headInfo = new StringBuilder();
		content = new StringBuilder();
		len = 0;
	}
	public Response(OutputStream os) {
		this(); // ���������໥����
		bw = new BufferedWriter(new OutputStreamWriter(os));
		
	}
	/**
	 * �������� + �س�
	 */
	public Response println(String info) {
		content.append(info).append(CRLF);
		len += (info+CRLF).getBytes().length;
		return this;
	}
	
	/**
	 * ������Ӧͷ
	 */
	private void createHeadInfo(int code) {
		// 1.HTTPЭ��汾��״̬���롢����
		headInfo.append("HTTP/1.1").append(BLANK).append(code).append(BLANK);
		switch (code) {
			case 200:
				headInfo.append("OK");
				break;
			case 404:
				headInfo.append("NOT FOUND");
				break;
			case 505:
				headInfo.append("SEVER ERROR")
				break;
		}
		headInfo.append(CRLF);
		// 2.��Ӧͷ��Response Head��
		headInfo.append("Server:bjext Server/0.0.1").append(CRLF);
		headInfo.append("Date:").append(new Date()).append(CRLF);
		headInfo.append("Content-type:text/html;charset=GBK").append(CRLF);
		// ���ĳ��� : �ֽڳ���
		headInfo.append("Content-Length:").append(len).append(CRLF);
		headInfo.append(CRLF); // �ָ���
	}
	
	// ���͵��ͻ���
	void pushToClient(int code) throws IOException {
		createHeadInfo(code);
		// ͷ��Ϣ + �ָ���
		bw.append(headInfo.toString());
		// ����
		bw.append(content.toString());
		bw.flush();
		
	}
}
