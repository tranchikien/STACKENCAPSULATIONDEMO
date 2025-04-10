/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STACKENCAPSULATIONDEMO;

/**
 *
 * @author CHI KIEN
 */
// ADT Stack sử dụng tính đóng gói (Encapsulation) và ẩn thông tin (Information Hiding)
public class StackADT {
    private int[] stack; // Mảng lưu trữ phần tử (Ẩn thông tin)
    private int top; // Con trỏ định stack (Ẩn thông tin)
    private int capacity; // Sức chứa của stack (Ẩn thông tin)

    // Constructor: Khởi tạo Stack với kích thước tối đa
    public StackADT(int size) {
        this.capacity = size;
        this.stack = new int[size];
        this.top = -1; // Stack rỗng ban đầu
    }

    // Phương thức push: Thêm phần tử vào định Stack
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Không thể thêm " + value);
            return;
        }
        stack[++top] = value;
        System.out.println("Pushed: " + value);
    }

    // Phương thức pop: Lấy và xóa phần tử ở định Stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow! Không thể pop.");
        }
        System.out.println("Popped: " + stack[top]);
        return stack[top--];
    }

    // Phương thức peek: Xem phần tử ở định mà không xóa
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty! Không thể peek.");
        }
        return stack[top];
    }

    // Phương thức kiểm tra Stack có rỗng không
    public boolean isEmpty() {
        return top == -1;
    }

    // Phương thức hiển thị Stack (Chỉ cung cấp thông tin qua giao diện công khai)
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack đang rỗng.");
            return;
        }
        System.out.print("Stack hiện tại: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

class StackEncapsulationDemo {
    public static void main(String[] args) {
        StackADT stack = new StackADT(5); // Tạo Stack có sức chứa 5 phần tử
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Hiển thị Stack
        System.out.println("Peek: " + stack.peek()); // Xem phần tử trên cùng
        stack.pop(); // Xóa phần tử trên cùng
        stack.display(); // Hiển thị Stack sau khi pop
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70); // Stack Overflow vì vượt quá dung lượng
        stack.display();
    }
}
