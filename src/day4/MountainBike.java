package day4;

public class MountainBike {
  private String brand;
  private double wheelDiameter;
  private int frontShockTravel;
  private int rearShockTravel;
  private String material;
  private boolean isTubeless;
  private double tireWidth;

  public MountainBike(String brand,
                      double wheelDiameter,
                      int frontShockTravel,
                      int rearShockTravel,
                      String material,
                      boolean isTubeless,
                      double tireWidth) {
    this.brand = brand;
    this.wheelDiameter = wheelDiameter;
    this.frontShockTravel = frontShockTravel;
    this.rearShockTravel = rearShockTravel;
    this.material = material;
    this.isTubeless = isTubeless;
    this.tireWidth = tireWidth;
  }

  public String getBrand() {
    return brand;
  }

  public double getWheelDiameter() {
    return wheelDiameter;
  }

  public int getFrontShockTravel() {
    return frontShockTravel;
  }

  public int getRearShockTravel() {
    return rearShockTravel;
  }

  public String getMaterial() {
    return material;
  }

  public boolean isTubeless() {
    return isTubeless;
  }

  public double getTireWidth() {
    return tireWidth;
  }

  public void setTubeless(boolean tubeless) {
    isTubeless = tubeless;
  }

  public void setTireWidth(double tireWidth) {
    this.tireWidth = tireWidth;
  }

  @Override
  public String toString() {
    return "MountainBike{" +
            "brand='" + brand + '\'' +
            ", wheelDiameter=" + wheelDiameter +
            ", frontShockTravel=" + frontShockTravel +
            ", rearShockTravel=" + rearShockTravel +
            ", material='" + material + '\'' +
            ", isTubeless=" + isTubeless +
            ", tireWidth=" + tireWidth +
            '}';
  }
}
