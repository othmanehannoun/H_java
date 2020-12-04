


public class Point {
     public float x;
     public float y;
        
     
     public Point(float xx, float yy) {
    	 this.x=xx;
    	 this.y=yy;
	}
	
	public void Destance(float x2,float y2) {
    	 System.out.printf("la destance entre les deux point et :" + Math.sqrt((float)Math.pow((this.x-x2),2)+(float)Math.pow((this.y-y2),2)));
     }
	
     
     
}