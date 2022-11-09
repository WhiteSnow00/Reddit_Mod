// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import java.util.Arrays;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Pair;
import androidx.compose.runtime.ComposerKt;
import zg2.q;
import android.os.Trace;
import java.util.Iterator;
import java.util.Set;
import androidx.compose.runtime.InvalidationResult;
import a1.c$a;
import kotlin.jvm.internal.Ref$ObjectRef;
import androidx.compose.runtime.ComposableSingletons$CompositionKt;
import androidx.compose.runtime.Recomposer;
import ah2.f;
import pg2.j;
import zg2.p;
import kotlin.coroutines.CoroutineContext;
import androidx.compose.runtime.ComposerImpl;
import a1.b;
import java.util.ArrayList;
import a1.d;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

public final class i implements m
{
    public final g f;
    public final c<?> g;
    public final AtomicReference<Object> h;
    public final Object i;
    public final HashSet<u0> j;
    public final x0 k;
    public final d<r0> l;
    public final HashSet<r0> m;
    public final d<n<?>> n;
    public final ArrayList o;
    public final ArrayList p;
    public final d<r0> q;
    public b r;
    public boolean s;
    public i t;
    public int u;
    public final ComposerImpl v;
    public final CoroutineContext w;
    public boolean x;
    public p<? super z0.d, ? super Integer, j> y;
    
    public i() {
        throw null;
    }
    
    public i(final g f, final z0.a g) {
        ah2.f.f((Object)f, "parent");
        ah2.f.f((Object)g, "applier");
        this.f = f;
        this.g = (c<?>)g;
        this.h = new AtomicReference<Object>(null);
        this.i = new Object();
        final HashSet j = new HashSet();
        this.j = j;
        final x0 k = new x0();
        this.k = k;
        this.l = new d<r0>();
        this.m = new HashSet<r0>();
        this.n = new d<n<?>>();
        final ArrayList o = new ArrayList();
        this.o = o;
        final ArrayList p2 = new ArrayList();
        this.p = p2;
        this.q = new d<r0>();
        this.r = new b();
        final ComposerImpl v = new ComposerImpl(g, f, k, j, o, p2, (m)this);
        f.m(v);
        this.v = v;
        this.w = null;
        final boolean b = f instanceof Recomposer;
        this.y = (p<? super z0.d, ? super Integer, j>)ComposableSingletons$CompositionKt.a;
    }
    
    public static final void b(final i i, final boolean b, final Ref$ObjectRef<HashSet<r0>> ref$ObjectRef, final Object o) {
        final d<r0> l = i.l;
        final int c = l.c(o);
        if (c >= 0) {
            final c$a c$a = new c$a(l.f(c));
            while (c$a.hasNext()) {
                final r0 r0 = (r0)c$a.next();
                if (!i.q.d(o, r0)) {
                    final i b2 = r0.b;
                    InvalidationResult invalidationResult;
                    if (b2 == null || (invalidationResult = b2.m(r0, o)) == null) {
                        invalidationResult = InvalidationResult.IGNORED;
                    }
                    if (invalidationResult == InvalidationResult.IGNORED) {
                        continue;
                    }
                    if (r0.g != null && !b) {
                        i.m.add(r0);
                    }
                    else {
                        HashSet element;
                        if ((element = (HashSet)ref$ObjectRef.element) == null) {
                            element = new HashSet();
                            ref$ObjectRef.element = element;
                        }
                        element.add(r0);
                    }
                }
            }
        }
    }
    
