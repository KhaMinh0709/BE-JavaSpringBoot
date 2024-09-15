package com.devjavaminh.be04springbootannotation;

public class Dog extends  Animal{
    @Override
    public void eat() {
        System.out.println("dog eatting");
    }
}
/*
* @Override
@Override là một trong những annotation được sử dụng phổ biến nhất trong Java.
*  Nó được đặt trên một phương thức để thông báo rằng phương thức này ghi đè (override)
* một phương thức từ lớp cha. Điều này giúp trình biên dịch kiểm
* tra xem phương thức thực sự có ghi đè một phương thức từ lớp cha hay không.*/
