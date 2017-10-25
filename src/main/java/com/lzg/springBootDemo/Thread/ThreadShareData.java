package com.lzg.springBootDemo.Thread;

import java.util.Random;

/**
 * Desc:
 *
 * @author liuzg
 * @date 2017/10/23
 */
public class ThreadShareData {

    private static  int data = 0 ;

    public static void main(String[] args) {

        for(int i = 0 ;i<2 ;i++){
            new Thread(new Runnable(){

                @Override
                public  void run() {
                    synchronized (ThreadShareData.class) {  //保证下面的代码都执行完才允许其他线程进入
                        data = new Random().nextInt();
                        VariableContainer.getThreadInstance().setAge(data) ;
                        VariableContainer.getThreadInstance().setName("liuzg-"+data) ;
                        System.out.println(Thread.currentThread().getName()+ " Put  VariableContainer:"+VariableContainer.getThreadInstance().toString());
                        new A().get() ;
                        new B().get() ;
                    }
                }

            }).start() ;
        }

    }

    static class A {
        public int get(){
            //取数据都从当前线程中取得
            System.out.println("A from " + Thread.currentThread().getName()
                    + " get data :" + VariableContainer.getThreadInstance().toString());
            return data ;
        }
    }

    static class B{
        public int get(){
            //取数据都从当前线程中取得

            System.out.println("B from " + Thread.currentThread().getName()
                    + " get data :" + VariableContainer.getThreadInstance().toString());
            return data ;
        }
    }

}
