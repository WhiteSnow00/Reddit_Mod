// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import java.util.Arrays;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Pair;
import mg2.q;
import android.os.Trace;
import androidx.compose.runtime.ComposerKt;
import a1.c$a;
import java.util.Iterator;
import java.util.Set;
import androidx.compose.runtime.InvalidationResult;
import kotlin.jvm.internal.Ref$ObjectRef;
import androidx.compose.runtime.ComposableSingletons$CompositionKt;
import androidx.compose.runtime.Recomposer;
import ng2.e;
import cg2.j;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import androidx.compose.runtime.ComposerImpl;
import a1.b;
import java.util.ArrayList;
import md.t;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

public final class i implements m
{
    public final g f;
    public final c<?> g;
    public final AtomicReference<Object> h;
    public final Object i;
    public final HashSet<s0> j;
    public final v0 k;
    public final t l;
    public final HashSet<p0> m;
    public final t n;
    public final ArrayList o;
    public final ArrayList p;
    public final t q;
    public b<p0, a1.c<Object>> r;
    public boolean s;
    public i t;
    public int u;
    public final ComposerImpl v;
    public final CoroutineContext w;
    public boolean x;
    public p<? super d, ? super Integer, j> y;
    
    public i() {
        throw null;
    }
    
    public i(final g f, final a g) {
        e.f((Object)f, "parent");
        e.f((Object)g, "applier");
        this.f = f;
        this.g = (c<?>)g;
        this.h = new AtomicReference<Object>(null);
        this.i = new Object();
        final HashSet j = new HashSet();
        this.j = j;
        final v0 k = new v0();
        this.k = k;
        this.l = new t();
        this.m = new HashSet<p0>();
        this.n = new t();
        final ArrayList o = new ArrayList();
        this.o = o;
        final ArrayList p2 = new ArrayList();
        this.p = p2;
        this.q = new t();
        this.r = (b<p0, a1.c<Object>>)new b();
        final ComposerImpl v = new ComposerImpl(g, f, k, j, o, p2, (m)this);
        f.m(v);
        this.v = v;
        this.w = null;
        final boolean b = f instanceof Recomposer;
        this.y = (p<? super d, ? super Integer, j>)ComposableSingletons$CompositionKt.a;
    }
    
    public static final void c(final i i, final boolean b, final Ref$ObjectRef<HashSet<p0>> ref$ObjectRef, final Object o) {
        final t l = i.l;
        final int d = l.d(o);
        if (d >= 0) {
            final a1.c g = l.g(d);
            for (int f = g.f, j = 0; j < f; ++j) {
                final p0 p4 = (p0)g.get(j);
                if (!i.q.e(o, (Object)p4)) {
                    final i b2 = p4.b;
                    InvalidationResult invalidationResult;
                    if (b2 == null || (invalidationResult = b2.o(p4, o)) == null) {
                        invalidationResult = InvalidationResult.IGNORED;
                    }
                    if (invalidationResult != InvalidationResult.IGNORED) {
                        if (p4.g != null && !b) {
                            i.m.add(p4);
                        }
                        else {
                            HashSet element;
                            if ((element = (HashSet)ref$ObjectRef.element) == null) {
                                element = new HashSet();
                                ref$ObjectRef.element = element;
                            }
                            element.add(p4);
                        }
                    }
                }
            }
        }
    }
    
    public final void a() {
        this.h.set(null);
        this.o.clear();
        this.p.clear();
        this.j.clear();
    }
    
