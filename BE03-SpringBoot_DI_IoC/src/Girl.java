

public class Girl {
    private Outfit outfit;

    public Girl(Outfit outfit) {
        this.outfit = outfit;
    }

    public void dressUp() {
        outfit.wear();
    }
}
/*
* trên là cách Dependency InJaction lớp Girl không tạo ra một Outfit mà nó cần. Thay vào đó, nó chấp nhận một Outfit thông qua constructor của nó. Điều này làm giảm sự phụ thuộc
* của Girl vào một cụ thể Outfit, tạo điều kiện cho tính linh hoạt và tùy biến.*/