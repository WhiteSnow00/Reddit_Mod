// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.nio.charset.Charset;

public final class t6
{
    public static final r6 b;
    public final s6 a;
    
    static {
        b = new r6();
    }
    
    public t6() {
        final x5 a = x5.a;
        Object b;
        try {
            b = Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (final Exception ex) {
            b = t6.b;
        }
        final s6 a2 = new s6(new y6[] { (y6)a, (y6)b });
        final Charset a3 = i6.a;
        this.a = a2;
    }
}
