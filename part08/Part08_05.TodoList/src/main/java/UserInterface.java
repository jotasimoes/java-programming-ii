
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotas
 */
public class UserInterface {
    
    private TodoList todoList=new TodoList();
    private Scanner sc = new Scanner(System.in);
    
    public UserInterface(TodoList todoList, Scanner sc){
        this.todoList=todoList;
        this.sc=sc;
    }
    
    public void start(){
        while(true){
            
            System.out.print("Command: ");
            String command = sc.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            if(command.equals("add")){
                System.out.println("To add: ");
                String task = sc.nextLine();
                todoList.add(task);
            }
            if(command.equals("list")){
              todoList.print();
            }
            if(command.equals("remove")){
                System.out.println("To remove: ");
                int taskToRemove = sc.nextInt();
                todoList.remove(taskToRemove);
            }
            
        }
        
        
    }
    
    
    
}
