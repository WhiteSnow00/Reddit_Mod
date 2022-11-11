// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.work.f$a;
import java.util.TreeMap;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import android.util.Log;
import gg.h0;
import android.os.IInterface;
import gg.u0;
import gg.w0;
import android.os.IBinder;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import java.util.AbstractCollection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import ti2.p0;
import io.reactivex.plugins.RxJavaPlugins;
import ff2.q;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import ej2.s0;
import kotlin.coroutines.CoroutineContext$b;
import ej2.z0;
import kotlin.coroutines.CoroutineContext;
import android.os.HandlerThread;
import android.os.Handler;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import dev.chrisbanes.snapper.SnapOffsets;
import androidx.compose.foundation.lazy.LazyListState;
import android.content.DialogInterface$OnClickListener;
import com.reddit.screen.dialog.RedditAlertDialog;
import ej2.c0;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayDeque;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import java.lang.annotation.Annotation;
import java.util.LinkedHashSet;
import x82.k0;
import android.view.MotionEvent;
import java.util.Arrays;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import rg2.l;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import l32.h$f;
import l32.h$j;
import l32.h$a;
import l32.h$d;
import l32.h$m;
import l32.h$b;
import l32.h$l;
import l32.h$c;
import l32.h$g;
import l32.h$e;
import l32.h$k;
import l32.h$i;
import l32.h$h;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.ListIterator;
import com.reddit.domain.image.model.ImageResolution;
import org.matrix.android.sdk.api.failure.MatrixError;
import android.net.Uri;
import java.util.LinkedHashMap;
import com.tonyodev.fetch2core.Downloader$b;
import com.tonyodev.fetch2.Download;
import android.view.View;
import ti2.v0;
import kotlin.NoWhenBranchMatchedException;
import ti2.p;
import ti2.x;
import kotlin.text.Regex;
import org.matrix.android.sdk.internal.auth.version.Versions;
import org.matrix.android.sdk.api.failure.Failure$OtherServerError;
import org.matrix.android.sdk.api.auth.registration.RegistrationFlowResponse;
import com.reddit.domain.snoovatar.model.storefront.gallery.GalleryViewLoadMoreState;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a$a;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import org.matrix.android.sdk.api.session.room.model.Membership;
import com.squareup.moshi.JsonAdapter;
import org.matrix.android.sdk.api.session.room.model.RoomMemberContent;
import java.util.HashMap;
import pd.r;
import ti2.n0;
import kotlin.collections.EmptyList;
import java.util.List;
import com.squareup.moshi.y;
import org.matrix.android.sdk.api.session.events.model.UnsignedData;
import java.util.Map;
import org.matrix.android.sdk.internal.database.mapper.ContentMapper;
import org.matrix.android.sdk.api.session.room.send.SendState;
import org.matrix.android.sdk.api.session.events.model.Event;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.Resources$Theme;
import android.content.res.TypedArray;
import p3.f$b;
import com.reddit.ui.compose.components.gridview.gestures.DefaultFlingBehavior;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;
import hi2.s;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlinx.serialization.SerializationException;
import fn2.e$a;
import java.math.BigInteger;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import io.reactivex.internal.subscribers.BlockingSubscriber;
import java.util.concurrent.LinkedBlockingQueue;
import io.reactivex.internal.subscribers.BoundedSubscriber;
import io.reactivex.internal.functions.Functions$l;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.functions.Functions;
import io.reactivex.exceptions.MissingBackpressureException;
import nf2.i;
import org.matrix.android.sdk.internal.session.room.send.NoMerger;
import androidx.work.d$a;
import java.util.Iterator;
import cj2.j;
import java.util.ArrayList;
import java.io.File;
import org.matrix.android.sdk.api.failure.Failure$ServerError;
import java.io.IOException;
import org.matrix.android.sdk.api.failure.Failure$NetworkConnection;
import kotlinx.serialization.json.internal.JsonTreeDecoder;
import tj2.n;
import tj2.g;
import bg.d;
import sg2.h;
import kotlinx.serialization.json.JsonObject;
import rj2.c;
import tj2.f;
import kotlin.collections.EmptySet;
import kotlin.collections.b;
import java.util.Collections;
import java.util.Set;
import android.content.res.Resources;
import kf2.o;
import h80.a;
import com.instabug.library.util.filters.Filter;
import ij.m;
import ih.e;
import gg.u;
import gg.v;
import cg.t;
import gg.k;

public class a0 implements k, t, v, u, ih.e, m, b, Filter
{
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final int[] K;
    public static final int[] L;
    public static final byte[] M;
    public static final h80.a O;
    public static final int[] P;
    public static final int[] Q;
    public static final int[] R;
    public static final jj2.t S;
    public static final jj2.t T;
    public static volatile o h;
    public static volatile o i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;
    public static final int[] o;
    public static final int[] p;
    public static final int[] q;
    public static final int[] r;
    public static final int[] s;
    public static final int[] t;
    public static final int[] u;
    public static final int[] v;
    public static final int[] w;
    public static final int[] x;
    public static final int[] y;
    public static final int[] z;
    
    public static int A(final Resources resources) {
        return Resources.getSystem().getDisplayMetrics().widthPixels - resources.getDimensionPixelSize(2131165582) * 2;
    }
    
    public static final Set A0(final Object o) {
        final Set<Object> singleton = Collections.singleton(o);
        sg2.e.e((Object)singleton, "singleton(element)");
        return singleton;
    }
    
    public static final Set B0(final Object... array) {
        Object o;
        if (array.length > 0) {
            o = kotlin.collections.b.y1(array);
        }
        else {
            o = EmptySet.INSTANCE;
        }
        return (Set)o;
    }
    
    public static final Object C(final f f, pj2.a a) {
        sg2.e.f((Object)f, "<this>");
        sg2.e.f((Object)a, "deserializer");
        if (!(a instanceof sj2.b) || f.L().a.i) {
            return a.deserialize((c)f);
        }
        final String s = s(a.getDescriptor(), f.L());
        final g a2 = f.A();
        final qj2.e descriptor = a.getDescriptor();
        if (!(a2 instanceof JsonObject)) {
            final StringBuilder r = a.r("Expected ");
            r.append(sg2.h.a((Class)JsonObject.class));
            r.append(" as the serialized body of ");
            r.append(descriptor.h());
            r.append(", but had ");
            r.append(sg2.h.a((Class)((JsonObject)a2).getClass()));
            throw d.j(-1, r.toString());
        }
        final JsonObject jsonObject = (JsonObject)a2;
        final g g = (g)jsonObject.get(s);
        String a3 = null;
        final n n = null;
        if (g != null) {
            n n2 = n;
            if (g instanceof n) {
                n2 = (n)g;
            }
            if (n2 == null) {
                final StringBuilder r2 = a.r("Element ");
                r2.append(sg2.h.a((Class)((n)g).getClass()));
                r2.append(" is not a ");
                r2.append("JsonPrimitive");
                throw new IllegalArgumentException(r2.toString());
            }
            a3 = n2.a();
        }
        a = ((sj2.b)a).a((rj2.a)f, a3);
        if (a == null) {
            String g2;
            if (a3 == null) {
                g2 = "missing class discriminator ('null')";
            }
            else {
                g2 = b.g("class discriminator '", a3, '\'');
            }
            throw d.k((CharSequence)jsonObject.toString(), -1, al0.b.h("Polymorphic serializer was not found for ", g2));
        }
        final tj2.a l = f.L();
        sg2.e.f((Object)l, "<this>");
        sg2.e.f((Object)s, "discriminator");
        return C((f)new JsonTreeDecoder(l, jsonObject, s, a.getDescriptor()), a);
    }
    
    public static final boolean C0(final Throwable t) {
        return t instanceof Failure$NetworkConnection || t instanceof IOException || (t instanceof Failure$ServerError && sg2.e.a((Object)((Failure$ServerError)t).getError().a, (Object)"M_LIMIT_EXCEEDED"));
    }
    
