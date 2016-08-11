package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try (ServerSocket ss = new ServerSocket(12345);
				Socket s =ss.accept();
				InputStream in = s.getInputStream();
				InputStreamReader read = new InputStreamReader(in);
				BufferedReader reader = new BufferedReader(read);
				)	
		{
			System.out.println(reader.readLine());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
