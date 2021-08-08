package cn.guosgbin.pattern.builder.webdemo;

/**
 * Builder interface defines all possible ways to configure a product.
 * 建造接口，定义构建产品的所有的零件
 */
public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}