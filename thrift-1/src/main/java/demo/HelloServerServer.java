package demo;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TBinaryProtocol.Factory;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

import demo.HelloServer.Processor;

public class HelloServerServer {

	public static void main(String[] args) throws TTransportException {
		// TODO Auto-generated method stub
		Processor<HelloServer.Iface> processor=new HelloServer.Processor<HelloServer.Iface>(new HelloServerImpl());
		TServerSocket socket=new TServerSocket(6788);
		Factory factory=new TBinaryProtocol.Factory();
		TServer.Args args2=new TServer.Args(socket);
		args2.processor(processor);
		args2.protocolFactory(factory);
		TServer server=new TSimpleServer(args2);
		System.out.println("服务已启动");
		server.serve();
		
		
	}

}
