package P3_ex;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);  // Khởi tạo ngăn xếp với kích thước 5

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek();  // Xem phần tử trên cùng

        stack.pop();   // Loại bỏ phần tử trên cùng

        stack.peek();  // Xem lại phần tử trên cùng

        stack.isEmpty();  // Kiểm tra ngăn xếp có rỗng không
    }
}
