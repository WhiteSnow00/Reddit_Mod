// 
// Decompiled by Procyon v0.6.0
// 

package bc;

import android.os.BaseBundle;
import java.util.ArrayList;
import java.util.Collection;
import com.google.common.collect.Lists;
import android.os.Bundle;
import ag0.a;
import java.util.Arrays;
import wi.b;
import ak0.m;
import bd.d0;
import sa.n;
import com.google.android.exoplayer2.f;

public final class t implements f
{
    public static final n j;
    public final int f;
    public final String g;
    public final com.google.android.exoplayer2.n[] h;
    public int i;
    
    static {
        j = new n(6);
    }
    
    public t() {
        throw null;
    }
    
    public t(String g, com.google.android.exoplayer2.n... h) {
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
                final com.google.android.exoplayer2.n[] h4 = this.h;
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
        final StringBuilder q = m.q(ak0.n.f(s3, ak0.n.f(s2, s.length() + 78)), "Different ", s, " combined in one TrackGroup: '", s2);
        q.append("' (track 0) and '");
        q.append(s3);
        q.append("' (track ");
        q.append(n);
        q.append(")");
        b.C("TrackGroup", "", (Throwable)new IllegalStateException(q.toString()));
    }
    
    public final int a(final com.google.android.exoplayer2.n n) {
        int n2 = 0;
        while (true) {
            final com.google.android.exoplayer2.n[] h = this.h;
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
            this.i = a.f(this.g, 527, 31) + Arrays.hashCode(this.h);
        }
        return this.i;
    }
    
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Integer.toString(0, 36), (ArrayList)bd.b.d((Collection<f>)Lists.b((Object[])this.h)));
        ((BaseBundle)bundle).putString(Integer.toString(1, 36), this.g);
        return bundle;
    }
}
