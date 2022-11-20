// 
// Decompiled by Procyon v0.6.0
// 

package jg2;

import ng2.e;

public class a extends a
{
    public final void a(final Throwable t, final Throwable t2) {
        e.f((Object)t, "cause");
        e.f((Object)t2, "exception");
        final Integer a = jg2.a.a.a;
        if (a == null || a >= 19) {
            t.addSuppressed(t2);
        }
        else {
            super.a(t, t2);
        }
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
