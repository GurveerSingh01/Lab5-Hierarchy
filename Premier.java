// Gurveer Singh 3187474
public class  Premier extends Politician
{
    private double approvalRating;
    StringBuilder sb= new StringBuilder();
    Premier()
    {
        approvalRating=0.0;
    }

    //Politician(String fn,String ln,String r,String p,double rating)

    Premier(String fn,String ln,String r,Party p,double rating)
    {
        super(fn,ln,r,p);
        approvalRating=rating;
    }

    public double getApprovalRating()
    {
        return approvalRating;
    }

    public void getApprovalRating(double rating)
    {
        approvalRating = rating;
    }

    public String getName()
    {
        sb.delete(0,sb.length());
        sb=sb.append("Hn. ").append(firstName).append(" ").append(lastName).append(", ");
        sb.append(party).append(": Approval ").append(approvalRating).append("%");
        return sb.toString();
    }
}
