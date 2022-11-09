// 
// Decompiled by Procyon v0.6.0
// 

package kc;

import java.util.regex.Pattern;
import com.google.android.exoplayer2.source.rtsp.h;
import com.google.android.exoplayer2.ParserException;
import java.util.Map;
import bd.d0;
import java.util.HashMap;
import bd.c0;
import com.google.common.collect.ImmutableMap;

public final class a
{
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final ImmutableMap<String, String> i;
    public final b j;
    
    public a() {
        throw null;
    }
    
    public a(final a a, final ImmutableMap i, final b j) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.f = a.g;
        this.g = a.h;
        this.e = a.f;
        this.h = a.i;
        this.i = (ImmutableMap<String, String>)i;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && a.class == o.getClass()) {
            final a a = (a)o;
            if (!this.a.equals(a.a) || this.b != a.b || !this.c.equals(a.c) || this.d != a.d || this.e != a.e || !this.i.equals((Object)a.i) || !this.j.equals(a.j) || !c0.a(this.f, a.f) || !c0.a(this.g, a.g) || !c0.a(this.h, a.h)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.c, (ag0.a.f(this.a, 217, 31) + this.b) * 31, 31);
        final int d = this.d;
        final int e = this.e;
        final int hashCode = this.i.hashCode();
        final int hashCode2 = this.j.hashCode();
        final String f2 = this.f;
        int hashCode3 = 0;
        int hashCode4;
        if (f2 == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = f2.hashCode();
        }
        final String g = this.g;
        int hashCode5;
        if (g == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = g.hashCode();
        }
        final String h = this.h;
        if (h != null) {
            hashCode3 = h.hashCode();
        }
        return (((hashCode2 + (hashCode + ((f + d) * 31 + e) * 31) * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode3;
    }
    
    public static final class a
    {
        public final String a;
        public final int b;
        public final String c;
        public final int d;
        public final HashMap<String, String> e;
        public int f;
        public String g;
        public String h;
        public String i;
        
        public a(final String a, final int b, final String c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = new HashMap<String, String>();
            this.f = -1;
        }
        
        public final kc.a a() {
            try {
                d0.f(this.e.containsKey("rtpmap"));
                final String s = this.e.get("rtpmap");
                final int a = c0.a;
                return new kc.a(this, ImmutableMap.copyOf((Map)this.e), kc.a.b.a(s));
            }
            catch (final ParserException ex) {
                throw new IllegalStateException((Throwable)ex);
            }
        }
    }
    
    public static final class b
    {
        public final int a;
        public final String b;
        public final int c;
        public final int d;
        
        public b(final String b, final int a, final int c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public static b a(String o) throws ParserException {
            final int a = c0.a;
            final String[] split = ((String)o).split(" ", 2);
            d0.c(split.length == 2);
            o = split[0];
            final Pattern a2 = h.a;
            try {
                final int int1 = Integer.parseInt((String)o);
                o = split[1].trim();
                int int2 = -1;
                o = ((String)o).split("/", -1);
                d0.c(o.length >= 2);
                String s = o[1];
                try {
                    final int int3 = Integer.parseInt(s);
                    if (o.length == 3) {
                        s = o[2];
                        try {
                            int2 = Integer.parseInt(s);
                        }
                        catch (final NumberFormatException ex) {
                            throw ParserException.createForMalformedManifest(s, (Throwable)ex);
                        }
                    }
                    return new b(o[0], int1, int3, int2);
                }
                catch (final NumberFormatException o) {
                    throw ParserException.createForMalformedManifest(s, (Throwable)o);
                }
            }
            catch (final NumberFormatException ex2) {
                throw ParserException.createForMalformedManifest((String)o, (Throwable)ex2);
            }
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && b.class == o.getClass()) {
                final b b2 = (b)o;
                if (this.a != b2.a || !this.b.equals(b2.b) || this.c != b2.c || this.d != b2.d) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return (ag0.a.f(this.b, (this.a + 217) * 31, 31) + this.c) * 31 + this.d;
        }
    }
}
