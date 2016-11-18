//public class test {
//public static void main(String[] args) {
//int gong,mu,n=0;
//for(gong=1;gong<=20;gong++){
//for(mu=1;mu<=33;mu++){
//if(gong*5+mu*3+(100-gong-mu)/3.0==100){
//n++;
//System.out.println("第"+n+"种买法：公鸡： "+gong+"只，母鸡： "+mu+"只,小鸡： "+(100-gong-mu)+"只");
//}
//}
//}
//System.out.println("共有"+n+"种买法");
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
//System.out.println ("较大数为："+maxd);
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
//System.out.println("最大值："+ max);
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
//System.out.println("1！+2！+3！+……+10！= "+sum);
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
//  return;//可以省略
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
// 定义一个功能，用于打印矩形。
// 思路：
// 1，确定结果：没有，因为直接打印。所以返回值类型是void
// 2，有未知内容吗？有，两个，因为矩形的行和列不确定。
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
//		System.out.println ("较大的数是：" +  max );
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

需求： 使用java描述一个车与修车厂两个事物， 车具备的公共属性:轮子数、 名字、 颜色 ，还
具备跑的功能行为。跑之前要检测轮子是否少于了4个，如果少于了4个，那么要送到修车厂修理，
修车厂修理之后，车的轮子数要补回来4个。 然后车就继续的跑起来。

修车厂： 具备公共属性： 名字、 地址、 电话。
		 公共的行为： 修车。

初学者的经典错误：
	1. 变量在同一个作用域(大括号)上是可以直接访问的。
	2. 如果一个类要访问另外一个类变量时，那么这时候就只能通过创建对象进行访问。（仅对于目前正确）
*/
//车类	  
//class Car{
//
//	String name;
//	String color;
//	int wheel;
//
//	public void run (){
//		if (wheel >= 4){
//			System.out.println(name+wheel+color+"个轮子跑起来了");
//		}else {
//			System.out.println(name+"不够4个轮子，需修理");
//		}
//	
//	}
//
//}
//
//
////修车厂
//
//class CarFactory{
//	String name;
//	String address;
//	String tel; 
//
//	public Car repair(Car c){
//		if (c.wheel>=4){
//			System.out.println ("修好了");
//		}else {
//			c.wheel = 4;
//			System.out.println ("已经4个轮子修好了");
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
//	c.name = "玛莎拉蒂";
//	c.color = "银白";
//	c.wheel = 4;
//	for (int i = 0; i < 100;i++ )
//	{c.run();
//	}
//	c.wheel = 3 ;
//	c.run ();
//
//	CarFactory f = new CarFactory();
//	f.name = "老夫子修车吧";
//	f.address = "修车广场";
//	f.tel = "233434343";
//	c = f.repair(c);
//	c.run();
//
//	}
//
//}
//	

/*
需求： 使用java类描述一个计算器类，计算器具备操作数1， 操作数2 、操作符三个公共 的属性
，还具备计算的功能行为。 

要求： 不能直接对操作数1，操作数2，运算符这些属性进行直接 的赋值，要封装起来。 (+ - * /  )

根据需求提供get或者set方法。

	需要提供set方法
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
//			System.out.println("做加法，结果是："+(num1+num2));
//			break;
//		case '-':
//			System.out.println("做减法，结果是："+(num1-num2));
//			break;
//        case '*':
//			System.out.println("做乘法，结果是："+(num1*num2));
//			break;
//        case '/':
//			System.out.println("做除法，结果是："+(num1/num2));
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
//		b.name = "狗娃";
//		b.cry();*/
//
//		baby b = new baby(123,"狗娃") ;
//		System.out.println("编号："+b.id+"姓名："+b.name);
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
//		System.out.println("baby的属性初始化完毕！");
//	
//	
//	}
//
//	public void cry(){
//		System.out.println (name+"哭");
//	}
//
//
//}

