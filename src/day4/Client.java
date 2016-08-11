package day4;

//import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Client {

	public static void main(String[] args) {
		
		try
		(
			Socket ser = new Socket("10.1.1.143",12345);
			OutputStream out = ser.getOutputStream();
			Writer write = new OutputStreamWriter(out);
			Writer buffwriter = new BufferedWriter(write);
			
		)
		{
			buffwriter.write( "My name is Giovanny Roman");
			buffwriter.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
