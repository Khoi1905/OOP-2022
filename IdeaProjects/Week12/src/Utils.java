import java.io.*;

public class Utils {
    /**
     * đọc từ file.
     *
     * @param path là đường dẫn file
     * @return file
     */
    public static String readContentFromFile(String path) {
        StringBuilder str = null;
        try {
            BufferedReader input = new BufferedReader(new FileReader(path));
            while (true) {
                if (input.readLine() == null) {
                    break;
                } else {
                    str.append(input.readLine());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    /**
     * is.
     *
     * @param path    is
     * @param content is
     */
    public static void writeContentToFile(String path, String content) {
        try {
            FileWriter in = new FileWriter(path);// loại này sẽ xóa dữ liệu cũ và ghi mới vào
            BufferedWriter output = new BufferedWriter(in);
            output.write(content);
            output.flush();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * có thể kết hợp hai lệnh thành BufferedWriter output = new BufferedWriter(new FileWriter(in,true);.
     *
     * @param path    is
     * @param content is
     */
    public static void appendContentToFile(String path, String content) {
        try {
            FileWriter in = new FileWriter(path, true); // loại này sẽ tiếp tục
            BufferedWriter output = new BufferedWriter(in);
            output.write(content);
            output.flush();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * iss.
     *
     * @param folderPath is tên thư mục
     * @param fileName   is tên file cần tìm
     * @return is
     */
    public static File findFileByName(String folderPath, String fileName) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.getName().equals(fileName)) {
                    return file;
                }
            }
        }
        return null;
    }
}