    public static final void D(final int n, final String s) {
        sg2.e.g((Object)s, "fileTempDir");
        try {
            final File file = new File(s);
            if (file.exists()) {
                final File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    final ArrayList<File> list = new ArrayList<File>();
                    for (final File file2 : listFiles) {
                        sg2.e.b((Object)file2, "file");
                        final String name = file2.getName();
                        sg2.e.e((Object)name, "name");
                        final String z1 = kotlin.text.b.z1(name, ".", name);
                        final StringBuilder sb = new StringBuilder();
                        sb.append(n);
                        sb.append('.');
                        if (cj2.j.O0(z1, sb.toString(), false)) {
                            list.add(file2);
                        }
                    }
                    for (final File file3 : list) {
                        if (file3.exists()) {
                            file3.delete();
                        }
                    }
                }
            }
        }
        catch (final Exception ex) {}
    }
    
    public static final void D0(final d$a d$a, final boolean b) {
        if (b) {
            ((f$a)d$a).c.d = NoMerger.class.getName();
        }
    }
    
    public static void E(final i i, final ff2.a0 a0, final if2.a a2, final of2.j j) {
        int f = 1;
        while (!r(j.j, ((nf2.j)i).isEmpty(), a0, (nf2.j)i, a2, j)) {
            while (true) {
                final boolean k = j.j;
                final Object poll = i.poll();
                final boolean b = poll == null;
                if (r(k, b, a0, (nf2.j)i, a2, j)) {
                    return;
                }
                if (b) {
                    if ((f = j.f(-f)) == 0) {
                        return;
                    }
                    break;
                }
                else {
                    j.a(a0, poll);
                }
            }
        }
    }
    
    public static String E0(final String s) {
        if (s == null) {
            return null;
        }
        if (s.startsWith("--")) {
            return s.substring(2, s.length());
        }
        String substring = s;
        if (s.startsWith("-")) {
            substring = s.substring(1, s.length());
        }
        return substring;
    }
    
    public static void F(final i i, final qt2.c c, final if2.a a, final xf2.h h) {
        int f = 1;
        while (true) {
            final boolean k = h.k;
            final Object poll = i.poll();
            final boolean b = false;
            final boolean b2 = poll == null;
            int n = 0;
            Label_0105: {
                if (h.j) {
                    ((nf2.j)i).clear();
                }
                else {
                    n = (b ? 1 : 0);
                    if (!k) {
                        break Label_0105;
                    }
                    final Throwable l = h.l;
                    if (l != null) {
                        ((nf2.j)i).clear();
                        c.onError(l);
                    }
                    else {
                        n = (b ? 1 : 0);
                        if (!b2) {
                            break Label_0105;
                        }
                        c.onComplete();
                    }
                }
                n = 1;
            }
            if (n != 0) {
                if (a != null) {
                    a.dispose();
                }
                return;
            }
            if (b2) {
                if ((f = h.f(-f)) == 0) {
                    return;
                }
                continue;
            }
            else {
                final long h2 = h.h();
                if (h2 == 0L) {
                    ((nf2.j)i).clear();
                    if (a != null) {
                        a.dispose();
                    }
                    c.onError((Throwable)new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
                if (!h.a(poll, c) || h2 == Long.MAX_VALUE) {
                    continue;
                }
                h.g(1L);
            }
        }
    }
    
    public static void F0(final qt2.b b, final kf2.g g, final kf2.g g2, final kf2.a a) {
        if (g == null) {
            throw new NullPointerException("onNext is null");
        }
        if (g2 == null) {
            throw new NullPointerException("onError is null");
        }
        if (a != null) {
            H0((qt2.c)new LambdaSubscriber(g, g2, a, (kf2.g)Functions.k), b);
            return;
        }
        throw new NullPointerException("onComplete is null");
    }
    
    public static void G0(final qt2.b b, final kf2.g g, final kf2.g g2, final kf2.a a, final int n) {
        if (g == null) {
            throw new NullPointerException("onNext is null");
        }
        if (g2 == null) {
            throw new NullPointerException("onError is null");
        }
        if (a != null) {
            mf2.a.c(n, "number > 0 required");
            H0((qt2.c)new BoundedSubscriber(g, g2, a, (kf2.g)new Functions$l(n), n), b);
            return;
        }
        throw new NullPointerException("onComplete is null");
    }
    
    public static void H0(final qt2.c c, final qt2.b b) {
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        final BlockingSubscriber blockingSubscriber = new BlockingSubscriber((Queue)linkedBlockingQueue);
        b.subscribe((qt2.c)blockingSubscriber);
        try {
            while (!blockingSubscriber.isCancelled()) {
                Object o;
                if ((o = linkedBlockingQueue.poll()) == null) {
                    if (blockingSubscriber.isCancelled()) {
                        break;
                    }
                    ui.b.f0();
                    o = linkedBlockingQueue.take();
                }
                if (blockingSubscriber.isCancelled()) {
                    break;
                }
                if (o == BlockingSubscriber.TERMINATED) {
                    break;
                }
                if (NotificationLite.acceptFull(o, (qt2.c<? super Object>)c)) {
                    break;
                }
            }
        }
        catch (final InterruptedException ex) {
            blockingSubscriber.cancel();
            c.onError((Throwable)ex);
        }
    }
    
    public static byte[] I(final dn2.a... array) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        BigInteger bigInteger = BigInteger.valueOf(array.length * 32L);
        for (final dn2.a a : array) {
            if (!a.a()) {
                list.add(a.b());
            }
            else {
                sg2.e.e((Object)bigInteger, "dynamicPos");
                list.add(e$a.a(bigInteger, new en2.a(32)).a);
                list2.add(a.b());
                final BigInteger value = BigInteger.valueOf(a.b().length);
                sg2.e.e((Object)value, "valueOf(this.toLong())");
                bigInteger = bigInteger.add(value);
                sg2.e.e((Object)bigInteger, "this.add(other)");
            }
        }
        byte[] array2 = new byte[0];
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            array2 = ig2.j.P0(array2, (byte[])iterator.next());
        }
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            array2 = ig2.j.P0(array2, (byte[])iterator2.next());
        }
        return array2;
    }
    
    public static final void I0(String s, final zg2.d d) {
        sg2.e.f((Object)d, "baseClass");
        final StringBuilder sb = new StringBuilder();
        sb.append("in the scope of '");
        sb.append(d.o());
        sb.append('\'');
        final String string = sb.toString();
        if (s == null) {
            s = al0.b.h("Class discriminator was missing and no default polymorphic serializers were registered ", string);
        }
        else {
            s = al0.a.k("Class '", s, "' is not registered for polymorphic serialization ", string, ".\nMark the base class as 'sealed' or register the serializer explicitly.");
        }
        throw new SerializationException(s);
    }
    
    public static final di2.e J(final ti2.t t) {
        final ih2.c f = t.getAnnotations().f(kotlin.reflect.jvm.internal.impl.builtins.e$a.r);
        if (f == null) {
            return null;
        }
        final Object c4 = CollectionsKt___CollectionsKt.c4((Collection)f.a().values());
        Object o;
        if (c4 instanceof s) {
            o = c4;
        }
        else {
            o = null;
        }
        if (o != null) {
            String s = (String)((hi2.g)o).a;
            if (s != null) {
                if (!di2.e.h(s)) {
                    s = null;
                }
                if (s != null) {
                    return di2.e.f(s);
                }
            }
        }
        return null;
    }
    
    public static final Activity J0(Context baseContext) {
        sg2.e.f((Object)baseContext, "<this>");
        while (!(baseContext instanceof Activity) && baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
            sg2.e.e((Object)baseContext, "context.baseContext");
        }
        return (Activity)baseContext;
    }
    
    public static DefaultFlingBehavior K(final z0.d d) {
        d.A(-1116939427);
        final l0.n a = k0.s.a(d);
        d.A(-3686930);
        final boolean m = d.m((Object)a);
        final Object b = d.B();
        DefaultFlingBehavior defaultFlingBehavior;
        if (m || (defaultFlingBehavior = (DefaultFlingBehavior)b) == z0.d$a.a) {
            defaultFlingBehavior = new DefaultFlingBehavior(a);
            d.w((Object)defaultFlingBehavior);
        }
        d.I();
        final DefaultFlingBehavior defaultFlingBehavior2 = defaultFlingBehavior;
        d.I();
        return defaultFlingBehavior2;
    }
    
    public static final byte[] K0(final int n) {
        final byte[] array = new byte[4];
        for (int i = 0; i < 4; ++i) {
            array[i] = (byte)(n >> (3 - i) * 8);
        }
        return array;
    }
    
    public static final int L(final Context context, int n, final int n2) {
        sg2.e.f((Object)context, "<this>");
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { n });
        sg2.e.e((Object)obtainStyledAttributes, "theme.obtainStyledAttributes(intArrayOf(attr))");
        n = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        final Resources resources = context.getResources();
        final Resources$Theme theme = context.getTheme();
        final ThreadLocal a = p3.f.a;
        final int n3 = n = f$b.a(resources, n, theme);
        if (n2 < 255) {
            n = q3.e.h(n3, n2);
        }
        return n;
    }
    
    public static final void L0(final Context context, final String s, final String s2) {
        sg2.e.f((Object)context, "context");
        final Object systemService = context.getSystemService("clipboard");
        sg2.e.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager)systemService).setPrimaryClip(ClipData.newPlainText((CharSequence)s, (CharSequence)s2));
    }
    
    public static final iq2.g M0(final Event event, String a, final SendState sendState, final Long n) {
        sg2.e.f((Object)event, "<this>");
        sg2.e.f((Object)a, "roomId");
        sg2.e.f((Object)sendState, "sendState");
        final y a2 = ContentMapper.a;
        final String a3 = ContentMapper.a(event.c);
        final boolean b = false;
        final boolean b2 = a3 != null && kotlin.text.b.P0((CharSequence)a3, (CharSequence)"\"m.relates_to\"", false);
        final String s = null;
        boolean p4;
        boolean p5;
        if (b2 && kotlin.text.b.P0((CharSequence)a3, (CharSequence)"\"rel_type\"", false)) {
            p4 = kotlin.text.b.P0((CharSequence)a3, (CharSequence)"\"m.replace\"", false);
            p5 = kotlin.text.b.P0((CharSequence)a3, (CharSequence)"\"org.matrix.response\"", false);
        }
        else {
            p4 = (p5 = false);
        }
        final iq2.g g = new iq2.g("", "", "", (String)null, (String)null, false, (String)null, (Long)null, (String)null, (String)null, Long.valueOf(0L), (String)null, (String)null, (Long)null, 0L, p4, p5);
        String a4;
        if ((a4 = event.b) == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append('$');
            sb.append(a);
            sb.append('-');
            sb.append(System.currentTimeMillis());
            sb.append('-');
            sb.append(event.hashCode());
            a4 = sb.toString();
        }
        sg2.e.f((Object)a4, "<set-?>");
        g.a = a4;
        final String h = event.h;
        if (h != null) {
            a = h;
        }
        g.b = a;
        g.d = a3;
        g.e = ContentMapper.a(event.d());
        boolean f = b;
        if (sg2.e.a((Object)event.a, (Object)"m.room.member")) {
            final Map c = event.c;
            f = b;
            if (c != null) {
                final y a5 = kq2.d.a;
                final Object jsonValue = a5.a((Class)Map.class).toJsonValue((Object)c);
                if (jsonValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, @[JvmSuppressWildcards(suppress = <null>)] kotlin.Any>{ org.matrix.android.sdk.api.session.events.model.EventKt.Content }");
                }
                final Map map = (Map)jsonValue;
                final Map d = event.d();
                Map map2;
                if (d != null) {
                    final Object jsonValue2 = a5.a((Class)Map.class).toJsonValue((Object)d);
                    if (jsonValue2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, @[JvmSuppressWildcards(suppress = <null>)] kotlin.Any>{ org.matrix.android.sdk.api.session.events.model.EventKt.Content }");
                    }
                    map2 = (Map)jsonValue2;
                }
                else {
                    map2 = null;
                }
                f = b;
                if (sg2.e.a((Object)map, (Object)map2)) {
                    f = true;
                }
            }
        }
        g.f = f;
        g.g = event.g;
        if ((a = event.a) == null) {
            a = "org.matrix.android.sdk.missing_type";
        }
        g.c = a;
        g.i = event.f;
        final Long e = event.e;
        g.h = e;
        g.m = event.j;
        final UnsignedData i = event.i;
        Long a6 = e;
        if (i != null) {
            a6 = i.a;
            if (a6 == null) {
                a6 = e;
            }
        }
        g.k = a6;
        String json = s;
        if (i != null) {
            json = kq2.d.a.a((Class)UnsignedData.class).toJson((Object)i);
        }
        g.l = json;
        g.r = ((Enum)sendState).name();
        g.n = n;
        return g;
    }
    
    public static final List N(final ti2.t t) {
        sg2.e.f((Object)t, "<this>");
        h0(t);
        final int x = x(t);
        Object instance;
        if (x == 0) {
            instance = EmptyList.INSTANCE;
        }
        else {
            final List subList = t.G0().subList(0, x);
            instance = new ArrayList<ti2.t>(ig2.m.c3((Iterable)subList, 10));
            final Iterator iterator = subList.iterator();
            while (iterator.hasNext()) {
                final ti2.t type = ((n0)iterator.next()).getType();
                sg2.e.e((Object)type, "it.type");
                ((Collection<ti2.t>)instance).add(type);
            }
        }
        return (List)instance;
    }
    
    public static dn2.a N0(final BigInteger bigInteger, final en2.a a) {
        final int n = 0;
        Object o;
        if (cj2.j.O0("uint256", "int", false)) {
            final byte[] byteArray = bigInteger.toByteArray();
            sg2.e.e((Object)byteArray, "value.toByteArray()");
            int n2;
            if (bigInteger.signum() < 0) {
                n2 = -1;
            }
            else {
                n2 = 0;
            }
            byte[] array;
            if (byteArray.length == 32) {
                array = byteArray;
            }
            else {
                if (byteArray.length >= 32) {
                    final StringBuilder i = al0.b.i("ByteArray too big - max size is ", 32, " but got ");
                    i.append(byteArray.length);
                    throw new IllegalArgumentException(i.toString().toString());
                }
                array = new byte[32];
                for (int j = n; j < 32; ++j) {
                    final Byte b1 = kotlin.collections.b.b1(byteArray.length - 32 + j, byteArray);
                    int byteValue;
                    if (b1 != null) {
                        byteValue = b1;
                    }
                    else {
                        byteValue = n2;
                    }
                    array[j] = (byte)byteValue;
                }
            }
            o = new fn2.d(array, a);
        }
        else {
            o = new fn2.e(pd.r.B0(32, bigInteger), a);
        }
        return (dn2.a)o;
    }
    
    public static HashMap O() {
        final HashMap hashMap = new HashMap(286);
        final ArrayList list = new ArrayList(25);
        list.add("US");
        list.add("AG");
        list.add("AI");
        list.add("AS");
        list.add("BB");
        list.add("BM");
        list.add("BS");
        list.add("CA");
        list.add("DM");
        list.add("DO");
        list.add("GD");
        list.add("GU");
        list.add("JM");
        list.add("KN");
        list.add("KY");
        list.add("LC");
        list.add("MP");
        list.add("MS");
        list.add("PR");
        list.add("SX");
        list.add("TC");
        list.add("TT");
        list.add("VC");
        list.add("VG");
        final ArrayList k = al0.b.k(list, "VI", 1, hashMap, list, 2);
        k.add("RU");
        k.add("KZ");
        hashMap.put(7, k);
        final ArrayList list2 = new ArrayList(1);
        list2.add("EG");
        hashMap.put(36, al0.a.q(34, hashMap, al0.a.q(33, hashMap, al0.a.q(32, hashMap, al0.a.q(31, hashMap, al0.a.q(30, hashMap, al0.a.q(27, hashMap, al0.a.q(20, hashMap, list2, 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"));
        final ArrayList list3 = new ArrayList(2);
        list3.add("IT");
        list3.add("VA");
        hashMap.put(43, al0.a.q(41, hashMap, al0.a.q(40, hashMap, al0.a.q(39, hashMap, list3, 1, "RO"), 1, "CH"), 1, "AT"));
        final ArrayList list4 = new ArrayList(4);
        list4.add("GB");
        list4.add("GG");
        list4.add("IM");
        list4.add("JE");
        hashMap.put(44, list4);
        final ArrayList list5 = new ArrayList(1);
        list5.add("DK");
        hashMap.put(46, al0.a.q(45, hashMap, list5, 1, "SE"));
        final ArrayList list6 = new ArrayList(2);
        list6.add("NO");
        list6.add("SJ");
        hashMap.put(60, al0.a.q(58, hashMap, al0.a.q(57, hashMap, al0.a.q(56, hashMap, al0.a.q(55, hashMap, al0.a.q(54, hashMap, al0.a.q(53, hashMap, al0.a.q(52, hashMap, al0.a.q(51, hashMap, al0.a.q(49, hashMap, al0.a.q(48, hashMap, al0.a.q(47, hashMap, list6, 1, "PL"), 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"));
        final ArrayList list7 = new ArrayList(3);
        list7.add("AU");
        list7.add("CC");
        final ArrayList i = al0.b.k(list7, "CX", 61, hashMap, list7, 1);
        final ArrayList j = al0.b.k(i, "ID", 62, hashMap, i, 1);
        final ArrayList l = al0.b.k(j, "PH", 63, hashMap, j, 1);
        final ArrayList m = al0.b.k(l, "NZ", 64, hashMap, l, 1);
        final ArrayList k2 = al0.b.k(m, "SG", 65, hashMap, m, 1);
        final ArrayList k3 = al0.b.k(k2, "TH", 66, hashMap, k2, 1);
        final ArrayList k4 = al0.b.k(k3, "JP", 81, hashMap, k3, 1);
        final ArrayList k5 = al0.b.k(k4, "KR", 82, hashMap, k4, 1);
        final ArrayList k6 = al0.b.k(k5, "VN", 84, hashMap, k5, 1);
        final ArrayList k7 = al0.b.k(k6, "CN", 86, hashMap, k6, 1);
        final ArrayList k8 = al0.b.k(k7, "TR", 90, hashMap, k7, 1);
        final ArrayList k9 = al0.b.k(k8, "IN", 91, hashMap, k8, 1);
        final ArrayList k10 = al0.b.k(k9, "PK", 92, hashMap, k9, 1);
        final ArrayList k11 = al0.b.k(k10, "AF", 93, hashMap, k10, 1);
        final ArrayList k12 = al0.b.k(k11, "LK", 94, hashMap, k11, 1);
        final ArrayList k13 = al0.b.k(k12, "MM", 95, hashMap, k12, 1);
        final ArrayList k14 = al0.b.k(k13, "IR", 98, hashMap, k13, 1);
        final ArrayList k15 = al0.b.k(k14, "SS", 211, hashMap, k14, 2);
        k15.add("MA");
        k15.add("EH");
        hashMap.put(212, k15);
        final ArrayList list8 = new ArrayList(1);
        list8.add("DZ");
        hashMap.put(261, al0.a.q(260, hashMap, al0.a.q(258, hashMap, al0.a.q(257, hashMap, al0.a.q(256, hashMap, al0.a.q(255, hashMap, al0.a.q(254, hashMap, al0.a.q(253, hashMap, al0.a.q(252, hashMap, al0.a.q(251, hashMap, al0.a.q(250, hashMap, al0.a.q(249, hashMap, al0.a.q(248, hashMap, al0.a.q(247, hashMap, al0.a.q(246, hashMap, al0.a.q(245, hashMap, al0.a.q(244, hashMap, al0.a.q(243, hashMap, al0.a.q(242, hashMap, al0.a.q(241, hashMap, al0.a.q(240, hashMap, al0.a.q(239, hashMap, al0.a.q(238, hashMap, al0.a.q(237, hashMap, al0.a.q(236, hashMap, al0.a.q(235, hashMap, al0.a.q(234, hashMap, al0.a.q(233, hashMap, al0.a.q(232, hashMap, al0.a.q(231, hashMap, al0.a.q(230, hashMap, al0.a.q(229, hashMap, al0.a.q(228, hashMap, al0.a.q(227, hashMap, al0.a.q(226, hashMap, al0.a.q(225, hashMap, al0.a.q(224, hashMap, al0.a.q(223, hashMap, al0.a.q(222, hashMap, al0.a.q(221, hashMap, al0.a.q(220, hashMap, al0.a.q(218, hashMap, al0.a.q(216, hashMap, al0.a.q(213, hashMap, list8, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"));
        final ArrayList list9 = new ArrayList(2);
        list9.add("RE");
        list9.add("YT");
        hashMap.put(269, al0.a.q(268, hashMap, al0.a.q(267, hashMap, al0.a.q(266, hashMap, al0.a.q(265, hashMap, al0.a.q(264, hashMap, al0.a.q(263, hashMap, al0.a.q(262, hashMap, list9, 1, "ZW"), 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"));
        final ArrayList list10 = new ArrayList(2);
        list10.add("SH");
        list10.add("TA");
        hashMap.put(357, al0.a.q(356, hashMap, al0.a.q(355, hashMap, al0.a.q(354, hashMap, al0.a.q(353, hashMap, al0.a.q(352, hashMap, al0.a.q(351, hashMap, al0.a.q(350, hashMap, al0.a.q(299, hashMap, al0.a.q(298, hashMap, al0.a.q(297, hashMap, al0.a.q(291, hashMap, al0.a.q(290, hashMap, list10, 1, "ER"), 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"));
        final ArrayList list11 = new ArrayList(2);
        list11.add("FI");
        list11.add("AX");
        hashMap.put(509, al0.a.q(508, hashMap, al0.a.q(507, hashMap, al0.a.q(506, hashMap, al0.a.q(505, hashMap, al0.a.q(504, hashMap, al0.a.q(503, hashMap, al0.a.q(502, hashMap, al0.a.q(501, hashMap, al0.a.q(500, hashMap, al0.a.q(423, hashMap, al0.a.q(421, hashMap, al0.a.q(420, hashMap, al0.a.q(389, hashMap, al0.a.q(387, hashMap, al0.a.q(386, hashMap, al0.a.q(385, hashMap, al0.a.q(383, hashMap, al0.a.q(382, hashMap, al0.a.q(381, hashMap, al0.a.q(380, hashMap, al0.a.q(378, hashMap, al0.a.q(377, hashMap, al0.a.q(376, hashMap, al0.a.q(375, hashMap, al0.a.q(374, hashMap, al0.a.q(373, hashMap, al0.a.q(372, hashMap, al0.a.q(371, hashMap, al0.a.q(370, hashMap, al0.a.q(359, hashMap, al0.a.q(358, hashMap, list11, 1, "BG"), 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"));
        final ArrayList list12 = new ArrayList(3);
        list12.add("GP");
        list12.add("BL");
        final ArrayList k16 = al0.b.k(list12, "MF", 590, hashMap, list12, 1);
        final ArrayList k17 = al0.b.k(k16, "BO", 591, hashMap, k16, 1);
        final ArrayList k18 = al0.b.k(k17, "GY", 592, hashMap, k17, 1);
        final ArrayList k19 = al0.b.k(k18, "EC", 593, hashMap, k18, 1);
        final ArrayList k20 = al0.b.k(k19, "GF", 594, hashMap, k19, 1);
        final ArrayList k21 = al0.b.k(k20, "PY", 595, hashMap, k20, 1);
        final ArrayList k22 = al0.b.k(k21, "MQ", 596, hashMap, k21, 1);
        final ArrayList k23 = al0.b.k(k22, "SR", 597, hashMap, k22, 1);
        final ArrayList k24 = al0.b.k(k23, "UY", 598, hashMap, k23, 2);
        k24.add("CW");
        k24.add("BQ");
        hashMap.put(599, k24);
        final ArrayList list13 = new ArrayList(1);
        list13.add("TL");
        hashMap.put(998, al0.a.q(996, hashMap, al0.a.q(995, hashMap, al0.a.q(994, hashMap, al0.a.q(993, hashMap, al0.a.q(992, hashMap, al0.a.q(979, hashMap, al0.a.q(977, hashMap, al0.a.q(976, hashMap, al0.a.q(975, hashMap, al0.a.q(974, hashMap, al0.a.q(973, hashMap, al0.a.q(972, hashMap, al0.a.q(971, hashMap, al0.a.q(970, hashMap, al0.a.q(968, hashMap, al0.a.q(967, hashMap, al0.a.q(966, hashMap, al0.a.q(965, hashMap, al0.a.q(964, hashMap, al0.a.q(963, hashMap, al0.a.q(962, hashMap, al0.a.q(961, hashMap, al0.a.q(960, hashMap, al0.a.q(888, hashMap, al0.a.q(886, hashMap, al0.a.q(883, hashMap, al0.a.q(882, hashMap, al0.a.q(881, hashMap, al0.a.q(880, hashMap, al0.a.q(878, hashMap, al0.a.q(870, hashMap, al0.a.q(856, hashMap, al0.a.q(855, hashMap, al0.a.q(853, hashMap, al0.a.q(852, hashMap, al0.a.q(850, hashMap, al0.a.q(808, hashMap, al0.a.q(800, hashMap, al0.a.q(692, hashMap, al0.a.q(691, hashMap, al0.a.q(690, hashMap, al0.a.q(689, hashMap, al0.a.q(688, hashMap, al0.a.q(687, hashMap, al0.a.q(686, hashMap, al0.a.q(685, hashMap, al0.a.q(683, hashMap, al0.a.q(682, hashMap, al0.a.q(681, hashMap, al0.a.q(680, hashMap, al0.a.q(679, hashMap, al0.a.q(678, hashMap, al0.a.q(677, hashMap, al0.a.q(676, hashMap, al0.a.q(675, hashMap, al0.a.q(674, hashMap, al0.a.q(673, hashMap, al0.a.q(672, hashMap, al0.a.q(670, hashMap, list13, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap;
    }
    
    public static fn2.a O0(final x82.a a) {
        sg2.e.f((Object)a, "value");
        final String c = a.c();
        sg2.e.g((Object)c, "string");
        byte[] a2 = ln2.a.a(c);
        if (a2.length != 32) {
            if (a2.length >= 32) {
                throw new IllegalArgumentException("ByteArray too big - max size is 32".toString());
            }
            final byte[] array = new byte[32];
            for (int i = 0; i < 32; ++i) {
                final Byte b1 = kotlin.collections.b.b1(a2.length - 32 + i, a2);
                byte byteValue;
                if (b1 != null) {
                    byteValue = b1;
                }
                else {
                    byteValue = 0;
                }
                array[i] = byteValue;
            }
            a2 = array;
        }
        return new fn2.a(a2);
    }
    
    public static final String P(final int n, final int n2, final String s) {
        sg2.e.g((Object)s, "fileTempDir");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append('/');
        sb.append(n);
        sb.append('.');
        sb.append(n2);
        sb.append(".data");
        return sb.toString();
    }
    
    public static fn2.c P0(byte[] array) {
        if (sg2.e.a((Object)"bytes", (Object)"bytes")) {
            final BigInteger value = BigInteger.valueOf(array.length);
            sg2.e.e((Object)value, "valueOf(this.toLong())");
            final byte[] a = e$a.a(value, new en2.a(256)).a;
            if (array.length % 32 != 0) {
                final int n = array.length + 32 - array.length % 32;
                final byte[] array2 = new byte[n];
                for (int i = 0; i < n; ++i) {
                    final Byte b1 = kotlin.collections.b.b1(i, array);
                    byte byteValue;
                    if (b1 != null) {
                        byteValue = b1;
                    }
                    else {
                        byteValue = 0;
                    }
                    array2[i] = byteValue;
                }
                array = array2;
            }
            return new fn2.c(ig2.j.P0(a, array));
        }
        if (array.length != 32) {
            if (array.length >= 32) {
                throw new IllegalArgumentException("ByteArray too big - max size is 32".toString());
            }
            final byte[] array3 = new byte[32];
            for (int j = 0; j < 32; ++j) {
                final Byte b2 = kotlin.collections.b.b1(j, array);
                byte byteValue2;
                if (b2 != null) {
                    byteValue2 = b2;
                }
                else {
                    byteValue2 = 0;
                }
                array3[j] = byteValue2;
            }
        }
        sg2.e.c((Object)null);
        throw null;
    }
    
    public static final RoomMemberContent Q(final Event event) {
        final Map c = event.c;
        final JsonAdapter a = kq2.d.a.a((Class)RoomMemberContent.class);
        final String s = null;
        Object fromJsonValue;
        try {
            fromJsonValue = a.fromJsonValue((Object)c);
        }
        catch (final Exception ex) {
            su2.a.a.f((Throwable)ex, d.j("To model failed : ", ex), new Object[0]);
            fromJsonValue = null;
        }
        final RoomMemberContent roomMemberContent = (RoomMemberContent)fromJsonValue;
        boolean b = true;
        Label_0082: {
            if (roomMemberContent != null) {
                final Membership a2 = roomMemberContent.a;
                if (a2 != null && a2.isLeft()) {
                    break Label_0082;
                }
            }
            b = false;
        }
        RoomMemberContent copy = roomMemberContent;
        if (b) {
            final Map d = event.d();
            final JsonAdapter a3 = kq2.d.a.a((Class)RoomMemberContent.class);
            Object fromJsonValue2;
            try {
                fromJsonValue2 = a3.fromJsonValue((Object)d);
            }
            catch (final Exception ex2) {
                su2.a.a.f((Throwable)ex2, d.j("To model failed : ", ex2), new Object[0]);
                fromJsonValue2 = null;
            }
            final RoomMemberContent roomMemberContent2 = (RoomMemberContent)fromJsonValue2;
            String c2;
            if (roomMemberContent2 != null) {
                c2 = roomMemberContent2.c;
            }
            else {
                c2 = null;
            }
            String d2 = s;
            if (roomMemberContent2 != null) {
                d2 = roomMemberContent2.d;
            }
            copy = roomMemberContent.copy(roomMemberContent.a, roomMemberContent.b, c2, d2, roomMemberContent.e, roomMemberContent.f, roomMemberContent.g);
        }
        return copy;
    }
    
    public static final androidx.fragment.app.r Q0(final Context context) {
        sg2.e.f((Object)context, "<this>");
        return (androidx.fragment.app.r)J0(context);
    }
    
    public static final FunctionClassKind R(final hh2.e e) {
        final boolean b = e instanceof hh2.c;
        final FunctionClassKind functionClassKind = null;
        if (!b) {
            return null;
        }
        if (!kotlin.reflect.jvm.internal.impl.builtins.c.L((hh2.g)e)) {
            return null;
        }
        final di2.d h = DescriptorUtilsKt.h((hh2.g)e);
        FunctionClassKind a = functionClassKind;
        if (h.f()) {
            if (h.e()) {
                a = functionClassKind;
            }
            else {
                final FunctionClassKind$a companion = FunctionClassKind.Companion;
                final String c = h.h().c();
                sg2.e.e((Object)c, "shortName().asString()");
                final di2.c e2 = h.i().e();
                sg2.e.e((Object)e2, "toSafe().parent()");
                companion.getClass();
                final FunctionClassKind$a$a a2 = FunctionClassKind$a.a(c, e2);
                a = functionClassKind;
                if (a2 != null) {
                    a = a2.a;
                }
            }
        }
        return a;
    }
    
    public static final GalleryViewLoadMoreState R0(final c5.k k) {
        sg2.e.f((Object)k, "<this>");
        GalleryViewLoadMoreState galleryViewLoadMoreState;
        if (k instanceof c5.k.b) {
            galleryViewLoadMoreState = GalleryViewLoadMoreState.IsLoadingMore;
        }
        else if (k instanceof c5.k.a) {
            galleryViewLoadMoreState = GalleryViewLoadMoreState.FailedToLoadMore;
        }
        else if (!k.a) {
            galleryViewLoadMoreState = GalleryViewLoadMoreState.HasMore;
        }
        else {
            galleryViewLoadMoreState = GalleryViewLoadMoreState.NothingMoreToLoad;
        }
        return galleryViewLoadMoreState;
    }
    
    public static final boolean S(final o42.c c) {
        sg2.e.f((Object)c, "<this>");
        final boolean a0 = a0(c);
        boolean b = true;
        if (!a0) {
            final List i = c.i;
            boolean b3 = false;
            Label_0103: {
                if (!(i instanceof Collection) || !i.isEmpty()) {
                    for (final o42.b b2 : i) {
                        if (b2.f != null || b2.i != null) {
                            b3 = true;
                            break Label_0103;
                        }
                    }
                }
                b3 = false;
            }
            if (b3) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static final RegistrationFlowResponse S0(final Throwable t) {
        sg2.e.f((Object)t, "<this>");
        final boolean b = t instanceof Failure$OtherServerError;
        List k = null;
        Label_0061: {
            if (!b || ((Failure$OtherServerError)t).getHttpCode() != 401) {
                break Label_0061;
            }
            try {
                final y a = kq2.d.a;
                Object o = kq2.d.a.a((Class)RegistrationFlowResponse.class).fromJson(((Failure$OtherServerError)t).getErrorBody());
                Label_0169: {
                    return (RegistrationFlowResponse)o;
                }
                Failure$ServerError failure$ServerError = null;
            Block_8:
                while (true) {
                    failure$ServerError = (Failure$ServerError)t;
                    o = k;
                    iftrue(Label_0169:)(failure$ServerError.getHttpCode() != 401);
                    o = k;
                    iftrue(Label_0169:)(!sg2.e.a((Object)failure$ServerError.getError().a, (Object)"M_FORBIDDEN"));
                    o = k;
                    iftrue(Label_0169:)(failure$ServerError.getError().i == null);
                    o = k;
                    iftrue(Label_0169:)(failure$ServerError.getError().k == null);
                    break Block_8;
                    o = k;
                    iftrue(Label_0169:)(!(t instanceof Failure$ServerError));
                    continue;
                }
                k = failure$ServerError.getError().k;
                o = new RegistrationFlowResponse(k, failure$ServerError.getError().j, failure$ServerError.getError().i, failure$ServerError.getError().l);
                return (RegistrationFlowResponse)o;
            }
            finally {
                final Object o = k;
                return (RegistrationFlowResponse)o;
            }
        }
    }
    
    public static final cq2.a T(final Versions versions) {
        final List a = versions.a;
        if (a != null) {
            final ArrayList list = new ArrayList();
            for (final String s : a) {
                final Regex i = cq2.a.i;
                sg2.e.f((Object)s, "value");
                final cj2.e matchEntire = cq2.a.i.matchEntire((CharSequence)s);
                cq2.a a2;
                if (matchEntire == null) {
                    a2 = null;
                }
                else {
                    a2 = new cq2.a(Integer.parseInt(matchEntire.c().get(1)), Integer.parseInt(matchEntire.c().get(2)), Integer.parseInt(matchEntire.c().get(3)));
                }
                if (a2 != null) {
                    list.add(a2);
                }
            }
            final cq2.a j = (cq2.a)CollectionsKt___CollectionsKt.N3(list);
            if (j != null) {
                return j;
            }
        }
        return cq2.a.j;
    }
    
    public static final x T0(final ti2.t t) {
        sg2.e.f((Object)t, "<this>");
        final v0 l0 = t.L0();
        x h;
        if (l0 instanceof p) {
            h = ((p)l0).h;
        }
        else {
            if (!(l0 instanceof x)) {
                throw new NoWhenBranchMatchedException();
            }
            h = (x)l0;
        }
        return h;
    }
    
    public static final String U(final int n, final String s) {
        sg2.e.g((Object)s, "fileTempDir");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append('/');
        sb.append(n);
        sb.append(".meta.data");
        return sb.toString();
    }
    
    public static final String U0(String substring) {
        sg2.e.f((Object)substring, "<this>");
        final int z0 = kotlin.text.b.Z0((CharSequence)substring, "?", 0, false, 6);
        if (z0 != -1) {
            substring = substring.substring(0, z0);
            sg2.e.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        }
        return substring;
    }
    
    public static final g4.b V(final View view) {
        g4.b b;
        if ((b = (g4.b)view.getTag(2131430522)) == null) {
            b = new g4.b();
            view.setTag(2131430522, (Object)b);
        }
        return b;
    }
    
    public static final ti2.t W(final ti2.t t) {
        sg2.e.f((Object)t, "<this>");
        h0(t);
        if (t.getAnnotations().f(kotlin.reflect.jvm.internal.impl.builtins.e$a.p) == null) {
            return null;
        }
        return t.G0().get(x(t)).getType();
    }
    
    public static final Downloader$b X(final Download download, final String s) {
        sg2.e.g((Object)download, "download");
        sg2.e.g((Object)s, "requestMethod");
        return Y(download, -1L, -1L, s, 0, 16);
    }
    
    public static Downloader$b Y(final Download download, long n, long n2, String s, final int n3, final int n4) {
        if ((n4 & 0x2) != 0x0) {
            n = -1L;
        }
        if ((n4 & 0x4) != 0x0) {
            n2 = -1L;
        }
        if ((n4 & 0x8) != 0x0) {
            s = "GET";
        }
        sg2.e.g((Object)download, "download");
        sg2.e.g((Object)s, "requestMethod");
        long n5 = n;
        if (n == -1L) {
            n5 = 0L;
        }
        String value;
        if (n2 == -1L) {
            value = "";
        }
        else {
            value = String.valueOf(n2);
        }
        final LinkedHashMap i1 = kotlin.collections.c.i1(download.getHeaders());
        final StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(n5);
        sb.append('-');
        sb.append(value);
        i1.put("Range", sb.toString());
        download.getId();
        final String url = download.getUrl();
        final String file = download.getFile();
        final Uri h0 = lw0.b.H0(download.getFile());
        download.getTag();
        download.getIdentifier();
        return new Downloader$b(url, i1, file, h0, s, download.getExtras());
    }
    
    public static final long Z(final long n, final Throwable t) {
        final boolean b = t instanceof Failure$ServerError;
        final MatrixError matrixError = null;
        Failure$ServerError failure$ServerError;
        if (b) {
            failure$ServerError = (Failure$ServerError)t;
        }
        else {
            failure$ServerError = null;
        }
        long n2 = n;
        if (failure$ServerError != null) {
            final MatrixError error = failure$ServerError.getError();
            n2 = n;
            if (error != null) {
                MatrixError matrixError2 = matrixError;
                if (sg2.e.a((Object)error.a, (Object)"M_LIMIT_EXCEEDED")) {
                    matrixError2 = error;
                }
                n2 = n;
                if (matrixError2 != null) {
                    final Long f = matrixError2.f;
                    n2 = n;
                    if (f != null) {
                        n2 = f + 100L;
                    }
                }
            }
        }
        return n2;
    }
    
    public static final boolean a0(final o42.c c) {
        sg2.e.f((Object)c, "<this>");
        final boolean g = c.g;
        boolean b = true;
        if (!g) {
            final List i = c.i;
            boolean b2 = false;
            Label_0081: {
                if (!(i instanceof Collection) || !i.isEmpty()) {
                    final Iterator iterator = i.iterator();
                    while (iterator.hasNext()) {
                        if (((o42.b)iterator.next()).v) {
                            b2 = true;
                            break Label_0081;
                        }
                    }
                }
                b2 = false;
            }
            b = (b2 && b);
        }
        return b;
    }
    
    public static final ImageResolution b0(final List list, final vn0.a a) {
        sg2.e.f((Object)list, "<this>");
        sg2.e.f((Object)a, "size");
        if (!list.isEmpty()) {
            final ArrayList list2 = new ArrayList();
            for (final Object next : list) {
                final ImageResolution imageResolution = (ImageResolution)next;
                if (imageResolution.getHeight() / 2 > a.b * 1.1 || imageResolution.getWidth() / 2 > a.a * 1.1) {
                    break;
                }
                list2.add(next);
            }
            final ListIterator listIterator = list2.listIterator(list2.size());
            while (true) {
                while (listIterator.hasPrevious()) {
                    final Object previous = listIterator.previous();
                    final ImageResolution imageResolution2 = (ImageResolution)previous;
                    if (imageResolution2.getHeight() > 0 && imageResolution2.getWidth() > 0) {
                        ImageResolution imageResolution3;
                        if ((imageResolution3 = (ImageResolution)previous) == null) {
                            imageResolution3 = (ImageResolution)CollectionsKt___CollectionsKt.A3(list);
                        }
                        return imageResolution3;
                    }
                }
                final Object previous = null;
                continue;
            }
        }
        throw new IllegalStateException("Can't get a sized preview if no preview sizes are available.");
    }
    
    public static void c0(final List list, final LinkedHashMap linkedHashMap) {
        sg2.e.f((Object)linkedHashMap, "currentVisibilityMap");
        sg2.e.f((Object)list, "posts");
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        final ArrayList list2 = new ArrayList();
        for (final Object next : list) {
            if (next instanceof w81.j) {
                list2.add(next);
            }
        }
        for (final w81.j j : list2) {
            linkedHashMap2.put(j.w0().Z0, !j.w0().f1 && !j.w0().m0);
        }
        for (final Map.Entry<Object, V> entry : linkedHashMap2.entrySet()) {
            if (!linkedHashMap.containsKey(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
    }
    
    public static final List d0(final ti2.t t) {
        sg2.e.f((Object)t, "<this>");
        h0(t);
        final List g0 = t.G0();
        final int x = x(t);
        final boolean h0 = h0(t);
        final int n = 1;
        int n2;
        if (h0 && t.getAnnotations().f(kotlin.reflect.jvm.internal.impl.builtins.e$a.p) != null) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        return g0.subList(n2 + x, g0.size() - 1);
    }
    
    public static final boolean e0(final int n, final HashSet set) {
        sg2.e.f((Object)set, "<this>");
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            final Activity activity = ((WeakReference<Activity>)iterator.next()).get();
            if (activity != null && n == activity.hashCode()) {
                return true;
            }
        }
        return false;
    }
    
    public static void f(int i, final int[] array, final int[] array2, final int[] array3, final int[] array4) {
        System.arraycopy(array, array.length - 16, array2, 0, 16);
        final int length = array.length;
        i *= 2;
        int n2;
        int n = n2 = 0;
        while (i > 0) {
            int length2 = array3.length;
            while (--length2 >= 0) {
                array3[length2] = (array2[length2] ^ array[n + length2]);
            }
            final int a = gl2.a.a;
            if (array3.length != 16) {
                throw new IllegalArgumentException();
            }
            if (array2.length != 16) {
                throw new IllegalArgumentException();
            }
            int n3 = array3[0];
            int n4 = array3[1];
            int n5 = array3[2];
            int n6 = array3[3];
            int n7 = array3[4];
            int n8 = array3[5];
            int n9 = array3[6];
            int n10 = array3[7];
            int n11 = array3[8];
            int n12 = array3[9];
            int n13 = array3[10];
            int n14 = array3[11];
            int n15 = array3[12];
            int n16 = array3[13];
            int n17 = array3[14];
            int n18 = array3[15];
            for (int j = 8; j > 0; j -= 2) {
                final int n19 = n3 + n15;
                final int n20 = n7 ^ (n19 >>> -7 | n19 << 7);
                final int n21 = n20 + n3;
                final int n22 = n11 ^ (n21 >>> -9 | n21 << 9);
                final int n23 = n22 + n20;
                final int n24 = n15 ^ (n23 >>> -13 | n23 << 13);
                final int n25 = n24 + n22;
                final int n26 = n3 ^ (n25 >>> -18 | n25 << 18);
                final int n27 = n8 + n4;
                final int n28 = n12 ^ (n27 >>> -7 | n27 << 7);
                final int n29 = n28 + n8;
                final int n30 = n16 ^ (n29 >>> -9 | n29 << 9);
                final int n31 = n30 + n28;
                final int n32 = n4 ^ (n31 >>> -13 | n31 << 13);
                final int n33 = n32 + n30;
                final int n34 = n8 ^ (n33 >>> -18 | n33 << 18);
                final int n35 = n13 + n9;
                final int n36 = n17 ^ (n35 >>> -7 | n35 << 7);
                final int n37 = n36 + n13;
                final int n38 = n5 ^ (n37 >>> -9 | n37 << 9);
                final int n39 = n38 + n36;
                final int n40 = n9 ^ (n39 >>> -13 | n39 << 13);
                final int n41 = n40 + n38;
                final int n42 = n13 ^ (n41 >>> -18 | n41 << 18);
                final int n43 = n18 + n14;
                final int n44 = n6 ^ (n43 >>> -7 | n43 << 7);
                final int n45 = n44 + n18;
                final int n46 = n10 ^ (n45 >>> -9 | n45 << 9);
                final int n47 = n46 + n44;
                final int n48 = n14 ^ (n47 >>> -13 | n47 << 13);
                final int n49 = n48 + n46;
                final int n50 = n18 ^ (n49 >>> -18 | n49 << 18);
                final int n51 = n26 + n44;
                n4 = (n32 ^ (n51 >>> -7 | n51 << 7));
                final int n52 = n4 + n26;
                n5 = (n38 ^ (n52 >>> -9 | n52 << 9));
                final int n53 = n5 + n4;
                n6 = (n44 ^ (n53 >>> -13 | n53 << 13));
                final int n54 = n6 + n5;
                n3 = (n26 ^ (n54 >>> -18 | n54 << 18));
                final int n55 = n34 + n20;
                n9 = (n40 ^ (n55 >>> -7 | n55 << 7));
                final int n56 = n9 + n34;
                n10 = (n46 ^ (n56 >>> -9 | n56 << 9));
                final int n57 = n10 + n9;
                n7 = (n20 ^ (n57 >>> -13 | n57 << 13));
                final int n58 = n7 + n10;
                n8 = (n34 ^ (n58 >>> -18 | n58 << 18));
                final int n59 = n42 + n28;
                n14 = (n48 ^ (n59 >>> -7 | n59 << 7));
                final int n60 = n14 + n42;
                n11 = (n22 ^ (n60 >>> -9 | n60 << 9));
                final int n61 = n11 + n14;
                n12 = (n28 ^ (n61 >>> -13 | n61 << 13));
                final int n62 = n12 + n11;
                n13 = (n42 ^ (n62 >>> -18 | n62 << 18));
                final int n63 = n50 + n36;
                n15 = (n24 ^ (n63 >>> -7 | n63 << 7));
                final int n64 = n15 + n50;
                n16 = (n30 ^ (n64 >>> -9 | n64 << 9));
                final int n65 = n16 + n15;
                n17 = (n36 ^ (n65 >>> -13 | n65 << 13));
                final int n66 = n17 + n16;
                n18 = (n50 ^ (n66 >>> -18 | n66 << 18));
            }
            array2[0] = n3 + array3[0];
            array2[1] = n4 + array3[1];
            array2[2] = n5 + array3[2];
            array2[3] = n6 + array3[3];
            array2[4] = n7 + array3[4];
            array2[5] = n8 + array3[5];
            array2[6] = n9 + array3[6];
            array2[7] = n10 + array3[7];
            array2[8] = n11 + array3[8];
            array2[9] = n12 + array3[9];
            array2[10] = n13 + array3[10];
            array2[11] = n14 + array3[11];
            array2[12] = n15 + array3[12];
            array2[13] = n16 + array3[13];
            array2[14] = n17 + array3[14];
            array2[15] = n18 + array3[15];
            System.arraycopy(array2, 0, array4, n2, 16);
            n2 = (length >>> 1) + n - n2;
            n += 16;
            --i;
        }
    }
    
    public static l32.h f0(h$h h, h$i i, h$k l, final int n) {
        h$e h$e;
        if ((n & 0x1) != 0x0) {
            final long o = l32.h.o;
            final long p4 = l32.h.p;
            final long h2 = l32.h.h0;
            h$e = new h$e(o, p4, h2, l32.h.K, l32.h.H, h2, l32.h.L, l32.h.N, l32.h.m0, h2, l32.h.e0);
        }
        else {
            h$e = null;
        }
        if ((n & 0x2) != 0x0) {
            h = h(0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095);
        }
        if ((n & 0x4) != 0x0) {
            i = i(0L, 0L, 0L, 0L, 63);
        }
        if ((n & 0x8) != 0x0) {
            l = l(0L, 0L, 0L, 0L, 127);
        }
        h$g h$g;
        if ((n & 0x10) != 0x0) {
            final long p5 = l32.h.p;
            h$g = new h$g(p5, aa1.a.d(1090519039), aa1.a.e(2315255808L), aa1.a.e(3204448256L), aa1.a.e(3204448256L), p5);
        }
        else {
            h$g = null;
        }
        h$c h$c;
        if ((n & 0x20) != 0x0) {
            final long j0 = l32.h.j0;
            final long k0 = l32.h.k0;
            h$c = new h$c(j0, k0, l32.h.p, j0, k0);
        }
        else {
            h$c = null;
        }
        h$l h$l;
        if ((n & 0x40) != 0x0) {
            h$l = new h$l(aa1.a.e(4278870016L), aa1.a.e(4278733312L), l32.h.p, aa1.a.e(4279142912L), aa1.a.e(4278870016L));
        }
        else {
            h$l = null;
        }
        h$b h$b;
        if ((n & 0x80) != 0x0) {
            h$b = new h$b(aa1.a.e(4284896517L), aa1.a.e(4283449604L), l32.h.o, aa1.a.e(4292587264L), aa1.a.e(4287591431L));
        }
        else {
            h$b = null;
        }
        h$m h$m;
        if ((n & 0x100) != 0x0) {
            final long h3 = l32.h.h0;
            h$m = new h$m(h3, h3, o1.r.b(h3, 0.3f), l32.h.p, h3, l32.h.i0, o1.r.b(h3, 0.3f));
        }
        else {
            h$m = null;
        }
        h$d h$d;
        if ((n & 0x200) != 0x0) {
            final long v = l32.h.V;
            h$d = new h$d(v, v, o1.r.b(v, 0.3f), l32.h.p, v, l32.h.W, o1.r.b(v, 0.3f));
        }
        else {
            h$d = null;
        }
        h$a h$a;
        if ((n & 0x400) != 0x0) {
            h$a = new h$a(l32.h.p, aa1.a.e(4292426240L), aa1.a.e(4288030976L));
        }
        else {
            h$a = null;
        }
        h$j h$j;
        if ((n & 0x800) != 0x0) {
            h$j = new h$j(aa1.a.e(3422552064L), aa1.a.e(2566914048L));
        }
        else {
            h$j = null;
        }
        final h$h h$h = h;
        h$f h$f;
        if ((n & 0x1000) != 0x0) {
            h$f = new h$f(l32.h.P, aa1.a.d(687865856), aa1.a.d(1073741824), aa1.a.d(218103808));
        }
        else {
            h$f = null;
        }
        sg2.e.f((Object)h$e, "global");
        sg2.e.f((Object)h$h, "neutral");
        sg2.e.f((Object)i, "primary");
        sg2.e.f((Object)l, "secondary");
        sg2.e.f((Object)h$g, "media");
        sg2.e.f((Object)h$c, "danger");
        sg2.e.f((Object)h$l, "success");
        sg2.e.f((Object)h$b, "caution");
        sg2.e.f((Object)h$m, "upvote");
        sg2.e.f((Object)h$d, "downvote");
        sg2.e.f((Object)h$a, "brand");
        sg2.e.f((Object)h$j, "scrim");
        sg2.e.f((Object)h$f, "interactive");
        return new l32.h(h$e, h$h, i, l, h$g, h$c, h$l, h$b, h$m, h$d, h$a, h$j, h$f, true);
    }
    
    public static AbstractChannel g(int b, BufferOverflow suspend, int n) {
        final int n2 = 0;
        if ((n & 0x1) != 0x0) {
            b = 0;
        }
        if ((n & 0x2) != 0x0) {
            suspend = BufferOverflow.SUSPEND;
        }
        n = 1;
        Object o;
        if (b != -2) {
            if (b != -1) {
                if (b != 0) {
                    if (b != Integer.MAX_VALUE) {
                        if (b == 1 && suspend == BufferOverflow.DROP_OLDEST) {
                            o = new gj2.k((l)null);
                        }
                        else {
                            o = new gj2.c(b, suspend, (l)null);
                        }
                    }
                    else {
                        o = new gj2.l((l)null);
                    }
                }
                else if (suspend == BufferOverflow.SUSPEND) {
                    o = new gj2.r((l)null);
                }
                else {
                    o = new gj2.c(1, suspend, (l)null);
                }
            }
            else {
                b = n2;
                if (suspend == BufferOverflow.SUSPEND) {
                    b = 1;
                }
                if (b == 0) {
                    throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
                }
                o = new gj2.k((l)null);
            }
        }
        else {
            b = n;
            if (suspend == BufferOverflow.SUSPEND) {
                gj2.e.K3.getClass();
                b = gj2.e.a.b;
            }
            o = new gj2.c(b, suspend, (l)null);
        }
        return (AbstractChannel)o;
    }
    
    public static final boolean g0(final Context context) {
        sg2.e.f((Object)context, "<this>");
        final Object systemService = context.getSystemService("activity");
        sg2.e.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        final List runningAppProcesses = ((ActivityManager)systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                if (activityManager$RunningAppProcessInfo.importance == 100 && sg2.e.a((Object)activityManager$RunningAppProcessInfo.processName, (Object)context.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static h$h h(long x, long t, long r, long a, long b, long c, long x2, final int n) {
        if ((n & 0x1) != 0x0) {
            x = l32.h.x;
        }
        if ((n & 0x2) != 0x0) {
            t = l32.h.t;
        }
        if ((n & 0x4) != 0x0) {
            r = l32.h.r;
        }
        long p8;
        if ((n & 0x8) != 0x0) {
            p8 = l32.h.p;
        }
        else {
            p8 = 0L;
        }
        long p9;
        if ((n & 0x10) != 0x0) {
            p9 = l32.h.p;
        }
        else {
            p9 = 0L;
        }
        if ((n & 0x20) != 0x0) {
            a = l32.h.A;
        }
        if ((n & 0x40) != 0x0) {
            b = l32.h.B;
        }
        if ((n & 0x80) != 0x0) {
            c = l32.h.C;
        }
        if ((n & 0x100) != 0x0) {
            x2 = l32.h.x;
        }
        long e;
        if ((n & 0x200) != 0x0) {
            e = aa1.a.e(2147483648L);
        }
        else {
            e = 0L;
        }
        long d;
        if ((n & 0x400) != 0x0) {
            d = aa1.a.d(855638016);
        }
        else {
            d = 0L;
        }
        long d2;
        if ((n & 0x800) != 0x0) {
            d2 = aa1.a.d(436207616);
        }
        else {
            d2 = 0L;
        }
        return new h$h(x, t, r, p8, p9, a, b, c, x2, e, d, d2);
    }
    
    public static final boolean h0(final ti2.t t) {
        sg2.e.f((Object)t, "<this>");
        final hh2.e f = t.I0().f();
        boolean b = true;
        if (f != null) {
            final FunctionClassKind r = R(f);
            if (r == FunctionClassKind.Function || r == FunctionClassKind.SuspendFunction) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static h$i i(long r, long s, long r2, long s2, final int n) {
        if ((n & 0x1) != 0x0) {
            r = l32.h.R;
        }
        if ((n & 0x2) != 0x0) {
            s = l32.h.S;
        }
        long b0;
        if ((n & 0x4) != 0x0) {
            b0 = l32.h.b0;
        }
        else {
            b0 = 0L;
        }
        long p5;
        if ((n & 0x8) != 0x0) {
            p5 = l32.h.p;
        }
        else {
            p5 = 0L;
        }
        if ((n & 0x10) != 0x0) {
            r2 = l32.h.R;
        }
        if ((n & 0x20) != 0x0) {
            s2 = l32.h.S;
        }
        return new h$i(r, s, b0, p5, r2, s2);
    }
    
    public static final boolean i0(final ti2.t t) {
        sg2.e.f((Object)t, "<this>");
        return t.L0() instanceof p;
    }
    
    public static void j(int i, final int n, final int n2, int[] array) {
        final int n3 = n2 * 32;
        final int[] array2 = new int[16];
        final int[] array3 = new int[16];
        final int[] array4 = new int[n3];
        final int[] array5 = new int[n3];
        final int[] array6 = new int[n * n3];
    Label_0236_Outer:
        while (true) {
            Label_0218: {
                try {
                    System.arraycopy(array, i, array5, 0, n3);
                    int j;
                    for (int n4 = j = 0; j < n; j += 2) {
                        System.arraycopy(array5, 0, array6, n4, n3);
                        final int n5 = n4 + n3;
                        f(n2, array5, array2, array3, array4);
                        System.arraycopy(array4, 0, array6, n5, n3);
                        n4 = n5 + n3;
                        f(n2, array4, array2, array3, array5);
                    }
                    final int n6 = 0;
                    if (n6 < n) {
                        System.arraycopy(array6, (array5[n3 - 16] & n - 1) * n3, array4, 0, n3);
                        int n7 = n3;
                        while (--n7 >= 0) {
                            array4[n7] ^= array5[0 + n7];
                        }
                        break Label_0218;
                    }
                    break Label_0218;
                }
                finally {
                    Arrays.fill(array6, 0);
                    int[] array7;
                    for (i = 0; i < 4; ++i) {
                        array7 = (new int[][] { array5, array2, array3, array4 })[i];
                        if (array7 != null) {
                            Arrays.fill(array7, 0);
                        }
                    }
                    while (true) {
                        iftrue(Label_0283:)(i >= 4);
                        Block_7: {
                            break Block_7;
                            Label_0283: {
                                return;
                            }
                        }
                        array = (new int[][] { array5, array2, array3, array4 })[i];
                        iftrue(Label_0277:)(array == null);
                        Arrays.fill(array, 0);
                        Label_0277: {
                            break Label_0277;
                            f(n2, array4, array2, array3, array5);
                            int n6 = 0;
                            ++n6;
                            continue Label_0236_Outer;
                            System.arraycopy(array5, 0, array, i, n3);
                            Arrays.fill(array6, 0);
                            i = 0;
                            continue;
                        }
                        ++i;
                        continue;
                    }
                }
            }
            break;
        }
    }
    
    public static boolean j0(final MotionEvent motionEvent, final int n) {
        return (motionEvent.getSource() & n) == n;
    }
    
    public static h$k k(final long n, final long n2, final long n3, final long n4, final long n5, final long n6, final long n7) {
        return new h$k(n, n2, n3, n4, n5, n6, n7);
    }
    
    public static final boolean k0(final ti2.t t) {
        sg2.e.f((Object)t, "<this>");
        final hh2.e f = t.I0().f();
        FunctionClassKind r;
        if (f != null) {
            r = R(f);
        }
        else {
            r = null;
        }
        return r == FunctionClassKind.SuspendFunction;
    }
    
    public static h$k l(long x, long r, long o, long o2, final int n) {
        if ((n & 0x1) != 0x0) {
            x = l32.h.x;
        }
        if ((n & 0x2) != 0x0) {
            r = l32.h.r;
        }
        if ((n & 0x4) != 0x0) {
            o = l32.h.o;
        }
        if ((n & 0x8) != 0x0) {
            o2 = l32.h.o;
        }
        long e = 0L;
        long c;
        if ((n & 0x10) != 0x0) {
            c = l32.h.C;
        }
        else {
            c = 0L;
        }
        long d;
        if ((n & 0x20) != 0x0) {
            d = l32.h.D;
        }
        else {
            d = 0L;
        }
        if ((n & 0x40) != 0x0) {
            e = l32.h.E;
        }
        return k(x, r, o, o2, c, d, e);
    }
    
    public static final boolean l0(final Throwable t) {
        if (t instanceof Failure$ServerError) {
            final Failure$ServerError failure$ServerError = (Failure$ServerError)t;
            if (sg2.e.a((Object)failure$ServerError.getError().a, (Object)"M_UNKNOWN_TOKEN") || sg2.e.a((Object)failure$ServerError.getError().a, (Object)"M_MISSING_TOKEN") || sg2.e.a((Object)failure$ServerError.getError().a, (Object)"ORG_MATRIX_EXPIRED_ACCOUNT")) {
                return true;
            }
        }
        return false;
    }
    
    public static final di2.c m(final di2.d d, final String s) {
        final di2.c i = d.c(di2.e.f(s)).i();
        sg2.e.e((Object)i, "child(Name.identifier(name)).toSafe()");
        return i;
    }
    
    public static final x82.a m0(final List list) {
        sg2.e.f((Object)list, "<this>");
        final Iterator iterator = list.iterator();
        while (true) {
            Object next;
            do {
                final boolean hasNext = iterator.hasNext();
                final x82.a a = null;
                if (!hasNext) {
                    next = null;
                    final k0 k0 = (k0)next;
                    x82.a g = a;
                    if (k0 != null) {
                        g = k0.g;
                    }
                    return g;
                }
                next = iterator.next();
            } while (((k0)next).g == null);
            continue;
        }
    }
    
    public static void n(final int n, final StringBuilder sb) {
        for (int i = 0; i < n; ++i) {
            sb.append("?");
            if (i < n - 1) {
                sb.append(",");
            }
        }
    }
    
    public static final Event o(final iq2.g g, final boolean b) {
        sg2.e.f((Object)g, "<this>");
        return a92.b.U(g, b);
    }
    
    public static final x o0(final ti2.t t) {
        sg2.e.f((Object)t, "<this>");
        final v0 l0 = t.L0();
        x g;
        if (l0 instanceof p) {
            g = ((p)l0).g;
        }
        else {
            if (!(l0 instanceof x)) {
                throw new NoWhenBranchMatchedException();
            }
            g = (x)l0;
        }
        return g;
    }
    
    public static final p p(final ti2.t t) {
        sg2.e.f((Object)t, "<this>");
        final v0 l0 = t.L0();
        sg2.e.d((Object)l0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (p)l0;
    }
    
    public static final vn0.a p0(final int n, final List list) {
        final int n2 = n * 9 / 16;
        int n5;
        int n6;
        if (list != null) {
            final Iterator iterator = list.iterator();
            int n3 = n;
            int n4 = n2;
            while (true) {
                n5 = n3;
                n6 = n4;
                if (!iterator.hasNext()) {
                    break;
                }
                final ImageResolution imageResolution = (ImageResolution)iterator.next();
                int width = imageResolution.getWidth();
                if (width > n3) {
                    width = n3;
                }
                if ((n3 = width) < n) {
                    n3 = n;
                }
                final int height = imageResolution.getHeight();
                if (height < n4) {
                    continue;
                }
                n4 = height;
            }
        }
        else {
            n5 = n;
            n6 = n2;
        }
        return new vn0.a(n, Math.min((int)Math.ceil(n / n5 * n6 * 1.0), n2));
    }
    
    public static final void q(final View view) {
        sg2.e.f((Object)view, "<this>");
        final Iterator iterator = androidx.core.view.b.c(view).iterator();
        while (true) {
            final bj2.l l = (bj2.l)iterator;
            if (!l.hasNext()) {
                break;
            }
            final g4.b v = V((View)l.next());
            for (int l2 = lw0.b.L0((List)v.a); -1 < l2; --l2) {
                ((g4.a)v.a.get(l2)).a();
            }
        }
    }
    
    public static final ff2.t q0(final List list) {
        sg2.e.g((Object)list, "$this$merge");
        final ff2.t fromIterable = ff2.t.fromIterable((Iterable)list);
        sg2.e.b((Object)fromIterable, "Observable.fromIterable(this)");
        final ff2.t merge = ff2.t.merge((ff2.y)fromIterable);
        sg2.e.b((Object)merge, "Observable.merge(this.toObservable())");
        return merge;
    }
    
    public static boolean r(final boolean b, final boolean b2, final ff2.a0 a0, final nf2.j j, final if2.a a2, final of2.j i) {
        if (i.i) {
            j.clear();
            a2.dispose();
            return true;
        }
        if (b) {
            final Throwable k = i.k;
            if (k != null) {
                j.clear();
                if (a2 != null) {
                    a2.dispose();
                }
                a0.onError(k);
                return true;
            }
            if (b2) {
                if (a2 != null) {
                    a2.dispose();
                }
                a0.onComplete();
                return true;
            }
        }
        return false;
    }
    
    public static final Set r0(final Object... array) {
        final LinkedHashSet set = new LinkedHashSet(d.o0(array.length));
        kotlin.collections.b.s1(set, array);
        return set;
    }
    
    public static final String s(final qj2.e e, final tj2.a a) {
        sg2.e.f((Object)e, "<this>");
        sg2.e.f((Object)a, "json");
        for (final Annotation annotation : e.getAnnotations()) {
            if (annotation instanceof tj2.d) {
                return ((tj2.d)annotation).discriminator();
            }
        }
        return a.a.j;
    }
    
    public static final Set s0(Set o) {
        final int size = ((Set)o).size();
        if (size != 0) {
            if (size == 1) {
                o = A0(((Set)o).iterator().next());
            }
        }
        else {
            o = EmptySet.INSTANCE;
        }
        return (Set)o;
    }
    
    public static final Object t0(Object o, final LockFreeLinkedListNode lockFreeLinkedListNode) {
        if (o == null) {
            o = lockFreeLinkedListNode;
        }
        else if (o instanceof ArrayList) {
            ((ArrayList)o).add(lockFreeLinkedListNode);
        }
        else {
            final ArrayList list = new ArrayList(4);
            list.add(o);
            list.add(lockFreeLinkedListNode);
            o = list;
        }
        return o;
    }
    
    public static final void u(final ArrayList list, final List list2) {
        sg2.e.f((Object)list, "<this>");
        sg2.e.f((Object)list2, "other");
        list.clear();
        list.addAll(list2);
    }
    
    public static boolean u0(long value, final qt2.c c, final ArrayDeque arrayDeque, final AtomicLong atomicLong, final kf2.e e) {
        long n = value & Long.MIN_VALUE;
        while (true) {
            if (n != value) {
                boolean b = false;
                try {
                    e.getAsBoolean();
                }
                finally {
                    final Throwable t;
                    c0.i4(t);
                    b = true;
                }
                if (b) {
                    return true;
                }
                final Object poll = arrayDeque.poll();
                if (poll == null) {
                    c.onComplete();
                    return true;
                }
                c.onNext(poll);
                ++n;
            }
            else {
                boolean b2 = false;
                try {
                    e.getAsBoolean();
                }
                finally {
                    final Throwable t2;
                    c0.i4(t2);
                    b2 = true;
                }
                if (b2) {
                    return true;
                }
                if (arrayDeque.isEmpty()) {
                    c.onComplete();
                    return true;
                }
                if ((value = atomicLong.get()) != n) {
                    continue;
                }
                final long addAndGet = atomicLong.addAndGet(-(n & Long.MAX_VALUE));
                if ((Long.MAX_VALUE & addAndGet) == 0x0L) {
                    return false;
                }
                value = addAndGet;
                n = (addAndGet & Long.MIN_VALUE);
            }
        }
    }
    
    public static final RedditAlertDialog v(final Context context, final rg2.p p2) {
        sg2.e.f((Object)context, "context");
        final RedditAlertDialog redditAlertDialog = new RedditAlertDialog(context, true, false, 4);
        android.support.v4.media.a.e(redditAlertDialog.c, 2131952192, 2131952191, 2131951733, (DialogInterface$OnClickListener)null).setPositiveButton(2131951731, (DialogInterface$OnClickListener)new dk0.i((Object)p2, 5));
        return redditAlertDialog;
    }
    
    public static final void v0(final HashSet set, final Activity activity) {
        sg2.e.f((Object)set, "<this>");
        final Iterator iterator = set.iterator();
        sg2.e.e((Object)iterator, "iterator()");
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            sg2.e.e(next, "iterator.next()");
            final Activity activity2 = (Activity)((WeakReference)next).get();
            if (activity2 != null) {
                int n = 0;
                if (activity != null) {
                    n = n;
                    if (activity.hashCode() == activity2.hashCode()) {
                        n = 1;
                    }
                }
                if (n == 0) {
                    continue;
                }
            }
            iterator.remove();
        }
    }
    
    public static final RedditAlertDialog w(final Context context, final String s, final rg2.p p3) {
        sg2.e.f((Object)context, "context");
        sg2.e.f((Object)s, "username");
        final RedditAlertDialog redditAlertDialog = new RedditAlertDialog(context, true, false, 4);
        redditAlertDialog.c.setTitle((CharSequence)context.getString(2131953582, new Object[] { s })).setMessage(2131956958).setNegativeButton(2131951733, (DialogInterface$OnClickListener)null).setPositiveButton(2131951730, (DialogInterface$OnClickListener)new ce1.a(p3, 0));
        return redditAlertDialog;
    }
    
    public static final dev.chrisbanes.snapper.a w0(final LazyListState lazyListState, final rg2.p p5, float n, final z0.d d, int w0) {
        sg2.e.f((Object)lazyListState, "lazyListState");
        d.A(-1050829263);
        rg2.p b = p5;
        if ((w0 & 0x2) != 0x0) {
            b = SnapOffsets.b;
        }
        if ((w0 & 0x4) != 0x0) {
            n = 0;
        }
        d.A(-3686552);
        final boolean m = d.m((Object)lazyListState);
        final boolean i = d.m((Object)b);
        final Object b2 = d.B();
        dev.chrisbanes.snapper.a a;
        if ((m | i) || (a = (dev.chrisbanes.snapper.a)b2) == z0.d$a.a) {
            a = new dev.chrisbanes.snapper.a(lazyListState, b);
            d.w((Object)a);
        }
        d.I();
        final dev.chrisbanes.snapper.a a2 = a;
        w0 = ((u2.b)d.u((o0)CompositionLocalsKt.e)).w0(n);
        ((SnapshotMutableStateImpl)a2.c).setValue((Object)w0);
        d.I();
        return a2;
    }
    
    public static final int x(final ti2.t t) {
        sg2.e.f((Object)t, "<this>");
        final ih2.c f = t.getAnnotations().f(kotlin.reflect.jvm.internal.impl.builtins.e$a.q);
        if (f == null) {
            return 0;
        }
        final hi2.g g = (hi2.g)kotlin.collections.c.W0(f.a(), (Object)kotlin.reflect.jvm.internal.impl.builtins.e.c);
        sg2.e.d((Object)g, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number)((hi2.g)g).a).intValue();
    }
    
    public static void x0(final qt2.d d, final int n) {
        long n2;
        if (n < 0) {
            n2 = Long.MAX_VALUE;
        }
        else {
            n2 = n;
        }
        d.request(n2);
    }
    
    public static final Handler y(final String s) {
        final HandlerThread handlerThread = new HandlerThread(s);
        ((Thread)handlerThread).start();
        return new Handler(handlerThread.getLooper());
    }
    
    public static final ff2.n y0(final CoroutineContext coroutineContext, final rg2.p p2) {
        if (coroutineContext.get((CoroutineContext$b)z0.b.f) == null) {
            return RxJavaPlugins.onAssembly(new MaybeCreate<Object>((ff2.q<Object>)new ni.m((Object)s0.f, (Object)coroutineContext, (Object)p2)));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ");
        sb.append(coroutineContext);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static final x z(final kotlin.reflect.jvm.internal.impl.builtins.c c, ih2.e a, final ti2.t t, final List list, final ArrayList list2, final ti2.t t2, final boolean b) {
        sg2.e.f((Object)list, "contextReceiverTypes");
        final int size = list2.size();
        final int size2 = list.size();
        final int n = 0;
        int n2;
        if (t != null) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final ArrayList list3 = new ArrayList(size2 + size + n2 + 1);
        final ArrayList<p0> list4 = new ArrayList<p0>(ig2.m.c3((Iterable)list, 10));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list4.add(TypeUtilsKt.a((ti2.t)iterator.next()));
        }
        list3.addAll((Collection)list4);
        p0 a2;
        if (t != null) {
            a2 = TypeUtilsKt.a(t);
        }
        else {
            a2 = null;
        }
        d.A((AbstractCollection)list3, (Object)a2);
        final Iterator iterator2 = list2.iterator();
        int n3 = 0;
        while (iterator2.hasNext()) {
            final Object next = iterator2.next();
            if (n3 < 0) {
                lw0.b.I2();
                throw null;
            }
            list3.add((Object)TypeUtilsKt.a((ti2.t)next));
            ++n3;
        }
        list3.add((Object)TypeUtilsKt.a(t2));
        final int size3 = list2.size();
        final int size4 = list.size();
        int n4;
        if (t == null) {
            n4 = n;
        }
        else {
            n4 = 1;
        }
        final int n5 = size4 + size3 + n4;
        hh2.c c2;
        if (b) {
            c2 = c.w(n5);
        }
        else {
            final di2.e a3 = kotlin.reflect.jvm.internal.impl.builtins.e.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Function");
            sb.append(n5);
            c2 = c.k(sb.toString());
        }
        sg2.e.e((Object)c2, "if (isSuspendFunction) b\u2026tFunction(parameterCount)");
        Object a4 = a;
        if (t != null) {
            final di2.c p7 = kotlin.reflect.jvm.internal.impl.builtins.e$a.p;
            if (a.S(p7)) {
                a4 = a;
            }
            else {
                a4 = ih2.e$a.a((List)CollectionsKt___CollectionsKt.V3((Iterable)a, (Object)new BuiltInAnnotationDescriptor(c, p7, kotlin.collections.c.V0())));
            }
        }
        a = (ih2.e)a4;
        if (list.isEmpty() ^ true) {
            final int size5 = list.size();
            final di2.c q = kotlin.reflect.jvm.internal.impl.builtins.e$a.q;
            if (((ih2.e)a4).S(q)) {
                a = (ih2.e)a4;
            }
            else {
                a = ih2.e$a.a((List)CollectionsKt___CollectionsKt.V3((Iterable)a4, (Object)new BuiltInAnnotationDescriptor(c, q, d.p0(new Pair((Object)kotlin.reflect.jvm.internal.impl.builtins.e.c, (Object)new hi2.l(size5))))));
            }
        }
        return KotlinTypeFactory.e(lw0.b.N2(a), c2, (List<? extends n0>)list3);
    }
    
    public static final void z0(final int p0, final int p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "fileTempDir"
        //     4: invokestatic    sg2/e.g:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: iload_0        
        //     8: aload_2        
        //     9: invokestatic    a4/a0.U:(ILjava/lang/String;)Ljava/lang/String;
        //    12: astore_2       
        //    13: iload_1        
        //    14: i2l            
        //    15: lstore_3       
        //    16: aload_2        
        //    17: ldc_w           "filePath"
        //    20: invokestatic    sg2/e.g:(Ljava/lang/Object;Ljava/lang/String;)V
        //    23: aload_2        
        //    24: invokestatic    lw0/b.E0:(Ljava/lang/String;)Ljava/io/File;
        //    27: astore          5
        //    29: aload           5
        //    31: invokevirtual   java/io/File.exists:()Z
        //    34: ifeq            81
        //    37: new             Ljava/io/RandomAccessFile;
        //    40: astore_2       
        //    41: aload_2        
        //    42: aload           5
        //    44: ldc_w           "rw"
        //    47: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    50: aload_2        
        //    51: lconst_0       
        //    52: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //    55: aload_2        
        //    56: lconst_0       
        //    57: invokevirtual   java/io/RandomAccessFile.setLength:(J)V
        //    60: aload_2        
        //    61: lload_3        
        //    62: invokevirtual   java/io/RandomAccessFile.writeLong:(J)V
        //    65: goto            77
        //    68: astore          5
        //    70: aload_2        
        //    71: invokevirtual   java/io/RandomAccessFile.close:()V
        //    74: aload           5
        //    76: athrow         
        //    77: aload_2        
        //    78: invokevirtual   java/io/RandomAccessFile.close:()V
        //    81: return         
        //    82: astore_2       
        //    83: goto            81
        //    86: astore          5
        //    88: goto            77
        //    91: astore_2       
        //    92: goto            74
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      13     82     86     Ljava/lang/Exception;
        //  16     50     82     86     Ljava/lang/Exception;
        //  50     65     86     91     Ljava/lang/Exception;
        //  50     65     68     77     Any
        //  70     74     91     95     Ljava/lang/Exception;
        //  74     77     82     86     Ljava/lang/Exception;
        //  77     81     82     86     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0074:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void B(final String s, final Object... array) {
        sg2.e.g((Object)s, "message");
        this.n0(3, s, null, Arrays.copyOf(array, array.length));
    }
    
    public void G(final String s, final Object... array) {
        this.n0(6, s, null, Arrays.copyOf(array, array.length));
    }
    
    public void H(final Throwable t, final String s, final Object... array) {
        sg2.e.g((Object)s, "message");
        this.n0(6, s, t, Arrays.copyOf(array, array.length));
    }
    
    public Object a(final e e) {
        sg2.e.g((Object)e, "reader");
        return e.g();
    }
    
    public Object apply(final Object o) {
        final ArrayList list = (ArrayList)o;
        final ArrayList list2 = new ArrayList();
        for (final com.instabug.survey.common.models.c c : list) {
            final String a = c.a();
            boolean b = true;
            Label_0415: {
                if (a != null) {
                    int n = -1;
                    switch (a) {
                        case "last_seen": {
                            n = 9;
                            break;
                        }
                        case "sessions_count": {
                            n = 8;
                            break;
                        }
                        case "app_version_v2": {
                            n = 7;
                            break;
                        }
                        case "days_since_dismiss": {
                            n = 6;
                            break;
                        }
                        case "country": {
                            n = 5;
                            break;
                        }
                        case "email": {
                            n = 4;
                            break;
                        }
                        case "date": {
                            n = 3;
                            break;
                        }
                        case "android_version": {
                            n = 2;
                            break;
                        }
                        case "app_version": {
                            n = 1;
                            break;
                        }
                        case "days_since_signup": {
                            n = 0;
                            break;
                        }
                        default:
                            break;
                    }
                    switch (n) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9: {
                            break Label_0415;
                        }
                    }
                }
                b = false;
            }
            if (b) {
                list2.add(c);
            }
        }
        return list2;
    }
    
    public int b(final int n) {
        return n;
    }
    
    public Object c(final IBinder binder) {
        final int a = gg.v0.a;
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            if (queryLocalInterface instanceof w0) {
                o = queryLocalInterface;
            }
            else {
                o = new u0(binder);
            }
        }
        return o;
    }
    
    public Object[] d(final Object o, final ArrayList list, final File file, final ArrayList list2) {
        return (Object[])h0.e(o, "makePathElements", (Class)List.class, list, (Class)File.class, file, (Class)List.class, list2);
    }
    
    public boolean e(final Object o, final File file, final File file2) {
        try {
            return (boolean)h0.f((Class)Class.forName("dalvik.system.DexFile"), file.getPath()) ^ true;
        }
        catch (final ClassNotFoundException ex) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
    
    public void n0(final int n, final String s, final Throwable t, final Object... array) {
    }
    
    public Object t(final ih.p p) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((ih.c)p);
    }
    
    public Object y1() {
        return new TreeMap();
    }
}
