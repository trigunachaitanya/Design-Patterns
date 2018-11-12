public class SingletonPattaern {


    private  SingletonPattaern() {
    }

    private static SingletonPattaern singletonPattaern = null;


    public static SingletonPattaern getSingletonPatternInstance(){

        if(singletonPattaern == null){
            singletonPattaern = new SingletonPattaern();
        }
        return  singletonPattaern;
    }

    public static void main(String args[]) {

        SingletonPattaern.getSingletonPatternInstance();
        System.out.println(SingletonPattaern.getSingletonPatternInstance().hashCode());
        System.out.println(SingletonPattaern.getSingletonPatternInstance().hashCode());
    }
}
