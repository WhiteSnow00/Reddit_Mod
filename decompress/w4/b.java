// 
// Decompiled by Procyon v0.6.0
// 

package w4;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.l0;
import j0.j;
import bg.d;
import java.io.PrintWriter;
import androidx.lifecycle.y;
import java.lang.reflect.Modifier;
import android.os.Looper;
import androidx.lifecycle.n0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q;

public final class b extends a
{
    public final q a;
    public final c b;
    
    public b(final q a, final p0 p2) {
        this.a = a;
        this.b = new n0(p2, (n0.b)c.f).a(c.class);
    }
    
    public final b b(final int n, final a$a a$a) {
        if (this.b.e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            final b$a b$a = (b$a)this.b.d.f(n, (Integer)null);
            if (b$a == null) {
                try {
                    this.b.e = true;
                    final b p2 = a$a.P();
                    if (p2 == null) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                    }
                    if (p2.getClass().isMemberClass() && !Modifier.isStatic(p2.getClass().getModifiers())) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                        sb.append(p2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    final b$a b$a2 = new b$a(n, p2);
                    this.b.d.g(n, (Object)b$a2);
                    this.b.e = false;
                    final q a = this.a;
                    final b p3 = new b(b$a2.n, a$a);
                    ((LiveData)b$a2).e(a, p3);
                    final b p4 = b$a2.p;
                    if (p4 != null) {
                        b$a2.j((y)p4);
                    }
                    b$a2.o = a;
                    b$a2.p = p3;
                    return b$a2.n;
                }
                finally {
                    this.b.e = false;
                }
            }
            final q a2 = this.a;
            final b p5 = new b(b$a.n, a$a);
            ((LiveData)b$a).e(a2, p5);
            final b p6 = b$a.p;
            if (p6 != null) {
                b$a.j((y)p6);
            }
            b$a.o = a2;
            b$a.p = p5;
            return b$a.n;
        }
        throw new IllegalStateException("initLoader must be called on the main thread");
    }
    
    @Deprecated
    public final void c(final String s, final PrintWriter printWriter) {
        final c b = this.b;
        if (b.d.h() > 0) {
            printWriter.print(s);
            printWriter.println("Loaders:");
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("    ");
            final String string = sb.toString();
            for (int i = 0; i < b.d.h(); ++i) {
                final b$a b$a = (b$a)b.d.i(i);
                printWriter.print(s);
                printWriter.print("  #");
                final j<b$a> d = b.d;
                if (d.f) {
                    d.e();
                }
                printWriter.print(d.g[i]);
                printWriter.print(": ");
                printWriter.println(b$a.toString());
                printWriter.print(string);
                printWriter.print("mId=");
                printWriter.print(b$a.l);
                printWriter.print(" mArgs=");
                printWriter.println(b$a.m);
                printWriter.print(string);
                printWriter.print("mLoader=");
                printWriter.println(b$a.n);
                final b n = b$a.n;
                final String h = al0.b.h(string, "  ");
                final x4.a a = (x4.a)n;
                a.getClass();
                printWriter.print(h);
                printWriter.print("mId=");
                printWriter.print(((b)a).a);
                printWriter.print(" mListener=");
                printWriter.println(((b)a).b);
                if (((b)a).d || ((b)a).g) {
                    printWriter.print(h);
                    printWriter.print("mStarted=");
                    printWriter.print(((b)a).d);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(((b)a).g);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (((b)a).e || ((b)a).f) {
                    printWriter.print(h);
                    printWriter.print("mAbandoned=");
                    printWriter.print(((b)a).e);
                    printWriter.print(" mReset=");
                    printWriter.println(((b)a).f);
                }
                if (a.i != null) {
                    printWriter.print(h);
                    printWriter.print("mTask=");
                    printWriter.print(a.i);
                    printWriter.print(" waiting=");
                    a.i.getClass();
                    printWriter.println(false);
                }
                if (a.j != null) {
                    printWriter.print(h);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(a.j);
                    printWriter.print(" waiting=");
                    a.j.getClass();
                    printWriter.println(false);
                }
                if (b$a.p != null) {
                    printWriter.print(string);
                    printWriter.print("mCallbacks=");
                    printWriter.println(b$a.p);
                    final b p2 = b$a.p;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append("  ");
                    final String string2 = sb2.toString();
                    p2.getClass();
                    printWriter.print(string2);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(p2.b);
                }
                printWriter.print(string);
                printWriter.print("mData=");
                final b n2 = b$a.n;
                final Object d2 = ((LiveData<Object>)b$a).d();
                n2.getClass();
                final StringBuilder sb3 = new StringBuilder(64);
                bg.d.H(sb3, d2);
                sb3.append("}");
                printWriter.println(sb3.toString());
                printWriter.print(string);
                printWriter.print("mStarted=");
                printWriter.println(((LiveData)b$a).c > 0);
            }
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        d.H(sb, (Object)this.a);
        sb.append("}}");
        return sb.toString();
    }
    
    public static final class b<D> implements y<D>
    {
        public final a$a<D> a;
        public boolean b;
        
        public b(final x4.b<D> b, final a$a<D> a) {
            this.b = false;
            this.a = a;
        }
        
        @Override
        public final void a(final D n) {
            this.a.M((Object)n);
            this.b = true;
        }
        
        @Override
        public final String toString() {
            return this.a.toString();
        }
    }
    
    public static final class c extends l0
    {
        public static final b$c$a f;
        public j<b$a> d;
        public boolean e;
        
        static {
            f = new n0.b() {
                @Override
                public final <T extends l0> T b(final Class<T> clazz) {
                    return (T)new c();
                }
            };
        }
        
        public c() {
            this.d = (j<b$a>)new j();
            this.e = false;
        }
        
        @Override
        public final void b() {
            for (int h = this.d.h(), i = 0; i < h; ++i) {
                ((b$a)this.d.i(i)).l();
            }
            final j<b$a> d = this.d;
            final int j = d.i;
            final Object[] h2 = d.h;
            for (int k = 0; k < j; ++k) {
                h2[k] = null;
            }
            d.i = 0;
            d.f = false;
        }
    }
}