    public final void a(final boolean b, final Set set) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (final Object next : set) {
            if (next instanceof r0) {
                final r0 r0 = (r0)next;
                final i b2 = r0.b;
                if (b2 != null && b2.m(r0, null) != null) {
                    continue;
                }
                final InvalidationResult ignored = InvalidationResult.IGNORED;
            }
            else {
                b(this, b, (Ref$ObjectRef<HashSet<r0>>)ref$ObjectRef, next);
                final d<n<?>> n = this.n;
                final int c = n.c(next);
                if (c < 0) {
                    continue;
                }
                final c$a c$a = new c$a(n.f(c));
                while (c$a.hasNext()) {
                    b(this, b, (Ref$ObjectRef<HashSet<r0>>)ref$ObjectRef, c$a.next());
                }
            }
        }
        if (b && (this.m.isEmpty() ^ true)) {
            final d<r0> l = this.l;
            final int d = l.d;
            int i = 0;
            int d2 = 0;
            while (i < d) {
                final int n2 = l.a[i];
                final a1.c<T> c2 = (a1.c<T>)l.c[n2];
                ah2.f.c((Object)c2);
                final int f = c2.f;
                int j = 0;
                int f2 = 0;
                while (j < f) {
                    final Object o = c2.g[j];
                    if (o == null) {
                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    }
                    final r0 r2 = (r0)o;
                    boolean b3 = false;
                    Label_0315: {
                        if (!this.m.contains(r2)) {
                            final HashSet set2 = (HashSet)ref$ObjectRef.element;
                            if (set2 == null || !set2.contains(r2)) {
                                b3 = false;
                                break Label_0315;
                            }
                        }
                        b3 = true;
                    }
                    int n3 = f2;
                    if (!b3) {
                        if (f2 != j) {
                            c2.g[f2] = o;
                        }
                        n3 = f2 + 1;
                    }
                    ++j;
                    f2 = n3;
                }
                for (int f3 = c2.f, k = f2; k < f3; ++k) {
                    c2.g[k] = null;
                }
                c2.f = f2;
                int n4 = d2;
                if (f2 > 0) {
                    if (d2 != i) {
                        final int[] a = l.a;
                        final int n5 = a[d2];
                        a[d2] = n2;
                        a[i] = n5;
                    }
                    n4 = d2 + 1;
                }
                ++i;
                d2 = n4;
            }
            for (int d3 = l.d, n6 = d2; n6 < d3; ++n6) {
                l.b[l.a[n6]] = null;
            }
            l.d = d2;
            this.f();
            this.m.clear();
        }
        else {
            final HashSet set3 = (HashSet)ref$ObjectRef.element;
            if (set3 != null) {
                final d<r0> m = this.l;
                final int d4 = m.d;
                int n7 = 0;
                int d5 = 0;
                while (n7 < d4) {
                    final int n8 = m.a[n7];
                    final a1.c<T> c3 = (a1.c<T>)m.c[n8];
                    ah2.f.c((Object)c3);
                    final int f4 = c3.f;
                    int n9 = 0;
                    int f5 = 0;
                    while (n9 < f4) {
                        final Object o2 = c3.g[n9];
                        if (o2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                        int n10 = f5;
                        if (!set3.contains(o2)) {
                            if (f5 != n9) {
                                c3.g[f5] = o2;
                            }
                            n10 = f5 + 1;
                        }
                        ++n9;
                        f5 = n10;
                    }
                    for (int f6 = c3.f, n11 = f5; n11 < f6; ++n11) {
                        c3.g[n11] = null;
                    }
                    c3.f = f5;
                    int n12 = d5;
                    if (f5 > 0) {
                        if (d5 != n7) {
                            final int[] a2 = m.a;
                            final int n13 = a2[d5];
                            a2[d5] = n8;
                            a2[n7] = n13;
                        }
                        n12 = d5 + 1;
                    }
                    ++n7;
                    d5 = n12;
                }
                for (int d6 = m.d, n14 = d5; n14 < d6; ++n14) {
                    m.b[m.a[n14]] = null;
                }
                m.d = d5;
                this.f();
            }
        }
    }
    
