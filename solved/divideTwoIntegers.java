package solved;
public class divideTwoIntegers {
    public int divide(int dividend, int divisor)
	{   
        int w = (dividend < 0)?-1:1;
        int z = (divisor < 0) ? -1 : 1;

		int sign = ((dividend < 0) ^(divisor < 0)) ? -1 : 1;
        int quotient = 0;
		if(sign==1){
            while (Math.abs(dividend) >= Math.abs(divisor)){
			    dividend -= divisor;
			    ++quotient;
		    }
        }
        if(sign==-1){
            while (Math.abs(dividend) >= Math.abs(divisor))
		    {
			    dividend += divisor;
			    ++quotient;
		    }
        }
	    if(quotient==0&&dividend!=0){
            return 2147483647;
        }
		return sign * quotient;
	}
}

