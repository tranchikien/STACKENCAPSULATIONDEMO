/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STACKENCAPSULATIONDEMO;

/**
 *
 * @author CHI KIEN
 */
public class StackEncapsulationDemo {
    public static void main(String[] args) {
        StackADT stack = new StackADT(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        stack.display();
    }
}
