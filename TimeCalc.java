public class TimeCalc {
    public static void main(String[] args) 
    {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
		hourstoadd = (minutesToAdd / 60);
        minutestoadd = (minutesToAdd % 60);
        hours = hours + hourstoadd;
        minutes = minutes + minutestoadd;
        System.out.println(hours + ":" + minutes);

        
	}
}