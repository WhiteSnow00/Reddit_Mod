// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.host.IHostNetwork;
import java.util.List;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class 0yu
{
    public static volatile 0yu LIZLLL;
    public final Map<Class<?>, 0TU<?>> LIZ;
    public final Map<Class<?>, 0TV<?>> LIZIZ;
    public final 0yk LIZJ;
    
    static {
        Covode.recordClassIndex(10456);
    }
    
    public 0yu() {
        this.LIZ = new ConcurrentHashMap<Class<?>, 0TU<?>>();
        this.LIZIZ = new ConcurrentHashMap<Class<?>, 0TV<?>>();
        this.LIZJ = new 1dT();
    }
    
    public static 0yu LIZ() {
        MethodCollector.i(14216);
        if (0yu.LIZLLL == null) {
            monitorenter(0yu.class);
            try {
                if (0yu.LIZLLL == null) {
                    0yu.LIZLLL = new 0yu();
                }
                monitorexit(0yu.class);
            }
            finally {
                monitorexit(0yu.class);
                MethodCollector.o(14216);
            }
        }
        final 0yu lizlll = 0yu.LIZLLL;
        MethodCollector.o(14216);
        return lizlll;
    }
    
    public static Object LIZ(final Class clazz, final String s) {
        final String name = clazz.getPackage().getName();
        final String liz = LIZ(clazz);
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("._");
        sb.append(liz);
        sb.append(s);
        final String string = sb.toString();
        try {
            return Class.forName(string).newInstance();
        }
        catch (final IllegalAccessException ex) {
            0II.LIZ(ex);
            goto Label_0080;
        }
        catch (final InstantiationException ex2) {
            0II.LIZ(ex2);
            goto Label_0080;
        }
        catch (final Exception ex3) {
            0II.LIZ(ex3);
        }
        catch (final ClassNotFoundException ex4) {
            goto Label_0080;
        }
    }
    
    public static String LIZ(final Class clazz) {
        if (clazz == null) {
            return "";
        }
        if (clazz.getEnclosingClass() != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(LIZ(clazz.getEnclosingClass()));
            sb.append("_");
            sb.append(clazz.getSimpleName());
            return sb.toString();
        }
        return clazz.getSimpleName();
    }
    
    public final H0J<7F6> LIZ(final String s, final List<0Vs> list, final Object o) {
        final 0yk lizj = this.LIZJ;
        final 0yk.a a = new 0yk.a(s, list);
        lizj.LIZ(a);
        return (H0J<7F6>)0jR.LIZ(IHostNetwork.class).get(a.LIZ, (List)a.LIZIZ, o);
    }
    
    public final H0J<7F6> LIZ(final String s, final List<0Vs> list, final String s2, final byte[] array, final Object o) {
        final 0yk lizj = this.LIZJ;
        final 0yk.a a = new 0yk.a(s, list);
        lizj.LIZ(a);
        return (H0J<7F6>)0jR.LIZ(IHostNetwork.class).post(a.LIZ, (List)a.LIZIZ, s2, array, o);
    }
}
