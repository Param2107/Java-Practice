import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
public class client {
public static void main(String[] args) throws Exception {
try {
Socket socket = new Socket("localhost",8123);
PrintWriter out = new PrintWriter(new BufferedWriter(new
OutputStreamWriter(socket.getOutputStream())));
out.println("GET /index.html HTTP/1.0");
out.println();
out.flush();
BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
String inputLine;
int count = 0;
while ((inputLine = in.readLine()) != null) {
count++;
System.out.println(count);
System.out.println(inputLine); } in.close(); }
catch (Exception e) {
e.printStackTrace(); } } }