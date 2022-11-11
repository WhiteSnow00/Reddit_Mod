// 
// Decompiled by Procyon v0.6.0
// 

package jc;

import java.util.regex.Pattern;
import com.google.android.exoplayer2.source.rtsp.h;
import com.google.android.exoplayer2.ParserException;
import java.util.Map;
import ad.d0;
import java.util.HashMap;
import ad.c0;
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
        final int c = b.c(this.c, (b.c(this.a, 217, 31) + this.b) * 31, 31);
        final int d = this.d;
        final int e = this.e;
        final int hashCode = this.i.hashCode();
        final int hashCode2 = this.j.hashCode();
        final String f = this.f;
        int hashCode3 = 0;
        int hashCode4;
        if (f == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = f.hashCode();
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
        return (((hashCode2 + (hashCode + ((c + d) * 31 + e) * 31) * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode3;
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
        
        public final jc.a a() {
            try {
                d0.f(this.e.containsKey("rtpmap"));
                final String s = this.e.get("rtpmap");
                final int a = c0.a;
                return new jc.a(this, ImmutableMap.copyOf((Map)this.e), jc.a.b.a(s));
            }
            catch (final ParserException ex) {
                throw new IllegalStateException(ex);
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
        
        public static b a(String trim) throws ParserException {
            final int a = c0.a;
            final String[] split = trim.split(" ", 2);
            d0.c(split.length == 2);
            trim = split[0];
            final Pattern a2 = h.a;
            try {
                final int int1 = Integer.parseInt(trim);
                trim = split[1].trim();
                int int2 = -1;
                final String[] split2 = trim.split("/", -1);
                d0.c(split2.length >= 2);
                trim = split2[1];
                try {
                    final int int3 = Integer.parseInt(trim);
                    if (split2.length == 3) {
                        trim = split2[2];
                        try {
                            int2 = Integer.parseInt(trim);
                        }
                        catch (final NumberFormatException ex) {
                            throw ParserException.createForMalformedManifest(trim, ex);
                        }
                    }
                    return new b(split2[0], int1, int3, int2);
                }
                catch (final NumberFormatException ex2) {
                    throw ParserException.createForMalformedManifest(trim, ex2);
                }
            }
            catch (final NumberFormatException ex3) {
                throw ParserException.createForMalformedManifest(trim, ex3);
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
            return (b.c(this.b, (this.a + 217) * 31, 31) + this.c) * 31 + this.d;
        }
    }
}