    public final void c(final ArrayList list) {
        final a a = new a(this.j);
        try {
            int n = list.isEmpty() ? 1 : 0;
            if (n != 0) {
                return;
            }
            Trace.beginSection("Compose:applyChanges");
            try {
                this.g.getClass();
                Object o = this.k.d();
                try {
                    Object g = this.g;
                    for (int size = list.size(), i = 0; i < size; ++i) {
                        ((q)list.get(i)).invoke(g, o, (Object)a);
                    }
                    list.clear();
                    final j a2 = pg2.j.a;
                    ((y0)o).f();
                    this.g.b();
                    Trace.endSection();
                    a.e();
                    a.f();
                    if (this.s) {
                    Label_0175_Outer:
                        while (true) {
                            Trace.beginSection("Compose:unobserve");
                            int size = 0;
                            int i = 0;
                            d<r0> l = null;
                            int d;
                            int n2 = 0;
                            int n3 = 0;
                            int f;
                            int n4 = 0;
                            r0 r0;
                            z0.b c;
                            boolean b = false;
                            int n5;
                            Label_0451:Label_0219_Outer:
                            while (true) {
                            Label_0352:
                                while (true) {
                                    Label_0296: {
                                        Label_0293: {
                                            Label_0283: {
                                                try {
                                                    this.s = false;
                                                    l = this.l;
                                                    d = l.d;
                                                    n2 = (i = 0);
                                                    if (n2 >= d) {
                                                        break Label_0451;
                                                    }
                                                    n3 = l.a[n2];
                                                    g = l.c[n3];
                                                    ah2.f.c(g);
                                                    f = ((a1.c)g).f;
                                                    n4 = (size = 0);
                                                    if (n4 >= f) {
                                                        break Label_0352;
                                                    }
                                                    o = ((a1.c)g).g[n4];
                                                    if (o == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                                    }
                                                    r0 = (r0)o;
                                                    if (r0.b == null) {
                                                        break Label_0293;
                                                    }
                                                    c = r0.c;
                                                    if (c != null) {
                                                        n = (c.a() ? 1 : 0);
                                                        break Label_0283;
                                                    }
                                                }
                                                finally {
                                                    continue Label_0175_Outer;
                                                }
                                                n = 0;
                                            }
                                            if (n != 0) {
                                                b = true;
                                                break Label_0296;
                                            }
                                        }
                                        b = false;
                                    }
                                    n5 = size;
                                    if (!(b ^ true)) {
                                        if (size != n4) {
                                            ((a1.c)g).g[size] = o;
                                        }
                                        n5 = size + 1;
                                    }
                                    ++n4;
                                    size = n5;
                                    continue;
                                }
                                for (int f2 = ((a1.c)g).f, j = size; j < f2; ++j) {
                                    ((a1.c)g).g[j] = null;
                                }
                                ((a1.c)g).f = size;
                                n4 = i;
                                if (size > 0) {
                                    if (i != n2) {
                                        o = l.a;
                                        size = o[i];
                                        o[i] = n3;
                                        o[n2] = size;
                                    }
                                    n4 = i + 1;
                                }
                                ++n2;
                                i = n4;
                                continue Label_0219_Outer;
                            }
                            for (int d2 = l.d, k = i; k < d2; ++k) {
                                l.b[l.a[k]] = null;
                            }
                            l.d = i;
                            this.f();
                            final j a3 = pg2.j.a;
                            Trace.endSection();
                            break;
                        }
                    }
                }
                finally {
                    ((y0)o).f();
                }
            }
            finally {
                Trace.endSection();
            }
        }
        finally {
            if (this.p.isEmpty()) {
                a.d();
            }
        }
    }
    
