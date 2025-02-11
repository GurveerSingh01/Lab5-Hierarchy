// Gurveer Singh 3187474
public class  Politician
{
    protected String firstName;
    protected String lastName;
    protected String riding;
    //protected String party;
    protected Party party;
    Politician()
    {
        firstName="unknown";
        lastName="unknown";
        riding="unknown";
        //party="unknown";
    }

    //Politician(String fn,String ln,String r,String p)
    Politician(String fn,String ln,String r,Party p)   //p should be string to simpify driver code
    {
        firstName=fn;
        lastName=ln;
        riding=r;
        party=p;      //here convert string p to enum Party so that we can enter a string in driver code
                     // and simplify driver 
                     // instead of  Politician pol= new Politician("Dianna", "Riggs", "Spence",  Party.valueOf("NDP"));
                     //we need   Politician pol= new Politician("Dianna", "Riggs", "Spence", "NDP");
                     //
                     //* so do party = Party.valueOf(p.toUpperCase) instead


    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getRiding()
    {
        return riding;
    }

    public Party getParty()
    {
        return party;
    }

    public void setFirstName(String fn)
    {
        firstName=fn;
    }

    public void setLastName(String ln)
    {
        lastName=ln;
    }

    public void setRiding(String r)
    {
        riding=r;
    }

    public void setParty(Party p)
    {
        party=p;
    }

    @Override
    public String toString()
    {
        return lastName + ": " + party + ", "+ riding;
    }

    public String getName()
    {
        //return firstName.charAt(0)+ ". " + lastName + ": " + party;
        return firstName.charAt(0)+ ". " + lastName + ": " + party;
    }
}