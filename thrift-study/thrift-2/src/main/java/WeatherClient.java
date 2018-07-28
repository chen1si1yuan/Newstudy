

import org.apache.http.impl.execchain.ClientExecChain;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TType;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;



public class WeatherClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TSocket socket=new TSocket("116.6.230.45 ",12301);
      TProtocol poProtocol=new TBinaryProtocol(socket);
      TrioBrainServing.Client trioBrainServing=new TrioBrainServing.Client(poProtocol);
      TrioDataBundle trioDataBundle=new TrioDataBundle();
      query = user_query,
              user = user_info,
              params = params_info,
              terminal = client_info
      trioDataBundle.setQuery("今天天气怎么样");
      UserInfo userInfo=new UserInfo();
      userInfo.setUid("")
      trioDataBundle.setUser()
      trioBrainServing.TrioBrainProcess(bundle)
      try {
		socket.open();
		
	} catch (TTransportException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
	}

}
