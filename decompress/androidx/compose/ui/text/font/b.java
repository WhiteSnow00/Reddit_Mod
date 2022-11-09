// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import zg2.l;
import n2.p;
import n2.f;
import v0.j;
import m2.a;

public final class b
{
    public final m2.a<b, a> a;
    public final b<b, a> b;
    public final j c;
    
    public b() {
        this.a = (m2.a<b, a>)new m2.a();
        this.b = (b<b, a>)new b(0);
        this.c = new j(1);
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
            final a a2 = (a)b.a.b((Object)b2, (Object)new a(o));
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
            asyncTypefaceCache$runCached$2 = new AsyncTypefaceCache$runCached$1(this, (c<? super AsyncTypefaceCache$runCached$1>)c);
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
                    aj2.c.Q0(result);
                    final Object invoke = result;
                    break Label_0265;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            final Object l$1 = new b(f, p3.b());
            synchronized (this.c) {
                a a;
                if ((a = (a)this.a.a(l$1)) == null) {
                    a = (a)this.b.a(l$1);
                }
                if (a != null) {
                    return a.a;
                }
                final pg2.j a2 = pg2.j.a;
                monitorexit(this.c);
                asyncTypefaceCache$runCached$2.L$0 = this;
                asyncTypefaceCache$runCached$2.L$1 = l$1;
                asyncTypefaceCache$runCached$2.Z$0 = false;
                asyncTypefaceCache$runCached$2.label = 1;
                final Object invoke = l.invoke((Object)asyncTypefaceCache$runCached$2);
                if (invoke == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                final b b = this;
                c = (c)b.c;
                monitorenter(c);
                Label_0363: {
                    Label_0309: {
                        if (invoke == null) {
                            Label_0372: {
                                try {
                                    b.b.d((b)l$1, new a(null));
                                    break Label_0363;
                                }
                                finally {
                                    break Label_0372;
                                }
                                break Label_0309;
                            }
                            monitorexit(c);
                        }
                    }
                    if (z$0) {
                        b.b.d((b)l$1, new a(invoke));
                    }
                    else {
                        b.a.b(l$1, (Object)new a(invoke));
                    }
                }
                final pg2.j a3 = pg2.j.a;
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
                if (ah2.f.a(a, ((a)o).a)) {
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
            ah2.f.f((Object)a, "font");
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
            return ah2.f.a((Object)this.a, (Object)b.a) && ah2.f.a(this.b, b.b);
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
            final StringBuilder k = a.k("Key(font=");
            k.append(this.a);
            k.append(", loaderKey=");
            return zu.a.b(k, this.b, ')');
        }
    }
}
