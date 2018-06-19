package com;

    class Dog {
        public void bark(){
            System.out.println("woof");
        }
}
    class subDog extends Dog {
        
        @Override
        public void bark() {
            System.out.println("yark");
        }
    }