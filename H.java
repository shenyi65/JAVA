//import java.util.*;
//public class H
//{ //书：P50   视频：08
//    public static void main(String[] args)
//    { 
//          byte bb = (byte)345;
//          System.out.println("~~~~~" + bb);
//
//		   byte b2 = (byte)385;
//          System.out.println("~~~~~" + b2);
//
//		   byte b3 = (byte)190;/* 190 二进制补码为   10111110    其符号位是1 因此为负数（0则为整数）
//		                          再取其反码为  -01000001    
//								  再取其源码加1   最终为 -65 + 1 = -66*/
//          System.out.println("~~~~~" + b3);
//
//		   byte b4 = (byte)656;/* 656 二进制为   10 10010000    此数已经溢出，则用656-512=144
//		                          144 二进制为   10010000    其符号位是1 因此为负数（0则为整数）
//		                          再取其反数为  -01101111    
//								  再取其补数加1   最终为 -111 + 1 = -112*/
//          System.out.println("~~~~~" + b4);
//
//           int b5 = 0x6f ;
//          System.out.println(b5);
//
//		   double b6 = 0.2e4;
//		  System.out.println(b6);
//
//		   int t = -3;
//		   byte b7 = (byte) t;
//		  System.out.println (b7);
//
//    	   int a = 14%13;
//		  System.out.println(a);

		  
//		  System.out.println (-302>>2);
// 		  System.out.println (19>>3);

//		 char fs = 'a';
//		 switch ( fs )
//		 {
//		 case 'a':
//			 System.out.println ("好");
//			break; 
//		 case 'b':
//			 System.out.println ("一般");
//			 break;
//		 default :
//			 System.out.println ("一般般");
//		     break;
//		 
//		 }

		 //P73

//			 int age = 30;
//			 if (age > 20)
//			 {
//				 System.out.println ("年龄大于20");
//				 System.out.println ("20岁以上");
//			 }

//			 int a = 5;
//			 if (a>4)
//			     System.out.println("a大于4");
//			 else
//				 System.out.println("a不大于4");

			 //P75
//			 int age = 22 ;
//			 if (age > 60)
//			 {    
//				 System.out.println(age);
//				 System.out.println("老人");
//			 }
//			 if (age > 40 && !(age > 60))   //40---60
//			 {    
//				 System.out.println(age);
//				 System.out.println("中年人 40---60");
//			 }
//			 if (age > 20 && !(age > 60) && !(age > 40 && !(age > 60)))  // 20--40
//			 {    
//				 System.out.println(age);
//				 System.out.println("年轻人 20--40");
//			 }


//int count = 0 ;
//while (count < 10)
//{	System.out.println(count);
//    count++;
//}
//System.out.println("循环结束");
//
//
//int count1 = 1;
//do
//{
//	System.out.println (count1);
//	count1 ++;
//}
//while (count1 < 10);
//    System.out.println("循环结束");

//for (int b =0, s =1, p = 0 ,l = 0;
//     b< 10 && s < 5 && p < 10; p++)
//{	
//	  System.out.println(++b);
//	  System.out.println(++s + p);
//	  
//}

//int b = 0 ;
//while (b<10)
//{
//	System.out.println ("b的值是" +b++ );
//}


//int i = 0;
//while (++i < 10)
//{
//	System.out.println("进入外层循环");
//	for (int j = 0;j < 10 ; j++ )
//	{
//		System.out.println("i的值为：" +i
//			+ ",j的值为："+ j);
//	}
//		 System.out.println("外层循环的最后一行");
//
//}

//int count = 1;
//do
//{
//	System.out.println(count);
//	count ++;
//}
//
//while (
//	count < 10 
//	
//);
//System.out.println ("循环结束");

//int count = 0;
//for (;count < 10 ; )
//{
//	System.out.println(count);
//	count++;
//}
//System.out.println("循环结束");	


//outer:
//	for (int i = 0;i < 5 ;i++ )
//	{  
//	  for (int j = 0; j < 3 ; j++ )
//	  {
//	  
//		System.out.println ("i的值为：" + i + 
//			"j的值为："+j);
//		  
//		if (j == 2)
//			{return;}
////		{
////			continue outer;
////		}
//	}}


//String[] books = {"ABC","def","ghI"};
//for (String book : books )
//{
//	System.out.println(book);
//}


//for (int i=1;i<=9;i++) {
//	for (int j=1;j<=i;j++){
//		System.out.print(i+"*"+j+"="+(i*j)+"\t");
//}
//	System.out.print("\n");
//}


//	int i, j;
//		for (i = 1; i <= 4; i++) {
//			for (j = 1; j <= 4 - i; j++)
//				System.out.print(" ");
//			for (j = 1; j <= 2 * i - 1; j++)
//				System.out.print("*");
//			System.out.println();
//		}


//	int i = 2;
//	int j = 3;
//	int k = 1;
//	int max =(i>j) ? i:j;
//	int max1 = (max > k) ? max : k;
//	System.out.println(max1);


//while (true){
//
//System.out.println("输入一个月份");
//Scanner o = new Scanner (System.in);
//int s = o.nextInt();
//System.out.println("输入的月份是"+s);
//
//switch (s)
//
//{
//	case 3:
//	case 4:
//	case 5:
//	System.out.println("春天");
//	break;
//	case 6:
//	case 7:
//	case 8:
//	System.out.println("夏天");
//	break;
//	case 9:
//	case 10:
//	case 11:
//	System.out.println("秋天");
//	break;
//	case 12:
//	case 1:
//	case 2:
//	System.out.println("冬天");
//	break;
//	default:
//		System.out.println("没有这个月份");
//	break;
//}
//
//}


//for (int i = 0;i < 4 ;i++ ){
//	for (int j = 0;j < 2 ;j++ )	{
//	System.out.println("fffff");
//	continue;
//	} 
//
//
//
//}
//
//
//
//
//
//
//
//
//}
//
//}


//

//import java.util.Random;
//import java.util.Arrays;
//
//public class H {
//
// // 红球 1-33取出6个
// // 兰球1-16 取一个
// // 随机生成一组双色球号码：
// // String[] redpool ={"01","02","03"};
// public static void main(String[] args) {
//  int[] redpool = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
//    16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 16, 27, 28, 29, 30, 31,
//    32, 33 };
//  int[] bluepool = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
//    16 };
//  getball(redpool, bluepool);
// }
//
// public static void getball(int[] red, int[] blue) {
//  Random x = new Random();
//  int[] strred = new int[6];//存储红色
//  int strblue = 0;//存储蓝色
//  int index = 0;//游标
//  for (int i = 0; i < 6; i++) {
//   index = x.nextInt(33);//////这里的一点让我话费了40多分钟
//   strred[i] = red[index];///////
//   for (int j = 0; j < i; j++) {
//    if (strred[j] == red[index]) {
//     System.out.println("double:" + red[index] + " delete");
//     i--;
//     break;
//    }
//   }
//  }
//  int index2 = x.nextInt(16);
//  strblue = blue[index2];
//  System.out.print("红色球为" + Arrays.toString(strred));
//  System.out.println("兰色球为" + strblue);
// }
//
//}

