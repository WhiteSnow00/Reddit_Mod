// 
// Decompiled by Procyon v0.6.0
// 

package nc;

import java.util.List;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import com.google.common.collect.ImmutableList;
import com.google.android.exoplayer2.f$a;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.exoplayer2.decoder.DecoderException;
import bd.d0;
import java.util.ArrayDeque;

public final class c implements g
{
    public final nc.b a;
    public final i b;
    public final ArrayDeque c;
    public int d;
    public boolean e;
    
    public c() {
        this.a = new nc.b();
        this.b = new i();
        this.c = new ArrayDeque();
        for (int i = 0; i < 2; ++i) {
            this.c.addFirst(new j() {
                public final void p() {
                    final c j = nc.c.this;
                    d0.f(j.c.size() < 2);
                    d0.c(j.c.contains(this) ^ true);
                    ((ab.a)this).f = 0;
                    super.h = null;
                    j.c.addFirst(this);
                }
            });
        }
        this.d = 0;
    }
    
    public final Object a() throws DecoderException {
        d0.f(this.e ^ true);
        Object b;
        if (this.d != 0) {
            b = null;
        }
        else {
            this.d = 1;
            b = this.b;
        }
        return b;
    }
    
    @Override
    public final void b(final long n) {
    }
    
    public final Object c() throws DecoderException {
        d0.f(this.e ^ true);
        j j;
        if (this.d == 2 && !this.c.isEmpty()) {
            j = this.c.removeFirst();
            if (((ab.a)this.b).n(4)) {
                ((ab.a)j).k(4);
            }
            else {
                final i b = this.b;
                final long i = b.j;
                final nc.b a = this.a;
                final ByteBuffer h = b.h;
                h.getClass();
                final byte[] array = h.array();
                a.getClass();
                final Parcel obtain = Parcel.obtain();
                obtain.unmarshall(array, 0, array.length);
                obtain.setDataPosition(0);
                final Bundle bundle = obtain.readBundle(Bundle.class.getClassLoader());
                obtain.recycle();
                final ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                parcelableArrayList.getClass();
                j.t(this.b.j, (f)new b(i, (ImmutableList<a>)bd.b.a((f$a)nc.a.x, parcelableArrayList)), 0L);
            }
            this.b.p();
            this.d = 0;
        }
        else {
            j = null;
        }
        return j;
    }
    
    public final void d(final i i) throws DecoderException {
        final boolean e = this.e;
        final boolean b = true;
        d0.f(e ^ true);
        d0.f(this.d == 1);
        d0.c(this.b == i && b);
        this.d = 2;
    }
    
    public final void flush() {
        d0.f(this.e ^ true);
        this.b.p();
        this.d = 0;
    }
    
    public final void release() {
        this.e = true;
    }
    
    public static final class b implements f
    {
        public final long f;
        public final ImmutableList<a> g;
        
        public b(final long f, final ImmutableList<a> g) {
            this.f = f;
            this.g = g;
        }
        
        public final long a(final int n) {
            d0.c(n == 0);
            return this.f;
        }
        
        public final int c() {
            return 1;
        }
        
        public final int d(final long n) {
            int n2;
            if (this.f > n) {
                n2 = 0;
            }
            else {
                n2 = -1;
            }
            return n2;
        }
        
        public final List<a> f(final long n) {
            ImmutableList list;
            if (n >= this.f) {
                list = this.g;
            }
            else {
                list = ImmutableList.of();
            }
            return (List<a>)list;
        }
    }
}
