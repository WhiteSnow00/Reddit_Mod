// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import org.matrix.android.sdk.internal.database.model.RoomMemberSummaryEntityInternal;
import hj2.n;
import hj2.c0;
import hj2.i;
import hj2.a0;
import rg2.s;
import org.matrix.android.sdk.api.session.presence.model.PresenceEnum;
import iq2.f0;
import java.io.Serializable;
import com.squareup.moshi.JsonAdapter;
import org.matrix.android.sdk.api.failure.MatrixError;
import org.matrix.android.sdk.api.failure.Failure$ServerError;
import hj2.u;
import java.util.NoSuchElementException;
import hj2.o;
import hj2.r;
import hj2.t;
import hj2.y;
import org.matrix.android.sdk.internal.util.HashKt;
import cj2.j;
import org.matrix.android.sdk.api.auth.data.Credentials;
import hj2.l;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.CoroutineStart;
import ej2.g;
import ej2.p1;
import ej2.b0;
import lg.e0;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import ok2.q;
import ok2.m;
import kotlinx.coroutines.channels.BufferOverflow;
import ij2.f$a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.CoroutineContext$b;
import ej2.z0;
import kotlinx.coroutines.CoroutineDispatcher;
import hj2.e;
import hj2.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import rg2.p;
import hj2.v;
import ek2.h;