    @Override
    public final boolean d(final a1.c c) {
        final c$a c$a = new c$a(c);
        while (c$a.hasNext()) {
            final Object next = c$a.next();
            if (this.l.b(next) || this.n.b(next)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final void dispose() {
        synchronized (this.i) {
            if (!this.x) {
                this.x = true;
                this.y = (p<? super z0.d, ? super Integer, j>)ComposableSingletons$CompositionKt.b;
                final boolean b = this.k.g > 0;
                if (b || (true ^ this.j.isEmpty())) {
                    final a a = new a(this.j);
                    if (b) {
                        final y0 d = this.k.d();
                        try {
                            ComposerKt.e(d, (t0)a);
                            final j a2 = pg2.j.a;
                            d.f();
                            this.g.clear();
                            a.e();
                        }
                        finally {
                            d.f();
                        }
                    }
                    a.d();
                }
                this.v.O();
            }
            final j a3 = pg2.j.a;
            monitorexit(this.i);
            this.f.p(this);
        }
    }
    
    @Override
    public final void e(final ArrayList list) {
        final int size = list.size();
        boolean b = false;
        int i = 0;
        while (true) {
            while (i < size) {
                if (!ah2.f.a((Object)((g0)((Pair)list.get(i)).getFirst()).c, (Object)this)) {
                    ComposerKt.f(b);
                    try {
                        this.v.Z(list);
                        final j a = pg2.j.a;
                        return;
                    }
                    finally {
                        if (this.j.isEmpty() ^ true) {
                            new a(this.j).d();
                        }
                    }
                }
                else {
                    ++i;
                }
            }
            b = true;
            continue;
        }
    }
    
    public final void f() {
        final d<n<?>> n = this.n;
        int d2;
        int n5;
        for (int d = n.d, i = d2 = 0; i < d; ++i, d2 = n5) {
            final int n2 = n.a[i];
            final a1.c<T> c = (a1.c<T>)n.c[n2];
            ah2.f.c((Object)c);
            int f2;
            int n4;
            for (int f = c.f, j = f2 = 0; j < f; ++j, f2 = n4) {
                final Object o = c.g[j];
                if (o == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                }
                final n n3 = (n)o;
                n4 = f2;
                if (!(this.l.b(n3) ^ true)) {
                    if (f2 != j) {
                        c.g[f2] = o;
                    }
                    n4 = f2 + 1;
                }
            }
            for (int f3 = c.f, k = f2; k < f3; ++k) {
                c.g[k] = null;
            }
            c.f = f2;
            n5 = d2;
            if (f2 > 0) {
                if (d2 != i) {
                    final int[] a = n.a;
                    final int n6 = a[d2];
                    a[d2] = n2;
                    a[i] = n6;
                }
                n5 = d2 + 1;
            }
        }
        for (int d3 = n.d, l = d2; l < d3; ++l) {
            n.b[n.a[l]] = null;
        }
        n.d = d2;
        final Iterator<r0> iterator = this.m.iterator();
        ah2.f.e((Object)iterator, "iterator()");
        while (iterator.hasNext()) {
            if (iterator.next().g != null ^ true) {
                iterator.remove();
            }
        }
    }
    
    public final void g() {
        final AtomicReference<Object> h = this.h;
        final Object a = z0.j.a;
        final Set andSet = h.getAndSet(a);
        if (andSet != null) {
            if (ah2.f.a((Object)andSet, a)) {
                throw new IllegalStateException("pending composition has not been applied".toString());
            }
            if (andSet instanceof Set) {
                this.a(true, andSet);
            }
            else {
                if (!(andSet instanceof Object[])) {
                    final StringBuilder k = a.k("corrupt pendingModifications drain: ");
                    k.append(this.h);
                    throw new IllegalStateException(k.toString().toString());
                }
                final Set[] array = (Object)andSet;
                for (int i = 0; i < array.length; ++i) {
                    this.a(true, array[i]);
                }
            }
        }
    }
    
    public final void h() {
        final Set[] andSet = this.h.getAndSet(null);
        if (!ah2.f.a((Object)andSet, z0.j.a)) {
            if (andSet instanceof Set) {
                this.a(false, andSet);
            }
            else if (andSet instanceof Object[]) {
                final Set[] array = andSet;
                for (int length = array.length, i = 0; i < length; ++i) {
                    this.a(false, array[i]);
                }
            }
            else {
                if (andSet == null) {
                    throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
                }
                final StringBuilder k = a.k("corrupt pendingModifications drain: ");
                k.append(this.h);
                throw new IllegalStateException(k.toString().toString());
            }
        }
    }
    
    @Override
    public final void i(final ComposableLambdaImpl composableLambdaImpl) {
        try {
            final Object i = this.i;
            monitorenter(i);
            Label_0092: {
                try {
                    this.g();
                    final ComposerImpl v = this.v;
                    final b r = this.r;
                    this.r = new b();
                    v.getClass();
                    ah2.f.f((Object)r, "invalidationsRequested");
                    if (v.e.isEmpty()) {
                        v.P(r, composableLambdaImpl);
                        final j a = pg2.j.a;
                        monitorexit(i);
                        return;
                    }
                }
                finally {
                    break Label_0092;
                }
                ComposerKt.c("Expected applyChanges() to have been called".toString());
                throw null;
            }
            monitorexit(i);
        }
        finally {
            if (this.j.isEmpty() ^ true) {
                new a(this.j).d();
            }
        }
    }
    
    @Override
    public final void invalidateAll() {
        synchronized (this.i) {
            final Object[] h = this.k.h;
            for (int i = 0; i < h.length; ++i) {
                final Object o = h[i];
                r0 r0;
                if (o instanceof r0) {
                    r0 = (r0)o;
                }
                else {
                    r0 = null;
                }
                if (r0 != null) {
                    r0.invalidate();
                }
            }
            final j a = pg2.j.a;
        }
    }
    
    @Override
    public final boolean isDisposed() {
        return this.x;
    }
    
    @Override
    public final void j(final p<? super z0.d, ? super Integer, j> y) {
        if (this.x ^ true) {
            this.y = y;
            this.f.a(this, (ComposableLambdaImpl)y);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }
    
    @Override
    public final void k() {
        synchronized (this.i) {
            this.v.u.clear();
            if (this.j.isEmpty() ^ true) {
                new a(this.j).d();
            }
            final j a = pg2.j.a;
        }
    }
    
    @Override
    public final void l() {
        synchronized (this.i) {
            if (this.p.isEmpty() ^ true) {
                this.c(this.p);
            }
            final j a = pg2.j.a;
        }
    }
    
    public final InvalidationResult m(final r0 r0, final Object o) {
        ah2.f.f((Object)r0, "scope");
        final int a = r0.a;
        final int n = 0;
        if ((a & 0x2) != 0x0) {
            r0.a = (a | 0x4);
        }
        final z0.b c = r0.c;
        if (c == null || !this.k.g(c) || !c.a()) {
            return InvalidationResult.IGNORED;
        }
        if (!c.a()) {
            return InvalidationResult.IGNORED;
        }
        int n2 = n;
        if (r0.d != null) {
            n2 = 1;
        }
        if (n2 == 0) {
            return InvalidationResult.IGNORED;
        }
        return this.t(r0, c, o);
    }
    
    @Override
    public final void n(final zg2.a<j> a) {
        final ComposerImpl v = this.v;
        v.getClass();
        if (v.C ^ true) {
            v.C = true;
            try {
                a.invoke();
                return;
            }
            finally {
                v.C = false;
            }
        }
        ComposerKt.c("Preparing a composition while composing is not supported".toString());
        throw null;
    }
    
    @Override
    public final void o(f0 d) {
        final a a = new a(this.j);
        d = (f0)d.a.d();
        try {
            ComposerKt.e((y0)d, (t0)a);
            final j a2 = pg2.j.a;
            ((y0)d).f();
            a.e();
        }
        finally {
            ((y0)d).f();
        }
    }
    
    @Override
    public final boolean p() {
        synchronized (this.i) {
            this.g();
            try {
                final ComposerImpl v = this.v;
                final b r = this.r;
                this.r = new b();
                final boolean h0 = v.h0(r);
                if (!h0) {
                    this.h();
                }
                return h0;
            }
            finally {
                if (this.j.isEmpty() ^ true) {
                    new a(this.j).d();
                }
            }
        }
    }
    
    @Override
    public final <R> R q(final m m, final int u, final zg2.a<? extends R> a) {
        if (m != null && !ah2.f.a((Object)m, (Object)this) && u >= 0) {
            this.t = (i)m;
            this.u = u;
            try {
                a.invoke();
                final Object invoke;
                return (R)invoke;
            }
            finally {
                this.t = null;
                this.u = 0;
            }
        }
        final Object invoke = a.invoke();
        return (R)invoke;
    }
    
    @Override
    public final void r(final Object o) {
        ah2.f.f(o, "value");
        final ComposerImpl v = this.v;
        if (v.z <= 0) {
            final r0 x = v.X();
            if (x != null) {
                x.a |= 0x1;
                this.l.a(o, x);
                final boolean b = o instanceof n;
                if (b) {
                    this.n.e((n<?>)o);
                    final Iterator iterator = ((n)o).j().iterator();
                    while (iterator.hasNext()) {
                        this.n.a(iterator.next(), o);
                    }
                }
                if ((x.a & 0x20) == 0x0) {
                    a1.a f;
                    if ((f = x.f) == null) {
                        f = new a1.a();
                        x.f = f;
                    }
                    final int e = x.e;
                    final int a = f.a;
                    int n = -1;
                    Label_0617: {
                        Label_0424: {
                            if (a > 0) {
                                int n2 = a - 1;
                                final int identityHashCode = System.identityHashCode(o);
                                int i = 0;
                            Label_0406:
                                while (true) {
                                    while (i <= n2) {
                                        final int n3 = i + n2 >>> 1;
                                        final Object o2 = f.b[n3];
                                        final int identityHashCode2 = System.identityHashCode(o2);
                                        if (identityHashCode2 < identityHashCode) {
                                            i = n3 + 1;
                                        }
                                        else if (identityHashCode2 > identityHashCode) {
                                            n2 = n3 - 1;
                                        }
                                        else {
                                            if (o2 != o) {
                                                for (int j = n3 - 1; -1 < j; --j) {
                                                    final Object o3 = f.b[j];
                                                    if (o3 == o) {
                                                        break Label_0406;
                                                    }
                                                    if (System.identityHashCode(o3) != identityHashCode) {
                                                        break;
                                                    }
                                                }
                                                while (true) {
                                                    for (int j = n3 + 1; j < f.a; ++j) {
                                                        final Object o4 = f.b[j];
                                                        if (o4 == o) {
                                                            break Label_0406;
                                                        }
                                                        if (System.identityHashCode(o4) != identityHashCode) {
                                                            j = -(j + 1);
                                                            break Label_0406;
                                                        }
                                                    }
                                                    int j = f.a;
                                                    continue;
                                                }
                                            }
                                            int j = n3;
                                            n = j;
                                            if (j >= 0) {
                                                f.c[j] = e;
                                                break Label_0617;
                                            }
                                            break Label_0424;
                                        }
                                    }
                                    int j = -(i + 1);
                                    continue Label_0406;
                                }
                            }
                        }
                        final int n4 = -(n + 1);
                        final int a2 = f.a;
                        final Object[] b2 = f.b;
                        if (a2 == b2.length) {
                            final Object[] b3 = new Object[b2.length * 2];
                            final int[] c = new int[b2.length * 2];
                            final int n5 = n4 + 1;
                            qg2.j.j1(b2, n5, b3, n4, a2);
                            qg2.j.g1(n5, n4, f.a, f.c, c);
                            qg2.j.m1(f.b, b3, 0, 0, n4, 6);
                            qg2.j.l1(f.c, c, 0, n4, 6);
                            f.b = b3;
                            f.c = c;
                        }
                        else {
                            final int n6 = n4 + 1;
                            qg2.j.j1(b2, n6, b2, n4, a2);
                            final int[] c2 = f.c;
                            qg2.j.g1(n6, n4, f.a, c2, c2);
                        }
                        f.b[n4] = o;
                        f.c[n4] = e;
                        ++f.a;
                    }
                    if (b) {
                        b g;
                        if ((g = x.g) == null) {
                            g = new b();
                            x.g = g;
                        }
                        g.b(o, ((n)o).h());
                    }
                }
            }
        }
    }
    
    @Override
    public final void s(final Set<?> set) {
        ah2.f.f((Object)set, "values");
        boolean b;
        Set[] value;
        do {
            value = this.h.get();
            b = true;
            Object copy;
            if (value == null || ah2.f.a((Object)value, z0.j.a)) {
                copy = set;
            }
            else if (value instanceof Set) {
                copy = new Set[] { (Set)value, set };
            }
            else {
                if (!(value instanceof Object[])) {
                    final StringBuilder k = a.k("corrupt pendingModifications: ");
                    k.append(this.h);
                    throw new IllegalStateException(k.toString().toString());
                }
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                }
                final Set[] array = value;
                final int length = array.length;
                copy = Arrays.copyOf(array, length + 1);
                copy[length] = set;
            }
            final AtomicReference<Object> h = this.h;
            while (!h.compareAndSet(value, copy)) {
                if (h.get() != value) {
                    b = false;
                    break;
                }
            }
        } while (!b);
        if (value == null) {
            synchronized (this.i) {
                this.h();
                final j a = pg2.j.a;
            }
        }
    }
    
    public final InvalidationResult t(final r0 r0, final z0.b b, final Object o) {
        synchronized (this.i) {
            i t = this.t;
            Object o2 = null;
            if (t == null || !this.k.b(b, this.u)) {
                t = null;
            }
            if (t == null) {
                final ComposerImpl v = this.v;
                if (v.C && v.B0(r0, o)) {
                    return InvalidationResult.IMMINENT;
                }
                if (o == null) {
                    this.r.b(r0, null);
                }
                else {
                    final b r2 = this.r;
                    final Object a = z0.j.a;
                    r2.getClass();
                    ah2.f.f((Object)r0, "key");
                    if (r2.a(r0) >= 0) {
                        final int a2 = r2.a(r0);
                        if (a2 >= 0) {
                            o2 = ((Object[])(Object)r2.c)[a2];
                        }
                        final a1.c c = (a1.c)o2;
                        if (c != null) {
                            c.add(o);
                        }
                    }
                    else {
                        final a1.c c2 = new a1.c();
                        c2.add(o);
                        final j a3 = pg2.j.a;
                        r2.b(r0, c2);
                    }
                }
            }
            monitorexit(this.i);
            if (t != null) {
                return t.t(r0, b, o);
            }
            this.f.i(this);
            InvalidationResult invalidationResult;
            if (this.v.C) {
                invalidationResult = InvalidationResult.DEFERRED;
            }
            else {
                invalidationResult = InvalidationResult.SCHEDULED;
            }
            return invalidationResult;
        }
    }
    
    public final void u(final Object o) {
        final d<r0> l = this.l;
        final int c = l.c(o);
        if (c >= 0) {
            final c$a c$a = new c$a(l.f(c));
            while (c$a.hasNext()) {
                final r0 r0 = (r0)c$a.next();
                final i b = r0.b;
                InvalidationResult invalidationResult;
                if (b == null || (invalidationResult = b.m(r0, o)) == null) {
                    invalidationResult = InvalidationResult.IGNORED;
                }
                if (invalidationResult == InvalidationResult.IMMINENT) {
                    this.q.a(o, r0);
                }
            }
        }
    }
    
    @Override
    public final void v() {
        synchronized (this.i) {
            this.c(this.o);
            this.h();
            final j a = pg2.j.a;
        }
    }
    
    @Override
    public final boolean w() {
        return this.v.C;
    }
    
    @Override
    public final void x(final Object o) {
        ah2.f.f(o, "value");
        synchronized (this.i) {
            this.u(o);
            final d<n<?>> n = this.n;
            final int c = n.c(o);
            if (c >= 0) {
                final c$a c$a = new c$a(n.f(c));
                while (c$a.hasNext()) {
                    this.u(c$a.next());
                }
            }
            final j a = pg2.j.a;
        }
    }
    
    @Override
    public final boolean y() {
        synchronized (this.i) {
            return this.r.a > 0;
        }
    }
    
    public static final class a implements t0
    {
        public final Set<u0> a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        
        public a(final HashSet a) {
            ah2.f.f((Object)a, "abandoning");
            this.a = a;
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
        }
        
        @Override
        public final void a(final zg2.a<j> a) {
            ah2.f.f((Object)a, "effect");
            this.d.add(a);
        }
        
        @Override
        public final void b(final u0 u0) {
            ah2.f.f((Object)u0, "instance");
            final int lastIndex = this.b.lastIndexOf(u0);
            if (lastIndex >= 0) {
                this.b.remove(lastIndex);
                this.a.remove(u0);
            }
            else {
                this.c.add(u0);
            }
        }
        
        @Override
        public final void c(final u0 u0) {
            ah2.f.f((Object)u0, "instance");
            final int lastIndex = this.c.lastIndexOf(u0);
            if (lastIndex >= 0) {
                this.c.remove(lastIndex);
                this.a.remove(u0);
            }
            else {
                this.b.add(u0);
            }
        }
        
        public final void d() {
            if (this.a.isEmpty() ^ true) {
                Trace.beginSection("Compose:abandons");
                try {
                    final Iterator<u0> iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        final u0 u0 = iterator.next();
                        iterator.remove();
                        u0.c();
                    }
                    final j a = pg2.j.a;
                }
                finally {
                    Trace.endSection();
                }
            }
        }
        
        public final void e() {
            if (this.c.isEmpty() ^ true) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    for (int n = this.c.size() - 1; -1 < n; --n) {
                        final u0 u0 = this.c.get(n);
                        if (!this.a.contains(u0)) {
                            u0.d();
                        }
                    }
                    final j a = pg2.j.a;
                }
                finally {
                    Trace.endSection();
                }
            }
            if (this.b.isEmpty() ^ true) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    final ArrayList b = this.b;
                    for (int i = 0; i < b.size(); ++i) {
                        final u0 u2 = (u0)b.get(i);
                        this.a.remove(u2);
                        u2.a();
                    }
                    final j a2 = pg2.j.a;
                }
                finally {
                    Trace.endSection();
                }
            }
        }
        
        public final void f() {
            if (this.d.isEmpty() ^ true) {
                Trace.beginSection("Compose:sideeffects");
                try {
                    final ArrayList d = this.d;
                    for (int i = 0; i < d.size(); ++i) {
                        ((zg2.a)d.get(i)).invoke();
                    }
                    this.d.clear();
                    final j a = pg2.j.a;
                }
                finally {
                    Trace.endSection();
                }
            }
        }
    }
}
