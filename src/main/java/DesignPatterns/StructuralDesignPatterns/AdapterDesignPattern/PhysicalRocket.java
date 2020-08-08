package DesignPatterns.StructuralDesignPatterns.AdapterDesignPattern;

public class PhysicalRocket {
  double burnArea;
  double burnRate;
  double fuelMass;
  double totalMass;

  public PhysicalRocket( double burnArea, double burnRate,double fuelMass,double totalMass){
    this.burnArea = burnArea;
    this.burnRate = burnRate;
    this.fuelMass = fuelMass;
    this.totalMass = totalMass;
  }

  public double getMass(double time) {
    return totalMass;
  }
  public double getThrust(double thurst) {
    return fuelMass;
  }
}
