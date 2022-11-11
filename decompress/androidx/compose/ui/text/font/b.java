// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import sg2.e;
import hg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import rg2.l;
import n2.p;
import n2.f;
import v0.i;
import m2.a;

public final class b
{
    public final m2.a<b, a> a;
    public final b<b, a> b;
    public final i c;
    
    public b() {
        this.a = new m2.a<b, a>();
        this.b = new b<b, a>(0);
        this.c = new i(1);
    }
    
    public static void a(final b b, f c, final p p4, final Object o) {
        final b b2 = new b(c, p4.b());
        c = (f)b.c;
        monitorenter(c);
        Label_0084: {
            Label_0057: {
                if (o == null) {
                    Label_0087: {
                        try {
                            final a a = (a)b.b.d(b2, new a(null));
                            break Label_0084;
                        }
                        finally {
                            break Label_0087;
                        }
                        break Label_0057;
                    }
                    monitorexit(c);
                }
            }
            final a a2 = b.a.b(b2, new a(o));
        }
        monitorexit(c);
    }
    
    public final Object b(final f f, final p p3, final l l, c c) {
        AsyncTypefaceCache$runCached$1 asyncTypefaceCache$runCached$2 = null;
        Label_0059: {
            if (c instanceof AsyncTypefaceCache$runCached$1) {
                final AsyncTypefaceCache$runCached$1 asyncTypefaceCache$runCached$1 = (AsyncTypefaceCache$runCached$1)c;
                final int label = asyncTypefaceCache$runCached$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    asyncTypefaceCache$runCached$1.label = label + Integer.MIN_VALUE;
                    asyncTypefaceCache$runCached$2 = asyncTypefaceCache$runCached$1;
                    break Label_0059;
                }
            }
            asyncTypefaceCache$runCached$2 = new AsyncTypefaceCache$runCached$1(this, c);
        }
        final Object result = asyncTypefaceCache$runCached$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = asyncTypefaceCache$runCached$2.label;
        boolean z$0 = false;
        Label_0265: {
            if (label2 != 0) {
                if (label2 == 1) {
                    z$0 = asyncTypefaceCache$runCached$2.Z$0;
                    final Object l$1 = asyncTypefaceCache$runCached$2.L$1;
                    final b b = (b)asyncTypefaceCache$runCached$2.L$0;
                    yd.b.k0(result);
                    final Object invoke = result;
                    break Label_0265;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            final Object l$1 = new b(f, p3.b());
            synchronized (this.c) {
                a a;
                if ((a = this.a.a((b)l$1)) == null) {
                    a = this.b.a((b)l$1);
                }
                if (a != null) {
                    return a.a;
                }
                final j a2 = j.a;
                monitorexit(this.c);
                asyncTypefaceCache$runCached$2.L$0 = this;
                asyncTypefaceCache$runCached$2.L$1 = l$1;
                asyncTypefaceCache$runCached$2.Z$0 = false;
                asyncTypefaceCache$runCached$2.label = 1;
                final Object invoke = l.invoke(asyncTypefaceCache$runCached$2);
                if (invoke == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                final b b = this;
                c = (c)b.c;
                monitorenter(c);
                Label_0363: {
                    Label_0308: {
                        if (invoke == null) {
                            Label_0372: {
                                try {
                                    b.b.d((b)l$1, new a(null));
                                    break Label_0363;
                                }
                                finally {
                                    break Label_0372;
                                }
                                break Label_0308;
                            }
                            monitorexit(c);
                        }
                    }
                    if (z$0) {
                        b.b.d((b)l$1, new a(invoke));
                    }
                    else {
                        b.a.b((b)l$1, new a(invoke));
                    }
                }
                final j a3 = j.a;
                return invoke;
            }
        }
    }
    
    public static final class a
    {
        public final Object a = a;
        
        @Override
        public final boolean equals(final Object o) {
            final Object a = this.a;
            final boolean b = o instanceof a;
            boolean b2 = false;
            if (b) {
                if (e.a(a, ((a)o).a)) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        @Override
        public final int hashCode() {
            final Object a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            final Object a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("AsyncTypefaceResult(result=");
            sb.append(a);
            sb.append(')');
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final f a;
        public final Object b;
        
        public b(final f a, final Object b) {
            e.f((Object)a, "font");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return e.a((Object)this.a, (Object)b.a) && e.a(this.b, b.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final Object b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("Key(font=");
            r.append(this.a);
            r.append(", loaderKey=");
            return wu.a.b(r, this.b, ')');
        }
    }
}
