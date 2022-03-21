package chuvi;

public class tamgiac {
    float a,b,c;
    float chuvi(){
        return a + b + c;
    }
    double dientich(){
        double cv2 = (double) chuvi()/2;
        return Math.sqrt(cv2*(cv2-a)*(cv2-b)*(cv2-c));
    }
}
