// Muhammad Rayhan Faridh
// 222212766
// 2KS1

public abstract class Route {
  private Location start;
  private Location end;
  private Routable routable;

  protected Route(Location start, Location end) {
    this.start = start;
    this.end = end;
  }

  public void setRoutable(Routable routable) {
    this.routable = routable;
  }

  public void printRoute() {
    routable.findBestRoute(start, end);
  }
}

class Walking extends Route {
  public Walking(Location start, Location end) {
    super(start, end);
    super.setRoutable(new WalkingRoute());
  }
}

class Driving extends Route {
  public Driving(Location start, Location end) {
    super(start, end);
    super.setRoutable(new CarRoute());
  }
}

class Riding extends Route {
  public Riding(Location start, Location end) {
    super(start, end);
    super.setRoutable(new MotorcycleRoute());
  }
}