package com.Multithreading;

/*
 * 推到lambda表达式
 * */
public class TestLambda {
    static ILike like1;

    //静态内部类
    // 实现类
    static class Like2 implements ILike {

        @Override
        public void lambda() {
            System.out.println("i like lambda");
        }
    }

    public static void main(String[] args) {
//        Like like = new Like();
//
//        //局部内部类
//        class Like3 implements ILike {
//            @Override
//            public void lambda() {
//                System.out.println("i like3 lambda");
//            }
//        }
//        Like3 like3 = new Like3();
//        like3.lambda();
//        // 匿名内部类，没有类的名称，必须借助接口或者父类
//        like1 = new ILike(){
//            @Override
//            public void lambda() {
//            }
//        };
        // 用lambda 简化


    }

}

// 定义一个函数式接口
interface ILike {
    void lambda();
}

class Like implements ILike {

    @Override
    public void lambda() {
        System.out.println("i like lambda");
    }

}
