package DPI;

public class Car {
    private EngineInterface engine;
    public Car(EngineInterface engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
    }
}
