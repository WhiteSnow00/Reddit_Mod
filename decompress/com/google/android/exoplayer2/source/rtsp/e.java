// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.ImmutableMultimap;
import java.util.AbstractCollection;
import ad.c0;
import java.util.List;
import com.google.common.collect.ImmutableListMultimap$a;
import com.google.common.collect.ImmutableList;
import lg.e0;
import lw0.b;
import com.google.common.collect.ImmutableListMultimap;

public final class e
{
    public final ImmutableListMultimap<String, String> a;
    
    static {
        new e(new a());
    }
    
    public e(final a a) {
        this.a = (ImmutableListMultimap<String, String>)a.a.d();
    }
    
    public static String a(final String s) {
        if (b.p0((CharSequence)s, "Accept")) {
            return "Accept";
        }
        if (b.p0((CharSequence)s, "Allow")) {
            return "Allow";
        }
        if (b.p0((CharSequence)s, "Authorization")) {
            return "Authorization";
        }
        if (b.p0((CharSequence)s, "Bandwidth")) {
            return "Bandwidth";
        }
        if (b.p0((CharSequence)s, "Blocksize")) {
            return "Blocksize";
        }
        if (b.p0((CharSequence)s, "Cache-Control")) {
            return "Cache-Control";
        }
        if (b.p0((CharSequence)s, "Connection")) {
            return "Connection";
        }
        if (b.p0((CharSequence)s, "Content-Base")) {
            return "Content-Base";
        }
        if (b.p0((CharSequence)s, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (b.p0((CharSequence)s, "Content-Language")) {
            return "Content-Language";
        }
        if (b.p0((CharSequence)s, "Content-Length")) {
            return "Content-Length";
        }
        if (b.p0((CharSequence)s, "Content-Location")) {
            return "Content-Location";
        }
        if (b.p0((CharSequence)s, "Content-Type")) {
            return "Content-Type";
        }
        if (b.p0((CharSequence)s, "CSeq")) {
            return "CSeq";
        }
        if (b.p0((CharSequence)s, "Date")) {
            return "Date";
        }
        if (b.p0((CharSequence)s, "Expires")) {
            return "Expires";
        }
        if (b.p0((CharSequence)s, "Location")) {
            return "Location";
        }
        if (b.p0((CharSequence)s, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (b.p0((CharSequence)s, "Proxy-Require")) {
            return "Proxy-Require";
        }
        if (b.p0((CharSequence)s, "Public")) {
            return "Public";
        }
        if (b.p0((CharSequence)s, "Range")) {
            return "Range";
        }
        if (b.p0((CharSequence)s, "RTP-Info")) {
            return "RTP-Info";
        }
        if (b.p0((CharSequence)s, "RTCP-Interval")) {
            return "RTCP-Interval";
        }
        if (b.p0((CharSequence)s, "Scale")) {
            return "Scale";
        }
        if (b.p0((CharSequence)s, "Session")) {
            return "Session";
        }
        if (b.p0((CharSequence)s, "Speed")) {
            return "Speed";
        }
        if (b.p0((CharSequence)s, "Supported")) {
            return "Supported";
        }
        if (b.p0((CharSequence)s, "Timestamp")) {
            return "Timestamp";
        }
        if (b.p0((CharSequence)s, "Transport")) {
            return "Transport";
        }
        if (b.p0((CharSequence)s, "User-Agent")) {
            return "User-Agent";
        }
        if (b.p0((CharSequence)s, "Via")) {
            return "Via";
        }
        String s2 = s;
        if (b.p0((CharSequence)s, "WWW-Authenticate")) {
            s2 = "WWW-Authenticate";
        }
        return s2;
    }
    
    public final String b(final String s) {
        final ImmutableList value = this.a.get((Object)a(s));
        if (((AbstractCollection)value).isEmpty()) {
            return null;
        }
        return (String)e0.Q((Iterable)value);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof e && ((ImmutableMultimap)this.a).equals((Object)((e)o).a));
    }
    
    @Override
    public final int hashCode() {
        return ((ImmutableMultimap)this.a).hashCode();
    }
    
    public static final class a
    {
        public final ImmutableListMultimap$a<String, String> a;
        
        public a() {
            this.a = (ImmutableListMultimap$a<String, String>)new ImmutableListMultimap$a();
        }
        
        public a(final String s, final String s2, final int n) {
            this();
            this.a("User-Agent", s);
            this.a("CSeq", String.valueOf(n));
            if (s2 != null) {
                this.a("Session", s2);
            }
        }
        
        public final void a(final String s, final String s2) {
            this.a.e((Object)e.a(s.trim()), (Object)s2.trim());
        }
        
        public final void b(final List list) {
            for (int i = 0; i < list.size(); ++i) {
                final String s = list.get(i);
                final int a = c0.a;
                final String[] split = s.split(":\\s?", 2);
                if (split.length == 2) {
                    this.a(split[0], split[1]);
                }
            }
        }
    }
}
