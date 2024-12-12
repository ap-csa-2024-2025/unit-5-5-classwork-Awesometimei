public class Oven(int max, int start)
{
    private final int maxTemp = max;
    private int currentTemp;

    public void setTemp(int max2, int start2)
    {
        if (max2 < start2)
        {
            currentTemp = max2;
        }
        else if (start2 < 0)
        {
            currentTemp = 0;
        }
        else
        {
            currentTemp = start2;
        }
    }

    setTemp(max, start);

    public int getCurrentTemp();
    {
        return currentTemp;
    }

    public void turnOff()
    {
        System.out.println("Oven is now off");
        currentTemp = 0;
    }

    public boolean isOn()
    {
        if(currentTemp > 0)
        {
            return true;
        }
        else
        (
            return false;
        )
    }

    public void preheat(int temp)
    {
        setTemp(max, temp);
    }

    public String toString()
    {
        String str = "New oven with a max temp of " + maxTemp + " and a starting temperature of " + currentTemp + ".";
        return str;
    }
}
