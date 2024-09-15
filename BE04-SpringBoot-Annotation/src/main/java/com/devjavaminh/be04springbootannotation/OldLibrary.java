package com.devjavaminh.be04springbootannotation;

public class OldLibrary {
    @Deprecated
    public void oldMethod(){
        System.out.println("this method is deprecated");
    }
}
/*
* @Deprecated được sử dụng để đánh dấu một phần của mã nguồn hoặc một phương thức đã bị
*  lỗi thời hoặc không nên sử dụng nữa. Nếu bạn sử dụng một phần
*  được đánh dấu @Deprecated, trình biên dịch sẽ cảnh báo bạn về điều này.*/
