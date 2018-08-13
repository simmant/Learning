package sockettest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test8 {

	public static String message = "";

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("127.0.0.1", 10000);

		DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
	
		int count;
		byte[] buffer = new byte[8192]; // or 4096, or more
		while ((count = in.read(buffer)) > 0)
		{
		  out.write(buffer, 0, count);
		}
		
		System.out.println(out.toString());
	}
// 9584827147
}
