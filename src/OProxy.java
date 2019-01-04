import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OProxy implements InvocationHandler {//继承InvocationHandler并获得实例

    private imp object;
    public OProxy(imp object){
        this.object=object;
    }
    public jiekou getProxy(){  //写imp会有错

        return (jiekou)Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("11111");
        return  method.invoke(object,args);
    }
}
