// 
// Decompiled by Procyon v0.6.0
// 

package oc;

import ab.a;
import ab.f$a;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import nc.f;
import bd.c0;
import nc.i;
import com.google.android.exoplayer2.decoder.DecoderException;
import bd.d0;
import sa.o;
import java.util.PriorityQueue;
import nc.j;
import java.util.ArrayDeque;
import nc.g;

public abstract class c implements g
{
    public final ArrayDeque<a> a;
    public final ArrayDeque<j> b;
    public final PriorityQueue<a> c;
    public a d;
    public long e;
    public long f;
    
    public c() {
        this.a = new ArrayDeque<a>();
        final int n = 0;
        for (int i = 0; i < 10; ++i) {
            this.a.add(new a());
        }
        this.b = new ArrayDeque<j>();
        for (int j = n; j < 2; ++j) {
            this.b.add(new b(new o((Object)this, 4)));
        }
        this.c = new PriorityQueue<a>();
    }
    
    public final Object a() throws DecoderException {
        d0.f(this.d == null);
        a d;
        if (this.a.isEmpty()) {
            d = null;
        }
        else {
            d = this.a.pollFirst();
            this.d = d;
        }
        return d;
    }
    
    @Override
    public final void b(final long e) {
        this.e = e;
    }
    
    public final void d(final i i) throws DecoderException {
        d0.c(i == this.d);
        final a a = (a)i;
        if (((ab.a)a).o()) {
            a.p();
            this.a.add(a);
        }
        else {
            final long f = this.f;
            this.f = 1L + f;
            a.o = f;
            this.c.add(a);
        }
        this.d = null;
    }
    
    public abstract d e();
    
    public abstract void f(final a p0);
    
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            final a a = this.c.poll();
            final int a2 = c0.a;
            a.p();
            this.a.add(a);
        }
        final a d = this.d;
        if (d != null) {
            d.p();
            this.a.add(d);
            this.d = null;
        }
    }
    
    public j g() throws SubtitleDecoderException {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty()) {
            final a a = this.c.peek();
            final int a2 = c0.a;
            if (a.j > this.e) {
                break;
            }
            final a a3 = this.c.poll();
            if (((ab.a)a3).n(4)) {
                final j j = this.b.pollFirst();
                ((ab.a)j).k(4);
                a3.p();
                this.a.add(a3);
                return j;
            }
            this.f(a3);
            if (this.h()) {
                final d e = this.e();
                final j i = this.b.pollFirst();
                i.t(a3.j, (f)e, Long.MAX_VALUE);
                a3.p();
                this.a.add(a3);
                return i;
            }
            a3.p();
            this.a.add(a3);
        }
        return null;
    }
    
    public abstract boolean h();
    
    public void release() {
    }
    
    public static final class a extends i implements Comparable<a>
    {
        public long o;
        
        @Override
        public final int compareTo(final Object o) {
            final a a = (a)o;
            final boolean n = ((ab.a)this).n(4);
            final boolean n2 = ((ab.a)a).n(4);
            int n3 = 1;
            if (n != n2) {
                if (((ab.a)this).n(4)) {
                    return n3;
                }
            }
            else {
                long n4;
                if ((n4 = super.j - a.j) == 0L && (n4 = this.o - a.o) == 0L) {
                    n3 = 0;
                    return n3;
                }
                if (n4 > 0L) {
                    return n3;
                }
            }
            n3 = -1;
            return n3;
        }
    }
    
    public static final class b extends j
    {
        public f$a<b> j;
        
        public b(final o j) {
            this.j = (f$a<b>)j;
        }
        
        public final void p() {
            final c c = (c)((o)this.j).g;
            c.getClass();
            ((ab.a)this).f = 0;
            super.h = null;
            c.b.add(this);
        }
    }
}
