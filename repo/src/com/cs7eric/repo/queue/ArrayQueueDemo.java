package com.cs7eric.repo.queue;



/**
 * 用数组模拟队列
 *
 * @author cs7eric
 * @date 2023/02/03
 */
public class ArrayQueueDemo {

    public static void main(String[] args) {

        ArrayQueue arrayQueue = new ArrayQueue(2);
        arrayQueue.add(1);
        arrayQueue.add(2);
        arrayQueue.list();
        System.out.println(arrayQueue.isFull());
        System.out.println(arrayQueue.isEmpty());
        System.out.println(arrayQueue.head());
    }



}
/**
 * 用数组模拟队列  - 编写一个 ArrayQueue 类
 *
 * @author cs7eric
 * @date 2023/02/03
 */
class ArrayQueue{

    /**
     * 数组的最大容量
     */
    private int maxSize;

    /**
     *  队列头指针
     */
    private int front;

    /**
     * 队列 尾指针
     */
    private int rear;

    /**
     *  该数组用于存放数据
     */
    private int[] array;

    // 创建队列
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        front = -1;  // 指向队列头部的前一个位置
        rear = -1; // 指向队列尾
    }

    /**
     * 判空
     *
     * @return boolean
     */
    public boolean isEmpty(){

        return rear == front ;
    }

    /**
     * 判断队列是否是满的
     *
     * @return boolean
     */
    public boolean isFull(){

        return rear == maxSize - 1;
    }

    /**
     * 添加数据
     *
     * @param elem  待添加的元素
     */
    public void add(int elem){

        if (isFull())    return;
        array[++rear] = elem;
    }

    /**
     * 得到 队列元素
     *
     * @return int
     */
    public int get(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return array[++front];
    }

    /**
     *  遍历所有数据
     */
    public void list(){

        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        for (int iterator : array){
            System.out.println(iterator);
        }
    }

    /**
     * 查看 队列head 元素
     *
     * @return int
     */
    public int head(){

        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return array[front+1];
    }

}
