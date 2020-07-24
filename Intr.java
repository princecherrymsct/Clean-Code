class Interest
{  
    
    private int a,b;
    private double c;
    public void setPrinciple(int a )
    {
        this.a=a ;
    }
    public void setRate(double c)
    {
        this.c=c;
    }
    public void setTime(int b)
    {
        this.b=b;
    }
    public int getPrinciple()
    {
        return this.a;
    }
    public double getRate()
    {
        return this.c;
    }
    public int getTime()
    {
        return this.b;
    }
    public double simpleIntrest()
    {
        return ((this.a)*(this.c)*(this.b))/100;
    }
    public double compoundInterest()
    {
        return this.a*(Math.pow((1+this.c),this.b)-1);
    }
}