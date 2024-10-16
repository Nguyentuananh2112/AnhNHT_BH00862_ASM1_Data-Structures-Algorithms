package P3_ex;

public class Stack {
    private int[] stack;  // Mảng để lưu trữ các phần tử của ngăn xếp
    private int top;      // Con trỏ chỉ đến phần tử trên cùng
    private int maxSize;  // Kích thước tối đa của ngăn xếp


    // Constructor để khởi tạo ngăn xếp với kích thước cho trước
    public Stack(int size) {
        maxSize = size;       // Đặt kích thước tối đa cho ngăn xếp
        stack = new int[maxSize];  // Khởi tạo mảng lưu trữ
        top = -1;             // Khởi tạo ngăn xếp rỗng (top = -1)
    }




    // Thao tác thêm phần tử vào ngăn xếp
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow!");  // Ngăn xếp đầy
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }



    // Thao tác loại bỏ phần tử khỏi ngăn xếp
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow!");  // Ngăn xếp rỗng
            return -1;  // Trả về giá trị lỗi
        } else {
            int poppedElement = stack[top];
            top--;
            System.out.println(poppedElement + " popped from stack.");
            return poppedElement;
        }
    }




    // Thao tác xem phần tử trên cùng của ngăn xếp
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");  // Ngăn xếp rỗng
            return -1;
        } else {
            System.out.println("Top element is " + stack[top]);
            return stack[top];
        }
    }




    // Thao tác kiểm tra ngăn xếp có rỗng không
    public boolean isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return true;
        } else {
            System.out.println("Stack is not empty.");
            return false;
        }
    }
}
