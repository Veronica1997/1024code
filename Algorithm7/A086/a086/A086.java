package a086;
//Print all possible solutions to N Queens problem 打印所有可能的解决方案N皇后问题
public class A086 {
	   public static int Q = 4;
	   public static void main(String[] args) {
		   String[][] dp = new String[Q][Q];
		   for(int i=0;i<Q;i++) {
			   for(int j=0;j<Q;j++) {
				   dp[i][j] = "-";
			   }
		   }
		   queen(0,dp);
	   }
	  public static void queen(int m,String[][] dp) {
		  for(int i=0;i<Q;i++) {
			  if(isCorrt(i,m,dp)) {
				  dp[i][m] = "Q";
				  queen(m+1,dp);
				  dp[i][m] = "-";
			  }
		  }
		  if(m==Q) {
			  for(int i=0;i<Q;i++) {
				  for(int j=0;j<Q;j++) {
					  System.out.print(dp[j][i]+" ");
				  }
				  System.out.println();
			  }
			  System.out.println();
		  }	 
	  }
	  private static boolean isCorrt(int i,int j,String[][] dp) {
		  int r ,c;//r表示行,c表示列
		  for(r = i,c=0;c<Q;c++) {//判断行
			  if(dp[r][c] =="Q" && c!=j) return false;
		  }
		  for(c = j,r=0;r<Q;r++) {//判断列
			  if(dp[r][c] == "Q" && r != i) return false;  
		  }
		  for(r=i-1,c=j-1;r>=0&&c>=0;r--,c--) {//判断左上方
			  if(dp[r][c] == "Q")return false; 
		  }
		  for(r=i+1,c=j-1;r<Q && c>=0;r++,c--) {//判断左下方
			  if(dp[r][c]=="Q") return false;	  
		  }
		  for(r=i-1,c=j+1;r>=0 && c<Q;r--,c++) {//判断右上方
			  if(dp[r][c]=="Q") return false;	  
		  }
		  for(r=i+1,c=j+1;r<Q&&c<Q;r++,c++) {//判断右下方
			  if(dp[r][c] == "Q")return false; 
		  }
		  return true;
	  }   
	}

