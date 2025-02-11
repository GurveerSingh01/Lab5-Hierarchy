// Gurveer Singh 3187474
public class  CabinetMinister extends Politician
{
    private String cabinetPost;
    CabinetMinister()
    {
        cabinetPost="unknown";
    }

    //Politician(String fn,String ln,String r,String p,String post)

    CabinetMinister(String fn,String ln,String r,Party p,String post)
    {
        super(fn,ln,r,p);
        cabinetPost = post;
    }

    public String getCabinetPost()
    {
        return cabinetPost;
    }

    public void setCabinetPost(String post)
    {
        cabinetPost = post;
    }

    public String getName()
    {
        return lastName + ": " + party + ": " + cabinetPost;
    }
}