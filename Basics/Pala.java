class Pala
{
 public static void main(String args[])
 {
  char[] a={'r','e','e','g','a','n'};
  int n=a.length();
  char temp;
  int j=n-1;
  
  for(int i=0;i<n;i++)
  {
   if(j-1>(n/2))
   {
    temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    j--;
   }
  }
 for(int i=0;i<n;i++)
 {
  System.out.print(a[i]);
 }
 }
}