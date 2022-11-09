// 
// Decompiled by Procyon v0.6.0
// 

package nc;

import android.os.BaseBundle;
import android.os.Parcelable;
import java.io.Serializable;
import android.os.Bundle;
import java.util.Arrays;
import android.text.TextUtils;
import android.text.SpannedString;
import android.text.Spanned;
import bd.d0;
import android.graphics.Bitmap;
import android.text.Layout$Alignment;
import ak0.o;
import com.google.android.exoplayer2.f;

public final class a implements f
{
    public static final a w;
    public static final o x;
    public final CharSequence f;
    public final Layout$Alignment g;
    public final Layout$Alignment h;
    public final Bitmap i;
    public final float j;
    public final int k;
    public final int l;
    public final float m;
    public final int n;
    public final float o;
    public final float p;
    public final boolean q;
    public final int r;
    public final int s;
    public final float t;
    public final int u;
    public final float v;
    
    static {
        final a.a$a a$a = new a.a$a();
        a$a.a = "";
        w = a$a.a();
        x = new o(4);
    }
    
    public a(final CharSequence charSequence, final Layout$Alignment g, final Layout$Alignment h, final Bitmap i, final float j, final int k, final int l, final float m, final int n, final int s, final float t, final float o, final float p17, final boolean q, final int r, final int u, final float v) {
        if (charSequence == null) {
            i.getClass();
        }
        else {
            d0.c(i == null);
        }
        if (charSequence instanceof Spanned) {
            this.f = (CharSequence)SpannedString.valueOf(charSequence);
        }
        else if (charSequence != null) {
            this.f = charSequence.toString();
        }
        else {
            this.f = null;
        }
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p17;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
    }
    
    public static String a(final int n) {
        return Integer.toString(n, 36);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && a.class == o.getClass()) {
            final a a = (a)o;
            if (TextUtils.equals(this.f, a.f) && this.g == a.g && this.h == a.h) {
                final Bitmap i = this.i;
                if (i == null) {
                    if (a.i != null) {
                        return false;
                    }
                }
                else {
                    final Bitmap j = a.i;
                    if (j == null || !i.sameAs(j)) {
                        return false;
                    }
                }
                if (this.j == a.j && this.k == a.k && this.l == a.l && this.m == a.m && this.n == a.n && this.o == a.o && this.p == a.p && this.q == a.q && this.r == a.r && this.s == a.s && this.t == a.t && this.u == a.u && this.v == a.v) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v });
    }
    
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        bundle.putCharSequence(a(0), this.f);
        bundle.putSerializable(a(1), (Serializable)this.g);
        bundle.putSerializable(a(2), (Serializable)this.h);
        bundle.putParcelable(a(3), (Parcelable)this.i);
        bundle.putFloat(a(4), this.j);
        ((BaseBundle)bundle).putInt(a(5), this.k);
        ((BaseBundle)bundle).putInt(a(6), this.l);
        bundle.putFloat(a(7), this.m);
        ((BaseBundle)bundle).putInt(a(8), this.n);
        ((BaseBundle)bundle).putInt(a(9), this.s);
        bundle.putFloat(a(10), this.t);
        bundle.putFloat(a(11), this.o);
        bundle.putFloat(a(12), this.p);
        ((BaseBundle)bundle).putBoolean(a(14), this.q);
        ((BaseBundle)bundle).putInt(a(13), this.r);
        ((BaseBundle)bundle).putInt(a(15), this.u);
        bundle.putFloat(a(16), this.v);
        return bundle;
    }
}
