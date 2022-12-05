public class Main {
    public static void main(String[] args) {
        Flower rosa = new Flower(null, "Голландия", 35.59);
        Flower chrysanthemum = new Flower(null, null, 15);
        chrysanthemum.lifeSpan = 5;
        Flower pion = new Flower(null, "Англия", 69.9);
        pion.lifeSpan = 1;
        Flower gypsophila = new Flower(null, "Турция", 19.5);
        gypsophila.lifeSpan = 10;

        printInfo(rosa);
        printInfo(chrysanthemum);
        printInfo(pion);
        printInfo(gypsophila);

        System.out.println();

        printPriceBouquetOfFlowers(
                rosa, rosa, rosa,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila
        );
    }
        private static void printInfo(Flower flower) {
            System.out.println(
                    "Цвет: " + flower.getFlowerColor() +
                            ", страна: " + flower.getCountry() +
                            ", стоимость за штуку: " + flower.getCost() +
                            ", срок стояния цветка: " + flower.lifeSpan);
        }

    private static void printPriceBouquetOfFlowers(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + minimumLifeSpan);
    }
    }
