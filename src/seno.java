
public class seno (double x;) 
{
	int i;
	double s = 0;
	int signo = 1; 
	for (i=1; i<10; i+=2)
	{
		s += signo*pow(x,i) / factorial.class(i);
		signo *= -1;
	} 
	return s;
}


public static double pow(double x, int n)
{ 
	int i;
	double pow =1; 
	if(x==0) 
		return 0; 
	for(i=1; i<=n; i++)
		pow = pow*x; 
	return pow;
	}
}