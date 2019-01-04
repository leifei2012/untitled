public class Main {

    public static void main(String[] args)
    {
        imp i=new imp();
        jiekou o=new OProxy(i).getProxy(); //写imp会有错
        o.find();

    }
}
