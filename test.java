//public class test {
//public static void main(String[] args) {
//int gong,mu,n=0;
//for(gong=1;gong<=20;gong++){
//for(mu=1;mu<=33;mu++){
//if(gong*5+mu*3+(100-gong-mu)/3.0==100){
//n++;
//System.out.println("��"+n+"���򷨣������� "+gong+"ֻ��ĸ���� "+mu+"ֻ,С���� "+(100-gong-mu)+"ֻ");
//}
//}
//}
//System.out.println("����"+n+"����");
//}
//}

//public class test {
//public static void main(String[] args) 
//public static void  draw(int width , int height){
//		for(int i = 0 ; i< height ; i++){
//			for(int j = 0 ; j < width ; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//
//
//
//}
//		printGrade(90);
//		printGrade(59.5);
//	}
//
//	public static void printGrade(double score) {
//		char grade;
//		if (score >= 90.0)
//			System.out.println("A");
//		else if (score >= 80.0)
//			System.out.println("B");
//		else if (score >= 70.0)
//			System.out.println("C");
//		else if (score >= 60.0)
//			System.out.println("D");
//		else
//			System.out.println("E");
//

//int maxd =  num (1,81111);
//System.out.println ("�ϴ���Ϊ��"+maxd);
//
//}
//
//
//public static int num (int a,int b){
//int max = 0;
//if (a > b){
//	max = a;}
//
//else 
//	{max = b;}
//return max;


//public class test {
//public static void main(String[] args) 
//	{
//int [] arr = {2,4,55,77};
//int max = getmax(arr);
//System.out.println("���ֵ��"+ max);
//	}
//
//   public static int getmax(int [] arr){
//int max = arr[0];
//for (int i = 1; i < arr.length ; i++ ){
//	if ( arr [i] > max ){
//		max = arr [i];
//	}
//}
//return max;
//}
//}


//public class test { 
//public static void main( String args[] ) {
//  int  i,j,mul,sum=0;
//
//      for(i=1;i<=1;i++) {
//        mul=1;
//          for(j=1;j<=i;j++) {
//              mul=mul*j;
//       }
//      sum=sum+mul;
//        }
//System.out.println("1��+2��+3��+����+10��= "+sum);
//}
//}


//class test {
//
//public static void main(String[] args)
// {
//  getResult(5);
// }
//
//
// public static void getResult(int num)
// {
//  System.out.println(num * 3 + 5);
//  return;//����ʡ��
// }
//
//}

//class  test
//{
// public static void main(String[] args) 
// {
//draw(2,6,2);
//  printHr();
// }
// /*
// ����һ�����ܣ����ڴ�ӡ���Ρ�
// ˼·��
// 1��ȷ�������û�У���Ϊֱ�Ӵ�ӡ�����Է���ֵ������void
// 2����δ֪�������У���������Ϊ���ε��к��в�ȷ����
// */
// public static void draw(int oo,int row,int col)
// {
//	 for (int z=0;z<oo ;z++ )
//	 {
//	 
//  for(int x=0; x<row; x++)
//  {
//   for(int y=0; y<col; y++)
//   {
//    System.out.print("*");
//   }
//   System.out.println();
//  }
// }}
// public static void printHr()
// {
//  System.out.println("------------------------------");
// }
// }


//public class test{
//	public static void main (String [] args)
//	{
//		int max = getmax (143,8);
//		System.out.println ("�ϴ�����ǣ�" +  max );
//	}
//
//		public static int getmax (int a,int b){
//		int max = 0;
//		if (a>b){
//			max =  a;
//	}else {
//			max = b; }
//		return max ;
//	} 
//
//}


//package test;
//
//import javax.swing.UIManager;
//import java.awt.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: </p>
 * @author unascribed
 * @version 1.0
 */

//public class test {
//  boolean packFrame = false;
//
//  //Construct the application
//  public welcome() {
//    Frame1 frame = new Frame1();
//    //Validate frames that have preset sizes
//    //Pack frames that have useful preferred size info, e.g. from their layout
//    if (packFrame) {
//      frame.pack();
//    }
//    else {
//      frame.validate();
//    }
//    //Center the window
//    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//    Dimension frameSize = frame.getSize();
//    if (frameSize.height > screenSize.height) {
//      frameSize.height = screenSize.height;
//    }
//    if (frameSize.width > screenSize.width) {
//      frameSize.width = screenSize.width;
//    }
//    frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
//    frame.setVisible(true);
//  }
//  //Main method
//  public static void main(String[] args) {
//    try {
//      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//    }
//    catch(Exception e) {
//      e.printStackTrace();
//    }
//    new welcome();
//  }
//}
 
	  

