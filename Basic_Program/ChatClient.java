import java.io.*;
import java.net.*;
class ChatClient {
public static void main(String[] args) throws Exception {
Socket s = new Socket("localhost", 1234);
BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintWriter out = new PrintWriter(s.getOutputStream(), true);
BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
String msg;
while (true) {
System.out.print("Client: ");
out.println(kb.readLine());
msg = in.readLine();
if (msg.equalsIgnoreCase("bye")) break;
System.out.println("Server: " + msg);
}
s.close();
}
}