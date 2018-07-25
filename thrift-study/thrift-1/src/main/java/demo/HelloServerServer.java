package demo;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TBinaryProtocol.Factory;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

import demo.HelloServer.Processor;


/**
 * 服务端实现
 * @author csy
 *
 */
public class HelloServerServer {

	/**
	 * 配置和启动服务端主函数
	 * @param args
	 * @throws TTransportException
	 */
	public static void main(String[] args) throws TTransportException {
		// TODO Auto-generated method stub
		//处理器业务关联
		Processor<HelloServer.Iface> processor=new HelloServer.Processor<HelloServer.Iface>(new HelloServerImpl());
		//设置服务端口
		TServerSocket socket=new TServerSocket(6788);
		//协议工厂
		Factory factory=new TBinaryProtocol.Factory();
		//单线程标准阻塞式IO
		TServer.Args args2=new TServer.Args(socket);
		args2.processor(processor);
		args2.protocolFactory(factory);
		TServer server=new TSimpleServer(args2);
		System.out.println("服务已启动");
		server.serve();
		
		
	}

}
