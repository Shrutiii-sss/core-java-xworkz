class ClockTester{

public static void main(String arg[]){
//object creation in java

Clock clock = new Clock();
clock.Brandname="Digital Alarm Clock";
clock.type="Digital";
clock.color="White";
clock.special feature="Snooze";

clock.toseetime();
System.out.println("creating 1st copy of the projector");
System.out.println(clock.Brandname+ " " +clock.type+ " "+ clock.color+ " "+ clock.special feature);


Clock clock1 = new Clock();
clock1.Brandname="Tinload";
clock1.type="Analog";
clock1.color="Black";
clock1.special feature="Silent Clock";

clock1.toseetime();
System.out.println("creating 1st copy of the projector");
System.out.println(clock1.Brandname+ " " +clock1.type+ " "+ clock1.color+ " "+ clock1.special feature);


Clock clock2 = new Clock();
clock2.Brandname="Reynoe";
clock2.type="Analog";
clock2.color="Square-brown";
clock2.special feature="Silent Clock";

clock2.toseetime();
System.out.println("creating 1st copy of the projector");
System.out.println(clock2.Brandname+ " " +clock2.type+ " "+ clock2.color+ " "+ clock2.special feature);
