package a086;
//Print all possible solutions to N Queens problem ��ӡ���п��ܵĽ������N�ʺ�����
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
		  int r ,c;//r��ʾ��,c��ʾ��
		  for(r = i,c=0;c<Q;c++) {//�ж���
			  if(dp[r][c] =="Q" && c!=j) return false;
		  }
		  for(c = j,r=0;r<Q;r++) {//�ж���
			  if(dp[r][c] == "Q" && r != i) return false;  
		  }
		  for(r=i-1,c=j-1;r>=0&&c>=0;r--,c--) {//�ж����Ϸ�
			  if(dp[r][c] == "Q")return false; 
		  }
		  for(r=i+1,c=j-1;r<Q && c>=0;r++,c--) {//�ж����·�
			  if(dp[r][c]=="Q") return false;	  
		  }
		  for(r=i-1,c=j+1;r>=0 && c<Q;r--,c++) {//�ж����Ϸ�
			  if(dp[r][c]=="Q") return false;	  
		  }
		  for(r=i+1,c=j+1;r<Q&&c<Q;r++,c++) {//�ж����·�
			  if(dp[r][c] == "Q")return false; 
		  }
		  return true;
	  }   
	}

