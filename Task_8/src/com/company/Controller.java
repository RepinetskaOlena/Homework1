package com.company;



public class Controller {
    private View viewSet = new View();

    public void run() {

        viewSet.view("Enter size -> ");
        int size = InputUtility.inputInt();
        Array array = new Array(size);
        System.out.println(array);

    }
}
