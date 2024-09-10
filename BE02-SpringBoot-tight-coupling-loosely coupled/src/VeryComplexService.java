public class VeryComplexService {
    private BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

    public VeryComplexService() {
    }

    public void complexBusiness(int[] array) {
        bubbleSortAlgorithm.sort(array);
        // TODO: More business logic here
    }
}
/*Trong trường hợp này, VeryComplexService và BubbleSortAlgorithm quá chặt chẽ kết nối với
nhau. Khi bạn cần thay đổi thuật toán sắp xếp sang QuickSort, bạn sẽ phải sửa cả hai lớp.
* */