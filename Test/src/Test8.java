import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test8 {

	public static String message = "";
	
	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("127.0.0.1", 5000);

		 InputStream is = socket.getInputStream();
		    PrintWriter pw = new PrintWriter(socket.getOutputStream());
		    pw.println("GET / HTTP/1.0");
		    pw.println();
		    pw.flush();
		    byte[] buffer = new byte[1024];
		    int read;
		    while((read = is.read(buffer)) != -1) {
		        String output = new String(buffer, 0, read);
		        System.out.print(output);
		        System.out.flush();
		    };
		    socket.close();

	}

}
