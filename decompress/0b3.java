// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.google.gson.p;
import com.google.gson.l;
import java.util.Map;
import com.google.gson.m;
import java.util.List;
import com.google.gson.g;
import kotlin.jvm.internal.n;
import com.google.gson.u;
import java.io.Writer;
import com.google.gson.c.c;
import java.io.StringWriter;
import com.google.gson.j;
import kotlin.n.z;
import kotlin.n.y;
import android.net.Uri;
import com.bytedance.covode.number.Covode;

public final class 0b3
{
    public static final 5DO LIZ;
    
    static {
        Covode.recordClassIndex(5601);
        LIZ = 3Os.LIZ((QgG)1sW.LIZ);
    }
    
    public static final int LIZ(final Uri uri, final String s, final String s2) {
        CTM.LIZ((Object)uri, (Object)s);
        if (s2 == null) {
            return 0;
        }
        if (y.LIZJ(s2, "rpx", false)) {
            return (int)(Float.parseFloat(z.LIZIZ(s2, (CharSequence)"rpx")) / 750.0f * 0cB.LIZJ());
        }
        if (!y.LIZJ(s2, "%", false)) {
            return 0cB.LIZ(Float.parseFloat(s2));
        }
        final float n = Float.parseFloat(z.LIZIZ(s2, (CharSequence)"%")) / 100.0f;
        if (z.LIZ((CharSequence)s, (CharSequence)"width", false)) {
            return (int)(0cB.LIZJ() * n);
        }
        if (z.LIZ((CharSequence)s, (CharSequence)"height", false)) {
            return (int)(0cB.LIZIZ() * n);
        }
        return (int)(0cB.LIZJ() * n);
    }
    
    public static final <T extends j> String LIZ(final T t) {
        CTM.LIZ((Object)t);
        final StringWriter stringWriter = new StringWriter();
        final c c = new c((Writer)stringWriter);
        c.LIZIZ = true;
        ((u)0b3.LIZ.getValue()).write(c, (Object)t);
        final String string = stringWriter.toString();
        n.LIZIZ((Object)string, "");
        return string;
    }
    
    public static final List<Object> LIZ(final g g) {
        CTM.LIZ((Object)g);
        return new 1H3(g);
    }
    
    public static final Map<String, Object> LIZ(final m m) {
        CTM.LIZ((Object)m);
        return new 1H5(m);
    }
    
    public static final Object LIZIZ(final j j) {
        if (j instanceof l) {
            return null;
        }
        if (j instanceof m) {
            return LIZ((m)j);
        }
        if (j instanceof g) {
            return LIZ((g)j);
        }
        if (!(j instanceof p)) {
            final StringBuilder sb = new StringBuilder("Unknown JsonElement type: ");
            sb.append(j.getClass().getCanonicalName());
            throw new IllegalStateException(sb.toString());
        }
        final p p = (p)j;
        if (p.LIZ instanceof Number) {
            return ((j)p).LIZIZ();
        }
        if (p.LIZ instanceof String) {
            return ((j)p).LIZJ();
        }
        if (p.LIZ instanceof Boolean) {
            return ((j)p).LJIIJ();
        }
        final StringBuilder sb2 = new StringBuilder("Unknown JsonPrimitive type: ");
        sb2.append(p.getClass().getCanonicalName());
        throw new IllegalStateException(sb2.toString());
    }
}
