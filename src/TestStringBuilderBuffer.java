public class TestStringBuilderBuffer {
    public static void main(String[] args) {
        StringBuffer sbf=new StringBuffer();
        StringBuilder sbu=new StringBuilder();
        long start=System.currentTimeMillis();
        for (int i=0; i<100000000; i++) {
            sbf.append("f");
        }
        System.out.println("String Buffer Time:" + (System.currentTimeMillis()-start));

        start=System.currentTimeMillis();
        for (int i=0; i<100000000; i++) {
            sbu.append("u");
        }
        System.out.println("String Builder Time:" + (System.currentTimeMillis()-start));


    }
}