/*

���� ʹ��java����һ�������޳���������� ���߱��Ĺ�������:�������� ���֡� ��ɫ ����
�߱��ܵĹ�����Ϊ����֮ǰҪ��������Ƿ�������4�������������4������ôҪ�͵��޳�������
�޳�������֮�󣬳���������Ҫ������4���� Ȼ�󳵾ͼ�������������

�޳����� �߱��������ԣ� ���֡� ��ַ�� �绰��
		 ��������Ϊ�� �޳���

��ѧ�ߵľ������
	1. ������ͬһ��������(������)���ǿ���ֱ�ӷ��ʵġ�
	2. ���һ����Ҫ��������һ�������ʱ����ô��ʱ���ֻ��ͨ������������з��ʡ���������Ŀǰ��ȷ��
*/
//����	  
//class Car{
//
//	String name;
//	String color;
//	int wheel;
//
//	public void run (){
//		if (wheel >= 4){
//			System.out.println(name+wheel+color+"��������������");
//		}else {
//			System.out.println(name+"����4�����ӣ�������");
//		}
//	
//	}
//
//}
//
//
////�޳���
//
//class CarFactory{
//	String name;
//	String address;
//	String tel; 
//
//	public Car repair(Car c){
//		if (c.wheel>=4){
//			System.out.println ("�޺���");
//		}else {
//			c.wheel = 4;
//			System.out.println ("�Ѿ�4�������޺���");
//		}
//			return c;
//	}
//}
//
//
//
//class test
//{
//	public static void main (String [] args){
//	Car c = new Car ();
//	c.name = "��ɯ����";
//	c.color = "����";
//	c.wheel = 4;
//	for (int i = 0; i < 100;i++ )
//	{c.run();
//	}
//	c.wheel = 3 ;
//	c.run ();
//
//	CarFactory f = new CarFactory();
//	f.name = "�Ϸ����޳���";
//	f.address = "�޳��㳡";
//	f.tel = "233434343";
//	c = f.repair(c);
//	c.run();
//
//	}
//
//}
//	

/*
���� ʹ��java������һ���������࣬�������߱�������1�� ������2 ���������������� ������
�����߱�����Ĺ�����Ϊ�� 

Ҫ�� ����ֱ�ӶԲ�����1��������2���������Щ���Խ���ֱ�� �ĸ�ֵ��Ҫ��װ������ (+ - * /  )

���������ṩget����set������

	��Ҫ�ṩset����
*/
//class test
//{
//
//public static void main (String [] args){
//	calculator c = new calculator();
//
//	c.initcalculator(2,3,'*');
//	c.calculate();
//
//
//
//
//}}
//
//class calculator{
//	 private  int num1;
//	 private  int num2;
//	 private  char option;
//
//	public void initcalculator (int n1,int n2,char o){
//		num1 = n1;
//		num2 = n2;
//		if (o=='+'||o=='-'||o=='*'||o=='/'){
//				option = o;
//		}else {
//			option = '+';
//		}
//	
//	}
//	 
//	
//	public void calculate(){
//		
//		switch (option)		{
//		case '+':
//			System.out.println("���ӷ�������ǣ�"+(num1+num2));
//			break;
//		case '-':
//			System.out.println("������������ǣ�"+(num1-num2));
//			break;
//        case '*':
//			System.out.println("���˷�������ǣ�"+(num1*num2));
//			break;
//        case '/':
//			System.out.println("������������ǣ�"+(num1/num2));
//			break;
//		
//		}
//
//	
//	}		
//
//}

//
//class test{
//	public static void main (String [] args){
//		/*baby b = new baby();
//		b.id = 123;
//		b.name = "����";
//		b.cry();*/
//
//		baby b = new baby(123,"����") ;
//		System.out.println("��ţ�"+b.id+"������"+b.name);
//		
//	}
//}
//
//
//class baby{
//
//	int id;
//	String name;
//	
//	public  baby (int i,String n){
//		id = i;
//		name = n;
//		System.out.println("baby�����Գ�ʼ����ϣ�");
//	
//	
//	}
//
//	public void cry(){
//		System.out.println (name+"��");
//	}
//
//
//}

//class animal{
//	String name = "��";
//	String color;
//	public void eat (){
//		String name = "����";
//		System.out.println(name + "�ڳ�.....");
//	}
//}
//
//class test{
//	public static void main(String [] args){
//		animal a = new animal ();
//		a.eat();
//	}
//
//}

//

