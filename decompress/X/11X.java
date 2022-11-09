// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class 11X
{
    static {
        Covode.recordClassIndex(23351);
    }
    
    public static final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        if (n.LIZ((Object)Looper.getMainLooper(), (Object)Looper.myLooper())) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Method ");
        sb.append(s);
        sb.append(" must be called on the main thread");
        throw new IllegalStateException(sb.toString().toString());
    }
}
