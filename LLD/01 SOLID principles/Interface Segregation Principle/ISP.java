// Before applying ISP
interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    @Override
    public void work() {
        // work logic
    }

    @Override
    public void eat() {
        // eating logic
    }
}

class RobotWorker implements Worker {
    @Override
    public void work() {
        // work logic
    }

    @Override
    public void eat() {
        // robots don't eat
        throw new UnsupportedOperationException();
    }
}

// After applying ISP
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        // work logic
    }

    @Override
    public void eat() {
        // eating logic
    }
}

class RobotWorker implements Workable {
    @Override
    public void work() {
        // work logic
    }
}
