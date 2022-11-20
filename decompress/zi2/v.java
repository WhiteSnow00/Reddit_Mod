// 
// Decompiled by Procyon v0.6.0
// 

package zi2;

import b5.k;
import ng2.e;
import java.util.concurrent.CancellationException;
import mg2.l;

public final class v
{
    public final Object a;
    public final j b;
    public final l<Throwable, cg2.j> c;
    public final Object d;
    public final Throwable e;
    
    public v(final Object a, final j b, final l<? super Throwable, cg2.j> c, final Object d, final Throwable e) {
        this.a = a;
        this.b = b;
        this.c = (l<Throwable, cg2.j>)c;
        this.d = d;
        this.e = e;
    }
    
    public v(final Object o, j j, l l, Object o2, CancellationException ex, final int n) {
        if ((n & 0x2) != 0x0) {
            j = null;
        }
        if ((n & 0x4) != 0x0) {
            l = null;
        }
        if ((n & 0x8) != 0x0) {
            o2 = null;
        }
        if ((n & 0x10) != 0x0) {
            ex = null;
        }
        this(o, j, (l<? super Throwable, cg2.j>)l, o2, ex);
    }
    
    public static v a(final v v, j b, CancellationException e, final int n) {
        Object d = null;
        Object a;
        if ((n & 0x1) != 0x0) {
            a = v.a;
        }
        else {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = v.b;
        }
        l<? super Throwable, cg2.j> c;
        if ((n & 0x4) != 0x0) {
            c = v.c;
        }
        else {
            c = null;
        }
        if ((n & 0x8) != 0x0) {
            d = v.d;
        }
        if ((n & 0x10) != 0x0) {
            e = (CancellationException)v.e;
        }
        v.getClass();
        return new v(a, b, c, d, e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof v)) {
            return false;
        }
        final v v = (v)o;
        return ng2.e.a(this.a, v.a) && ng2.e.a((Object)this.b, (Object)v.b) && ng2.e.a((Object)this.c, (Object)v.c) && ng2.e.a(this.d, v.d) && ng2.e.a((Object)this.e, (Object)v.e);
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final j b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final l<Throwable, cg2.j> c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Object d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Throwable e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("CompletedContinuation(result=");
        t.append(this.a);
        t.append(", cancelHandler=");
        t.append(this.b);
        t.append(", onCancellation=");
        t.append(this.c);
        t.append(", idempotentResume=");
        t.append(this.d);
        t.append(", cancelCause=");
        return k.m(t, this.e, ')');
    }
}
