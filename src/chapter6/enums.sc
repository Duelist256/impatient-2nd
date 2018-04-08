object TrafficLightColor extends Enumeration {
  type TrafficLightColor = Value
  val Red, Yellow, Green = Value
}

TrafficLightColor.Green.id
TrafficLightColor.Yellow.id

TrafficLightColor(0)
TrafficLightColor.withName("Red")