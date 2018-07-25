package thrift;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

public class HelloServiceServer {
    /**
     * 启动thrift服务器
     * @param args
     */
    public static void main(String[] args) {
        try {
            System.out.println("服务端开启....");
            //设置处理器并关联业务：thrift生成的对应处理器
            TProcessor tprocessor = new Hello.Processor<Hello.Iface>(new HelloServiceImpl());
            // 设置服务器端口
            TServerSocket serverTransport = new TServerSocket(9898);
            //使用单线程标准阻塞IO模型
            TServer.Args tArgs = new TServer.Args(serverTransport);
            tArgs.processor(tprocessor);
            //设置二进制协议工厂
            tArgs.protocolFactory(new TBinaryProtocol.Factory());
            //配置服务器
            TServer server = new TSimpleServer(tArgs);
            //启动服务
            server.serve();
            }catch (TTransportException e) {
            e.printStackTrace();
        }
    }
}