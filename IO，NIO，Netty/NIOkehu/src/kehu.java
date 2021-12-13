import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class kehu {
    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);

        // 连接服务器
        if (!socketChannel.connect(new InetSocketAddress("127.0.0.1", 8887))) {
            while (!socketChannel.finishConnect()) {
                System.out.println("connecting...");
            }
        }
        //发送数据
        String str = "物联二班Woo";
        ByteBuffer byteBuffer = ByteBuffer.wrap(str.getBytes());
        socketChannel.write(byteBuffer);
        System.in.read();
    }

}
