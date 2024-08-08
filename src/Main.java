// import exception.CheckedException;
import exception.CheckedException;
import exception.Person;
import exception.UnCheckedException;

public class Main {
    public static void main(String[] args)  {
        // Checked Exception và Unchecked Exception
//        printName("");

        // Xử ly ngoại lệ
        // Try ... catch ... finally(optional)
        try{
            // khối lệnh có thể phát sinh lôi
            printName("");
        }catch (UnCheckedException e) { // bắt tên lỗi muốn xử lí
            // khối lệnh xử lí
            System.out.println(e.getMessage());
        }catch (CheckedException e){ // lỗi thứ 2
            throw new RuntimeException("đến dây thôi"); // dừng và kết thúc main
        }finally {
            // kết thúc khối lệnh
            System.out.println("Kêt thúc chương trình");
        }
        System.out.println("Dừng hàm main");

        // throw : ném ra 1 ngoại lệ chỉ định  : kết hợp vs 1  đối tượng tạo ra từ Exception

        // throws : né ngoại lệ sinh ra trong 1 phương thức : thường đi với checked  exception

    }

    public static void printName(String name) throws CheckedException {
        if (name.isBlank()){
//            throw new CheckedException(); // checked : kiểm tra và phát hiện quá trình biên dịch
            throw new UnCheckedException("hehe");
        }

        if (name.length()<6){
            throw new CheckedException("ko thể bé hơn 6 kí tự");
        }
        System.out.println(name);
    }
}