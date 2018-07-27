import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.ZooKeeper.States;

/**
 * Zookeeper测试
 *
 * @create 2016年3月10日
 */
public class Test implements Runnable {

	// 会话超时时间，设置为与系统默认时间一致
	private static final int SESSION_TIMEOUT = 30 * 1000;

	// 创建 ZooKeeper 实例
	private ZooKeeper zk;

	// 初始化 ZooKeeper 实例
	private void createZKInstance() throws IOException {
		// 连接到ZK服务，多个可以用逗号分割写
		zk = new ZooKeeper("127.0.0.1:2181,127.0.0.1:2182,127.0.0.1:2183", Test.SESSION_TIMEOUT, new Watcher() {

			public void process(WatchedEvent event) {
				// TODO Auto-generated method stub

			}
		});
		if (!zk.getState().equals(States.CONNECTED)) {
			while (true) {
				if (zk.getState().equals(States.CONNECTED)) {
					break;
				}
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException, KeeperException {
		Test dm = new Test();
		dm.createZKInstance();
		Thread thread = new Thread(dm);
		thread.start();

	}

	public void run() {
		// TODO Auto-generated method stub
		// 创建 Watcher 实例
		Watcher wh = new Watcher() {
			/**
			 * Watched事件
			 */
			public void process(WatchedEvent event) {
				System.out.println("WatchedEvent >>> " + event.getType());

			}
		};
		while (true) {
			try {
				zk.exists("/zoo20000000012", wh);
				Thread.sleep(5);
			} catch (KeeperException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}