package demo;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;

import demo.HelloServer.Client;

public class HelloServerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TSocket socket=null;
		try {
		socket=new TSocket("localhost", 6788);
		TProtocol protocol=new TBinaryProtocol(socket);
		Client client=new HelloServer.Client(protocol);
		socket.open();
		
		int result=client.returnone("ss");
		System.out.println("客户端返回结果为："+result);
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(socket!=null)
				socket.close();
		}
	}

}
