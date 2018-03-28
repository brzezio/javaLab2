
class Lab2
{
	public static void main(String[] args)
	{
		int start,end;
		StringBuilder sb=new StringBuilder();
		try
		{
			start=Integer.parseInt(args[1]);
			end=Integer.parseInt(args[2]);
			if(start<0 || end<0) throw new Exception("Podano ujemną liczbę!");
			if(end<start) throw new Exception("Pierwsza wartość jest większa od drugiej!");
			for(int i=start;i<end+1;i++)
			{
				sb.append(args[0].charAt(i));
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			System.exit(1);
		}
		System.out.println(sb.toString());
	}
}
