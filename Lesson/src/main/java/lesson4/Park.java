package lesson4;

public class Park {
    public class Attraction {
        private String name;
        private String time;
        private double cost;

        public Attraction(String name, double cost) {
            this.name = name;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name + "; стоимость: " + cost);
        }
    }
}
