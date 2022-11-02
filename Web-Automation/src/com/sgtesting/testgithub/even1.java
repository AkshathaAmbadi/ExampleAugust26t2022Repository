package com.sgtesting.testgithub;
class MyThread1 implements Runnable
{
	public void run()
	{
		DisplayEvenNumber();
	}
	void 	DisplayEvenNumber()
	{
		try
		{
			for(int i=0;i<=40;i++)
			{
				if(i%2==0)
				{
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+"Even Numbers"+i);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class even1 {

	public static void main(String[] args) {
		MyThread1 job=new MyThread1();
		
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);
		
		t1.setName("alpha");
		t2.setName("omega");
		t1.start();
		t2.start();
 	}
}
