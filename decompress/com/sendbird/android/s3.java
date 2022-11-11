// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import lg.e0;
import fc2.i;
import fc2.g;

public final class s3
{
    public User a;
    public long b;
    public String c;
    public String d;
    
    public s3(final g g) {
        final i p = g.p();
        this.a = new User(p.L("user"));
        this.b = p.L("ts").x();
        String c;
        if (p.P("channel_url")) {
            c = p.L("channel_url").C();
        }
        else {
            c = "";
        }
        this.c = c;
        String d;
        if (p.P("channel_type")) {
            d = p.L("channel_type").C();
        }
        else {
            d = BaseChannel$ChannelType.GROUP.value();
        }
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b2;
        final boolean b = b2 = false;
        if (o != null) {
            if (o.getClass() != s3.class) {
                b2 = b;
            }
            else {
                final s3 s3 = (s3)o;
                b2 = b;
                if (this.c.equals(s3.c)) {
                    b2 = b;
                    if (this.b == s3.b) {
                        b2 = b;
                        if (this.a.equals((Object)s3.a)) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return e0.J(new Object[] { this.c, this.b, this.a });
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ReadStatus{mReader=");
        r.append(this.a);
        r.append(", mTimestamp=");
        r.append(this.b);
        r.append(", mChannelUrl='");
        a.z(r, this.c, '\'', ", mChannelType='");
        return android.support.v4.media.a.k(r, this.d, '\'', '}');
    }
}
