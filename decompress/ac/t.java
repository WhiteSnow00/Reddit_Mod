// 
// Decompiled by Procyon v0.6.0
// 

package ac;

import android.os.BaseBundle;
import java.util.ArrayList;
import java.util.Collection;
import com.google.common.collect.Lists;
import android.os.Bundle;
import java.util.Arrays;
import lg.e0;
import aw.b;
import a81.e;
import ad.d0;
import com.google.android.exoplayer2.n;
import nw.p;
import com.google.android.exoplayer2.f;

public final class t implements f
{
    public static final p j;
    public final int f;
    public final String g;
    public final n[] h;
    public int i;
    
    static {
        j = new p(6);
    }
    
    public t() {
        throw null;
    }
    
    public t(String g, n... h) {
        final int length = h.length;
        int n = 1;
        d0.c(length > 0);
        this.g = g;
        this.h = h;
        this.f = h.length;
        final String h2 = h[0].h;
        Label_0073: {
            if (h2 != null) {
                g = h2;
                if (!h2.equals("und")) {
                    break Label_0073;
                }
            }
            g = "";
        }
        final int j = h[0].j;
        while (true) {
            h = this.h;
            if (n >= h.length) {
                break;
            }
            final String h3 = h[n].h;
            String s = null;
            Label_0122: {
                if (h3 != null) {
                    s = h3;
                    if (!h3.equals("und")) {
                        break Label_0122;
                    }
                }
                s = "";
            }
            if (!g.equals(s)) {
                final n[] h4 = this.h;
                b(n, "languages", h4[0].h, h4[n].h);
                break;
            }
            h = this.h;
            if ((j | 0x4000) != (h[n].j | 0x4000)) {
                b(n, "role flags", Integer.toBinaryString(h[0].j), Integer.toBinaryString(this.h[n].j));
                break;
            }
            ++n;
        }
    }
    
    public static void b(final int n, final String s, final String s2, final String s3) {
        final StringBuilder k = b.k(e.h(s3, e.h(s2, s.length() + 78)), "Different ", s, " combined in one TrackGroup: '", s2);
        k.append("' (track 0) and '");
        k.append(s3);
        k.append("' (track ");
        k.append(n);
        k.append(")");
        e0.I("TrackGroup", "", (Throwable)new IllegalStateException(k.toString()));
    }
    
    public final int a(final n n) {
        int n2 = 0;
        while (true) {
            final n[] h = this.h;
            if (n2 >= h.length) {
                return -1;
            }
            if (n == h[n2]) {
                return n2;
            }
            ++n2;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && t.class == o.getClass()) {
            final t t = (t)o;
            if (this.f != t.f || !this.g.equals(t.g) || !Arrays.equals(this.h, t.h)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.i == 0) {
            this.i = b.c(this.g, 527, 31) + Arrays.hashCode(this.h);
        }
        return this.i;
    }
    
    @Override
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Integer.toString(0, 36), (ArrayList)ad.b.d((Collection<f>)Lists.b((Object[])this.h)));
        ((BaseBundle)bundle).putString(Integer.toString(1, 36), this.g);
        return bundle;
    }
}
