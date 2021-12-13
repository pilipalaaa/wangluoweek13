import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class kehu {
    public static void main(String[] args) throws IOException{
        //创建客户端的Socket对象
        Socket s=new Socket("127.0.0.1", 50000);

        //获取输出流，写数据
        OutputStream os=s.getOutputStream();
        os.write("物联2班Woo".getBytes());

        //释放资源
        s.close();
    }
}
