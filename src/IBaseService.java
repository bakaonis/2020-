import java.util.concurrent.CopyOnWriteArrayList;


    public interface IBaseService<T> extends IDraw {

        /**
         * ��ʼ������б�Ԫ��
         */
        void init();

        /**
         * ���
         *
         * @param element
         */
    void add(T element);

    /**
     * �Ƴ�
     *
     * @param element
     */
    void remove(T element);

    /**
     * ��ȡԪ���б�
     *
     * @return
     */
    CopyOnWriteArrayList<T> getElementList();

 
}