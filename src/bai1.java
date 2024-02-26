import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai1 {
    public static void main(String[] args) {
//        validate du lieu Quan ly thong tin cua 1 sinh vien
//=====Bài tâp===
//1. Nhap vao ma sinh vien
//2. Nhap vao ho ten
//3. so diejnd thoại
//4. Nhập vào ngày tháng năm sinh
//5. In thông tin sinh vien
//
//Validate dữ liệu nhập vào
//mã sinh viên phải bắt đầu bằng chữ B sau là 3 số (VD : B200)
//Ho ten khong chua ky tu dac biet trừ khoảng trắng có tối thiểu 10 ký tự
//Phone Đúng định dạng Đông Lào
//Năm sinh phải đúng yy/mmm/dd (05/10/1
        Scanner sc = new Scanner(System.in);
        String msv;
        do {
            System.out.println("Nhap vao ma sinh vien");
             msv = sc.nextLine();
//        validate input
//        Pattern pattern = Pattern.compile("(0[3|5|7|9][0-9]{8})");
            Pattern pattern = Pattern.compile("B[0-9]{3}");
            Matcher check = pattern.matcher(msv);
            if (check.matches()) {
                System.out.println("Cam on");
                break;
            } else {
                System.err.println("Nhap sai dinh dang");
            }

        } while (true);
        String name;
        do {
            System.out.println("Nhap vao ho ten sinh vien");
             name = sc.nextLine();
//        validate input
//        Pattern pattern = Pattern.compile("(0[3|5|7|9][0-9]{8})");
            Pattern pattern = Pattern.compile("[a-z A-Z]{10}");
            Matcher check = pattern.matcher(name);
            if (check.matches()) {
                System.out.println("Cam on");
                break;
            } else {
                System.err.println("Nhap sai dinh dang");
            }

        } while (true);
        String phone;
        do {
            System.out.println("Nhap vao so dien thoai sinh vien");
             phone = sc.nextLine();
//        validate input
        Pattern pattern = Pattern.compile("(0[3579][0-9]{8})");
//            Pattern pattern = Pattern.compile("([a-z A-Z]+)@[a-z A-Z]{1,10}\\.[a-z]{1,10}");

            Matcher check = pattern.matcher(phone);
            if (check.matches()) {
                System.out.println("Cam on");
                break;
            } else {
                System.err.println("Nhap sai dinh dang");
            }

        } while (true);
        String birthday;
        do {
            System.out.println("Nhap vao ngay thang nam sinh(dd/mm/yyyy)");
             birthday = sc.nextLine();
//        validate input
//        Pattern pattern = Pattern.compile("(0[3|5|7|9][0-9]{8})");
            Pattern pattern = Pattern.compile("\\d{1,2}[/|-]\\d{1,2}[/|-]\\d{4}");

            Matcher check = pattern.matcher(birthday);
            if (check.matches()) {
                System.out.println("Cam on");
                break;
            } else {
                System.err.println("Nhap sai dinh dang");
            }

        } while (true);
        System.out.printf("Ma sinh vien %s \n Ho va ten %s \n So dien thoai %s \n Ngay thang nam sinh %s ",msv,name,phone,birthday);
    }
}
