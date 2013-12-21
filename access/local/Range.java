package access.local;

public class Range
{
  public static int[] Range(int n)
  {
    int[] result=new int[n];
    for(int i=0; i<n; i++)
    {
      result[i]=i;
    }
    return result;
  }

  public static int[] Range(int start, int end)
  {
    int length=end-start;
    int[] result=new int[length];
    for(int i=0; i<length; i++)
    {
      result[i]=i;
    }
    return result;
  }

  public static int[] Range(int start, int end, int step)
  {
    int length=(end-start)/step;
    int[] result=new int[length];
    for(int i=0; i<length; i++)
    {
      result[i]=start+i*step;
    }
    return result;
  }
}
