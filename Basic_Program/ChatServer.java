import java.io.*;
import java.net.*;
class ChatServer {
public static void main(String[] args) throws Exception {
ServerSocket ss = new ServerSocket(1234);
Socket s = ss.accept();
BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintWriter out = new PrintWriter(s.getOutputStream(), true);
BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
String msg;
while (true) {
msg = in.readLine();
if (msg.equalsIgnoreCase("bye")) break;
System.out.println("Client: " + msg);
System.out.print("Server: ");
out.println(kb.readLine());
}
s.close(); ss.close();
}
}