//public class test {
// 
//    public static void main(String[] args) {
//        int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
//        int zero=0; // ͳ��0�ĸ���
//        for(int i=0;i<oldArr.length;i++){
//            if(oldArr[i]==0){
//                zero++;
//            }
//        }
//        int newArr[]=new int[oldArr.length-zero]; // �����µ����� ������ ԭ���ɵ�����ĳ��ȼ�ȥ0�ĸ���
//        int j=0; // �����������
//        for(int i=0;i<oldArr.length;i++){ // ����ԭ���ɵ�����
//            if(oldArr[i]!=0){ // ���粻����0
//                newArr[j]=oldArr[i]; // ��ֵ���µ�����
//                j++;
//            }
//        }
//         
//        System.out.print("�����飺");
//        for(int n:newArr){
//            System.out.print(n+" ");
//        }
//    }
//}

//class test{
//	public static void main (String [] args){
//	int[] arr = {456,5714,684,7};
//	for (int q:arr ){
//		System.out.print(q + ",");}
//	}
//}

//class test{
//	 String name = "����thisname ";
//	public void print (String name){
//		System.out.println("���е����� name ="  + this.name);
//		System.out.println("�ֲ����ε�����=" + name);
//	}
//
//	public static void main (String [] args)
//	{
//		test tt = new test();
//		tt.print ("����������ȥ����");
//	} 
//	
//}


//class test{
//	public static void main (String [] args){
//		System.out.println ("����ĳ��ȣ�"+args.length);
//		System.out.print ("����Ϊ:");
//		for (int i=0;i<args.length;i++ ){
//			
//			System.out.print (args[i]+",");
//		}
//		}
//}
//


///*���� ����һ��ͼ�Ρ�Բ�Ρ� ���������ࡣ��������ͼ�ζ���߱��������
//���ܳ�����Ϊ������ÿ��ͼ�μ���ķ�ʽ��һ�¶��ѡ�*/
//
//
//abstract class test{
//
//
//}
//
//class tuxing{
//	String name;
//	public tuxing (String name){
//		this.name=name;
//	}
//
//
//	public abstract void getarea(){}
//
//
//	public abstract void zhouchang(){}
//}
//
//class yuanxing extends tuxing (name,r){
//	public static final double PI = 3.14;
//	double r ;
//    getarea(){
//	System 
//	}
//}

//class test{
//	public static void main (String [] args) {
//	int a= 3;
//	int b = 5;
//	ChangeNum (a,b);
//	System.out.println ("�����������"+ "a="+a+ "b="+b);
//	
//	}
//
//
//
//
//	public static void ChangeNum(int a,int b){
//	int temp = a;
//	a = b ;
//	b = temp;
//	}
//
//
//}

//import java.util.*;
//class person{
//	int x = 10;
//}
//
//class test{
//    public static void main (String [] args){
//	person p = new person();
//	changeobj(p,20);
//	System.out.println("x="+p.x);
//	
//	}
//
//	public static void changeobj (person p ,int x){
//	p.x = x;
//
//	}
//} 

//
//class student {
//	String name;
//	public student (String name) { 
//		this.name=name;
//		}
//	public void study () {
//		System.out.println (name+"�ú�ѧϰ");
//	}
//}
//
//
//interface MakeMoney{
//	public void makemoney();
//}
//
//class MoneyStudent extends student implements MakeMoney {
//	public MoneyStudent (String name){
//	super(name);
//	}
//
//	public void makemoney(){
//	System.out.println(name+"׬Ǯ");
//	}
//} 
//class test{
//	public static void main (String [] args){
//		student s = new student ("ABC");
//		s.study();
//		MoneyStudent m = new MoneyStudent ("123");
//		m.study();
//		m.makemoney();
//	}
//
//}

//abstract class animal {
//	public abstract void run();
//}
//
//class outer {
//	public void print(){
////		class dog extends animal{
////			public void run() {
////				System.out.println("������...");
////			}
////		}
////	dog d = new dog ();
////	d.run();
////	}
////}
//
//new animal (){
//	public void run (){
//		System.out.println("���Ѿ�����...");
//	}
//
//	public void run1 (){
//		System.out.println("����...");
//	}
//}.run1 ();
//
//}
//}
//
//class test {
//	public static void main (String [] args){
//
//	outer outer = new outer();
//	outer.print();
//	
//	}
//}



//class Outer {
	//public int num = 10 ;
	//class Inner {
		//public int num = 20;
		//public void show() {
			//int num = 30;
			//System.out.println(num);
			//System.out.println(this.num);
			//System.out.println(Outer.this.num);
		//}
	//}
	//}
