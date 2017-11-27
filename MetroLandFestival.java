
public class MetroLandFestival {

   static int minimizeCost(int[] p, int[] x, int[] y) {
       int sumx;
       int sumy;
       int minx=Integer.MAX_VALUE;
       int miny=Integer.MAX_VALUE;
       for(int i=0;i<x.length;i++){
           sumx=0;
           sumy=0;
           for(int j=0;j<x.length;j++){
               sumx+=(Math.abs(x[i]-x[j]))*p[j];
               sumy+=(Math.abs(y[i]-y[j]))*p[j];
           }
           if(sumx<minx){
               minx=sumx;
           }
           if(sumy<miny){
               miny=sumy;
           }
       }
       
       return minx+miny;
   }

   public static void main(String[] args) {
       int [] p={1,1};
       int [] x= {1,3};
       int [] y= {1,1};
       System.out.println("Test case 1 : "+  minimizeCost(p,x,y));
       //System.out.println("Test case 1 : "+  minCost(p,x,y));
       
       int [] p1={1,1};
       int [] x1= {1,2};
       int [] y1= {1,2};
       
       System.out.println("Test case 2 : "+ minimizeCost(p1,x1,y1));
       
       int [] p3={1,1,1};
       int [] x3= {5,2,3};
       int [] y3= {3,4,7};
       
       System.out.println("Test case 3 : "+ minimizeCost(p3,x3,y3));
       
       /*System.out.println(minCost(p,x,y));
       
       System.out.println(minimizeCost(p,x,y));
       System.out.println(minCost(p,x,y));
       
       System.out.println(minimizeCost(p,x,y));
       System.out.println(minCost(p,x,y));*/
   }
}

