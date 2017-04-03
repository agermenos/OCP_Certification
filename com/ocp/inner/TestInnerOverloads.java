package com.ocp.inner;

/**
 * Created by alejandrogermenos on 4/3/17.
 */
public class TestInnerOverloads {
    public void f(){
        System.out.println("Outer f");
    }
    public Inner getInner(){
        return new Inner();
    }

    /*
      I created doTest, since this code can't be created on a static method, like main
      To remember: static pieces of the code CANNOT touch non-static inner classes!!

      Lesson #2: if you run the this.f() line, it will compile, but recurse until error.
      this.f() will always call the overloaded (the one currently being defined) method... looping!
     */
    public void doTest(){
        TestInnerOverloads.Inner inner= this.new Inner(){
            public void f(){
                //this.f();
                System.out.println("Overloaded Inner f");
            }
        };
        inner.f();
    }
    public class Inner{
        public void f(){
            System.out.println("Inner f");
        }
        public Inner(){
            System.out.println("Inner constructor");
        }
    }
    public static void main(String args[]){
        TestInnerOverloads tio = new TestInnerOverloads();
        tio.doTest();
    }
}
