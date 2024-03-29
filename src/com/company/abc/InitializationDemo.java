package com.company.abc;

/**
 * @author lilei
 * @date 2020-09-16 15:07
 * @apiNote
 */

public class InitializationDemo {
    public static void main(String[] args) {
        System.out.println("爸爸的岁数:" + Son.factor);
    }
}

class Grandpa {
    static {
        System.out.println("爷爷在静态代码块");
    }
}

class Father extends Grandpa {
    public static int factor = 25;

    static {
        System.out.println("爸爸在静态代码块");
    }

    public Father() {
        System.out.println("我是爸爸~");
    }
}

class Son extends Father {
    static {
        System.out.println("儿子在静态代码块");
    }

    public Son() {
        System.out.println("我是儿子~");
    }
}



