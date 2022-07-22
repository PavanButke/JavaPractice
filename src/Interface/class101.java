package Interface;

 class  Father {

    public void fathermeth(){
        System.out.println("This is parent class.");
    }
}

class Children extends Father{
    public void childrenmeth(){
        System.out.println("This is child class.");
    }
}

class class101{
    public static void main(String[] args){
        Father f = new Father();
        Children c = new Children();
        f.fathermeth();
        c.childrenmeth();
        c.fathermeth();
    }
}