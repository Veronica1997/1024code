//书写一个类抛出IllegalAccessException异常
import java.util.Scanner;
public class j129 {
    static void inputException() throws IllegalAccessException //声明异常IllegalAccessException
    {
        int a[]=new int[3]; //r定义包含3个元素的数组
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入3个整型数据:");
        int i,sum=0,average;
        for(i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i]; //获取3个元素的值，并计算总和
        }
        System.out.println("请输入除数"); //输入除数，并用总和除以除数
        average=sc.nextInt();
        average=sum/average;
        System.out.println("average="+average);
        throw new IllegalAccessException(); //抛出异IllegalAccessException

    }
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        try //语句组“监督”异常
        {
            inputException();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("数组越界"+e); //捕获越界异常IllegalAccessException
        }
        catch(ArithmeticException e)
        {
            System.out.println("除数不能为0"+e); //捕获数学运算异常ArithmeticException
        }
        catch(IllegalAccessException e)
        {
            System.out.println("非法存取"+e); //捕获异常Arithmetiception
        }
        finally //finally语句组，输出提示信息
        {
            System.out.println("最后一定会被执行的语句");
        }

    }

}
