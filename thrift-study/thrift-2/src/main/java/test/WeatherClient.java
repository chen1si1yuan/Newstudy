package test;

import org.apache.http.impl.execchain.ClientExecChain;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class WeatherClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TSocket socket=new TSocket("116.6.230.45 ",12301);
      TProtocol poProtocol=new TBinaryProtocol(socket);
 
      
      
	}

}
