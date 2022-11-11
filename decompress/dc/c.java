// 
// Decompiled by Procyon v0.6.0
// 

package dc;

import java.util.List;
import java.io.IOException;
import cc.f;
import cc.l;
import cc.d;
import com.google.android.exoplayer2.upstream.a;
import ad.b0;
import com.google.android.exoplayer2.upstream.b;
import ec.i;
import ec.j;

public final class c
{
    public static b a(final j j, String a, final i i, final int k) {
        final b.a a2 = new b.a();
        a2.a = b0.d(a, i.c);
        a2.f = i.a;
        a2.g = i.b;
        a = j.a();
        String string;
        if (a != null) {
            string = a;
        }
        else {
            string = b0.d(((List<ec.b>)j.g).get(0).a, i.c).toString();
        }
        a2.h = string;
        a2.i = k;
        return a2.a();
    }
    
    public static void b(final a a, final j j, final d d, final i i) throws IOException {
        new l(a, a(j, ((List<ec.b>)j.g).get(0).a, i, 0), j.f, 0, null, (f)d).load();
    }
}
