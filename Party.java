//Gurveer Singh 3187474
public enum Party
{
    WHIG("Whig"),

    TORY("Tory"),

    NDP("NDP");
    private String friendlyName;

    private Party(String friendlyName)
    {
        this.friendlyName = friendlyName;
    }

    public String getFriendlyName()
    {
        return friendlyName;
    }

    @Override
    public String toString()
    {
        return friendlyName;
    }
}
