package silver;

public class Main{
//	public static void calc() {
//		long free = Runtime.getRuntime().freeMemory();
//		long total = Runtime.getRuntime().totalMemory();
//		long usage = (total - free) / 1024/1024;
//		System.out.println(usage);
//	}
    public static void main(String[] args) {
//    	Instant start = Instant.now();
//    	System.out.println(Integer.MAX_VALUE);
//    	StringBuilder sb1 = new StringBuilder(50_000);
//    	String a = "";
//    	String[] array = {"A","B","C","D","E","F","G","H","I","J"};
//    	calc();
//    	for (int i = 0; i < 50_000; i++) {
//    		Random r = new Random();
//    		int rr = r.nextInt(10);
//    		a += array[rr];
////			sb1.append(array[rr])/*.append(array[rr]).append(array[rr])*/;
//		}
//    	calc();
//    	Instant end = Instant.now();
//    	System.out.println(Duration.between(start, end));

    	String s2 = new String("Sample");
    	String s1 = new String("Sample");
    	String s3 = "Sample";
    	String s4 = s1.intern();
    	
//    	String str3 = str1.intern();
//    	System.out.println(str1==str2);
    	System.out.println(s2==s1.intern());
    	System.out.println(s3==s4);
//    	System.out.println(str1.intern()==str3.intern());
//    	System.out.println(str1==str3.intern());
//    	System.out.println(str3==str1.intern());

//    	System.out.println(str1.codePointAt(0));

//    	Random r = new Random();
//    	int rr = r.nextInt(4);
//    	int num = rr;
//    	switch(num) {
//    	case 1:
//    		System.out.println("1");
//    		break;
//    	case 2:
//    		System.out.println("2");
//    		break;
//    	case 3:
//    		System.out.println("3");
//    		break;
//    		default:
//    			System.out.println("etc");
//    	}


//    	Sample s1 = new Sample(10);
//    	Sample s2 = new Sample(12);
//    	Sample s3 = s1;
//
//    	System.out.println(s1.getId());
//    	System.out.println(s2.getId());
//    	System.out.println(s3.getId());
//    	System.out.println(s1.getId());
//    	System.out.println(s1.equals(s2));
//    	System.out.println(s1.equals(s3));
//    	System.out.println(s2.equals(s3));
//    	System.out.println();
//    	s1 = new Sample(10);
//    	System.out.println(s1.getClass());
//    	System.out.println(s2.getId());
//    	System.out.println(s3.getId());
//    	System.out.println(s1.getId());









    }
}