//class animal{
//	String name = "狗";
//	String color;
//	public void eat (){
//		String name = "老鼠";
//		System.out.println(name + "在吃.....");
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
//        int zero=0; // 统计0的个数
//        for(int i=0;i<oldArr.length;i++){
//            if(oldArr[i]==0){
//                zero++;
//            }
//        }
//        int newArr[]=new int[oldArr.length-zero]; // 定义新的数组 长度是 原来旧的数组的长度减去0的个数
//        int j=0; // 新数组的索引
//        for(int i=0;i<oldArr.length;i++){ // 遍历原来旧的数组
//            if(oldArr[i]!=0){ // 假如不等于0
//                newArr[j]=oldArr[i]; // 赋值给新的数组
//                j++;
//            }
//        }
//         
//        System.out.print("新数组：");
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
//	 String name = "调用thisname ";
//	public void print (String name){
//		System.out.println("类中的属性 name ="  + this.name);
//		System.out.println("局部传参的属性=" + name);
//	}
//
//	public static void main (String [] args)
//	{
//		test tt = new test();
//		tt.print ("主函数传进去的名");
//	} 
//	
//}


//class test{
//	public static void main (String [] args){
//		System.out.println ("数组的长度："+args.length);
//		System.out.print ("数组为:");
//		for (int i=0;i<args.length;i++ ){
//			
//			System.out.print (args[i]+",");
//		}
//		}
//}
//


///*需求： 描述一个图形、圆形、 矩形三个类。不管哪种图形都会具备计算面积
//与周长的行为，但是每种图形计算的方式不一致而已。*/
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
//	System.out.println ("交换后的数字"+ "a="+a+ "b="+b);
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
//		System.out.println (name+"好好学习");
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
//	System.out.println(name+"赚钱");
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
////				System.out.println("狗在跑...");
////			}
////		}
////	dog d = new dog ();
////	d.run();
////	}
////}
//
//new animal (){
//	public void run (){
//		System.out.println("狗已经在跑...");
//	}
//
//	public void run1 (){
//		System.out.println("在跑...");
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
	
	//String name = "外部类的name";

	//public void test(){
		//int y = 100;
		
		//class inner{
		
			//int x = 10;

			//public void print(){
			
				//System.out.println("局部内部类的print方法.."+y);
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


 
//// day 11   1.自定义异常类   模拟feiQ上线时候，如果无网络，那么就抛出一个没有插上网线的异常，
////如果网络正常，那么久正常显示好友列表



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
			//System.out.println("马上插上网线");
		//}
		
	//*/
	
	//}
	//public static void feiQ (String ip) throws NoIpException {
		//if (ip == null) {
			//throw new NoIpException	("没有插网线");


		//}
		//System.out.println("正常显示好友");
	//}
//}


//////day 11  2.自定义异常类  demo 3 
//////模拟吃饭，带钱少于10块，就抛出一个没有带够钱的异常对象，
//////如果带够了，那么就可以吃上香喷喷的饭
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
				//System.out.println("给我洗碗去");
			//}
				
	//}


	//public static void eat (int money) throws NoMoneyException {
			//if (money < 10 ){
					//throw new NoMoneyException("吃霸王餐");
			//}
			//System.out.println("吃饭去了！！");
	
	//}
	//}


//////day 11  4.finally块       Demo6 

//import java.io.*;
//class test{

	//public static void main (String [] args ) {

		//FileReader fileReader = null;
		//try{
			////找到目标文件
			//File file = new File ("c:\\HaxLogs1.txt");
			////建立程序与文件的数据通道
			//fileReader = new FileReader(file);
			////读取文件
			//char [] buf = new char [1024];
			//int length = 0;
			//length = fileReader.read(buf);
			//System.out.println("读取到的内容"+ new String (buf,0,length));
			////关闭资源
		//}
		//catch (IOException e) {
			//System.out.println("读取资源文件失败....");
					
		//} finally {
			//try
			//{
				//fileReader.close();
				//System.out.println("释放资源文件成功");
			//}
			//catch (IOException e){
				//System.out.println("释放资源文件失败");

			//}
			
		
		//}

	//}
//}


//class test{
			
			//public static void main (String [] args) {
			//System.out.println ("这是test的方法");
			//}



//}

public class test{  
    public static void main(String args[]){   
    //i是表示月份的，这里计算了36个月，也就是三年，兔子的数量  
      int i;  
      long arr[]=new long[36];   //这个数组时用来计算每月有兔子的对数  
      arr[0]=arr[1]=1;  
      System.out.println("第1个月有兔子1对"+", "+"总数是"+2);  
      System.out.println("第2个月有兔子1对"+", "+"总数是"+2);  
      for(i=2;i<=35;i++){  
         arr[i]=arr[i-1]+arr[i-2];  
         System.out.println("第"+i+"个月有兔子"+arr[i]+"对"+", "+"总数是"+2*arr[i]);  
             //规律是 每个数字都是前面两个数字之     和  
         }  
   }  
          
}   