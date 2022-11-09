// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import u5.w;
import pg.m;
import android.content.Context;
import com.google.android.play.core.splitinstall.zzo;
import ng.h0;
import ng.g;
import mj2.c0;
import u2.j;
import u2.k;
import an2.c;
import android.os.Bundle;
import java.util.concurrent.locks.Lock;
import od.b;
import re.a3;
import re.b4;
import re.h4;
import java.util.List;
import java.util.Iterator;
import le2.a;
import android.util.Base64;
import ah2.f;
import android.os.Parcel;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import ig.m0;
import pg.l;
import qd.c1;
import com.google.android.exoplayer2.source.q;

public final class d1 implements q, c1, l, m0
{
    public final Object f;
    
    public d1(final int n) {
        if (n == 7) {
            this.f = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>());
            return;
        }
        if (n == 8) {
            this.f = new ConcurrentHashMap();
            return;
        }
        if (n != 9) {
            this.f = new ArrayList();
            return;
        }
        this.f = new ByteArrayOutputStream();
    }
    
    public static d1 r() {
        return new d1(9);
    }
    
    public final void A(final a a) {
        for (final Map.Entry<zg2.l, V> entry : ((Map)this.f).entrySet()) {
            final zg2.l l = entry.getKey();
            if (((zg2.l)entry.getValue()).invoke((Object)a)) {
                l.invoke((Object)a);
            }
        }
    }
    
    public final void B(final int n) {
        ((ByteArrayOutputStream)this.f).write((byte)(n >>> 24));
        ((ByteArrayOutputStream)this.f).write((byte)(n >>> 16));
        ((ByteArrayOutputStream)this.f).write((byte)(n >>> 8));
        ((ByteArrayOutputStream)this.f).write((byte)n);
    }
    
    public final void C(int size, final String s, final List list, final boolean b, final boolean b2) {
        a3 a3;
        if (--size != 0) {
            if (size != 1) {
                if (size != 3) {
                    if (size != 4) {
                        a3 = ((h4)((w)this.f).f).f().q;
                    }
                    else if (b) {
                        a3 = ((h4)((w)this.f).f).f().o;
                    }
                    else if (!b2) {
                        a3 = ((h4)((w)this.f).f).f().p;
                    }
                    else {
                        a3 = ((h4)((w)this.f).f).f().n;
                    }
                }
                else {
                    a3 = ((h4)((w)this.f).f).f().s;
                }
            }
            else if (b) {
                a3 = ((h4)((w)this.f).f).f().l;
            }
            else if (!b2) {
                a3 = ((h4)((w)this.f).f).f().m;
            }
            else {
                a3 = ((h4)((w)this.f).f).f().k;
            }
        }
        else {
            a3 = ((h4)((w)this.f).f).f().r;
        }
        size = list.size();
        if (size == 1) {
            a3.b(list.get(0), s);
            return;
        }
        if (size == 2) {
            a3.c(list.get(0), s, list.get(1));
            return;
        }
        if (size != 3) {
            a3.a(s);
            return;
        }
        a3.d(list.get(0), s, list.get(1), list.get(2));
    }
    
    public final boolean a() {
        final q[] array = (q[])this.f;
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i].a()) {
                return true;
            }
        }
        return false;
    }
    
    public final byte[] b() {
        return ((ByteArrayOutputStream)this.f).toByteArray();
    }
    
    public final boolean c(final long n) {
        boolean b = false;
        boolean b2;
        boolean b5;
        do {
            final long f = this.f();
            if (f == Long.MIN_VALUE) {
                return b;
            }
            final q[] array = (q[])this.f;
            boolean b4;
            for (int length = array.length, i = (b2 = false) ? 1 : 0; i < length; ++i, b2 = b4) {
                final q q = array[i];
                final long f2 = q.f();
                final boolean b3 = f2 != Long.MIN_VALUE && f2 <= n;
                if (f2 != f) {
                    b4 = b2;
                    if (!b3) {
                        continue;
                    }
                }
                b4 = (b2 | q.c(n));
            }
            b5 = (b |= b2);
        } while (b2);
        b = b5;
        return b;
    }
    
    public final long d() {
        final q[] array = (q[])this.f;
        final int length = array.length;
        int i = 0;
        long n = Long.MAX_VALUE;
        while (i < length) {
            final long d = array[i].d();
            long min = n;
            if (d != Long.MIN_VALUE) {
                min = Math.min(n, d);
            }
            ++i;
            n = min;
        }
        long n2 = n;
        if (n == Long.MAX_VALUE) {
            n2 = Long.MIN_VALUE;
        }
        return n2;
    }
    
    public final void e(final long n) {
        final q[] array = (q[])this.f;
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].e(n);
        }
    }
    
    public final long f() {
        final q[] array = (q[])this.f;
        final int length = array.length;
        int i = 0;
        long n = Long.MAX_VALUE;
        while (i < length) {
            final long f = array[i].f();
            long min = n;
            if (f != Long.MIN_VALUE) {
                min = Math.min(n, f);
            }
            ++i;
            n = min;
        }
        long n2 = n;
        if (n == Long.MAX_VALUE) {
            n2 = Long.MIN_VALUE;
        }
        return n2;
    }
    
    public final void j(final b j) {
        ((qd.q)this.f).m.lock();
        try {
            final Object f = this.f;
            ((qd.q)f).j = j;
            qd.q.k((qd.q)f);
        }
        finally {
            ((qd.q)this.f).m.unlock();
        }
    }
    
    public final void k(final int n, final boolean b) {
        ((qd.q)this.f).m.lock();
        try {
            final qd.q q = (qd.q)this.f;
            while (true) {
                Label_0091: {
                    if (q.l) {
                        break Label_0091;
                    }
                    final b k = q.k;
                    if (k == null) {
                        break Label_0091;
                    }
                    if (!k.j()) {
                        break Label_0091;
                    }
                    final Object f = this.f;
                    ((qd.q)f).l = true;
                    ((qd.q)f).e.k(n);
                    final Lock lock = ((qd.q)this.f).m;
                    lock.unlock();
                    return;
                }
                final Object f2 = this.f;
                ((qd.q)f2).l = false;
                qd.q.j((qd.q)f2, n, b);
                final Lock lock = ((qd.q)this.f).m;
                continue;
            }
        }
        finally {
            ((qd.q)this.f).m.unlock();
        }
    }
    
    public final void m(final Bundle i) {
        ((qd.q)this.f).m.lock();
        try {
            final qd.q q = (qd.q)this.f;
            final Bundle j = q.i;
            if (j == null) {
                q.i = i;
            }
            else if (i != null) {
                j.putAll(i);
            }
            final Object f = this.f;
            ((qd.q)f).j = b.j;
            qd.q.k((qd.q)f);
        }
        finally {
            ((qd.q)this.f).m.unlock();
        }
    }
    
    public final void n(final c c) {
        try {
            ((ByteArrayOutputStream)this.f).write(c.getEncoded());
        }
        catch (final Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
    
    public final void p(final byte[] array) {
        try {
            ((ByteArrayOutputStream)this.f).write(array);
        }
        catch (final Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
    
    public final int s() {
        return ((Parcel)this.f).dataAvail();
    }
    
    public final float v() {
        return ((Parcel)this.f).readFloat();
    }
    
    public final long w() {
        final byte byte1 = ((Parcel)this.f).readByte();
        long n;
        if (byte1 == 1) {
            n = 4294967296L;
        }
        else if (byte1 == 2) {
            n = 8589934592L;
        }
        else {
            n = 0L;
        }
        if (k.a(n, 0L)) {
            return j.c;
        }
        return c0.O(this.v(), n);
    }
    
    public final void x(final int n) {
        while (((ByteArrayOutputStream)this.f).size() < n) {
            ((ByteArrayOutputStream)this.f).write(0);
        }
    }
    
    public final Object y() {
        final Object f = this.f;
        return ((ArrayList<Object>)f).remove(((ArrayList<Object>)f).size() - 1);
    }
    
    public final void z(final Object o) {
        ((ArrayList)this.f).add(o);
    }
    
    public final Object zza() {
        final Context a = ((g)this.f).a;
        synchronized (h0.class) {
            if (h0.j == null) {
                h0.j = new h0(a, zzo.zza);
            }
            final h0 j = h0.j;
            monitorexit(h0.class);
            aj2.c.e1((Object)j);
            return j;
        }
    }
    
    public final void zza() {
        final m m = (m)this.f;
        for (int i = 0; i < m.a.getAttributeCount(); ++i) {
            if ("defaultErrorCode".equals(m.a.getAttributeName(i))) {
                m.b.a = og.a.a(m.a.getAttributeValue(i));
            }
        }
        m.a("split-install-error", new c1.c(m));
    }
}
