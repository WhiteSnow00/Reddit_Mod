// 
// Decompiled by Procyon v0.6.0
// 

package h7;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import sg2.e;

public abstract class c<T>
{
    public final T a;
    
    public c() {
        throw null;
    }
    
    public c(final Object a) {
        this.a = (T)a;
    }
    
    public static final class a
    {
        public static c a(final Object o) {
            e.g(o, "value");
            Object o2;
            if (o instanceof Map) {
                o2 = new c$d((Map)o);
            }
            else if (o instanceof List) {
                o2 = new c$c((List)o);
            }
            else if (o instanceof Boolean) {
                o2 = new c$b((boolean)o);
            }
            else if (o instanceof BigDecimal) {
                o2 = new c$f((Number)o);
            }
            else if (o instanceof Number) {
                o2 = new c$f((Number)o);
            }
            else {
                o2 = new c$g(o.toString());
            }
            return (c)o2;
        }
    }
}
