import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    /**
     * constructor.
     *
     * @param shape is shape
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * hi.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(shapes.get(i));
            }
        }
    }

    /**
     * hi.
     *
     * @return string
     */
    public String getInfo() {
        StringBuilder ans = new StringBuilder("Layer of crazy shapes:\n");
        for (Shape v : shapes) {
            ans.append(v.toString());
            ans.append('\n');
        }
        return ans.toString();
    }

    /**
     * hi.
     */
    public void removeDuplicates() {
        List<Shape> temp = new ArrayList<>();
        int[] dd = new int[shapes.size()];
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    dd[j] = 1;
                }
            }
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (dd[i] != 0) {
                continue;
            }
            temp.add(shapes.get(i));
        }
        shapes = temp;
    }

}
