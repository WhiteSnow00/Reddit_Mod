// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import android.os.BaseBundle;
import java.util.Arrays;
import ia.c;
import bc.s;
import bd.b;
import android.os.Bundle;
import java.util.Collection;
import java.util.List;
import com.google.common.collect.ImmutableList;

public final class f0 implements f
{
    public static final f0 g;
    public final ImmutableList<a> f;
    
    static {
        g = new f0((List<a>)ImmutableList.of());
    }
    
    public f0(final List<a> list) {
        this.f = (ImmutableList<a>)ImmutableList.copyOf((Collection)list);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && f0.class == o.getClass() && this.f.equals((Object)((f0)o).f));
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Integer.toString(0, 36), b.d((Collection)this.f));
        return bundle;
    }
    
    public static final class a implements f
    {
        public final s f;
        public final int[] g;
        public final int h;
        public final boolean[] i;
        
        static {
            new c(5);
        }
        
        public a(final s f, final int[] array, final int h, final boolean[] array2) {
            final int f2 = f.f;
            ah0.b.C(f2 == array.length && f2 == array2.length);
            this.f = f;
            this.g = array.clone();
            this.h = h;
            this.i = array2.clone();
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
                if (this.h != a.h || !this.f.equals((Object)a.f) || !Arrays.equals(this.g, a.g) || !Arrays.equals(this.i, a.i)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return Arrays.hashCode(this.i) + ((Arrays.hashCode(this.g) + this.f.hashCode() * 31) * 31 + this.h) * 31;
        }
        
        public final Bundle toBundle() {
            final Bundle bundle = new Bundle();
            bundle.putBundle(a(0), this.f.toBundle());
            ((BaseBundle)bundle).putIntArray(a(1), this.g);
            ((BaseBundle)bundle).putInt(a(2), this.h);
            ((BaseBundle)bundle).putBooleanArray(a(3), this.i);
            return bundle;
        }
    }
}
