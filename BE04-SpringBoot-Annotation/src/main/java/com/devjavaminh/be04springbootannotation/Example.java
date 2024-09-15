package com.devjavaminh.be04springbootannotation;

@SuppressWarnings("unused")
public class Example {
    int unusedVariable;

    @SuppressWarnings("deprecation")
    void useDeprecatedMethod() {
        OldLibrary library = new OldLibrary();
        library.oldMethod();
    }
}
/*
* @SuppressWarnings được sử dụng để tắt cảnh báo của trình biên dịch tại các vị trí cụ thể trong mã nguồn.
*  Điều này có thể hữu ích khi bạn muốn tắt cảnh báo cụ thể mà bạn biết là không cần thiết.*/
