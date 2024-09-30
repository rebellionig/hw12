package bana1.test_11_17.hw;

class Animal {
    protected String name;
    protected double runningVelocity; // in mph
    protected int stamina;
    protected int currentStamina;

    public Animal(String name, double runningVelocity, int stamina) {
        this.name = name;
        this.runningVelocity = runningVelocity;
        this.stamina = stamina;
        this.currentStamina = stamina;
    }

    public double run(int distance) {
        int requiredStamina = distance; // 1 stamina per meter
        if (currentStamina < requiredStamina) {
            System.out.println(name + " is too tired to run.");
            return -1; // tired condition
        }

        double timeTaken = distance / (runningVelocity * 0.44704); // converting mph to m/s
        currentStamina -= requiredStamina;
        System.out.printf("%s ran %d meters in %.2f seconds.%n", name, distance, timeTaken);
        return timeTaken;
    }

    public double swim(int distance) {
        throw new UnsupportedOperationException("This animal cannot swim.");
    }

    public void info() {
        System.out.printf("%s - Stamina: %d/%d%n", name, currentStamina, stamina);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name, 30, 100); // Example velocity in mph
    }

    @Override
    public double swim(int distance) {
        System.out.println(name + " cannot swim.");
        return -1;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name, 20, 100); // Example velocity in mph
    }

    @Override
    public double swim(int distance) {
        int requiredStamina = distance * 2; // 2 stamina per meter for swimming
        if (currentStamina < requiredStamina) {
            System.out.println(name + " is too tired to swim.");
            return -1; // tired condition
        }

        double timeTaken = distance / (runningVelocity * 0.44704); // converting mph to m/s
        currentStamina -= requiredStamina;
        System.out.printf("%s swam %d meters in %.2f seconds.%n", name, distance, timeTaken);
        return timeTaken;
    }
}

class Horse extends Animal {
    public Horse(String name) {
        super(name, 25, 100); // Example velocity in mph
    }

    @Override
    public double swim(int distance) {
        int requiredStamina = distance * 4; // 4 stamina per meter for swimming
        if (currentStamina < requiredStamina) {
            System.out.println(name + " is too tired to swim.");
            return -1; // tired condition
        }

        double timeTaken = distance / (runningVelocity * 0.44704); // converting mph to m/s
        currentStamina -= requiredStamina;
        System.out.printf("%s swam %d meters in %.2f seconds.%n", name, distance, timeTaken);
        return timeTaken;
    }
}