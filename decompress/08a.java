// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.CancellationSignal;
import android.content.res.Resources;
import android.content.Context;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;
import android.graphics.Typeface;

public final class 08a
{
    public static final 08c LIZ;
    public static final 04w<String, Typeface> LIZIZ;
    
    static {
        Covode.recordClassIndex(900);
        if (Build$VERSION.SDK_INT >= 29) {
            LIZ = new 14m();
        }
        else if (Build$VERSION.SDK_INT >= 28) {
            LIZ = new 1nJ();
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            LIZ = new 1fq();
        }
        else if (Build$VERSION.SDK_INT >= 24 && 14l.LIZ != null) {
            LIZ = new 14l();
        }
        else {
            LIZ = new 14k();
        }
        LIZIZ = new 04w<String, Typeface>(16);
    }
    
    public static Typeface LIZ(final Context context, final Resources resources, final int n, final String s, final int n2) {
        final Typeface liz = 08a.LIZ.LIZ(context, resources, n, s, n2);
        if (liz != null) {
            08a.LIZIZ.LIZ(LIZ(resources, n, n2), liz);
        }
        return liz;
    }
    
    public static Typeface LIZ(final Context context, final 075.b[] array, final int n) {
        return 08a.LIZ.LIZ(context, null, array, n);
    }
    
    public static String LIZ(final Resources resources, final int n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(n));
        sb.append("-");
        sb.append(n);
        sb.append("-");
        sb.append(n2);
        return sb.toString();
    }
}