    public final void b(final boolean b, final Set set) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (final Object next : set) {
            if (next instanceof p0) {
                final p0 p2 = (p0)next;
                final i b2 = p2.b;
                if (b2 != null && b2.o(p2, null) != null) {
                    continue;
                }
                final InvalidationResult ignored = InvalidationResult.IGNORED;
            }
            else {
                c(this, b, (Ref$ObjectRef<HashSet<p0>>)ref$ObjectRef, next);
                final t n = this.n;
                final int d = n.d(next);
                if (d < 0) {
                    continue;
                }
                final a1.c g = n.g(d);
                for (int f = g.f, i = 0; i < f; ++i) {
                    c(this, b, (Ref$ObjectRef<HashSet<p0>>)ref$ObjectRef, g.get(i));
                }
            }
        }
        if (b && (this.m.isEmpty() ^ true)) {
            final t l = this.l;
            final int a = l.a;
            int j = 0;
            int a2 = 0;
            while (j < a) {
                final int n2 = ((int[])l.b)[j];
                final a1.c c = ((a1.c[])l.d)[n2];
                e.c((Object)c);
                final int f2 = c.f;
                int k = 0;
                int f3 = 0;
                while (k < f2) {
                    final Object o = c.g[k];
                    e.d(o, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    final p0 p3 = (p0)o;
                    boolean b3 = false;
                    Label_0327: {
                        if (!this.m.contains(p3)) {
                            final HashSet set2 = (HashSet)ref$ObjectRef.element;
                            if (set2 == null || !set2.contains(p3)) {
                                b3 = false;
                                break Label_0327;
                            }
                        }
                        b3 = true;
                    }
                    int n3 = f3;
                    if (!b3) {
                        if (f3 != k) {
                            c.g[f3] = o;
                        }
                        n3 = f3 + 1;
                    }
                    ++k;
                    f3 = n3;
                }
                for (int f4 = c.f, n4 = f3; n4 < f4; ++n4) {
                    c.g[n4] = null;
                }
                c.f = f3;
                int n5 = a2;
                if (f3 > 0) {
                    if (a2 != j) {
                        final int[] array = (int[])l.b;
                        final int n6 = array[a2];
                        array[a2] = n2;
                        array[j] = n6;
                    }
                    n5 = a2 + 1;
                }
                ++j;
                a2 = n5;
            }
            for (int a3 = l.a, n7 = a2; n7 < a3; ++n7) {
                ((Object[])l.c)[((int[])l.b)[n7]] = null;
            }
            l.a = a2;
            this.g();
            this.m.clear();
        }
        else {
            final HashSet set3 = (HashSet)ref$ObjectRef.element;
            if (set3 != null) {
                final t m = this.l;
                final int a4 = m.a;
                int n8 = 0;
                int a5 = 0;
                while (n8 < a4) {
                    final int n9 = ((int[])m.b)[n8];
                    final a1.c c2 = ((a1.c[])m.d)[n9];
                    e.c((Object)c2);
                    final int f5 = c2.f;
                    int n10 = 0;
                    int f6 = 0;
                    while (n10 < f5) {
                        final Object o2 = c2.g[n10];
                        e.d(o2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        int n11 = f6;
                        if (!set3.contains(o2)) {
                            if (f6 != n10) {
                                c2.g[f6] = o2;
                            }
                            n11 = f6 + 1;
                        }
                        ++n10;
                        f6 = n11;
                    }
                    for (int f7 = c2.f, n12 = f6; n12 < f7; ++n12) {
                        c2.g[n12] = null;
                    }
                    c2.f = f6;
                    int n13 = a5;
                    if (f6 > 0) {
                        if (a5 != n8) {
                            final int[] array2 = (int[])m.b;
                            final int n14 = array2[a5];
                            array2[a5] = n9;
                            array2[n8] = n14;
                        }
                        n13 = a5 + 1;
                    }
                    ++n8;
                    a5 = n13;
                }
                for (int a6 = m.a, n15 = a5; n15 < a6; ++n15) {
                    ((Object[])m.c)[((int[])m.b)[n15]] = null;
                }
                m.a = a5;
                this.g();
            }
        }
    }
    
    public final boolean d(final a1.c c) {
        final c$a c$a = new c$a(c);
        while (c$a.hasNext()) {
            final Object next = c$a.next();
            if (this.l.c(next) || this.n.c(next)) {
                return true;
            }
        }
        return false;
    }
    
    public final void dispose() {
        synchronized (this.i) {
            if (!this.x) {
                this.x = true;
                this.y = (p<? super d, ? super Integer, j>)ComposableSingletons$CompositionKt.b;
                final ArrayList i = this.v.I;
                if (i != null) {
                    this.f(i);
                }
                final boolean b = this.k.g > 0;
                if (b || (true ^ this.j.isEmpty())) {
                    final i.i$a i$a = new i.i$a((HashSet)this.j);
                    if (b) {
                        final x0 g = this.k.g();
                        try {
                            ComposerKt.e(g, (r0)i$a);
                            final j a = cg2.j.a;
                            g.f();
                            this.g.clear();
                            i$a.e();
                        }
                        finally {
                            g.f();
                        }
                    }
                    i$a.d();
                }
                this.v.P();
            }
            final j a2 = cg2.j.a;
            monitorexit(this.i);
            this.f.p((m)this);
        }
    }
    
    public final void e(final mg2.a<j> a) {
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
    
    public final void f(final ArrayList list) {
        final i.i$a i$a = new i.i$a((HashSet)this.j);
        try {
            int n = list.isEmpty() ? 1 : 0;
            if (n != 0) {
                return;
            }
            Trace.beginSection("Compose:applyChanges");
            try {
                this.g.getClass();
                Object o = this.k.g();
                try {
                    Object g = this.g;
                    for (int size = list.size(), i = 0; i < size; ++i) {
                        ((q)list.get(i)).invoke(g, o, (Object)i$a);
                    }
                    list.clear();
                    final j a = cg2.j.a;
                    ((x0)o).f();
                    this.g.b();
                    Trace.endSection();
                    i$a.e();
                    i$a.f();
                    if (this.s) {
                    Label_0176_Outer:
                        while (true) {
                            Trace.beginSection("Compose:unobserve");
                            int size = 0;
                            int i = 0;
                            t l = null;
                            int a2;
                            int n2 = 0;
                            int n3 = 0;
                            int f;
                            int n4 = 0;
                            p0 p;
                            z0.b c;
                            boolean b = false;
                            int n5;
                            Label_0442:Label_0224_Outer:
                            while (true) {
                            Label_0345:
                                while (true) {
                                    Label_0306: {
                                        Label_0303: {
                                            Label_0292: {
                                                try {
                                                    this.s = false;
                                                    l = this.l;
                                                    a2 = l.a;
                                                    n2 = 0;
                                                    i = 0;
                                                    if (n2 >= a2) {
                                                        break Label_0442;
                                                    }
                                                    n3 = ((int[])l.b)[n2];
                                                    g = ((a1.c[])l.d)[n3];
                                                    e.c(g);
                                                    f = ((a1.c)g).f;
                                                    n4 = 0;
                                                    size = 0;
                                                    if (n4 >= f) {
                                                        break Label_0345;
                                                    }
                                                    o = ((a1.c)g).g[n4];
                                                    e.d(o, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                                    p = (p0)o;
                                                    if (p.b == null) {
                                                        break Label_0303;
                                                    }
                                                    c = p.c;
                                                    if (c != null) {
                                                        n = (c.a() ? 1 : 0);
                                                        break Label_0292;
                                                    }
                                                }
                                                finally {
                                                    continue Label_0176_Outer;
                                                }
                                                n = 0;
                                            }
                                            if (n != 0) {
                                                b = true;
                                                break Label_0306;
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
                                        o = l.b;
                                        size = ((int[])o)[i];
                                        ((int[])o)[i] = n3;
                                        ((int[])o)[n2] = size;
                                    }
                                    n4 = i + 1;
                                }
                                ++n2;
                                i = n4;
                                continue Label_0224_Outer;
                            }
                            for (int a3 = l.a, k = i; k < a3; ++k) {
                                ((Object[])l.c)[((int[])l.b)[k]] = null;
                            }
                            l.a = i;
                            this.g();
                            final j a4 = cg2.j.a;
                            Trace.endSection();
                            break;
                        }
                    }
                }
                finally {
                    ((x0)o).f();
                }
            }
            finally {
                Trace.endSection();
            }
        }
        finally {
            if (this.p.isEmpty()) {
                i$a.d();
            }
        }
    }
    
    public final void g() {
        final t n = this.n;
        final int a = n.a;
        int i = 0;
        int a2 = 0;
        while (i < a) {
            final int n2 = ((int[])n.b)[i];
            final a1.c c = ((a1.c[])n.d)[n2];
            e.c((Object)c);
            final int f = c.f;
            int j = 0;
            int f2 = 0;
            while (j < f) {
                final Object o = c.g[j];
                e.d(o, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                final n n3 = (n)o;
                int n4 = f2;
                if (!(this.l.c((Object)n3) ^ true)) {
                    if (f2 != j) {
                        c.g[f2] = o;
                    }
                    n4 = f2 + 1;
                }
                ++j;
                f2 = n4;
            }
            for (int f3 = c.f, k = f2; k < f3; ++k) {
                c.g[k] = null;
            }
            c.f = f2;
            int n5 = a2;
            if (f2 > 0) {
                if (a2 != i) {
                    final int[] array = (int[])n.b;
                    final int n6 = array[a2];
                    array[a2] = n2;
                    array[i] = n6;
                }
                n5 = a2 + 1;
            }
            ++i;
            a2 = n5;
        }
        for (int a3 = n.a, l = a2; l < a3; ++l) {
            ((Object[])n.c)[((int[])n.b)[l]] = null;
        }
        n.a = a2;
        final Iterator<p0> iterator = this.m.iterator();
        e.e((Object)iterator, "iterator()");
        while (iterator.hasNext()) {
            if (iterator.next().g != null ^ true) {
                iterator.remove();
            }
        }
    }
    
    public final void h(final ArrayList list) {
        final int size = list.size();
        boolean b = false;
        int i = 0;
        while (true) {
            while (i < size) {
                if (!e.a((Object)((f0)((Pair)list.get(i)).getFirst()).c, (Object)this)) {
                    ComposerKt.f(b);
                    try {
                        final ComposerImpl v = this.v;
                        v.getClass();
                        try {
                            v.a0(list);
                            v.L();
                            final j a = cg2.j.a;
                            return;
                        }
                        finally {
                            v.J();
                        }
                    }
                    finally {
                        try {
                            if (this.j.isEmpty() ^ true) {
                                new i.i$a((HashSet)this.j).d();
                            }
                        }
                        catch (final Exception ex) {
                            this.a();
                            throw ex;
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
    
    public final void i() {
        final AtomicReference<Object> h = this.h;
        final Object a = z0.j.a;
        final Set andSet = h.getAndSet(a);
        if (andSet != null) {
            if (e.a((Object)andSet, a)) {
                ComposerKt.c("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                this.b(true, andSet);
            }
            else {
                if (!(andSet instanceof Object[])) {
                    final StringBuilder t = a.t("corrupt pendingModifications drain: ");
                    t.append(this.h);
                    ComposerKt.c(t.toString());
                    throw null;
                }
                final Set[] array = (Object)andSet;
                for (int i = 0; i < array.length; ++i) {
                    this.b(true, array[i]);
                }
            }
        }
    }
    
    public final void invalidateAll() {
        synchronized (this.i) {
            final Object[] h = this.k.h;
            for (int i = 0; i < h.length; ++i) {
                final Object o = h[i];
                p0 p0;
                if (o instanceof p0) {
                    p0 = (p0)o;
                }
                else {
                    p0 = null;
                }
                if (p0 != null) {
                    p0.invalidate();
                }
            }
            final j a = cg2.j.a;
        }
    }
    
    public final boolean isDisposed() {
        return this.x;
    }
    
    public final void j(final ComposableLambdaImpl composableLambdaImpl) {
        try {
            final Object i = this.i;
            monitorenter(i);
            Label_0060: {
                b<p0, a1.c<Object>> r;
                try {
                    this.i();
                    r = this.r;
                    this.r = (b<p0, a1.c<Object>>)new b();
                    final i j = this;
                    final ComposerImpl composerImpl = j.v;
                    final b<p0, a1.c<Object>> b = r;
                    final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                    composerImpl.M((b)b, composableLambdaImpl2);
                    final j k = cg2.j.a;
                    final Object o = i;
                    monitorexit(o);
                    return;
                }
                finally {
                    break Label_0060;
                }
                try {
                    final i j = this;
                    final ComposerImpl composerImpl = j.v;
                    final b<p0, a1.c<Object>> b = r;
                    final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                    composerImpl.M((b)b, composableLambdaImpl2);
                    final j k = cg2.j.a;
                    final Object o = i;
                    monitorexit(o);
                    return;
                }
                catch (final Exception ex) {
                    this.r = r;
                    throw ex;
                }
            }
            monitorexit(i);
        }
        finally {
            try {
                if (this.j.isEmpty() ^ true) {
                    new i.i$a((HashSet)this.j).d();
                }
            }
            catch (final Exception ex2) {
                this.a();
                throw ex2;
            }
        }
    }
    
    public final void k(final p<? super d, ? super Integer, j> y) {
        if (this.x ^ true) {
            this.y = y;
            this.f.a((m)this, (ComposableLambdaImpl)y);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }
    
    public final void l() {
        final Set[] andSet = this.h.getAndSet(null);
        if (!e.a((Object)andSet, z0.j.a)) {
            if (andSet instanceof Set) {
                this.b(false, andSet);
            }
            else if (andSet instanceof Object[]) {
                final Set[] array = andSet;
                for (int length = array.length, i = 0; i < length; ++i) {
                    this.b(false, array[i]);
                }
            }
            else {
                if (andSet == null) {
                    ComposerKt.c("calling recordModificationsOf and applyChanges concurrently is not supported");
                    throw null;
                }
                final StringBuilder t = a.t("corrupt pendingModifications drain: ");
                t.append(this.h);
                ComposerKt.c(t.toString());
                throw null;
            }
        }
    }
    
    public final void m() {
        final Object i = this.i;
        monitorenter(i);
        Label_0052: {
            try {
                this.v.u.clear();
                if (this.j.isEmpty() ^ true) {
                    new i.i$a((HashSet)this.j).d();
                }
                break Label_0052;
            }
            finally {
                Label_0100: {
                    final Throwable t;
                    try {
                        try {
                            if (this.j.isEmpty() ^ true) {
                                new i.i$a((HashSet)this.j).d();
                                throw t;
                            }
                            throw t;
                        }
                        finally {}
                    }
                    catch (final Exception ex) {
                        break Label_0100;
                    }
                    throw t;
                }
                this.a();
                throw;
                monitorexit(i);
                final j a = cg2.j.a;
                monitorexit(i);
            }
        }
    }
    
    public final void n() {
        final Object i = this.i;
        monitorenter(i);
        EndFinally_1: {
            try {
                if (this.p.isEmpty() ^ true) {
                    this.f(this.p);
                }
                break EndFinally_1;
            }
            finally {
                try {
                    try {
                        if (this.j.isEmpty() ^ true) {
                            new i.i$a((HashSet)this.j).d();
                        }
                    }
                    finally {}
                }
                catch (final Exception ex) {}
                break EndFinally_1;
                this.a();
                throw;
                monitorexit(i);
                final j a = cg2.j.a;
                monitorexit(i);
            }
        }
    }
    
    public final InvalidationResult o(final p0 p2, final Object o) {
        e.f((Object)p2, "scope");
        final int a = p2.a;
        final int n = 0;
        if ((a & 0x2) != 0x0) {
            p2.a = (a | 0x4);
        }
        final z0.b c = p2.c;
        if (c == null || !this.k.k(c) || !c.a()) {
            return InvalidationResult.IGNORED;
        }
        if (!c.a()) {
            return InvalidationResult.IGNORED;
        }
        int n2 = n;
        if (p2.d != null) {
            n2 = 1;
        }
        if (n2 == 0) {
            return InvalidationResult.IGNORED;
        }
        return this.y(p2, c, o);
    }
    
    public final <R> R p(final m m, final int u, final mg2.a<? extends R> a) {
        if (m != null && !e.a((Object)m, (Object)this) && u >= 0) {
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
    
    public final void q(e0 g) {
        final i.i$a i$a = new i.i$a((HashSet)this.j);
        g = (e0)g.a.g();
        try {
            ComposerKt.e((x0)g, (r0)i$a);
            final j a = cg2.j.a;
            ((x0)g).f();
            i$a.e();
        }
        finally {
            ((x0)g).f();
        }
    }
    
    public final boolean r() {
        synchronized (this.i) {
            this.i();
            try {
                final b<p0, a1.c<Object>> r = this.r;
                this.r = (b<p0, a1.c<Object>>)new b();
                try {
                    final boolean i0 = this.v.i0((b)r);
                    if (!i0) {
                        this.l();
                    }
                    return i0;
                }
                catch (final Exception ex) {
                    this.r = r;
                    throw ex;
                }
            }
            finally {
                try {
                    if (this.j.isEmpty() ^ true) {
                        new i.i$a((HashSet)this.j).d();
                    }
                }
                catch (final Exception ex2) {}
                EndFinally_0: {
                    break EndFinally_0;
                    this.a();
                }
            }
        }
    }
    
    public final void s(final Object o) {
        e.f(o, "value");
        final ComposerImpl v = this.v;
        final int z = v.z;
        final int n = 1;
        if (z <= 0) {
            final p0 y = v.Y();
            if (y != null) {
                y.a |= 0x1;
                this.l.a(o, (Object)y);
                final boolean b = o instanceof n;
                if (b) {
                    this.n.f(o);
                    for (final Object o2 : ((n)o).j()) {
                        if (o2 == null) {
                            break;
                        }
                        this.n.a(o2, o);
                    }
                }
                int n2;
                if ((y.a & 0x20) != 0x0) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0) {
                    a1.a f;
                    if ((f = y.f) == null) {
                        f = new a1.a();
                        y.f = f;
                    }
                    f.a(o, y.e);
                    if (b) {
                        b g;
                        if ((g = y.g) == null) {
                            g = new b();
                            y.g = g;
                        }
                        g.c(o, ((n)o).g());
                    }
                }
            }
        }
    }
    
    public final void t(final Set<?> set) {
        e.f((Object)set, "values");
        boolean b;
        Set[] value;
        do {
            value = this.h.get();
            b = true;
            Object copy;
            if (value == null || e.a((Object)value, z0.j.a)) {
                copy = set;
            }
            else if (value instanceof Set) {
                copy = new Set[] { (Set)value, set };
            }
            else {
                if (!(value instanceof Object[])) {
                    final StringBuilder t = a.t("corrupt pendingModifications: ");
                    t.append(this.h);
                    throw new IllegalStateException(t.toString().toString());
                }
                e.d((Object)value, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
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
                this.l();
                final j a = cg2.j.a;
            }
        }
    }
    
    public final void u() {
        final Object i = this.i;
        monitorenter(i);
        try {
            this.f(this.o);
            this.l();
            final j a = cg2.j.a;
            monitorexit(i);
        }
        finally {
            Label_0066: {
                try {
                    try {
                        if (this.j.isEmpty() ^ true) {
                            new i.i$a((HashSet)this.j).d();
                            break Label_0066;
                        }
                        break Label_0066;
                    }
                    finally {}
                }
                catch (final Exception ex) {}
            }
            EndFinally_1: {
                break EndFinally_1;
                this.a();
                throw;
                monitorexit(i);
            }
        }
    }
    
    public final boolean v() {
        return this.v.C;
    }
    
    public final void w(final Object o) {
        e.f(o, "value");
        synchronized (this.i) {
            this.z(o);
            final t n = this.n;
            final int d = n.d(o);
            if (d >= 0) {
                final a1.c g = n.g(d);
                for (int i = 0; i < g.f; ++i) {
                    this.z(g.get(i));
                }
            }
            final j a = cg2.j.a;
        }
    }
    
    public final boolean x() {
        synchronized (this.i) {
            return this.r.c > 0;
        }
    }
    
    public final InvalidationResult y(final p0 p3, final z0.b b, final Object o) {
        synchronized (this.i) {
            i t = this.t;
            if (t == null || !this.k.d(b, this.u)) {
                t = null;
            }
            if (t == null) {
                final ComposerImpl v = this.v;
                if (v.C && v.C0(p3, o)) {
                    return InvalidationResult.IMMINENT;
                }
                if (o == null) {
                    this.r.c((Object)p3, (Object)null);
                }
                else {
                    final b<p0, a1.c<Object>> r = this.r;
                    final Object a = z0.j.a;
                    r.getClass();
                    e.f((Object)p3, "key");
                    if (r.a((Object)p3) >= 0) {
                        final a1.c c = (a1.c)r.b((Object)p3);
                        if (c != null) {
                            c.add(o);
                        }
                    }
                    else {
                        final a1.c c2 = new a1.c();
                        c2.add(o);
                        final j a2 = cg2.j.a;
                        r.c((Object)p3, (Object)c2);
                    }
                }
            }
            monitorexit(this.i);
            if (t != null) {
                return t.y(p3, b, o);
            }
            this.f.i((m)this);
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
    
    public final void z(final Object o) {
        final t l = this.l;
        final int d = l.d(o);
        if (d >= 0) {
            final a1.c g = l.g(d);
            for (int i = 0; i < g.f; ++i) {
                final p0 p = (p0)g.get(i);
                final i b = p.b;
                InvalidationResult invalidationResult;
                if (b == null || (invalidationResult = b.o(p, o)) == null) {
                    invalidationResult = InvalidationResult.IGNORED;
                }
                if (invalidationResult == InvalidationResult.IMMINENT) {
                    this.q.a(o, (Object)p);
                }
            }
        }
    }
}
