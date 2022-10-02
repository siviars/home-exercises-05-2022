package io.codelex.oop.computers;

import java.util.Objects;

public class Computer {

    String processor;
    String ram;
    String graphics;
    String card;
    String company;
    String model;

    public static void main(String[] args) {
        Computer oneC = new Computer("IntelCore i5", "128Gb", "GeForce GTX1650","8Gb","ASUS","GF876");
        Computer twoC = new Computer("IntelCore i7", "256Gb", "GeForce RTX3060","8Gb","LENOVO","UG89");
        Computer threeC = new Computer("IntelCore i3", "64Gb", "GeForce GT730","8Gb","DELL","ACH34");
        Computer fourC = new Computer("AMD Ryzen 7", "256Gb", "Radeon RX 6600","8Gb","HP","OTV35");
        Computer fiveC = new Computer("AMD Ryzen 5", "128Gb", "Radeon RX550X","8Gb","MSI","UZV24");

        System.out.println(oneC.getCard());
        System.out.println(twoC.getModel());
        System.out.println(threeC.getProcessor());
        fourC.setCard("6Gb");
        System.out.println(fiveC.hashCode());
        System.out.println(threeC.toString());

    }

    public Computer(String processor, String ram, String graphics, String card, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphics = graphics;
        this.card = card;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(processor, computer.processor) && Objects.equals(ram, computer.ram) && Objects.equals(graphics, computer.graphics) && Objects.equals(card, computer.card) && Objects.equals(company, computer.company) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphics, card, company, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphics='" + graphics + '\'' +
                ", card='" + card + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
