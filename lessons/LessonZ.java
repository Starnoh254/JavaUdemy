package lessons;

interface Computer {
    void code();
}

class Desktop implements Computer {

    @Override
    public void code() {
        System.out.println("code , compile , run : faster");
    }
    
}

class Laptop implements Computer {

    @Override
    public void code() {
        System.out.println("code , compile , run");
    }
    
}

class Developer {
    public void develop(Computer comp){
        comp.code();
    }
}

public class LessonZ {
    public static void main(String[] args){

        Computer lapi = new Laptop();

        Computer desktop = new Desktop();

        Developer starnohDeveloper = new Developer();

        starnohDeveloper.develop(lapi);

    }
}
