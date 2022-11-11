// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 0Hb
{
    public static final String LIZ;
    public static final String LIZIZ = "0123456789ABCDEF";
    
    static {
        Covode.recordClassIndex(1860);
        n.LIZ((Object)"0123456789ABCDEF".toUpperCase(), "");
        final String lowerCase = "0123456789ABCDEF".toLowerCase();
        n.LIZ((Object)lowerCase, "");
        LIZ = lowerCase;
    }
}
