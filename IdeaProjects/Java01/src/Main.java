import java.util.Scanner;
// ctr + space rat hay
// bien doi tuong can viet hoa chu dau, bien nguyen thuy thi khong
// rat nhieu quy tac trong java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao ho ten");
        String hoten = sc.nextLine(); // là class mở rộng nhưng cài đặt đb nên kh cần dùng new => biến hoten là biến mở rộng
        System.out.println("Nhap vao tuoi ");
        int tuoi = sc.nextInt();
        sc.nextLine(); // tránh trôi lệnh
        System.out.println("Nhập giới tính: ");
        String gioitinh = sc.nextLine();
        System.out.println("------------");
        System.out.println("Ho va Ten la " + hoten);
        System.out.println("Tuoi la " + tuoi);
        System.out.print("10 năm nữa " + hoten + " sẽ có số tuổi là ");
        for(int i = 0; i < 10; i++)
            tuoi++;
        System.out.println(tuoi);
        System.out.println("gioi tinh cua" + hoten + " la " + gioitinh);
        phuongtrinhbac2 pt = new phuongtrinhbac2();
        System.out.println(hoten +" muon tinh phuong trinh bac 2, hay nhap pt muon tinh: ");
        pt.a = sc.nextInt();
        pt.b = sc.nextInt();
        pt.c = sc.nextInt();
        pt.tinhtoan(pt.a,pt.b,pt.c);
        Tambiet kt = new Tambiet();
        kt.khoi();
    }
}
/*
nếu bạn nhập hoten - tuoi - gioitinh
mà không có dòng lệnh 13 thì sẽ không được nhập gioitinh
đây là hiện tượng trôi lệnh
do lệnh nhập tuổi kết thúc bằng 1 dấu space hoặc enter
mà dấu này không thuộc kiểu int nên được lưu vào bộ nhớ đệm
sau đó mình nhập gioitinh thì sẽ có cái dấu đó vào
mà lệnh nextline sẽ dừng khi có dấu đó
nên không nhập được gioitinh
cách xử lý là thêm dòng 13 để đọc dấu đó
nếu bạn nhập hoten - gioitinh - tuoi thì vẫn chạy ngon do dấu đó đã tính vào phần hoten rùi (do dấu đó cũng là string)

mở rộng một cách xử lý khác là dùng string đối vs cả biến tuoi, sau đó dùng đổi kiểu
vd: tuoi = integer.pareInt(keyboard.nextLine());
 */

/*
Khi khởi tạo cùng một src thì các class khác hoàn toàn có thể liên kết với nhau và gọi lẫn nhau như kiểu các hàm con
vd class phuongtrinhbac2 thay đổi một chút, làm như bth thì hoàn toàn có thể là một ctr riêng, nhưng khi bỏ main đi và biến tấu
thì nó lại như một hàm cho cái main.java này gọi và sử dụng. nếu bấm chạy cái ptbac2 nó sẽ báo lỗi kh tìm thấy main
lý do nó có dấu đỏ do là mình từng cho nó là hàm main!? mai hỏi a Minh vậy
 */