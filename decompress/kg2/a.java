// 
// Decompiled by Procyon v0.6.0
// 

package kg2;

import rg2.b;
import kotlin.random.Random;

public class a extends a
{
    public final Random b() {
        final Integer a = kg2.a.a.a;
        rg2.a a2;
        if (a == null || a >= 24) {
            a2 = new sg2.a();
        }
        else {
            a2 = new b();
        }
        return (Random)a2;
    }
    
    public static final class a
    {
        public static final Integer a;
        
        static {
            final Integer n = null;
            while (true) {
                try {
                    final Object value = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                    Integer n2;
                    if (value instanceof Integer) {
                        n2 = (Integer)value;
                    }
                    else {
                        n2 = null;
                    }
                    Integer a2 = n;
                    if (n2 != null) {
                        final boolean b = n2.intValue() > 0;
                        a2 = n;
                        if (b) {
                            a2 = n2;
                        }
                    }
                    a = a2;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
}
