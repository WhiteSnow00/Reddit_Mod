// 
// Decompiled by Procyon v0.6.0
// 

package bc;

import android.os.BaseBundle;
import java.util.Collection;
import ad.d0;
import ha.c;
import java.util.ArrayList;
import android.os.Bundle;
import ad.c0;
import java.util.Arrays;
import android.net.Uri;
import ja.k;
import com.google.android.exoplayer2.f;

public final class a implements f
{
    public static final a l;
    public static final a m;
    public static final k n;
    public final Object f;
    public final int g;
    public final long h;
    public final long i;
    public final int j;
    public final a[] k;
    
    static {
        l = new a(null, new a[0], 0L, -9223372036854775807L, 0);
        final a a = new a(0L, -1, new int[0], new Uri[0], new long[0], 0L, false);
        final int[] i = a.i;
        final int length = i.length;
        final int max = Math.max(0, length);
        final int[] copy = Arrays.copyOf(i, max);
        Arrays.fill(copy, length, max, 0);
        final long[] j = a.j;
        final int length2 = j.length;
        final int max2 = Math.max(0, length2);
        final long[] copy2 = Arrays.copyOf(j, max2);
        Arrays.fill(copy2, length2, max2, -9223372036854775807L);
        m = new a(a.f, 0, copy, Arrays.copyOf(a.h, 0), copy2, a.k, a.l);
        n = new k(9);
    }
    
    public a(final Object f, final a[] k, final long h, final long i, final int j) {
        this.f = f;
        this.h = h;
        this.i = i;
        this.g = k.length + j;
        this.k = k;
        this.j = j;
    }
    
    public static String b(final int n) {
        return Integer.toString(n, 36);
    }
    
    public final a a(final int n) {
        final int j = this.j;
        a m;
        if (n < j) {
            m = a.m;
        }
        else {
            m = this.k[n - j];
        }
        return m;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && a.class == o.getClass()) {
            final a a = (a)o;
            if (!c0.a(this.f, a.f) || this.g != a.g || this.h != a.h || this.i != a.i || this.j != a.j || !Arrays.equals(this.k, a.k)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int g = this.g;
        final Object f = this.f;
        int hashCode;
        if (f == null) {
            hashCode = 0;
        }
        else {
            hashCode = f.hashCode();
        }
        return ((((g * 31 + hashCode) * 31 + (int)this.h) * 31 + (int)this.i) * 31 + this.j) * 31 + Arrays.hashCode(this.k);
    }
    
    @Override
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        final ArrayList list = new ArrayList();
        final a[] k = this.k;
        for (int length = k.length, i = 0; i < length; ++i) {
            list.add(k[i].toBundle());
        }
        bundle.putParcelableArrayList(b(1), list);
        ((BaseBundle)bundle).putLong(b(2), this.h);
        ((BaseBundle)bundle).putLong(b(3), this.i);
        ((BaseBundle)bundle).putInt(b(4), this.j);
        return bundle;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("AdPlaybackState(adsId=");
        r.append(this.f);
        r.append(", adResumePositionUs=");
        r.append(this.h);
        r.append(", adGroups=[");
        for (int i = 0; i < this.k.length; ++i) {
            r.append("adGroup(timeUs=");
            r.append(this.k[i].f);
            r.append(", ads=[");
            for (int j = 0; j < this.k[i].i.length; ++j) {
                r.append("ad(state=");
                final int n = this.k[i].i[j];
                if (n != 0) {
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                if (n != 4) {
                                    r.append('?');
                                }
                                else {
                                    r.append('!');
                                }
                            }
                            else {
                                r.append('P');
                            }
                        }
                        else {
                            r.append('S');
                        }
                    }
                    else {
                        r.append('R');
                    }
                }
                else {
                    r.append('_');
                }
                r.append(", durationUs=");
                r.append(this.k[i].j[j]);
                r.append(')');
                if (j < this.k[i].i.length - 1) {
                    r.append(", ");
                }
            }
            r.append("])");
            if (i < this.k.length - 1) {
                r.append(", ");
            }
        }
        r.append("])");
        return r.toString();
    }
    
    public static final class a implements f
    {
        public static final c m;
        public final long f;
        public final int g;
        public final Uri[] h;
        public final int[] i;
        public final long[] j;
        public final long k;
        public final boolean l;
        
        static {
            m = new c(8);
        }
        
        public a(final long f, final int g, final int[] i, final Uri[] h, final long[] j, final long k, final boolean l) {
            d0.c(i.length == h.length);
            this.f = f;
            this.g = g;
            this.i = i;
            this.h = h;
            this.j = j;
            this.k = k;
            this.l = l;
        }
        
        public static String b(final int n) {
            return Integer.toString(n, 36);
        }
        
        public final int a(int n) {
            ++n;
            while (true) {
                final int[] i = this.i;
                if (n >= i.length || this.l) {
                    break;
                }
                final int n2 = i[n];
                if (n2 == 0) {
                    break;
                }
                if (n2 == 1) {
                    break;
                }
                ++n;
            }
            return n;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && a.class == o.getClass()) {
                final a a = (a)o;
                if (this.f != a.f || this.g != a.g || !Arrays.equals(this.h, a.h) || !Arrays.equals(this.i, a.i) || !Arrays.equals(this.j, a.j) || this.k != a.k || this.l != a.l) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            final int g = this.g;
            final long f = this.f;
            final int n = (int)(f ^ f >>> 32);
            final int hashCode = Arrays.hashCode(this.h);
            final int hashCode2 = Arrays.hashCode(this.i);
            final int hashCode3 = Arrays.hashCode(this.j);
            final long k = this.k;
            return ((hashCode3 + (hashCode2 + ((g * 31 + n) * 31 + hashCode) * 31) * 31) * 31 + (int)(k ^ k >>> 32)) * 31 + (this.l ? 1 : 0);
        }
        
        @Override
        public final Bundle toBundle() {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putLong(b(0), this.f);
            ((BaseBundle)bundle).putInt(b(1), this.g);
            bundle.putParcelableArrayList(b(2), new ArrayList((Collection<? extends E>)Arrays.asList(this.h)));
            ((BaseBundle)bundle).putIntArray(b(3), this.i);
            ((BaseBundle)bundle).putLongArray(b(4), this.j);
            ((BaseBundle)bundle).putLong(b(5), this.k);
            ((BaseBundle)bundle).putBoolean(b(6), this.l);
            return bundle;
        }
    }
}
