package some;
import java.util.*;
public class Main {

        public static int LCS(String s1,String s2,int i,int j,int[][] dp){

            if(i<0){
                return 0;
            }
            if(j<0){
                return 0;
            }
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
            int res;
            if(s1.charAt(i)==s2.charAt(j)){
                res=1+LCS(s1,s2,i-1,j-1,dp);
            }
            else{
                res=Math.max(LCS(s1, s2, i-1, j, dp),LCS(s1, s2, i, j-1, dp));
            }
            dp[i][j]=res;
            return dp[i][j];

        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            System.out.print("enter the first string");


            String s1=sc.nextLine();


            System.out.print("enter the first string");

            String s2=sc.nextLine();

            int n=s1.length();
            int m=s2.length();
            int[][] dp=new int[n][m];
            for(int i=0;i<n;i++){
                Arrays.fill(dp[i],-1);
            }

            int res=LCS(s1,s2,s1.length()-1,s2.length()-1,dp);
            System.out.print(res);

            
        } 
}
