package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		byte b = 10;
		short s = 100;
		int i = 1000;
		long l = 10000;
		float f = 9.5f;
		double d = 10.5;
		char ch = 'a';
		String str = "ハロー";
		boolean bool = true;
		
		
        //1-4
		System.out.println( b + s + i + l );
		System.out.println( Math.round(d + f) );
		System.out.println( ch + str + bool );
		System.out.println( d / 100 );
		System.out.println( b - 100 );
		
		
        //5
		String num = "20";
		int num2 = Integer.parseInt(num);
		int num1 = 23;
		System.out.println( "ハローJAVA" + ( num2 + num1) );
		
		
		//6
		String name;
		int age;
		double height;
		double weight;
		String food;
		
		name = "山田太郎";
		age = 18;
		height = 170.5;
		weight = 62.2;
		food ="寿司";
		
		System.out.println( "「初めまして" + name + "です」" );
		System.out.println( "「年齢は" + age + "歳です」");
		System.out.println( "「身長は" + height + "cmです」");
		System.out.println( "「体重は" + weight + "kgです」");
		System.out.println( "「好きな食べ物は" + food + "です」");
		
		
		//7
		double height2;
		double bmi;
		
		height2 = 1.705;
		bmi = weight / (height2 * height2);
		
		System.out.println( "「BMIは" + bmi +"です」");
		
		
		//8
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food ="オムライス";
		
		System.out.println( "「初めまして" + name + "です」" );
		System.out.println( "「年齢は" + age + "歳です」");
		System.out.println( "「身長は" + height + "cmです」");
		System.out.println( "「体重は" + weight + "kgです」");
		System.out.println( "「好きな食べ物は" + food + "です」");
		
		bmi = weight / ( (height/100) * (height/100) );
		
		System.out.println( "「BMIは" + String.format("%.1f", bmi) +"です」");
		
		
		//9
		System.out.println( "「初めまして" + name + "です」" );
		System.out.println( "「年齢は" + (age + age) + "歳です」");
		System.out.println( "「身長は" + (height + height) + "cmです」");
		System.out.println( "「体重は" + (weight + weight) + "kgです」");
		System.out.println( "「好きな食べ物は" + food + "です」");
		
		bmi = (weight+weight) / ( ((height+height) /100) * ( (height+height) /100) );
		
		System.out.println( "「BMIは" + String.format("%.2f", bmi ) +"です」");
		
		
		//10
		boolean b_age;
		b_age = age >= 25;
		
		System.out.println(b_age);
		
		
		//11
		String s_age;
		String s_height;
		String s_weight;
		
		s_age = String.valueOf(age);
		s_height = String.valueOf(height);
		s_weight = String.valueOf(weight);
		
		System.out.println( s_age + s_height + s_weight );
		
		
		//12
		System.out.println( Integer.parseInt(s_age) );
//		System.out.println( Integer.parseInt(s_height) );
		
		
		//13
		boolean b_ah;
		b_ah = s_age == "25" || Integer.parseInt(s_height) >= 160;
		
		System.out.println(b_ah);
		
		
		
		// TODO 自動生成されたメソッド・スタブ

	}

}
