package hus.oop.mystudentmanager;

public abstract class AbstractMyList implements MyList {
    /**
     * Phương thức kiểm tra xem index có nằm trong đoạn [0 - limit] không.
     * @param index
     * @param limit
     * @return true nếu index nằm trong đoạn [0, limit], ngược lại trả về false.
     */
    public boolean checkBoundaries(int index, int limit) {
        return index >= 0 && index <= limit;
    }
}
