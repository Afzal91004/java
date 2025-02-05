import java.util.ArrayList;
import java.util.List;

interface IObserver {
    void onNotification(Video video);
}

class Video {
    public String title;
    public String cat;

    Video(String title) {
        this.title = title;
    }
}

class Subscriber implements IObserver {
    private String name;

    Subscriber(String name) {
        this.name = name;
    }
    
    public String toString(){
        return this.name;
    }

    @Override
    public void onNotification(Video video) {
        System.out.println(name + ": A new video is published "+ video.title);
    }
}

class SubscriberIterator {
    private Channel channel;
    private int currentIndex;

    SubscriberIterator(Channel ch) {
        this.channel = ch;
        this.currentIndex = 0;
    }

    public boolean hasNext() {
        return currentIndex < channel.getSubscribers().size();
    }

    public Subscriber next() {
        Subscriber subscriber = this.channel.getSubscribers().get(currentIndex);
        currentIndex++;
        return subscriber;
    }
}

class Channel {
    private List<Subscriber> subscribers;

    Channel() {
        this.subscribers = new ArrayList<>();
    }

    public void publishVideo(Video video) {
        for (Subscriber sub: subscribers) {
            sub.onNotification(video);
        }
    }

    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public List<Subscriber> getSubscribers(){
        return this.subscribers;
    }
}

public class Main {
    public static void main(String[] args) {
        Channel r2h = new Channel();
        SubscriberIterator iterator = new SubscriberIterator(r2h);
        Subscriber afzal = new Subscriber("Afzal");
        Subscriber tufail = new Subscriber("Tufail");
        Subscriber shadab = new Subscriber("Shadab");

        r2h.addSubscriber(afzal);
        r2h.publishVideo(new Video("Zombie vs Human"));
        r2h.addSubscriber(tufail);
        r2h.addSubscriber(shadab);
        r2h.publishVideo(new Video("Men on Mission"));


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
