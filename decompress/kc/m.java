// 
// Decompiled by Procyon v0.6.0
// 

package kc;

import com.google.common.collect.ImmutableList$a;
import java.util.HashMap;
import bd.c0;
import java.util.Map;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public final class m
{
    public final ImmutableMap<String, String> a;
    public final ImmutableList<kc.a> b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Uri g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    
    public m(final a a) {
        this.a = (ImmutableMap<String, String>)ImmutableMap.copyOf((Map)a.a);
        this.b = (ImmutableList<kc.a>)a.b.f();
        final String d = a.d;
        final int a2 = c0.a;
        this.c = d;
        this.d = a.e;
        this.e = a.f;
        this.g = a.g;
        this.h = a.h;
        this.f = a.c;
        this.i = a.i;
        this.j = a.k;
        this.k = a.l;
        this.l = a.j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && m.class == o.getClass()) {
            final m m = (m)o;
            if (this.f != m.f || !this.a.equals((Object)m.a) || !this.b.equals((Object)m.b) || !this.d.equals(m.d) || !this.c.equals(m.c) || !this.e.equals(m.e) || !c0.a(this.l, m.l) || !c0.a(this.g, m.g) || !c0.a(this.j, m.j) || !c0.a(this.k, m.k) || !c0.a(this.h, m.h) || !c0.a(this.i, m.i)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.e, ag0.a.f(this.c, ag0.a.f(this.d, (this.b.hashCode() + (this.a.hashCode() + 217) * 31) * 31, 31), 31), 31);
        final int f2 = this.f;
        final String l = this.l;
        int hashCode = 0;
        int hashCode2;
        if (l == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = l.hashCode();
        }
        final Uri g = this.g;
        int hashCode3;
        if (g == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = g.hashCode();
        }
        final String j = this.j;
        int hashCode4;
        if (j == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = j.hashCode();
        }
        final String k = this.k;
        int hashCode5;
        if (k == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = k.hashCode();
        }
        final String h = this.h;
        int hashCode6;
        if (h == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = h.hashCode();
        }
        final String i = this.i;
        if (i != null) {
            hashCode = i.hashCode();
        }
        return ((((((f + f2) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode;
    }
    
    public static final class a
    {
        public final HashMap<String, String> a;
        public final ImmutableList$a<kc.a> b;
        public int c;
        public String d;
        public String e;
        public String f;
        public Uri g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        
        public a() {
            this.a = new HashMap<String, String>();
            this.b = (ImmutableList$a<kc.a>)new ImmutableList$a();
            this.c = -1;
        }
        
        public final m a() {
            if (this.d != null && this.e != null && this.f != null) {
                return new m(this);
            }
            throw new IllegalStateException("One of more mandatory SDP fields are not set.");
        }
    }
}
