package thrift;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class HelloServiceClient {

    public static void main(String[] args) {
        System.out.println("客户端启动....");
        TTransport transport = null;
        try {
        	//设置传输通道：ip 端口 超时
            transport = new TSocket("localhost", 9898, 30000);
            // 协议要和服务端一致：二进制传输协议
            TProtocol protocol = new TBinaryProtocol(transport);
            //创建客户端并配置协议信息
            Hello.Client client = new Hello.Client(protocol);
            //打开传输通道
            transport.open();
            //发送并接受消息
            String result = client.helloString("哈哈");
            System.out.println(result);
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        } finally {
            if (null != transport) {
                transport.close();
            }
        }
    }
}