package com.mawl.mycallback.one;

/**
 * @author mawl1991
 * @date 2022/9/12
 * @time 16:01
 */
public class MyTest {

    private MyInterfaceOne myInterfaceOne;

    public MyTest(MyInterfaceOne myInterfaceOne) {
      this.myInterfaceOne=myInterfaceOne;
    }

    public void getTestResult(String str){
        if(str.equals("高小玉离婚")){
            myInterfaceOne.sucess(str);
        }else {
            myInterfaceOne.failed(str);
        }

    }


}
