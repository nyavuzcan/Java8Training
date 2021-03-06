package DesignPatterns.StructuralDesignPatterns.AdapterDesignPattern;


public class OozinozRocket extends PhysicalRocket implements RocketSim {

  private double time;

  public OozinozRocket(
      double burnArea,
      double burnRate,
      double fuelMass,
      double totalMass){

    super(burnArea, burnRate, fuelMass, totalMass);
  }
  public double getMass() {
    return getMass(time);
  }
  public double getThrust() {
    return getThrust(time);
  }

  public void setSimTime(double time) {
    this.time = time;
  }
}