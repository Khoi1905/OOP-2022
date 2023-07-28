import java.util.List;

public class ShapeUtil {
    /**
     * string.
     *
     * @param shapes is
     * @return is
     */
    public String printInfo(List<GeometricObject> shapes) {
        String ans = "Circle:\n";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                ans += shapes.get(i).getInfo();
                ans += "\n";
            }
        }
        ans += "Triangle:\n";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                ans += shapes.get(i).getInfo();
                ans += "\n";
            }
        }
        return ans;
    }
}
