package design_patterns.Behavioral;

import java.util.ArrayList;
import java.util.List;

interface IpublisherChannel {
	void uploadVideo(String bytes);

	void notifySubscribers();

	void subscriberChannel(IsubscriberChannel isubscriberChannel);

	void unSubscriberChannel(IsubscriberChannel isubscriberChannel);

	String getVideoData();
}

class PublisherChannel implements IpublisherChannel {
	String name;
	String latestVideo;

	public PublisherChannel(String name) {
		this.name = name;
	}

	List<IsubscriberChannel> subscribers = new ArrayList<>();

	@Override
	public void uploadVideo(String title) {
		latestVideo = name;
		System.out.println("[ " + this.name + " uploaded " + title + " ]");
		notifySubscribers();
	}

	@Override
	public void notifySubscribers() {
		subscribers.forEach(f -> f.update());
	}

	@Override
	public void subscriberChannel(IsubscriberChannel isubscriberChannel) {
		if (!subscribers.contains(isubscriberChannel)) {
			subscribers.add(isubscriberChannel);
		}

	}

	@Override
	public void unSubscriberChannel(IsubscriberChannel isubscriberChannel) {
		if (subscribers.contains(isubscriberChannel)) {
			subscribers.remove(isubscriberChannel);
		}
	}

	@Override

	public String getVideoData() {
		return "Checkout our new video " + latestVideo;
	}
}

interface IsubscriberChannel {
	void update();
}

class SubscriberChannel implements IsubscriberChannel {

	String name;
	IpublisherChannel channel;

	public SubscriberChannel(String name, IpublisherChannel channel) {
		this.name = name;
		this.channel = channel;
	}

	@Override
	public void update() {
		System.out.println("HEY " + name + "," + channel.getVideoData());
	}
}

public class YT_ObserverPatern {
	public static void main(String[] args) {
		PublisherChannel pChannel = new PublisherChannel("RaghibYT");

		SubscriberChannel subscriberChannel1 = new SubscriberChannel("rohit", pChannel);
		SubscriberChannel subscriberChannel2 = new SubscriberChannel("rahul", pChannel);

		pChannel.subscriberChannel(subscriberChannel1);
		pChannel.subscriberChannel(subscriberChannel2);

		pChannel.uploadVideo("Observer Pattern tutorial");

		pChannel.unSubscriberChannel(subscriberChannel2);

		pChannel.uploadVideo("Decorator Pattern tutorial");
	}

}
