public class testing {

    static String  get(String num ) {


        int maxlen = 0;
        int count = 0 ;

        for ( int i = num.length()-1;i>=0;i--)
        {

            if ((num.charAt(i)-'0')%2==1)
            {
                count =  i+1;
                break;
            }





        }

        maxlen = count;

        if ( maxlen == 0 )
        {
            return 0;
        }


        return

    }

    static void main() {
        String num = "222";
        System.out.println(get(num));
    }

}
