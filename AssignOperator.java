public class AssignOperator {
	public static void main(String[] args) {
		
		int n1 = 10;
		n1 += 4;
		System.out.println(n1);
		n1 /= 3;
		System.out.println(n1);
		
		//复合赋值运算符会进行类型转换
		byte b = 3;
		b += 2; // 等价于  b = (byte)(b + 2);
		b++; //  等价于  b = (byte)(b + 1);
		
	}
}