public class TimeCalc {
    public static void main(String[] args) 
    {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
		int hourstoadd = (minutesToAdd / 60);
        int minutestoadd = (minutesToAdd % 60);
        hours = hours + hourstoadd;
        minutes = minutes + minutestoadd;
        if (minutes >= 60) {
            hours = hours + (minutes / 60);
            minutes = minutes % 60;
        }
        if (hours >= 24) {
            hours = hours % 24;
        }
        System.out.println(hours + ":" + minutes);

	}
}
