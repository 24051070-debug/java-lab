interface Motor {
    int capacity = 5;
    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Motor is running");
    }

    public void consume() {
        System.out.println("Motor is consuming power");
    }

    void display() {
        System.out.println("Capacity of the motor is " + capacity);
    }

    public static void main(String args[]) {
        WashingMachine w = new WashingMachine();
        w.display();
    }
}
