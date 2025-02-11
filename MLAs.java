// Gurveer Singh 3187474
import java.util.ArrayList;
public class MLAs
{
    public static void main(String args[])
    {
        // Politician pol= new Politician("Dianna", "Riggs", "Spence", "NDP");
        // CabinetMinister cm=new CabinetMinister("Soloman", "Kanu", "Osborn", "Tory", "Health");
        // Premier prem= new Premier("Winston", "Churchill", "Riverview", "Whig", 45.3);

        Politician pol= new Politician("Dianna", "Riggs", "Spence",  Party.valueOf("NDP"));
                //Politician pol= new Politician("Dianna", "Riggs", "Spence", "NDP");

        CabinetMinister cm=new CabinetMinister("Soloman", "Kanu", "Osborn", Party.valueOf("TORY"), "Health");
        Premier prem= new Premier("Winston", "Churchill", "Riverview", Party.valueOf("WHIG"), 45.3);

        ArrayList <Politician> Politicians = new ArrayList <>();

        Politicians.add(pol);
        Politicians.add(cm);
        Politicians.add(prem);

        System.out.println("Politicians");

        for(Politician p:Politicians)
        {
            System.out.println(p.getName());
        }

        System.out.println("\nPositions");
        for(Politician p : Politicians)
        {
            String position="Backbencher";
            if (p instanceof CabinetMinister) position="Minister";
            if (p instanceof Premier) position="Premier";
            System.out.println(p + " " + position);
        }

        System.out.println("\nend of program");
    }
}