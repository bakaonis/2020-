import java.util.concurrent.CopyOnWriteArrayList;


    public interface IBaseService<T> extends IDraw {

        /**
         * 初始化清除列表元素
         */
        void init();

        /**
         * 添加
         *
         * @param element
         */
    void add(T element);

    /**
     * 移除
     *
     * @param element
     */
    void remove(T element);

    /**
     * 获取元素列表
     *
     * @return
     */
    CopyOnWriteArrayList<T> getElementList();

 
}