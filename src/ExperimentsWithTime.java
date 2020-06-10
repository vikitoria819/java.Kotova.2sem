public class ExperimentsWithTime {
    public static void main(String[] args){
        Time s = new Time(12,40);
        System.out.println(s.show());
        System.out.println(s.isMorning());
        System.out.println(s.isDay());
        System.out.println(s.isEvening());
        System.out.println(s.isNight());
        System.out.println(s.sayHello());
        System.out.println(s.add(60));
    }
}
