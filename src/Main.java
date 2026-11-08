public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber alice = new NewsSubscriber("Alice");
        Subscriber bob = new NewsSubscriber("Bob");
        Subscriber carol = new NewsSubscriber("Carol");

        agency.subscribe(alice);
        agency.subscribe(bob);
        agency.subscribe(carol);

        agency.publish("Breaking: Market hits record high");

        agency.unsubscribe(bob);

        agency.publish("Breaking: Storm approaching the coast");
    }
}