//class test {
	//public static void main (String [] args){
		//Outer.Inner oi = new Outer().new Inner();
		//oi.show();
	//}
//}


//class outer{
	
	//String name = "�ⲿ���name";

	//public void test(){
		//int y = 100;
		
		//class inner{
		
			//int x = 10;

			//public void print(){
			
				//System.out.println("�ֲ��ڲ����print����.."+y);
			//}
		//}
	
		//inner inner = new inner();
		//inner.print();

	//}
//}

//class test {

	//public static void main (String [] args)
	//{
		//outer outer = new outer();
		//outer.test();
	
	//}

//}

//class test {

	//public static void main (String [] args){
	
		//Throwable  t = new Throwable ();
		//String info = t.toString();
		//String msg	= t.getMessage();
		//System.out.println ("toString:"+msg);
		

	//div(4,0);
	//}
		//public static void div (int a,int b){
			//int c = a/b;
			//System.out.println("c="+c);
		
		
		//}
//}


 
//// day 11   1.�Զ����쳣��   ģ��feiQ����ʱ����������磬��ô���׳�һ��û�в������ߵ��쳣��
////���������������ô��������ʾ�����б�



//class NoIpException extends Exception{

	//public NoIpException (String message){
		//super (message);
	
	//}

//}
//class test  {

	//public static void main (String [] args) throws NoIpException {
		//String ip= "192.168.1.1";
		////ip = null;
		////try		{
			//feiQ(ip);
		///*}
		//catch (NoIpException e)	{
			//e.printStackTrace();
			//System.out.println("���ϲ�������");
		//}
		
	//*/
	
	//}
	//public static void feiQ (String ip) throws NoIpException {
		//if (ip == null) {
			//throw new NoIpException	("û�в�����");


		//}
		//System.out.println("������ʾ����");
	//}
//}


//////day 11  2.�Զ����쳣��  demo 3 
//////ģ��Է�����Ǯ����10�飬���׳�һ��û�д���Ǯ���쳣����
//////��������ˣ���ô�Ϳ��Գ���������ķ�
//class NoMoneyException extends Exception {
	//public NoMoneyException (String message) {
		//super(message);
	
	//}
		
//}

//class test {

	//public static void main (String [] args){
			//try
			//{
				//eat(9);
			//}
			//catch (NoMoneyException e){
				//e.printStackTrace();
				//System.out.println("����ϴ��ȥ");
			//}
				
	//}


	//public static void eat (int money) throws NoMoneyException {
			//if (money < 10 ){
					//throw new NoMoneyException("�԰�����");
			//}
			//System.out.println("�Է�ȥ�ˣ���");
	
	//}
	//}


//////day 11  4.finally��       Demo6 

//import java.io.*;
//class test{

	//public static void main (String [] args ) {

		//FileReader fileReader = null;
		//try{
			////�ҵ�Ŀ���ļ�
			//File file = new File ("c:\\HaxLogs1.txt");
			////�����������ļ�������ͨ��
			//fileReader = new FileReader(file);
			////��ȡ�ļ�
			//char [] buf = new char [1024];
			//int length = 0;
			//length = fileReader.read(buf);
			//System.out.println("��ȡ��������"+ new String (buf,0,length));
			////�ر���Դ
		//}
		//catch (IOException e) {
			//System.out.println("��ȡ��Դ�ļ�ʧ��....");
					
		//} finally {
			//try
			//{
				//fileReader.close();
				//System.out.println("�ͷ���Դ�ļ��ɹ�");
			//}
			//catch (IOException e){
				//System.out.println("�ͷ���Դ�ļ�ʧ��");

			//}
			
		
		//}

	//}
//}


//class test{
			
			//public static void main (String [] args) {
			//System.out.println ("����test�ķ���");
			//}



//}

public class test{  
    public static void main(String args[]){   
    //i�Ǳ�ʾ�·ݵģ����������36���£�Ҳ�������꣬���ӵ�����  
      int i;  
      long arr[]=new long[36];   //�������ʱ��������ÿ�������ӵĶ���  
      arr[0]=arr[1]=1;  
      System.out.println("��1����������1��"+", "+"������"+2);  
      System.out.println("��2����������1��"+", "+"������"+2);  
      for(i=2;i<=35;i++){  
         arr[i]=arr[i-1]+arr[i-2];  
         System.out.println("��"+i+"����������"+arr[i]+"��"+", "+"������"+2*arr[i]);  
             //������ ÿ�����ֶ���ǰ����������֮     ��  
         }  
   }  
          
}   