// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collection;
import java.util.ArrayList;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import al0.f0;
import java.util.Iterator;

public abstract class c implements Iterable<Byte>
{
    public static final k f;
    
    static {
        f = new k(new byte[0]);
    }
    
    public static c a(final Iterator<c> iterator, final int n) {
        c b;
        if (n == 1) {
            b = iterator.next();
        }
        else {
            final int n2 = n >>> 1;
            b = a(iterator, n2).b(a(iterator, n - n2));
        }
        return b;
    }
    
    public static b m() {
        return new b();
    }
    
    public final c b(c o) {
        final int size = this.size();
        final int size2 = ((c)o).size();
        if (size + (long)size2 < 2147483647L) {
            final int[] m = p.m;
            final boolean b = this instanceof p;
            p p = null;
            if (b) {
                p = (p)this;
            }
            if (((c)o).size() == 0) {
                o = this;
            }
            else if (this.size() != 0) {
                final int n = ((c)o).size() + this.size();
                if (n < 128) {
                    final int size3 = this.size();
                    final int size4 = ((c)o).size();
                    final byte[] array = new byte[size3 + size4];
                    this.c(array, 0, 0, size3);
                    ((c)o).c(array, 0, size3, size4);
                    o = new k(array);
                }
                else if (p != null && ((c)o).size() + p.i.size() < 128) {
                    final c i = p.i;
                    final int size5 = i.size();
                    final int size6 = ((c)o).size();
                    final byte[] array2 = new byte[size5 + size6];
                    i.c(array2, 0, 0, size5);
                    ((c)o).c(array2, 0, size5, size6);
                    o = new p(p.h, (c)new k(array2));
                }
                else if (p != null && p.h.e() > p.i.e() && p.k > ((c)o).e()) {
                    o = new p(p.h, (c)new p(p.i, (c)o));
                }
                else if (n >= kotlin.reflect.jvm.internal.impl.protobuf.p.m[Math.max(this.e(), ((c)o).e()) + 1]) {
                    o = new p(this, (c)o);
                }
                else {
                    final p.a a = new p.a();
                    a.a(this);
                    a.a((c)o);
                    Object o2 = a.a.pop();
                    while (true) {
                        o = o2;
                        if (a.a.isEmpty()) {
                            break;
                        }
                        o2 = new p((c)a.a.pop(), (c)o2);
                    }
                }
            }
            return (c)o;
        }
        final StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void c(final byte[] array, final int n, final int n2, final int n3) {
        if (n < 0) {
            throw new IndexOutOfBoundsException(f0.f(30, "Source offset < 0: ", n));
        }
        if (n2 < 0) {
            throw new IndexOutOfBoundsException(f0.f(30, "Target offset < 0: ", n2));
        }
        if (n3 < 0) {
            throw new IndexOutOfBoundsException(f0.f(23, "Length < 0: ", n3));
        }
        final int n4 = n + n3;
        if (n4 > this.size()) {
            throw new IndexOutOfBoundsException(f0.f(34, "Source end offset < 0: ", n4));
        }
        final int n5 = n2 + n3;
        if (n5 <= array.length) {
            if (n3 > 0) {
                this.d(array, n, n2, n3);
            }
            return;
        }
        throw new IndexOutOfBoundsException(f0.f(34, "Target end offset < 0: ", n5));
    }
    
    public abstract void d(final byte[] p0, final int p1, final int p2, final int p3);
    
    public abstract int e();
    
    public abstract boolean i();
    
    public abstract boolean k();
    
    public abstract a l();
    
    public abstract int n(final int p0, final int p1, final int p2);
    
    public abstract int o(final int p0, final int p1, final int p2);
    
    public abstract int p();
    
    public abstract String q() throws UnsupportedEncodingException;
    
    public abstract int size();
    
    @Override
    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
    }
    
    public abstract void x(final OutputStream p0, final int p1, final int p2) throws IOException;
    
    public interface a extends Iterator<Byte>
    {
    }
    
    public static final class b extends OutputStream
    {
        public static final byte[] k;
        public final int f;
        public final ArrayList<c> g;
        public int h;
        public byte[] i;
        public int j;
        
        static {
            k = new byte[0];
        }
        
        public b() {
            this.f = 128;
            this.g = new ArrayList<c>();
            this.i = new byte[128];
        }
        
        public final void b(final int n) {
            this.g.add((c)new k(this.i));
            final int h = this.h + this.i.length;
            this.h = h;
            this.i = new byte[Math.max(this.f, Math.max(n, h >>> 1))];
            this.j = 0;
        }
        
        public final void h() {
            final int j = this.j;
            final byte[] i = this.i;
            if (j < i.length) {
                if (j > 0) {
                    final byte[] array = new byte[j];
                    System.arraycopy(i, 0, array, 0, Math.min(i.length, j));
                    this.g.add((c)new k(array));
                }
            }
            else {
                this.g.add((c)new k(this.i));
                this.i = b.k;
            }
            this.h += this.j;
            this.j = 0;
        }
        
        public final c q() {
            synchronized (this) {
                this.h();
                ArrayList g;
                final ArrayList<c> list = g = this.g;
                if (!(list instanceof Collection)) {
                    g = new ArrayList<c>();
                    final Iterator<c> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        g.add(iterator.next());
                    }
                }
                Object o;
                if (g.isEmpty()) {
                    o = c.f;
                }
                else {
                    o = c.a(g.iterator(), g.size());
                }
                return (c)o;
            }
        }
        
        @Override
        public final String toString() {
            final String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                final int h = this.h;
                final int j = this.j;
                monitorexit(this);
                return String.format("<ByteString.Output@%s size=%d>", hexString, h + j);
            }
        }
        
        @Override
        public final void write(final int n) {
            synchronized (this) {
                if (this.j == this.i.length) {
                    this.b(1);
                }
                this.i[this.j++] = (byte)n;
            }
        }
        
        @Override
        public final void write(final byte[] array, final int n, int j) {
            synchronized (this) {
                final byte[] i = this.i;
                final int length = i.length;
                final int k = this.j;
                if (j <= length - k) {
                    System.arraycopy(array, n, i, k, j);
                    this.j += j;
                }
                else {
                    final int n2 = i.length - k;
                    System.arraycopy(array, n, i, k, n2);
                    j -= n2;
                    this.b(j);
                    System.arraycopy(array, n + n2, this.i, 0, j);
                    this.j = j;
                }
            }
        }
    }
}
