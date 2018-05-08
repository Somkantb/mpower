package com.practice;

public class HourGlassSum {
	int sum1,sum1a,sum1b,sum1c,sum2,sum2a,sum2b,sum2c,sum3,sum3a,sum3b,sum3c,sum4,sum4a,sum4b,sum4c,sum5,sum5a,sum5b,sum5c,sum6,sum6a,sum6b,sum6c,sum7,sum7a,sum7b,sum7c,sum8,sum8a,sum8b,sum8c;
	int sum9,sum9a,sum9b,sum9c,sum10,sum10a,sum10b,sum10c,sum11,sum11a,sum11b,sum11c,sum12,sum12a,sum12b,sum12c,sum13,sum13a,sum13b,sum13c;
	int sum14,sum14a,sum14b,sum14c,sum15,sum15a,sum15b,sum15c,sum16,sum16a,sum16b,sum16c;
	int[][] SampleArray = new int[][] {
		{1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,2,4,4,0},
        {0,0,0,2,0,0,},
        {0,0,1,2,4,0}};
	int max;
	public void sumhg1()
	{		
		
		for(int i=0; i<=0;i++ )
		{
				
			for (int j =0; j<=2; j++)
			{
				sum1a = sum1a + SampleArray[i][j];
				
			}
			
		}
		for(int i=1; i<=1;i++)
		{
			for(int j =1;j<=1; j++)
			{
				sum1b= sum1b+SampleArray[i][j];
			}
			
		}
		
		for(int i=2; i<=2;i++)
		{
			for (int j=0; j<=2;j++)
			{
				sum1c=sum1c+SampleArray[i][j];
			}
			
		}	
	 sum1= sum1a+sum1b+sum1c;
	 
	 for(int i=0; i<=0;i++ )
		{
				
			for (int j =1; j<=3; j++)
			{
				sum2a = sum2a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=1; i<=1;i++ )
		{
				
			for (int j =2; j<=2; j++)
			{
				sum2b = sum2b + SampleArray[i][j];
				
			}
		}
	 for(int i=2; i<=2;i++ )
		{
				
			for (int j =1; j<=3; j++)
			{
				sum2c = sum2c + SampleArray[i][j];
				
			}
		}
	 sum2= sum2a+sum2b+sum2c;
	///// 
	 for(int i=0; i<=0;i++ )
		{
				
			for (int j =2; j<=4; j++)
			{
				sum3a = sum3a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=1; i<=1;i++ )
		{
				
			for (int j =3; j<=3; j++)
			{
				sum3b = sum3b + SampleArray[i][j];
				
			}
		}
	 for(int i=2; i<=2;i++ )
		{
				
			for (int j =2; j<=4; j++)
			{
				sum3c = sum3c + SampleArray[i][j];
				
			}
		}
	 sum3= sum3a+sum3b+sum3c;
	////
	 
	 for(int i=0; i<=0;i++ )
		{
				
			for (int j =3; j<=5; j++)
			{
				sum4a = sum4a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=1; i<=1;i++ )
		{
				
			for (int j =4; j<=4; j++)
			{
				sum4b = sum4b + SampleArray[i][j];
				
			}
		}
	 for(int i=2; i<=2;i++ )
		{
				
			for (int j =3; j<=5; j++)
			{
				sum4c = sum4c + SampleArray[i][j];
				
			}
		}
	 sum4= sum4a+sum4b+sum4c;
	 
	 ////
	 
	 for(int i=1; i<=1;i++ )
		{
				
			for (int j =0; j<=2; j++)
			{
				sum5a = sum5a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=2; i<=2;i++ )
		{
				
			for (int j =2; j<=2; j++)
			{
				sum5b = sum5b + SampleArray[i][j];
				
			}
		}
	 for(int i=3; i<=3;i++ )
		{
				
			for (int j =0; j<=2; j++)
			{
				sum5c = sum5c + SampleArray[i][j];
				
			}
		}
	 sum5= sum5a+sum5b+sum5c;
	 ////////
	 
	 for(int i=1; i<=1;i++ )
		{
				
			for (int j =1; j<=3; j++)
			{
				sum6a = sum6a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=2; i<=2;i++ )
		{
				
			for (int j =2; j<=2; j++)
			{
				sum6b = sum6b + SampleArray[i][j];
				
			}
		}
	 for(int i=3; i<=3;i++ )
		{
				
			for (int j =1; j<=3; j++)
			{
				sum6c = sum6c + SampleArray[i][j];
				
			}
		}
	 sum6= sum6a+sum6b+sum6c;
	 //////
	 
	 for(int i=1; i<=1;i++ )
		{
				
			for (int j =2; j<=4; j++)
			{
				sum7a = sum7a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=2; i<=2;i++ )
		{
				
			for (int j =3; j<=3; j++)
			{
				sum7b = sum7b + SampleArray[i][j];
				
			}
		}
	 for(int i=3; i<=3;i++ )
		{
				
			for (int j =2; j<=4; j++)
			{
				sum7c = sum7c + SampleArray[i][j];
				
			}
		}
        sum7= sum7a+sum7b+sum7c;
	/////
        
        for(int i=1; i<=1;i++ )
		{
				
			for (int j =3; j<=5; j++)
			{
				sum8a = sum8a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=2; i<=2;i++ )
		{
				
			for (int j =4; j<=4; j++)
			{
				sum8b = sum8b + SampleArray[i][j];
				
			}
		}
	 for(int i=3; i<=3;i++ )
		{
				
			for (int j =3; j<=5; j++)
			{
				sum8c = sum8c + SampleArray[i][j];
				
			}
		}
	 sum8= sum8a+sum8b+sum8c;
	 /////
	 
	 for(int i=2; i<=2;i++ )
		{
				
			for (int j =0; j<=2; j++)
			{
				sum9a = sum9a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=3; i<=3;i++ )
		{
				
			for (int j =1; j<=1; j++)
			{
				sum9b = sum9b + SampleArray[i][j];
				
			}
		}
	 for(int i=4; i<=4;i++ )
		{
				
			for (int j =0; j<=2; j++)
			{
				sum9c = sum9c + SampleArray[i][j];
				
			}
		}
	 sum9= sum9a+sum9b+sum9c;
	 ////////
	 
	 for(int i=2; i<=2;i++ )
		{
				
			for (int j =1; j<=3; j++)
			{
				sum10a = sum10a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=3; i<=3;i++ )
		{
				
			for (int j =2; j<=2; j++)
			{
				sum10b = sum10b + SampleArray[i][j];
				
			}
		}
	 for(int i=4; i<=4;i++ )
		{
				
			for (int j =1; j<=3; j++)
			{
				sum10c = sum10c + SampleArray[i][j];
				
			}
		}
	 sum10= sum10a+sum10b+sum10c;
	 //////
	 
	 for(int i=2; i<=2;i++ )
		{
				
			for (int j =2; j<=4; j++)
			{
				sum11a = sum11a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=3; i<=3;i++ )
		{
				
			for (int j =3; j<=3; j++)
			{
				sum11b = sum11b + SampleArray[i][j];
				
			}
		}
	 for(int i=4; i<=4;i++ )
		{
				
			for (int j =2; j<=4; j++)
			{
				sum11c = sum11c + SampleArray[i][j];
				
			}
		}
     sum11= sum11a+sum11b+sum11c;
	/////
     
     for(int i=2; i<=2;i++ )
		{
				
			for (int j =3; j<=5; j++)
			{
				sum12a = sum12a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=3; i<=3;i++ )
		{
				
			for (int j =4; j<=4; j++)
			{
				sum12b = sum12b + SampleArray[i][j];
				
			}
		}
	 for(int i=4; i<=4;i++ )
		{
				
			for (int j =3; j<=5; j++)
			{
				sum12c = sum12c + SampleArray[i][j];
				
			}
		}
	 sum12= sum12a+sum12b+sum12c;
	 /////

	 
	 for(int i=3; i<=3;i++ )
		{
				
			for (int j =0; j<=2; j++)
			{
				sum13a = sum13a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=4; i<=4;i++ )
		{
				
			for (int j =1; j<=1; j++)
			{
				sum13b = sum13b + SampleArray[i][j];
				
			}
		}
	 for(int i=5; i<=5;i++ )
		{
				
			for (int j =0; j<=2; j++)
			{
				sum13c = sum13c + SampleArray[i][j];
				
			}
		}
	 sum13= sum13a+sum13b+sum13c;
	 ////////
	 
	 for(int i=3; i<=3;i++ )
		{
				
			for (int j =1; j<=3; j++)
			{
				sum14a = sum14a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=4; i<=4;i++ )
		{
				
			for (int j =2; j<=2; j++)
			{
				sum14b = sum14b + SampleArray[i][j];
				
			}
		}
	 for(int i=5; i<=5;i++ )
		{
				
			for (int j =1; j<=3; j++)
			{
				sum14c = sum14c + SampleArray[i][j];
				
			}
		}
	 sum14= sum14a+sum14b+sum14c;
	 //////
	 
	 for(int i=3; i<=3;i++ )
		{
				
			for (int j =2; j<=4; j++)
			{
				sum15a = sum15a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=4; i<=4;i++ )
		{
				
			for (int j =3; j<=3; j++)
			{
				sum15b = sum15b + SampleArray[i][j];
				
			}
		}
	 for(int i=5; i<=5;i++ )
		{
				
			for (int j =2; j<=4; j++)
			{
				sum15c = sum15c + SampleArray[i][j];
				
			}
		}
  sum15= sum15a+sum15b+sum15c;
	/////
  
  for(int i=3; i<=3;i++ )
		{
				
			for (int j =3; j<=5; j++)
			{
				sum16a = sum16a + SampleArray[i][j];
				
			}
		}
	 
	 for(int i=4; i<=4;i++ )
		{
				
			for (int j =4; j<=4; j++)
			{
				sum16b = sum16b + SampleArray[i][j];
				
			}
		}
	 for(int i=5; i<=5;i++ )
		{
				
			for (int j =3; j<=5; j++)
			{
				sum16c = sum16c + SampleArray[i][j];
				
			}
		}
	 sum16= sum16a+sum16b+sum16c;

	 
	 
	
        
        ////
			System.out.println("The sum of 1st hourglass is : "+sum1);
			System.out.println("The sum of 2nd hourglass is : "+sum2);
			System.out.println("The sum of 3rd hourglass is : "+sum3);
			System.out.println("The sum of 4th hourglass is : "+sum4);
			
			System.out.println("The sum of 5th hourglass is : "+sum5);
			System.out.println("The sum of 6th hourglass is : "+sum6);
			System.out.println("The sum of 7th hourglass is : "+sum7);
			System.out.println("The sum of 8th hourglass is : "+sum8);
			
			System.out.println("The sum 9th hourglass is : "+ sum9);
			System.out.println("The sum 10th hourglass is : "+sum10);
			System.out.println("The sum 11th hourglass is : "+sum11);
			System.out.println("The sum 12th hourglass is : "+sum12);
			
			System.out.println("The sum 13th hourglass is : "+ sum13);
			System.out.println("The sum 14th hourglass is : "+sum14);
			System.out.println("The sum 15th hourglass is : "+sum15);
			System.out.println("The sum 16th hourglass is : "+sum16);
	
			}
	public int maxv() {
		//Max(sum1,int sum2,int sum3,int sum4,int sum5,int sum6,int sum7,int sum8,int sum9,int sum10,int sum11,int sum12,int sum13,int sum14,int sum15,intsum16);
	int[] maxA = new int []{sum1,sum2,sum3,sum4,sum5,sum6,sum7,sum8,sum9,sum10,sum11,sum12,sum13,sum14,sum15,sum16};
	
	for (int i=0; i<=maxA.length-1;i++)
	{
	if (maxA[i]>max)
	{
	  max=maxA[i];
	 
	}
	}
	 return max;
	}
	
		

	
		

	
	
	public static void main(String[] args)
	{
	HourGlassSum hr = new HourGlassSum();
	hr.sumhg1();
	System.out.println();
	System.out.println();
	System.out.println("The max hourglass value is : "+hr.maxv() );
		
	}


}
