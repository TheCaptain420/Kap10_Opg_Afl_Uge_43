public class TimeOpg10komma1 {
    public static void main(String[] args) {
        //Laver 2 nye objects, den ene uden arg, som viser nuværende tid. Og en som viser klokken efter 555550000 mili.
        TimeOpg10komma1 time1 = new TimeOpg10komma1();
        TimeOpg10komma1 time2 = new TimeOpg10komma1(555550000);

        //Printer Nuværende tid aka. time1
        System.out.println("Time1  "+time1.getHour()+":"+time1.getMinute()+":"+time1.getSecond());
        System.out.println(" ");
        //Printer tid efter 555550000 mili aka. time2 (note: Der er + 2 timer på)
        System.out.println("Time2  "+time2.getHour()+":"+time2.getMinute()+":"+time2.getSecond());
        System.out.println(" ");
        //Ændre time1 og printer den.
        time1.setTime(555550000);
        System.out.println("Time1  "+time1.getHour()+":"+time1.getMinute()+":"+time1.getSecond());



    }



    //Del 1. Lav datafields:
    int hour;
    int minute;
    int second;
    long klokken;

    //Del 2. constructor Time, der viser tiden "nu"
    TimeOpg10komma1(){
        klokken=System.currentTimeMillis();
    }

    //Del 3. constructor Time, der viser klokken, et bestemt antal mili efter 1.1.1970.
    TimeOpg10komma1(long time){
        klokken=time;
    }

    //Del 4. constructor Time, der får værdier fra bruger.
    TimeOpg10komma1(int hour, int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Del 5. Gettere, der giver værdierne for henholdsvis timer, minuter, sekunder.
    public int getHour() {
        return (int)(klokken / (1000 * 60 * 60)) % 24 +2; // Lægger 2 til for at få dansk tid.
    }

    public int getMinute() {
        return (int)(klokken / (1000 * 60)) % 60;
    }

    public int getSecond() {
        return (int)(klokken / 1000) % 60; // Først div. der med 1000 for at komme til sekunder, derefter bruges *rest*(%), til at sekunder tilovers, efter minutter.
    }

    //Del 6. En setter der tillader bruger at "set" tiden.
    public void setTime(long elapsedTime){
        this.klokken = elapsedTime;
    }

}
