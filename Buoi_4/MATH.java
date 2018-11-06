import java.util.ArrayList;

public class MATH {
	public static float tb(ArrayList<Float> a) {
        float tb = 0;
        for(int i=0;i<a.size();i++){
		    tb += a.get(i);
        }
        return tb/a.size();
    }
}