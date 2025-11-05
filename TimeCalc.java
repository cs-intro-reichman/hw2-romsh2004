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
        hours = hours + (minutes / 60);
        minutes = minutes % 60;
        hours = hours % 24;
        if (minutes < 10)
        {
            if (hours < 10)
            {
                System.out.println("0" + hours + ":0" + minutes);
            }
            else
            {
                System.out.println(hours + ":0" + minutes);
            }
        }
        else if (hours < 10)
        {
            System.out.println("0" + hours + ":" + minutes);
        }
        else
        {
            System.out.println(hours + ":" + minutes);
        }


	}
}
