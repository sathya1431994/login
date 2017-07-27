package order;
public class Order
{
    String gname,gprice;
   //getter & setter methods
    public String getGname()
    {
        return gname;
    }
    public void setGname(String gname)
    {
        this.gname=gname;
    }
    public String getGprice()
    {
        return gprice;
    }
    public void setGprice(String gprice)
    {
        this.gprice=gprice;
    }
    public String toString()
    {
        return gname+" "+gprice;
    }
}