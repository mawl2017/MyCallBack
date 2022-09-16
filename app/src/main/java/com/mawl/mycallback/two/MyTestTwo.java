package com.mawl.mycallback.two;

/**
 * @author mawl1991
 * @date 2022/9/12
 * @time 19:57
 */
public class MyTestTwo {


    public MyTestTwo() {
    }


    public void testLLK(String sttt,CallBackTwo callBackTwo){

        if(sttt.contains("武静")){
            callBackTwo.testTT("武静离婚吧");

        }else {
            callBackTwo.testOO("高小玉离婚吧");
        }
    }


    public interface CallBackTwo{

        void testTT(String gg);

        void testOO(String hh);

    }

}