public final class a implements h
{
    public static final Object A(v v, final p p3, final c c) {
        Object o = null;
        Label_0049: {
            if (c instanceof FlowKt__ReduceKt$firstOrNull$3) {
                final FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3 = (FlowKt__ReduceKt$firstOrNull$3)c;
                final int label = flowKt__ReduceKt$firstOrNull$3.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__ReduceKt$firstOrNull$3.label = label + Integer.MIN_VALUE;
                    o = flowKt__ReduceKt$firstOrNull$3;
                    break Label_0049;
                }
            }
            o = new FlowKt__ReduceKt$firstOrNull$3(c);
        }
        final Object result = ((FlowKt__ReduceKt$firstOrNull$3)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FlowKt__ReduceKt$firstOrNull$3)o).label;
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3 = null;
        Label_0188: {
            if (label2 != 0) {
                if (label2 == 1) {
                    final FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2)((FlowKt__ReduceKt$firstOrNull$3)o).L$1;
                    v = (v)((FlowKt__ReduceKt$firstOrNull$3)o).L$0;
                    try {
                        b.k0(result);
                        return ((Ref$ObjectRef)v).element;
                    }
                    catch (final AbortFlowException ex) {
                        flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                        break Label_0188;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(result);
            final Object l$0 = new Ref$ObjectRef();
            final FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 l$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(p3, (Ref$ObjectRef)l$0);
            try {
                ((FlowKt__ReduceKt$firstOrNull$3)o).L$0 = l$0;
                ((FlowKt__ReduceKt$firstOrNull$3)o).L$1 = l$2;
                ((FlowKt__ReduceKt$firstOrNull$3)o).label = 1;
                if (((AbstractFlow)v).a((f)l$2, (c)o) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                v = (v)l$0;
                return ((Ref$ObjectRef)v).element;
            }
            catch (final AbortFlowException ex) {
                v = (v)l$0;
                flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3 = l$2;
            }
        }
        final AbortFlowException ex;
        if (ex.owner != flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3) {
            throw ex;
        }
        return ((Ref$ObjectRef)v).element;
    }
    
    public static final e B(e a, final CoroutineDispatcher coroutineDispatcher) {
        if (coroutineDispatcher.get((kotlin.coroutines.CoroutineContext$b<CoroutineContext$a>)z0.b.f) == null) {
            if (!sg2.e.a((Object)coroutineDispatcher, (Object)EmptyCoroutineContext.INSTANCE)) {
                if (a instanceof ij2.f) {
                    a = f$a.a((ij2.f)a, coroutineDispatcher, 0, (BufferOverflow)null, 6);
                }
                else {
                    a = new ij2.c((e)a, coroutineDispatcher, 0, (BufferOverflow)null, 12);
                }
            }
            return (e)a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Flow context cannot contain job in it. Had ");
        sb.append(coroutineDispatcher);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static m C(final String s) {
        if (s.equals("SHA-256")) {
            return vk2.b.a;
        }
        if (s.equals("SHA-512")) {
            return vk2.b.c;
        }
        if (s.equals("SHAKE128")) {
            return vk2.b.g;
        }
        if (s.equals("SHAKE256")) {
            return vk2.b.h;
        }
        throw new IllegalArgumentException(al0.b.h("unrecognized digest: ", s));
    }
    
    public static String D(final m m) {
        if (((q)m).n((q)vk2.b.a)) {
            return "SHA256";
        }
        if (((q)m).n((q)vk2.b.c)) {
            return "SHA512";
        }
        if (((q)m).n((q)vk2.b.g)) {
            return "SHAKE128";
        }
        if (((q)m).n((q)vk2.b.h)) {
            return "SHAKE256";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("unrecognized digest OID: ");
        sb.append(m);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final void E(final CoroutineContext coroutineContext, final Throwable t) {
        if (t instanceof CancellationException) {
            return;
        }
        try {
            RxJavaPlugins.onError(t);
        }
        finally {
            final Throwable t2;
            lw0.b.u(t, t2);
            e0.V(coroutineContext, t);
        }
    }
    
    public static final p1 F(final e e, final b0 b0) {
        return g.i(b0, (CoroutineContext)null, (CoroutineStart)null, (p)new FlowKt__CollectKt$launchIn$1(e, (c)null), 3);
    }
    
    public static final Object G(final String s) {
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append("org.kethereum.crypto.impl.");
            sb.append(s);
            return Class.forName(sb.toString()).newInstance();
        }
        catch (final ClassNotFoundException ex) {
            throw new RuntimeException(a.k("There is not implementation found for ", s, " - you need to either depend on crypto_impl_spongycastle or crypto_impl_bouncycastle"));
        }
    }
    
    public static final ChannelFlowTransformLatest H(final p p2, final e e) {
        final int a = l.a;
        return O(e, (rg2.q)new FlowKt__MergeKt$mapLatest$1(p2, (c)null));
    }
    
    public static final kotlinx.coroutines.flow.internal.e I(final e e, final long n) {
        if (n > 0L) {
            return new kotlinx.coroutines.flow.internal.e((rg2.q)new FlowKt__DelayKt$sample$2(n, e, (c)null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }
    
    public static final String J(final Credentials credentials) {
        sg2.e.f((Object)credentials, "<this>");
        final String e = credentials.e;
        String s;
        if (e == null || j.H0((CharSequence)e)) {
            s = credentials.a;
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(credentials.a);
            sb.append('|');
            sb.append(credentials.e);
            s = sb.toString();
        }
        return HashKt.a(s);
    }
    
    public static final t K(final e e, final b0 b0, final y y, final int n) {
        final ec.m a = d.a(e, n);
        final kotlinx.coroutines.flow.f k = a92.b.k(n, a.a, (BufferOverflow)a.c);
        return new t(k, d.b(b0, (CoroutineContext)a.d, (e)a.b, (r)k, y, (Object)a92.b.o));
    }
    
    public static final Object L(final v v, final c c) {
        Object o = null;
        Label_0046: {
            if (c instanceof FlowKt__ReduceKt$single$1) {
                final FlowKt__ReduceKt$single$1 flowKt__ReduceKt$single$1 = (FlowKt__ReduceKt$single$1)c;
                final int label = flowKt__ReduceKt$single$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__ReduceKt$single$1.label = label + Integer.MIN_VALUE;
                    o = flowKt__ReduceKt$single$1;
                    break Label_0046;
                }
            }
            o = new FlowKt__ReduceKt$single$1(c);
        }
        final Object result = ((FlowKt__ReduceKt$single$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FlowKt__ReduceKt$single$1)o).label;
        Object o2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o2 = ((FlowKt__ReduceKt$single$1)o).L$0;
            b.k0(result);
        }
        else {
            b.k0(result);
            final Ref$ObjectRef l$0 = new Ref$ObjectRef();
            l$0.element = a92.b.q;
            final o o3 = new o(l$0);
            ((FlowKt__ReduceKt$single$1)o).L$0 = l$0;
            ((FlowKt__ReduceKt$single$1)o).label = 1;
            if (((AbstractFlow)v).a((f)o3, (c)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o2 = l$0;
        }
        final Object element = ((Ref$ObjectRef)o2).element;
        if (element == a92.b.q) {
            throw new NoSuchElementException("Flow is empty");
        }
        return element;
    }
    
    public static final u M(final e e, final b0 b0, final y y, final Object o) {
        final ec.m a = d.a(e, 1);
        final StateFlowImpl n = bg.d.n(o);
        return new u(n, d.b(b0, (CoroutineContext)a.d, (e)a.b, (r)n, y, o));
    }
    
    public static final String N(Throwable t) {
        final boolean b = t instanceof Failure$ServerError;
        final Throwable t2 = null;
        Failure$ServerError failure$ServerError;
        if (b) {
            failure$ServerError = (Failure$ServerError)t;
        }
        else {
            failure$ServerError = null;
        }
        Label_0054: {
            if (failure$ServerError == null) {
                break Label_0054;
            }
            final JsonAdapter a = kq2.d.a.a((Class)MatrixError.class);
            while (true) {
                try {
                    Serializable s = a.toJson((Object)((Failure$ServerError)t).getError());
                    if (s == null) {
                        s = t.getLocalizedMessage();
                    }
                    t = (Throwable)s;
                    if (s == null) {
                        t = (Throwable)"error";
                    }
                    return (String)t;
                }
                finally {
                    final Serializable s = t2;
                    continue;
                }
                break;
            }
        }
    }
    
    public static final ChannelFlowTransformLatest O(final e e, final rg2.q q) {
        final int a = l.a;
        return new ChannelFlowTransformLatest(q, e, (CoroutineContext)EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }
    
    public static final uo2.g a(final f0 f0) {
        sg2.e.f((Object)f0, "<this>");
        final String userId = ((RoomMemberSummaryEntityInternal)f0).getUserId();
        final jq2.a a = f0.a;
        mo2.a a2;
        if (a != null) {
            a2 = new mo2.a(PresenceEnum.valueOf(a.g), a.b, a.c, a.d);
        }
        else {
            a2 = null;
        }
        return new uo2.g(((RoomMemberSummaryEntityInternal)f0).getMembership(), userId, a2, ((RoomMemberSummaryEntityInternal)f0).getDisplayName(), ((RoomMemberSummaryEntityInternal)f0).getAvatarUrl());
    }
    
    public static e b(e a, int n) {
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        if (n >= 0 || n == -2 || n == -1) {
            if (n == -1) {
                bufferOverflow = BufferOverflow.DROP_OLDEST;
                n = 0;
            }
            if (a instanceof ij2.f) {
                a = f$a.a((ij2.f)a, (CoroutineDispatcher)null, n, bufferOverflow, 1);
            }
            else {
                a = new ij2.c((e)a, (CoroutineDispatcher)null, n, bufferOverflow, 2);
            }
            return (e)a;
        }
        throw new IllegalArgumentException(d.h("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", n).toString());
    }
    
    public static final CallbackFlowBuilder c(final p p) {
        return new CallbackFlowBuilder(p, (CoroutineContext)EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }
    
    public static final Serializable d(final c c, e o, final f f) {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1 = null;
        Label_0047: {
            if (c instanceof FlowKt__ErrorsKt$catchImpl$1) {
                flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1)c;
                final int label = flowKt__ErrorsKt$catchImpl$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__ErrorsKt$catchImpl$1.label = label + Integer.MIN_VALUE;
                    break Label_0047;
                }
            }
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(c);
        }
        Object result = flowKt__ErrorsKt$catchImpl$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__ErrorsKt$catchImpl$1.label;
        final int n = 1;
        final Throwable t;
        Label_0172: {
            if (label2 != 0) {
                if (label2 == 1) {
                    o = flowKt__ErrorsKt$catchImpl$1.L$0;
                    try {
                        b.k0(result);
                        return t;
                    }
                    finally {
                        break Label_0172;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(result);
            result = new Ref$ObjectRef();
            try {
                final FlowKt__ErrorsKt$catchImpl$2 flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2(f, (Ref$ObjectRef)result);
                flowKt__ErrorsKt$catchImpl$1.L$0 = result;
                flowKt__ErrorsKt$catchImpl$1.label = 1;
                if (((e)o).a((f)flowKt__ErrorsKt$catchImpl$2, (c)flowKt__ErrorsKt$catchImpl$1) == coroutine_SUSPENDED) {
                    return t;
                }
                return t;
            }
            finally {
                o = result;
            }
        }
        final Throwable t2 = (Throwable)((Ref$ObjectRef)o).element;
        final boolean b = false;
        if (t2 == null || !sg2.e.a((Object)t2, (Object)t)) {
            final z0 z0 = (z0)((c)flowKt__ErrorsKt$catchImpl$1).getContext().get((CoroutineContext$b)ej2.z0.b.f);
            int n2 = b ? 1 : 0;
            if (z0 != null) {
                if (!z0.isCancelled()) {
                    n2 = (b ? 1 : 0);
                }
                else {
                    final CancellationException g = z0.G();
                    if (g != null && sg2.e.a((Object)g, (Object)t)) {
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                }
            }
            if (n2 == 0) {
                if (t2 == null) {
                    return t;
                }
                if (t instanceof CancellationException) {
                    lw0.b.u(t2, t);
                    throw t2;
                }
                lw0.b.u(t, t2);
                throw t;
            }
        }
        throw t;
    }
    
    public static final hj2.c e(final p p) {
        return new hj2.c(p, (CoroutineContext)EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }
    
    public static final Object f(final e e, final c c) {
        Object o = e.a((f)ij2.h.f, c);
        if (o != CoroutineSingletons.COROUTINE_SUSPENDED) {
            o = hg2.j.a;
        }
        return o;
    }
    
    public static final Object g(final e e, final p p3, final c c) {
        Object o = f(b((e)H(p3, e), 0), c);
        if (o != CoroutineSingletons.COROUTINE_SUSPENDED) {
            o = hg2.j.a;
        }
        return o;
    }
    
    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 h(final e e, final e e2, final e e3, final rg2.r r) {
        return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1(new e[] { e, e2, e3 }, r);
    }
    
    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 i(final e e, final e e2, final e e3, final e e4, final s s) {
        return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2(new e[] { e, e2, e3, e4 }, s);
    }
    
    public static final hj2.b j(final gj2.p p) {
        return new hj2.b(p, true);
    }
    
    public static byte[] k(final short[] array) {
        final byte[] array2 = new byte[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = (byte)array[i];
        }
        return array2;
    }
    
    public static short[] l(final byte[] array) {
        final short[] array2 = new short[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = (short)(array[i] & 0xFF);
        }
        return array2;
    }
    
    public static byte[][] m(final short[][] array) {
        final byte[][] array2 = new byte[array.length][array[0].length];
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[0].length; ++j) {
                array2[i][j] = (byte)array[i][j];
            }
        }
        return array2;
    }
    
    public static short[][] n(final byte[][] array) {
        final short[][] array2 = new short[array.length][array[0].length];
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[0].length; ++j) {
                array2[i][j] = (short)(array[i][j] & 0xFF);
            }
        }
        return array2;
    }
    
    public static byte[][][] o(final short[][][] array) {
        final int length = array.length;
        final short[][] array2 = array[0];
        final byte[][][] array3 = new byte[length][array2.length][array2[0].length];
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[0].length; ++j) {
                for (int k = 0; k < array[0][0].length; ++k) {
                    array3[i][j][k] = (byte)array[i][j][k];
                }
            }
        }
        return array3;
    }
    
    public static short[][][] p(final byte[][][] array) {
        final int length = array.length;
        final byte[][] array2 = array[0];
        final short[][][] array3 = new short[length][array2.length][array2[0].length];
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[0].length; ++j) {
                for (int k = 0; k < array[0][0].length; ++k) {
                    array3[i][j][k] = (short)(array[i][j][k] & 0xFF);
                }
            }
        }
        return array3;
    }
    
    public static final e q(e e, final long n) {
        final long n2 = lcmp(n, 0L);
        if (n2 >= 0) {
            if (n2 != 0) {
                e = new kotlinx.coroutines.flow.internal.e((rg2.q)new FlowKt__DelayKt$debounceInternal$1((rg2.l)new FlowKt__DelayKt$debounce$2(n), (e)e, (c)null));
            }
            return e;
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }
    
    public static final e r(e distinctFlowImpl) {
        final rg2.l a = FlowKt__DistinctKt.a;
        if (!(distinctFlowImpl instanceof a0)) {
            final rg2.l a2 = FlowKt__DistinctKt.a;
            final p b = FlowKt__DistinctKt.b;
            if (distinctFlowImpl instanceof DistinctFlowImpl) {
                final DistinctFlowImpl distinctFlowImpl2 = distinctFlowImpl;
                if (distinctFlowImpl2.g == a2 && distinctFlowImpl2.h == b) {
                    return (e)distinctFlowImpl;
                }
            }
            distinctFlowImpl = new DistinctFlowImpl((e)distinctFlowImpl, a2, b);
        }
        return (e)distinctFlowImpl;
    }
    
    public static final i s(final e e, final int n) {
        if (n >= 0) {
            return new i(e, n);
        }
        throw new IllegalArgumentException(d.h("Drop count should be non-negative, but had ", n).toString());
    }
    
    public static final Object t(final f f, final gj2.p p3, final c c) {
        Object o = FlowKt__ChannelsKt.a(f, p3, true, c);
        if (o != CoroutineSingletons.COROUTINE_SUSPENDED) {
            o = hg2.j.a;
        }
        return o;
    }
    
    public static final Object u(final c c, final e e, final f f) {
        if (!(f instanceof c0)) {
            Object o = e.a(f, c);
            if (o != CoroutineSingletons.COROUTINE_SUSPENDED) {
                o = hg2.j.a;
            }
            return o;
        }
        throw ((c0)f).f;
    }
    
    public static boolean v(final short[] array, final short[] array2) {
        if (array.length != array2.length) {
            return false;
        }
        int i = array.length - 1;
        boolean b = true;
        while (i >= 0) {
            b &= (array[i] == array2[i]);
            --i;
        }
        return b;
    }
    
    public static boolean w(final short[][] array, final short[][] array2) {
        if (array.length != array2.length) {
            return false;
        }
        int i = array.length;
        boolean b = true;
        --i;
        while (i >= 0) {
            b &= v(array[i], array2[i]);
            --i;
        }
        return b;
    }
    
    public static final Object x(e o, c l$0) {
        Object o2 = null;
        Label_0044: {
            if (l$0 instanceof FlowKt__ReduceKt$first$1) {
                o2 = l$0;
                final int label = ((FlowKt__ReduceKt$first$1)o2).label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    ((FlowKt__ReduceKt$first$1)o2).label = label + Integer.MIN_VALUE;
                    break Label_0044;
                }
            }
            o2 = new FlowKt__ReduceKt$first$1(l$0);
        }
        final Object result = ((FlowKt__ReduceKt$first$1)o2).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FlowKt__ReduceKt$first$1)o2).label;
        Label_0197: {
            hj2.m i = null;
            AbortFlowException ex = null;
            Label_0189: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        final hj2.m m = (hj2.m)((FlowKt__ReduceKt$first$1)o2).L$1;
                        o = ((FlowKt__ReduceKt$first$1)o2).L$0;
                        try {
                            b.k0(result);
                            break Label_0197;
                        }
                        catch (final AbortFlowException ex) {
                            i = m;
                            break Label_0189;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.k0(result);
                l$0 = (c)new Ref$ObjectRef();
                ((Ref$ObjectRef)l$0).element = a92.b.q;
                final hj2.m l$2 = new hj2.m((Ref$ObjectRef)l$0);
                try {
                    ((FlowKt__ReduceKt$first$1)o2).L$0 = l$0;
                    ((FlowKt__ReduceKt$first$1)o2).L$1 = l$2;
                    ((FlowKt__ReduceKt$first$1)o2).label = 1;
                    if (((e)o).a((f)l$2, (c)o2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    o = l$0;
                    break Label_0197;
                }
                catch (final AbortFlowException ex2) {
                    o = l$0;
                    ex = ex2;
                    i = l$2;
                }
            }
            if (ex.owner != i) {
                throw ex;
            }
        }
        final Object element = ((Ref$ObjectRef)o).element;
        if (element == a92.b.q) {
            throw new NoSuchElementException("Expected at least one element");
        }
        return element;
    }
    
    public static final Object y(e o, p l$0, c l$2) {
        Object o2 = null;
        Label_0047: {
            if (l$2 instanceof FlowKt__ReduceKt$first$3) {
                o2 = l$2;
                final int label = ((FlowKt__ReduceKt$first$3)o2).label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    ((FlowKt__ReduceKt$first$3)o2).label = label + Integer.MIN_VALUE;
                    break Label_0047;
                }
            }
            o2 = new FlowKt__ReduceKt$first$3(l$2);
        }
        final Object result = ((FlowKt__ReduceKt$first$3)o2).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FlowKt__ReduceKt$first$3)o2).label;
        Label_0215: {
            Label_0207: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        l$2 = (c)((FlowKt__ReduceKt$first$3)o2).L$2;
                        o = ((FlowKt__ReduceKt$first$3)o2).L$1;
                        l$0 = (p)((FlowKt__ReduceKt$first$3)o2).L$0;
                        try {
                            b.k0(result);
                            break Label_0215;
                        }
                        catch (final AbortFlowException ex) {
                            break Label_0207;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.k0(result);
                l$2 = (c)new Ref$ObjectRef();
                ((Ref$ObjectRef)l$2).element = a92.b.q;
                final FlowKt__ReduceKt$first$$inlined$collectWhile$2 l$3 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2(l$0, (Ref$ObjectRef)l$2);
                try {
                    ((FlowKt__ReduceKt$first$3)o2).L$0 = l$0;
                    ((FlowKt__ReduceKt$first$3)o2).L$1 = l$2;
                    ((FlowKt__ReduceKt$first$3)o2).L$2 = l$3;
                    ((FlowKt__ReduceKt$first$3)o2).label = 1;
                    final Object a = ((e)o).a(l$3, (c)o2);
                    o = l$2;
                    if (a == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    break Label_0215;
                }
                catch (final AbortFlowException ex) {
                    final Object o3 = l$3;
                    o = l$2;
                    l$2 = (c)o3;
                }
            }
            final AbortFlowException ex;
            if (ex.owner != l$2) {
                throw ex;
            }
        }
        final Object element = ((Ref$ObjectRef)o).element;
        if (element == a92.b.q) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected at least one element matching the predicate ");
            sb.append(l$0);
            throw new NoSuchElementException(sb.toString());
        }
        return element;
    }
    
    public static final Object z(e o, final c c) {
        Object o2 = null;
        Label_0046: {
            if (c instanceof FlowKt__ReduceKt$firstOrNull$1) {
                final FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1)c;
                final int label = flowKt__ReduceKt$firstOrNull$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__ReduceKt$firstOrNull$1.label = label + Integer.MIN_VALUE;
                    o2 = flowKt__ReduceKt$firstOrNull$1;
                    break Label_0046;
                }
            }
            o2 = new FlowKt__ReduceKt$firstOrNull$1(c);
        }
        final Object result = ((FlowKt__ReduceKt$firstOrNull$1)o2).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FlowKt__ReduceKt$firstOrNull$1)o2).label;
        n n2 = null;
        AbortFlowException ex = null;
        Label_0184: {
            if (label2 != 0) {
                if (label2 == 1) {
                    final n n = (n)((FlowKt__ReduceKt$firstOrNull$1)o2).L$1;
                    o = ((FlowKt__ReduceKt$firstOrNull$1)o2).L$0;
                    try {
                        b.k0(result);
                        return ((Ref$ObjectRef)o).element;
                    }
                    catch (final AbortFlowException ex) {
                        n2 = n;
                        break Label_0184;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(result);
            final Ref$ObjectRef l$0 = new Ref$ObjectRef();
            final n l$2 = new n(l$0);
            try {
                ((FlowKt__ReduceKt$firstOrNull$1)o2).L$0 = l$0;
                ((FlowKt__ReduceKt$firstOrNull$1)o2).L$1 = l$2;
                ((FlowKt__ReduceKt$firstOrNull$1)o2).label = 1;
                if (((e)o).a((f)l$2, (c)o2) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                o = l$0;
                return ((Ref$ObjectRef)o).element;
            }
            catch (final AbortFlowException ex2) {
                o = l$0;
                ex = ex2;
                n2 = l$2;
            }
        }
        if (ex.owner != n2) {
            throw ex;
        }
        return ((Ref$ObjectRef)o).element;
    }
}
