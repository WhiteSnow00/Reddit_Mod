// 
// Decompiled by Procyon v0.6.0
// 

package ya;

import android.os.BaseBundle;
import android.os.Bundle;
import bd.c0;
import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;
import com.google.android.exoplayer2.f;

public final class d implements f
{
    public static final d l;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public AudioAttributes k;
    
    static {
        final d.d$c d$c = new d.d$c();
        l = new d(d$c.a, d$c.b, d$c.c, d$c.d, d$c.e);
    }
    
    public d(final int f, final int g, final int h, final int i, final int j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public static String b(final int n) {
        return Integer.toString(n, 36);
    }
    
    public final AudioAttributes a() {
        if (this.k == null) {
            final AudioAttributes$Builder setUsage = new AudioAttributes$Builder().setContentType(this.f).setFlags(this.g).setUsage(this.h);
            final int a = c0.a;
            if (a >= 29) {
                d.d$a.a(setUsage, this.i);
            }
            if (a >= 32) {
                d.d$b.a(setUsage, this.j);
            }
            this.k = setUsage.build();
        }
        return this.k;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && d.class == o.getClass()) {
            final d d = (d)o;
            if (this.f != d.f || this.g != d.g || this.h != d.h || this.i != d.i || this.j != d.j) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((527 + this.f) * 31 + this.g) * 31 + this.h) * 31 + this.i) * 31 + this.j;
    }
    
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt(b(0), this.f);
        ((BaseBundle)bundle).putInt(b(1), this.g);
        ((BaseBundle)bundle).putInt(b(2), this.h);
        ((BaseBundle)bundle).putInt(b(3), this.i);
        ((BaseBundle)bundle).putInt(b(4), this.j);
        return bundle;
    }
}
