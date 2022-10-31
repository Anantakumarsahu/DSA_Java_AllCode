package examplee;

import java.util.*;

class Gfg {

    public static String reduced_String (String s,int k)
    {
        if (k == 1) {
            String ans = "";
            return ans;
        }
        Stack<Pair> st = new Stack<Pair>();
        int l = s.length();
        for (int i=0; i < l; i++) {
            if(st.size() == 0) {
                st.push(new Pair(s.charAt(i), 1));
                continue;
            }
            if(st.peek().c == s.charAt(i)) {
                Pair p = st.peek();
                st.pop();
                p.ctr += 1;
                if(p.ctr == k) {
                    continue;
                }
                else {
                    st.push(p);
                }
            }
            else {
                st.push(new Pair(s.charAt(i), 1));
            }
        }
        String ans = "";
        while (st.size() > 0) {
            char c = st.peek().c;
            int cnt = st.peek().ctr;
            while(cnt-- > 0) {
                ans = c + ans;
            }
            st.pop();
        }
        return ans;
    }

    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */

        // Write your code here

       Scanner s = new Scanner(System.in);
       String st = s.nextLine();
       int k = 0;
       if(s.hasNextInt()) {
           k = s.nextInt();
       }
       String ans = reduced_String (st,k);
       System.out.println(ans); 
       s.close();
    }

    static class Pair {
        char c;
        int ctr;
        Pair(char c,int ctr)
        {
            this.c = c;
            this.ctr = ctr;
        }
    }

}
