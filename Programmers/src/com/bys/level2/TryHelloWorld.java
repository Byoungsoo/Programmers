package com.bys.level2;

class TryHelloWorld
{
	
	public int nextBigNumber(int n)
    {
        int answer = 0;
        boolean flag = true;
        
        String BinaryNum = Integer.toBinaryString(n);
        int oneCount = 0;

        for (int i = BinaryNum.length()-1; i >= 0; i--) {
        	if("1".equals(BinaryNum.substring(i, i+1))) {
        		oneCount += 1;
        	}
		}
        while(flag) {
        	String tempBinaryNum = "";
            int tempCount = 0; 
            
        	n += 1;
        	tempBinaryNum = Integer.toBinaryString(n);
        	
        	for (int i = tempBinaryNum.length()-1; i >= 0; i--) {
            	if("1".equals(tempBinaryNum.substring(i, i+1))) {
            		tempCount += 1;
            	}
    		}
        	if(tempCount == oneCount) {
        		flag = false;
        		answer = n;
        	}
        }
        
        return answer;
    }
	
	
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int n = 78;
        System.out.println("result: " + test.nextBigNumber(n));
        
       
        
    }
}