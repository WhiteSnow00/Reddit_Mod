// 
// Decompiled by Procyon v0.6.0
// 

package zd;

import java.util.concurrent.CountDownLatch;
import android.widget.TextView;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.google.firebase.iid.Registrar;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import r51.p$v;
import r51.p$e;
import r51.p$n;
import r51.p$l;
import r51.p$k;
import r51.p$i;
import r51.p$h;
import r51.p$b;
import r51.p$a;
import r51.p$w;
import r51.p$m;
import r51.p$d;
import r51.p$y;
import r51.p$t;
import r51.p$s;
import r51.p$c;
import r51.p$r;
import r51.p$g;
import r51.p$p;
import r51.p$j;
import r51.p$u;
import r51.p$x;
import r51.p$o;
import r51.p$f;
import r51.p$q;
import android.graphics.PorterDuff$Mode;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import java.io.Closeable;
import android.content.Intent;
import android.text.TextUtils;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.NetworkInfo;
import kotlin.TypeCastException;
import android.net.ConnectivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import kotlin.time.DurationUnit;
import android.opengl.GLES20;
import com.reddit.vault.domain.model.PendingTransactionSubtype$a;
import com.reddit.vault.domain.model.TransactionType$a;
import java.math.BigInteger;
import com.reddit.vault.domain.model.PendingTransactionSubtype;
import com.reddit.vault.domain.model.TransactionType;
import android.content.ContextWrapper;
import com.reddit.ui.AvatarView;
import kotlinx.serialization.SerializationException;
import android.text.TextWatcher;
import android.widget.EditText;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import hp.u;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.KTypeImpl;
import java.io.IOException;
import java.net.SocketTimeoutException;
import com.tonyodev.fetch2.Error;
import org.json.JSONException;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONObject;
import java.util.Collections;
import android.graphics.RectF;
import com.reddit.frontpage.image.NsfwDrawable;
import com.reddit.frontpage.image.NsfwDrawable$Shape;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.reddit.domain.model.SubredditDetail;
import c91.h$a;
import c91.b$a;
import com.reddit.domain.model.Link;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import android.view.View;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.exceptions.ProtocolViolationException;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.ComposerKt;
import android.graphics.Canvas;
import og2.d$a;
import kotlin.jvm.internal.Ref$IntRef;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.NoSuchElementException;
import kotlin.random.Random$Default;
import je.f4;
import oi2.n0$a;
import oi2.q0;
import oi2.n0;
import oi2.m0;
import android.os.Looper;
import java.lang.ref.WeakReference;
import android.app.Activity;
import android.widget.Toast;
import android.content.ClipData;
import android.content.ClipboardManager;
import java.util.Arrays;
import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import android.content.DialogInterface$OnClickListener;
import com.reddit.screen.dialog.RedditAlertDialog;
import android.content.Context;
import kotlin.collections.EmptySet;
import ch2.v;
import hp.n;
import hp.p;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import java.util.LinkedHashSet;
import java.util.Set;
import java.io.OutputStream;
import hp.i;
import android.database.sqlite.SQLiteDatabase;
import th2.i$b;
import th2.i$c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import oi2.x;
import oi2.l0;
import java.util.Iterator;
import java.util.List;
import fh2.z;
import ch2.i0;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import ch2.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import qi2.h;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import bh2.c$a;
import bh2.c;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kh2.s;
import pi2.a$a;
import pi2.k;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.collections.CollectionsKt___CollectionsKt;
import oi2.k0;
import oi2.o0;
import java.util.ArrayList;
import dg2.m;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import zg2.g;
import th2.j;
import mg2.q;
import th2.r;
import tg2.l;
import je.o7;
import je.n7;
import ej2.t;
import ff2.o;
import un0.f;
import bn0.r0;
import java.lang.reflect.Method;
import bt1.a;
import jh.e;
import fw1.d;

public class b implements d, e, a
{
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static Method G;
    public static Method H;
    public static boolean I;
    public static volatile ClassLoader f;
    public static volatile Thread g;
    public static r0 h;
    public static f i;
    public static bu0.e j;
    public static volatile o k;
    public static volatile o l;
    public static final t m;
    public static final int[] n;
    public static final int[] o;
    public static final b p;
    public static final d11.a q;
    public static final b r;
    public static final n7 s;
    public static final o7 t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    
    static {
        m = new t("CLOSED");
        n = new int[] { 2130968768 };
        o = new int[] { 2130968918, 2130969726 };
        p = new b();
        q = new d11.a();
        r = new b();
        s = new n7();
        t = new o7();
        u = new byte[] { 97, 99, 84, 76 };
        v = new byte[] { 102, 99, 84, 76 };
        w = new byte[] { 102, 100, 65, 84 };
        x = new byte[] { 73, 68, 65, 84 };
        y = new byte[] { 73, 72, 68, 82 };
        z = new byte[] { 73, 69, 78, 68 };
        A = new byte[] { 80, 76, 84, 69 };
        B = new byte[] { 116, 82, 78, 83 };
        C = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
        D = new int[] { 16842804, 16842901, 16842904, 16843692, 2130968637, 2130969416, 2130969820 };
        E = new int[] { 16842927, 2130968998, 2130968999, 2130969000, 2130969001, 2130969002, 2130969003, 2130969004, 2130969217, 2130969330 };
        F = new int[] { 2130968576, 2130968662, 2130969189, 2130969190, 2130969225, 2130969434 };
    }
    
    public static final long A(final long n, final l l) {
        if (l instanceof tg2.e) {
            return ((Number)B(n, (tg2.e)l)).longValue();
        }
        if (!l.isEmpty()) {
            long n2;
            if (n < ((Number)l.c()).longValue()) {
                n2 = ((Number)l.c()).longValue();
            }
            else {
                n2 = n;
                if (n > ((Number)l.d()).longValue()) {
                    n2 = ((Number)l.d()).longValue();
                }
            }
            return n2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(l);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final Object A0(oi2.t a, final r r, final q q) {
        final j a2 = th2.j.a;
        final p2.b g = p2.b.g;
        ng2.e.f((Object)a, "kotlinType");
        ng2.e.f((Object)q, "writeGenericType");
        if (ah0.b.M0(a)) {
            final z a3 = zg2.g.a;
            ah0.b.M0(a);
            final kotlin.reflect.jvm.internal.impl.builtins.c g2 = TypeUtilsKt.g(a);
            final dh2.e annotations = a.getAnnotations();
            final oi2.t s0 = ah0.b.s0(a);
            final List i0 = ah0.b.i0(a);
            final List v0 = ah0.b.v0(a);
            final ArrayList list = new ArrayList<oi2.t>(dg2.m.u4((Iterable)v0, 10));
            final Iterator iterator = v0.iterator();
            while (iterator.hasNext()) {
                list.add(((o0)iterator.next()).getType());
            }
            k0.g.getClass();
            final k0 h = k0.h;
            final l0 n = zg2.g.a.n();
            ah0.b.F0(a);
            final oi2.t type = ((o0)CollectionsKt___CollectionsKt.c5(a.G0())).getType();
            ng2.e.e((Object)type, "arguments.last().type");
            final ArrayList p3 = CollectionsKt___CollectionsKt.p5((Collection)list, (Object)KotlinTypeFactory.f(h, n, cg.d.l3((Object)TypeUtilsKt.a(type)), false, (pi2.d)null));
            final x p4 = TypeUtilsKt.g(a).p();
            ng2.e.e((Object)p4, "suspendFunType.builtIns.nullableAnyType");
            return A0((oi2.t)ah0.b.R(g2, annotations, s0, i0, p3, (oi2.t)p4, false).P0(a.J0()), r, q);
        }
        final ri2.j m0 = a$a.m0((pi2.a)pi2.k.f, (ri2.f)a);
        Object o = null;
        Label_0554: {
            Label_0551: {
                if (a$a.I(m0)) {
                    final PrimitiveType u = a$a.u(m0);
                    if (u != null) {
                        final i$c d = a2.d(u);
                        boolean b = false;
                        Label_0328: {
                            if (!a$a.S((ri2.f)a)) {
                                final yh2.c p5 = kh2.s.p;
                                ng2.e.e((Object)p5, "ENHANCED_NULLABILITY_ANNOTATION");
                                if (!a$a.D((ri2.f)a, p5)) {
                                    b = false;
                                    break Label_0328;
                                }
                            }
                            b = true;
                        }
                        ng2.e.f((Object)d, "possiblyPrimitiveType");
                        o = d;
                        if (b) {
                            o = a2.a(d);
                        }
                        break Label_0554;
                    }
                    else {
                        final PrimitiveType t = a$a.t(m0);
                        if (t != null) {
                            final StringBuilder o2 = d.o('[');
                            o2.append(JvmPrimitiveType.get(t).getDesc());
                            o = th2.j.b(o2.toString());
                            break Label_0554;
                        }
                        if (a$a.Y(m0)) {
                            final yh2.d q2 = a$a.q(m0);
                            final String a4 = c.a;
                            final yh2.b g3 = c.g(q2);
                            if (g3 != null) {
                                if (!r.g) {
                                    final List n2 = c.n;
                                    boolean b2 = false;
                                    Label_0514: {
                                        if (!(n2 instanceof Collection) || !n2.isEmpty()) {
                                            final Iterator iterator2 = n2.iterator();
                                            while (iterator2.hasNext()) {
                                                if (ng2.e.a((Object)((c$a)iterator2.next()).a, (Object)g3)) {
                                                    b2 = true;
                                                    break Label_0514;
                                                }
                                            }
                                        }
                                        b2 = false;
                                    }
                                    if (b2) {
                                        break Label_0551;
                                    }
                                }
                                final String e = fi2.b.b(g3).e();
                                ng2.e.e((Object)e, "byClassId(classId).internalName");
                                o = a2.c(e);
                                break Label_0554;
                            }
                        }
                    }
                }
            }
            o = null;
        }
        if (o != null) {
            final boolean a5 = r.a;
            final j a6 = th2.j.a;
            Object a7 = o;
            if (a5) {
                a7 = a6.a(o);
            }
            q.invoke((Object)a, a7, (Object)r);
            return a7;
        }
        final l0 i2 = a.I0();
        if (i2 instanceof IntersectionTypeConstructor) {
            final IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor)i2;
            a = intersectionTypeConstructor.a;
            if (a != null) {
                return A0((oi2.t)TypeUtilsKt.o(a), r, q);
            }
            g.s(intersectionTypeConstructor.b);
            throw null;
        }
        else {
            final ch2.e f = i2.f();
            if (f == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("no descriptor for type constructor of ");
                sb.append(a);
                throw new UnsupportedOperationException(sb.toString());
            }
            if (qi2.h.f((ch2.g)f)) {
                final i$b c = a2.c("error/NonExistentClass");
                final ch2.c c2 = (ch2.c)f;
                return c;
            }
            final boolean b3 = f instanceof ch2.c;
            if (b3 && kotlin.reflect.jvm.internal.impl.builtins.c.z(a)) {
                if (a.G0().size() == 1) {
                    final o0 o3 = a.G0().get(0);
                    final oi2.t type2 = o3.getType();
                    ng2.e.e((Object)type2, "memberProjection.type");
                    Object o4;
                    if (o3.b() == Variance.IN_VARIANCE) {
                        o4 = a2.c("java/lang/Object");
                    }
                    else {
                        final Variance b4 = o3.b();
                        ng2.e.e((Object)b4, "memberProjection.projectionKind");
                        r r2 = null;
                        Label_0874: {
                            if (!r.c) {
                                final int n3 = r.a.a[((Enum)b4).ordinal()];
                                if (n3 != 1) {
                                    if (n3 != 2) {
                                        if ((r2 = r.f) != null) {
                                            break Label_0874;
                                        }
                                    }
                                    else if ((r2 = r.i) != null) {
                                        break Label_0874;
                                    }
                                }
                                else if ((r2 = r.h) != null) {
                                    break Label_0874;
                                }
                            }
                            r2 = r;
                        }
                        o4 = A0(type2, r2, q);
                    }
                    final StringBuilder o5 = d.o('[');
                    o5.append(a2.f(o4));
                    return th2.j.b(o5.toString());
                }
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            else {
                if (b3) {
                    if (ai2.e.b((ch2.g)f) && !r.b) {
                        final oi2.t t2 = (oi2.t)xd.a.F((ri2.f)a, new HashSet());
                        if (t2 != null) {
                            return A0(t2, new r(r.a, true, r.c, r.d, r.e, r.f, r.g, r.h, r.i, false, 512), q);
                        }
                    }
                    i$b i$b;
                    if (r.c && kotlin.reflect.jvm.internal.impl.builtins.c.c((ch2.e)f, e$a.P)) {
                        i$b = a2.e();
                    }
                    else {
                        final ch2.c c3 = (ch2.c)f;
                        ng2.e.e((Object)c3.a(), "descriptor.original");
                        ch2.c c4 = c3;
                        if (c3.getKind() == ClassKind.ENUM_ENTRY) {
                            final ch2.g b5 = c3.b();
                            ng2.e.d((Object)b5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            c4 = (ch2.c)b5;
                        }
                        final ch2.c a8 = c4.a();
                        ng2.e.e((Object)a8, "enumClassIfEnumEntry.original");
                        i$b = a2.c(E(a8, (th2.q)g));
                    }
                    q.invoke((Object)a, (Object)i$b, (Object)r);
                    return i$b;
                }
                if (f instanceof j0) {
                    Object o6;
                    final oi2.t t3 = (oi2.t)(o6 = TypeUtilsKt.h((j0)f));
                    if (a.J0()) {
                        o6 = TypeUtilsKt.l(t3);
                    }
                    return A0((oi2.t)o6, r, FunctionsKt.b);
                }
                if (f instanceof i0 && r.j) {
                    return A0((oi2.t)((i0)f).Y(), r, q);
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown type ");
                sb2.append(a);
                throw new UnsupportedOperationException(sb2.toString());
            }
        }
    }
    
    public static void A1(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 24: {
                new hp.l().b(sqLiteDatabase);
                break;
            }
            case 23: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.k(), (hp.b)new hp.l() }, 14).b(sqLiteDatabase);
                break;
            }
            case 22: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l() }, 14).b(sqLiteDatabase);
                break;
            }
            case 21: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l() }, 14).b(sqLiteDatabase);
                break;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l() }, 14).b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static final Comparable B(final Comparable comparable, final tg2.e e) {
        ng2.e.f((Object)comparable, "<this>");
        ng2.e.f((Object)e, "range");
        if (!e.isEmpty()) {
            Comparable comparable2;
            if (e.a(comparable, (Comparable)((tg2.f<Comparable>)e).c()) && !e.a((Comparable)((tg2.f<Comparable>)e).c(), comparable)) {
                comparable2 = ((tg2.f<Comparable>)e).c();
            }
            else {
                comparable2 = comparable;
                if (e.a((Comparable)((tg2.f<Comparable>)e).d(), comparable)) {
                    comparable2 = comparable;
                    if (!e.a(comparable, (Comparable)((tg2.f<Comparable>)e).d())) {
                        comparable2 = ((tg2.f<Comparable>)e).d();
                    }
                }
            }
            return comparable2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(e);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void B0(final long[] array, final long[] array2, final long[] array3) {
        final long[] array4 = new long[8];
        m0(array, array2, array4);
        Q0(array4, array3);
    }
    
    public static final void B1(final OutputStream outputStream, final int n) {
        outputStream.write(n >>> 16);
        outputStream.write(n >>> 8);
        outputStream.write(n);
    }
    
    public static final Comparable C(final Integer n, final Integer n2, final Integer n3) {
        ng2.e.f((Object)n, "<this>");
        if (n2 != null && n3 != null) {
            if (n2.compareTo((Object)n3) > 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot coerce value to an empty range: maximum ");
                sb.append(n3);
                sb.append(" is less than minimum ");
                sb.append(n2);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString());
            }
            if (n.compareTo((Object)n2) < 0) {
                return n2;
            }
            if (n.compareTo((Object)n3) > 0) {
                return n3;
            }
        }
        else {
            if (n2 != null && n.compareTo((Object)n2) < 0) {
                return n2;
            }
            if (n3 != null && n.compareTo((Object)n3) > 0) {
                return n3;
            }
        }
        return n;
    }
    
    public static final Set C0(final Object... array) {
        final LinkedHashSet set = new LinkedHashSet(cg.d.p3(array.length));
        kotlin.collections.b.B2((HashSet)set, array);
        return set;
    }
    
    public static final void C1(final OutputStream outputStream, final int n) {
        outputStream.write(n >>> 24);
        outputStream.write(n >>> 16);
        outputStream.write(n >>> 8);
        outputStream.write(n);
    }
    
    public static final dh2.e D(dh2.e o, final dh2.e e) {
        ng2.e.f(o, "first");
        ng2.e.f((Object)e, "second");
        if (((dh2.e)o).isEmpty()) {
            o = e;
        }
        else if (!e.isEmpty()) {
            o = new CompositeAnnotations(new dh2.e[] { (dh2.e)o, e });
        }
        return (dh2.e)o;
    }
    
    public static void D0(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        if (n != 12) {
            if (n != 14) {
                if (n != 15) {
                    c(sqLiteDatabase, n, n2);
                }
            }
            else {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f() }, 14).b(sqLiteDatabase);
            }
        }
        else {
            new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f() }, 14).b(sqLiteDatabase);
        }
    }
    
    public static void D1(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 28: {
                sqLiteDatabase.execSQL("ALTER TABLE surveys_table ADD COLUMN isDismissible BOOLEAN DEFAULT 1");
                break;
            }
            case 27: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
            case 26: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
            case 25: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
            case 24: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
            case 23: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
            case 22: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
            case 21: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static final String E(final ch2.c c, final th2.q q) {
        ng2.e.f((Object)c, "klass");
        ng2.e.f((Object)q, "typeMappingConfiguration");
        q.a(c);
        final ch2.g b = c.b();
        ng2.e.e((Object)b, "klass.containingDeclaration");
        yh2.e e = ((ch2.g)c).getName();
        Label_0066: {
            if (e != null) {
                final yh2.e a = yh2.g.a;
                if (!e.g) {
                    break Label_0066;
                }
            }
            e = yh2.g.c;
        }
        final String d = e.d();
        ng2.e.e((Object)d, "safeIdentifier(klass.name).identifier");
        if (b instanceof v) {
            final yh2.c d2 = ((v)b).d();
            String string;
            if (d2.d()) {
                string = d;
            }
            else {
                final StringBuilder sb = new StringBuilder();
                final String b2 = d2.b();
                ng2.e.e((Object)b2, "fqName.asString()");
                sb.append(xi2.j.F0(b2, '.', '/'));
                sb.append('/');
                sb.append(d);
                string = sb.toString();
            }
            return string;
        }
        ch2.c c2;
        if (b instanceof ch2.c) {
            c2 = (ch2.c)b;
        }
        else {
            c2 = null;
        }
        if (c2 != null) {
            q.c(c2);
            return b.h(E(c2, q), '$', d);
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected container: ");
        sb2.append(b);
        sb2.append(" for ");
        sb2.append(c);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public static final Set E0(Set o) {
        final int size = ((Set)o).size();
        if (size != 0) {
            if (size == 1) {
                o = a1(((Set)o).iterator().next());
            }
        }
        else {
            o = EmptySet.INSTANCE;
        }
        return (Set)o;
    }
    
    public static ClassLoader E1() {
        synchronized (b.class) {
            if (b.f == null) {
                b.f = G1();
            }
            return b.f;
        }
    }
    
    public static final RedditAlertDialog F(final Context context, final String s, final mg2.p p3) {
        ng2.e.f((Object)context, "context");
        ng2.e.f((Object)s, "username");
        final RedditAlertDialog redditAlertDialog = new RedditAlertDialog(context, true, false, 4);
        redditAlertDialog.c.setTitle((CharSequence)context.getString(2131953605, new Object[] { s })).setMessage(2131956995).setNegativeButton(2131951738, (DialogInterface$OnClickListener)null).setPositiveButton(2131951735, (DialogInterface$OnClickListener)new m11.b(p3, 1));
        return redditAlertDialog;
    }
    
    public static final ProtoBuf$Type F0(ProtoBuf$Type protoBuf$Type, final wh2.e e) {
        ng2.e.f((Object)protoBuf$Type, "<this>");
        ng2.e.f((Object)e, "typeTable");
        if (protoBuf$Type.hasOuterType()) {
            protoBuf$Type = protoBuf$Type.getOuterType();
        }
        else if (protoBuf$Type.hasOuterTypeId()) {
            protoBuf$Type = e.a(protoBuf$Type.getOuterTypeId());
        }
        else {
            protoBuf$Type = null;
        }
        return protoBuf$Type;
    }
    
    public static String F1(final String s, final Object... array) {
        final int n = 0;
        int n2 = 0;
        int length;
        while (true) {
            length = array.length;
            if (n2 >= length) {
                break;
            }
            final Object o = array[n2];
            String s2;
            if (o == null) {
                s2 = "null";
            }
            else {
                try {
                    s2 = o.toString();
                }
                catch (final Exception ex) {
                    final String name = o.getClass().getName();
                    final String hexString = Integer.toHexString(System.identityHashCode(o));
                    final StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    final String string = sb.toString();
                    final Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    final Level warning = Level.WARNING;
                    final String value = String.valueOf(string);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Exception during lenientFormat for ".concat(value);
                    }
                    else {
                        concat = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(warning, "com.google.common.base.Strings", "lenientToString", concat, ex);
                    final String name2 = ex.getClass().getName();
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 9 + name2.length());
                    b.x(sb2, "<", string, " threw ", name2);
                    sb2.append(">");
                    s2 = sb2.toString();
                }
            }
            array[n2] = s2;
            ++n2;
        }
        final StringBuilder sb3 = new StringBuilder(length * 16 + s.length());
        int n3 = 0;
        int n4 = n;
        int length2;
        while (true) {
            length2 = array.length;
            if (n4 >= length2) {
                break;
            }
            final int index = s.indexOf("%s", n3);
            if (index == -1) {
                break;
            }
            sb3.append(s, n3, index);
            sb3.append(array[n4]);
            n3 = index + 2;
            ++n4;
        }
        sb3.append(s, n3, s.length());
        if (n4 < length2) {
            sb3.append(" [");
            final int n5 = n4 + 1;
            sb3.append(array[n4]);
            for (int i = n5; i < array.length; ++i) {
                sb3.append(", ");
                sb3.append(array[i]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
    
    public static long[] G(long[] array, final long... array2) {
        long[] array3 = array;
        if (array == null) {
            array3 = new long[0];
        }
        array = new long[array3.length + array2.length];
        System.arraycopy(array3, 0, array, 0, array3.length);
        System.arraycopy(array2, 0, array, array3.length, array2.length);
        return array;
    }
    
    public static void G0(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        if (n != 12) {
            if (n != 17) {
                if (n != 14) {
                    if (n != 15) {
                        c(sqLiteDatabase, n, n2);
                    }
                    else {
                        new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e() }, 14).b(sqLiteDatabase);
                    }
                }
                else {
                    new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e() }, 14).b(sqLiteDatabase);
                }
            }
            else {
                new hp.e().b(sqLiteDatabase);
            }
        }
        else {
            new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e() }, 14).b(sqLiteDatabase);
        }
    }
    
    public static ClassLoader G1() {
        synchronized (b.class) {
            final Thread g = b.g;
            final ClassLoader classLoader = null;
            if (g == null) {
                b.g = I1();
                if (b.g == null) {
                    return null;
                }
            }
            final Thread g2 = b.g;
            monitorenter(g2);
            try {
                try {
                    final ClassLoader contextClassLoader = b.g.getContextClassLoader();
                }
                finally {
                    monitorexit(g2);
                    while (true) {
                        while (true) {
                            monitorexit(g2);
                            return;
                            final String concat;
                            Log.w("DynamiteLoaderV2CL", concat);
                            contextClassLoader = classLoader;
                            continue;
                        }
                        final String concat = new String("Failed to get thread context classloader ");
                        continue;
                    }
                    final String s;
                    final String concat = "Failed to get thread context classloader ".concat(s);
                }
            }
            catch (final SecurityException ex) {}
        }
    }
    
    public static final void H(final int n, final int n2) {
        if (n <= n2) {
            return;
        }
        throw new IndexOutOfBoundsException(b5.k.j("toIndex (", n, ") is greater than size (", n2, ")."));
    }
    
    public static String H0(final List list) {
        if (list.isEmpty()) {
            return "/";
        }
        final StringBuilder sb = new StringBuilder();
        int n = 1;
        for (final String s : list) {
            if (n == 0) {
                sb.append("/");
            }
            n = 0;
            sb.append(s);
        }
        return sb.toString();
    }
    
    public static je.e H1(final je.e e, final i6.g g, final je.n n, final Boolean b, final Boolean b2) {
        final je.e e2 = new je.e();
        final Iterator o = e.o();
        while (o.hasNext()) {
            final int intValue = o.next();
            if (e.C(intValue)) {
                final je.o b3 = n.b(g, (List)Arrays.asList(e.m(intValue), (je.o)new je.h(Double.valueOf(intValue)), (je.o)e));
                if (b3.d().equals(b)) {
                    return e2;
                }
                if (b2 != null && !b3.d().equals(b2)) {
                    continue;
                }
                e2.z(intValue, b3);
            }
        }
        return e2;
    }
    
    public static final void I(final Context context, final String s, final String s2) {
        ng2.e.f((Object)context, "<this>");
        ng2.e.f((Object)s, "label");
        ng2.e.f((Object)s2, "text");
        final Object systemService = context.getSystemService("clipboard");
        ng2.e.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager)systemService).setPrimaryClip(ClipData.newPlainText((CharSequence)s, (CharSequence)s2));
        Toast.makeText(context, (CharSequence)context.getResources().getString(2131953679, new Object[] { s }), 0).show();
    }
    
    public static final void I0(final HashSet set, final Activity activity) {
        ng2.e.f((Object)set, "<this>");
        final Iterator iterator = set.iterator();
        ng2.e.e((Object)iterator, "iterator()");
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            ng2.e.e(next, "iterator.next()");
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
    
    public static Thread I1() {
        synchronized (b.class) {
            final ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup == null) {
                return null;
            }
            monitorenter(Void.class);
            try {
                Label_0293: {
                    try {
                        final int activeGroupCount = threadGroup.activeGroupCount();
                        final ThreadGroup[] array = new ThreadGroup[activeGroupCount];
                        threadGroup.enumerate(array);
                        final int n = 0;
                        for (final ThreadGroup threadGroup2 : array) {
                            if ("dynamiteLoader".equals(threadGroup2.getName())) {
                                ThreadGroup threadGroup3 = threadGroup2;
                                if (threadGroup2 == null) {
                                    threadGroup3 = new ThreadGroup(threadGroup, "dynamiteLoader");
                                }
                                final int activeCount = threadGroup3.activeCount();
                                final Thread[] array2 = new Thread[activeCount];
                                threadGroup3.enumerate(array2);
                                int j = n;
                                while (true) {
                                    while (j < activeCount) {
                                        Thread thread = array2[j];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            final Thread thread2 = thread;
                                            if (thread != null) {
                                                break Label_0293;
                                            }
                                            try {
                                                final zd.a a = new zd.a(threadGroup3);
                                                try {
                                                    a.setContextClassLoader(null);
                                                    a.start();
                                                    thread = a;
                                                }
                                                catch (final SecurityException ex) {
                                                    thread = a;
                                                }
                                            }
                                            catch (final SecurityException ex) {}
                                        }
                                        else {
                                            ++j;
                                        }
                                    }
                                    Thread thread = null;
                                    continue;
                                }
                            }
                        }
                        ThreadGroup threadGroup2 = null;
                    }
                    finally {
                        monitorexit(Void.class);
                        String value = null;
                    Block_20:
                        while (true) {
                            final Thread thread;
                            final Thread thread2 = thread;
                            break Label_0293;
                            final SecurityException ex;
                            value = String.valueOf(ex.getMessage());
                            iftrue(Label_0268:)(value.length() == 0);
                            break Block_20;
                            monitorexit(Void.class);
                            return thread2;
                            final String concat;
                            Label_0268: {
                                concat = new String("Failed to enumerate thread/threadgroup ");
                            }
                            Log.w("DynamiteLoaderV2CL", concat);
                            continue;
                        }
                        String concat = "Failed to enumerate thread/threadgroup ".concat(value);
                    }
                }
            }
            catch (final SecurityException ex2) {}
        }
    }
    
    public static final m0 J(final ch2.c c, final fh2.b b) {
        ng2.e.f((Object)b, "to");
        c.s().size();
        ((ch2.c)b).s().size();
        final n0$a b2 = n0.b;
        final List s = c.s();
        ng2.e.e((Object)s, "from.declaredTypeParameters");
        final ArrayList list = new ArrayList<l0>(dg2.m.u4((Iterable)s, 10));
        final Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            list.add(((j0)iterator.next()).n());
        }
        final List s2 = ((ch2.c)b).s();
        ng2.e.e((Object)s2, "to.declaredTypeParameters");
        final ArrayList list2 = new ArrayList<q0>(dg2.m.u4((Iterable)s2, 10));
        final Iterator iterator2 = s2.iterator();
        while (iterator2.hasNext()) {
            final x r = ((ch2.e)iterator2.next()).r();
            ng2.e.e((Object)r, "it.defaultType");
            list2.add(TypeUtilsKt.a((oi2.t)r));
        }
        return new m0(false, kotlin.collections.c.E4((List)CollectionsKt___CollectionsKt.O5((Iterable)list, (Iterable)list2)));
    }
    
    public static void J0(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 18: {
                new hp.f().b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static je.o J1(final je.e e, final i6.g g, final ArrayList list, final boolean b) {
        f4.i("reduce", 1, (List)list);
        f4.j("reduce", 2, list);
        final je.o c = g.c((je.o)list.get(0));
        if (c instanceof je.i) {
            je.o c2;
            if (list.size() == 2) {
                c2 = g.c((je.o)list.get(1));
                if (c2 instanceof je.g) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            }
            else {
                if (e.k() == 0) {
                    throw new IllegalStateException("Empty array with no initial value error");
                }
                c2 = null;
            }
            final je.i i = (je.i)c;
            int k = e.k();
            int n;
            if (b) {
                n = 0;
            }
            else {
                n = k - 1;
            }
            int n2 = -1;
            if (b) {
                --k;
            }
            else {
                k = 0;
            }
            if (b) {
                n2 = 1;
            }
            int n3 = k;
            int n4 = n;
            int n5 = n2;
            je.o o = c2;
            while (true) {
                je.o o2 = null;
                Label_0290: {
                    if (c2 == null) {
                        o2 = e.m(n);
                        break Label_0290;
                    }
                    if ((n3 - n4) * n5 < 0) {
                        return o;
                    }
                    k = n3;
                    n = n4;
                    n2 = n5;
                    o2 = o;
                    if (e.C(n4)) {
                        o2 = i.b(g, (List)Arrays.asList(o, e.m(n4), (je.o)new je.h(Double.valueOf(n4)), (je.o)e));
                        if (o2 instanceof je.g) {
                            throw new IllegalStateException("Reduce operation failed");
                        }
                        k = n3;
                        n = n4;
                        n2 = n5;
                    }
                }
                n4 = n + n2;
                n3 = k;
                n5 = n2;
                o = o2;
                continue;
            }
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
    
    public static void K(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 29: {
                new hp.q().b(sqLiteDatabase);
                break;
            }
            case 28: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 27: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 26: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 25: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 24: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 23: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 22: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 21: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static void K0(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 19: {
                new hp.g().b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static final int L0(final Random$Default random$Default, final tg2.i i) {
        ng2.e.f((Object)i, "<this>");
        ng2.e.f((Object)random$Default, "random");
        try {
            return xd.a.x0(random$Default, i);
        }
        catch (final IllegalArgumentException ex) {
            throw new NoSuchElementException(ex.getMessage());
        }
    }
    
    public static void M(final StringBuilder sb, final Object o, final HashMap hashMap) {
        if (o == null) {
            sb.append("null");
            return;
        }
        if (!o.getClass().isArray()) {
            try {
                sb.append(o.toString());
            }
            finally {
                final StringBuilder t = a.t("SLF4J: Failed toString() invocation on an object of type [");
                t.append(o.getClass().getName());
                t.append("]");
                final Throwable t2;
                px1.a.B0(t.toString(), t2);
                sb.append("[FAILED toString()]");
            }
        }
        else {
            final boolean b = o instanceof boolean[];
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            final int n4 = 0;
            final int n5 = 0;
            int i = 0;
            final int n6 = 0;
            final int n7 = 0;
            final int n8 = 0;
            if (b) {
                final boolean[] array = (boolean[])o;
                sb.append('[');
                for (int length = array.length, j = n8; j < length; ++j) {
                    sb.append(array[j]);
                    if (j != length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(']');
            }
            else if (o instanceof byte[]) {
                final byte[] array2 = (byte[])o;
                sb.append('[');
                for (int length2 = array2.length, k = n; k < length2; ++k) {
                    sb.append(array2[k]);
                    if (k != length2 - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(']');
            }
            else if (o instanceof char[]) {
                final char[] array3 = (char[])o;
                sb.append('[');
                for (int length3 = array3.length, l = n2; l < length3; ++l) {
                    sb.append(array3[l]);
                    if (l != length3 - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(']');
            }
            else if (o instanceof short[]) {
                final short[] array4 = (short[])o;
                sb.append('[');
                for (int length4 = array4.length, n9 = n3; n9 < length4; ++n9) {
                    sb.append(array4[n9]);
                    if (n9 != length4 - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(']');
            }
            else if (o instanceof int[]) {
                final int[] array5 = (int[])o;
                sb.append('[');
                for (int length5 = array5.length, n10 = n4; n10 < length5; ++n10) {
                    sb.append(array5[n10]);
                    if (n10 != length5 - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(']');
            }
            else if (o instanceof long[]) {
                final long[] array6 = (long[])o;
                sb.append('[');
                for (int length6 = array6.length, n11 = n5; n11 < length6; ++n11) {
                    sb.append(array6[n11]);
                    if (n11 != length6 - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(']');
            }
            else if (o instanceof float[]) {
                final float[] array7 = (float[])o;
                sb.append('[');
                for (int length7 = array7.length; i < length7; ++i) {
                    sb.append(array7[i]);
                    if (i != length7 - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(']');
            }
            else if (o instanceof double[]) {
                final double[] array8 = (double[])o;
                sb.append('[');
                for (int length8 = array8.length, n12 = n6; n12 < length8; ++n12) {
                    sb.append(array8[n12]);
                    if (n12 != length8 - 1) {
                        sb.append(", ");
                    }
                }
                sb.append(']');
            }
            else {
                final Object[] array9 = (Object[])o;
                sb.append('[');
                if (!hashMap.containsKey(array9)) {
                    hashMap.put(array9, null);
                    for (int length9 = array9.length, n13 = n7; n13 < length9; ++n13) {
                        M(sb, array9[n13], hashMap);
                        if (n13 != length9 - 1) {
                            sb.append(", ");
                        }
                    }
                    hashMap.remove(array9);
                }
                else {
                    sb.append("...");
                }
                sb.append(']');
            }
        }
    }
    
    public static final int M0(final BufferedInputStream bufferedInputStream) {
        return (bufferedInputStream.read() & 0xFF) | ((bufferedInputStream.read() & 0xFF) << 16 | (bufferedInputStream.read() & 0xFF) << 8);
    }
    
    public static void N(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 30: {
                new hp.r().b(sqLiteDatabase);
                break;
            }
            case 29: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 28: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 27: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 26: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 25: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 24: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 23: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 22: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 21: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static final int N0(final InputStream inputStream) {
        return (inputStream.read() & 0xFF) | ((inputStream.read() & 0xFF) << 24 | (inputStream.read() & 0xFF) << 16 | (inputStream.read() & 0xFF) << 8);
    }
    
    public static final void O0(final InputStream inputStream, final byte[] array) {
        int read;
        for (int i = 0; i < array.length; i += read) {
            read = inputStream.read(array, i, array.length - i);
            if (read != -1) {}
        }
    }
    
    public static final ProtoBuf$Type P0(final ProtoBuf$Function protoBuf$Function, final wh2.e e) {
        ng2.e.f((Object)protoBuf$Function, "<this>");
        ng2.e.f((Object)e, "typeTable");
        ProtoBuf$Type protoBuf$Type;
        if (protoBuf$Function.hasReceiverType()) {
            protoBuf$Type = protoBuf$Function.getReceiverType();
        }
        else if (protoBuf$Function.hasReceiverTypeId()) {
            protoBuf$Type = e.a(protoBuf$Function.getReceiverTypeId());
        }
        else {
            protoBuf$Type = null;
        }
        return protoBuf$Type;
    }
    
    public static final Map Q(final dg2.s s) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Iterator b = s.b();
        while (b.hasNext()) {
            final Object a = s.a(b.next());
            Object value = linkedHashMap.get(a);
            if (value == null && !linkedHashMap.containsKey(a)) {
                value = new Ref$IntRef();
            }
            final Ref$IntRef ref$IntRef = (Ref$IntRef)value;
            ++ref$IntRef.element;
            linkedHashMap.put(a, ref$IntRef);
        }
        for (final Map.Entry<K, Ref$IntRef> entry : linkedHashMap.entrySet()) {
            ng2.e.d((Object)entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4>");
            if (entry instanceof og2.a && !(entry instanceof d$a)) {
                ng2.k.g((Object)entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue((Ref$IntRef)entry.getValue().element);
        }
        return ng2.k.c((Object)linkedHashMap);
    }
    
    public static void Q0(final long[] array, final long[] array2) {
        final long n = array[0];
        final long n2 = array[1];
        final long n3 = array[2];
        final long n4 = array[3];
        final long n5 = array[4];
        final long n6 = array[5];
        final long n7 = array[6];
        final long n8 = n5 ^ n7 >>> 50;
        final long n9 = n4 ^ (n7 >>> 1 ^ n7 << 14) ^ n6 >>> 50;
        final long n10 = n9 >>> 1;
        array2[0] = (n ^ n8 << 63 ^ n10 ^ n10 << 15);
        array2[1] = (n10 >>> 49 ^ (n2 ^ n6 << 63 ^ (n8 >>> 1 ^ n8 << 14)));
        array2[2] = (n3 ^ n7 << 63 ^ (n6 >>> 1 ^ n6 << 14) ^ n8 >>> 50);
        array2[3] = (0x1L & n9);
    }
    
    public static void R(final Canvas p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "canvas"
        //     4: invokestatic    ng2/e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    10: istore_2       
        //    11: iload_2        
        //    12: bipush          29
        //    14: if_icmplt       28
        //    17: getstatic       o1/q.a:Lo1/q;
        //    20: aload_0        
        //    21: iload_1        
        //    22: invokevirtual   o1/q.a:(Landroid/graphics/Canvas;Z)V
        //    25: goto            245
        //    28: getstatic       zd/b.I:Z
        //    31: ifne            201
        //    34: iload_2        
        //    35: bipush          28
        //    37: if_icmpne       133
        //    40: ldc_w           Ljava/lang/Class;.class
        //    43: ldc_w           "getDeclaredMethod"
        //    46: iconst_2       
        //    47: anewarray       Ljava/lang/Class;
        //    50: dup            
        //    51: iconst_0       
        //    52: ldc_w           Ljava/lang/String;.class
        //    55: aastore        
        //    56: dup            
        //    57: iconst_1       
        //    58: iconst_0       
        //    59: anewarray       Ljava/lang/Class;
        //    62: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    65: aastore        
        //    66: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    69: astore_3       
        //    70: aload_3        
        //    71: ldc_w           Landroid/graphics/Canvas;.class
        //    74: iconst_2       
        //    75: anewarray       Ljava/lang/Object;
        //    78: dup            
        //    79: iconst_0       
        //    80: ldc_w           "insertReorderBarrier"
        //    83: aastore        
        //    84: dup            
        //    85: iconst_1       
        //    86: iconst_0       
        //    87: anewarray       Ljava/lang/Class;
        //    90: aastore        
        //    91: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    94: checkcast       Ljava/lang/reflect/Method;
        //    97: putstatic       zd/b.G:Ljava/lang/reflect/Method;
        //   100: aload_3        
        //   101: ldc_w           Landroid/graphics/Canvas;.class
        //   104: iconst_2       
        //   105: anewarray       Ljava/lang/Object;
        //   108: dup            
        //   109: iconst_0       
        //   110: ldc_w           "insertInorderBarrier"
        //   113: aastore        
        //   114: dup            
        //   115: iconst_1       
        //   116: iconst_0       
        //   117: anewarray       Ljava/lang/Class;
        //   120: aastore        
        //   121: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   124: checkcast       Ljava/lang/reflect/Method;
        //   127: putstatic       zd/b.H:Ljava/lang/reflect/Method;
        //   130: goto            165
        //   133: ldc_w           Landroid/graphics/Canvas;.class
        //   136: ldc_w           "insertReorderBarrier"
        //   139: iconst_0       
        //   140: anewarray       Ljava/lang/Class;
        //   143: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   146: putstatic       zd/b.G:Ljava/lang/reflect/Method;
        //   149: ldc_w           Landroid/graphics/Canvas;.class
        //   152: ldc_w           "insertInorderBarrier"
        //   155: iconst_0       
        //   156: anewarray       Ljava/lang/Class;
        //   159: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   162: putstatic       zd/b.H:Ljava/lang/reflect/Method;
        //   165: getstatic       zd/b.G:Ljava/lang/reflect/Method;
        //   168: astore_3       
        //   169: aload_3        
        //   170: ifnonnull       176
        //   173: goto            181
        //   176: aload_3        
        //   177: iconst_1       
        //   178: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   181: getstatic       zd/b.H:Ljava/lang/reflect/Method;
        //   184: astore_3       
        //   185: aload_3        
        //   186: ifnonnull       192
        //   189: goto            197
        //   192: aload_3        
        //   193: iconst_1       
        //   194: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   197: iconst_1       
        //   198: putstatic       zd/b.I:Z
        //   201: iload_1        
        //   202: ifeq            223
        //   205: getstatic       zd/b.G:Ljava/lang/reflect/Method;
        //   208: astore_3       
        //   209: aload_3        
        //   210: ifnull          223
        //   213: aload_3        
        //   214: aload_0        
        //   215: iconst_0       
        //   216: anewarray       Ljava/lang/Object;
        //   219: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   222: pop            
        //   223: iload_1        
        //   224: ifne            245
        //   227: getstatic       zd/b.H:Ljava/lang/reflect/Method;
        //   230: astore_3       
        //   231: aload_3        
        //   232: ifnull          245
        //   235: aload_3        
        //   236: aload_0        
        //   237: iconst_0       
        //   238: anewarray       Ljava/lang/Object;
        //   241: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   244: pop            
        //   245: return         
        //   246: astore_3       
        //   247: goto            197
        //   250: astore_0       
        //   251: goto            245
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  40     130    246    250    Ljava/lang/IllegalAccessException;
        //  40     130    246    250    Ljava/lang/reflect/InvocationTargetException;
        //  40     130    246    250    Ljava/lang/NoSuchMethodException;
        //  133    165    246    250    Ljava/lang/IllegalAccessException;
        //  133    165    246    250    Ljava/lang/reflect/InvocationTargetException;
        //  133    165    246    250    Ljava/lang/NoSuchMethodException;
        //  165    169    246    250    Ljava/lang/IllegalAccessException;
        //  165    169    246    250    Ljava/lang/reflect/InvocationTargetException;
        //  165    169    246    250    Ljava/lang/NoSuchMethodException;
        //  176    181    246    250    Ljava/lang/IllegalAccessException;
        //  176    181    246    250    Ljava/lang/reflect/InvocationTargetException;
        //  176    181    246    250    Ljava/lang/NoSuchMethodException;
        //  181    185    246    250    Ljava/lang/IllegalAccessException;
        //  181    185    246    250    Ljava/lang/reflect/InvocationTargetException;
        //  181    185    246    250    Ljava/lang/NoSuchMethodException;
        //  192    197    246    250    Ljava/lang/IllegalAccessException;
        //  192    197    246    250    Ljava/lang/reflect/InvocationTargetException;
        //  192    197    246    250    Ljava/lang/NoSuchMethodException;
        //  205    209    250    254    Ljava/lang/IllegalAccessException;
        //  205    209    250    254    Ljava/lang/reflect/InvocationTargetException;
        //  213    223    250    254    Ljava/lang/IllegalAccessException;
        //  213    223    250    254    Ljava/lang/reflect/InvocationTargetException;
        //  227    231    250    254    Ljava/lang/IllegalAccessException;
        //  227    231    250    254    Ljava/lang/reflect/InvocationTargetException;
        //  235    245    250    254    Ljava/lang/IllegalAccessException;
        //  235    245    250    254    Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0223:
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
    
    public static final y0.b R0(float n, final z0.d d, final int n2, final int n3) {
        d.A(-1303348746);
        final boolean b = (n3 & 0x1) != 0x0;
        if ((n3 & 0x2) != 0x0) {
            n = Float.NaN;
        }
        final q a = ComposerKt.a;
        final y0.b a2 = y0.i.a(b, n, 0L, d, (n2 & 0xE) | (n2 & 0x70), 4);
        d.H();
        return a2;
    }
    
    public static boolean S(final CharSequence charSequence, final String s) {
        final int length = charSequence.length();
        if (charSequence == s) {
            return true;
        }
        if (length != s.length()) {
            return false;
        }
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            final char char2 = s.charAt(i);
            if (char1 != char2) {
                final char c = (char)((char1 | ' ') - 97);
                if (c >= '\u001a' || c != (char)((char2 | ' ') - 97)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static final da.f S0(final da.k.b b, boolean b2, boolean b3, boolean b4, boolean b5, final z0.d d, final int n) {
        ng2.e.f((Object)b, "insets");
        d.A(-1165102418);
        if ((n & 0x2) != 0x0) {
            b2 = true;
        }
        if ((n & 0x4) != 0x0) {
            b3 = true;
        }
        if ((n & 0x8) != 0x0) {
            b4 = true;
        }
        if ((n & 0x10) != 0x0) {
            b5 = true;
        }
        float n2 = 0.0f;
        float n3;
        if ((n & 0x20) != 0x0) {
            n3 = 0;
        }
        else {
            n3 = 0.0f;
        }
        float n4;
        if ((n & 0x40) != 0x0) {
            n4 = 0;
        }
        else {
            n4 = 0.0f;
        }
        float n5;
        if ((n & 0x80) != 0x0) {
            n5 = 0;
        }
        else {
            n5 = 0.0f;
        }
        if ((n & 0x100) != 0x0) {
            n2 = 0;
        }
        final u2.b b6 = (u2.b)d.u((z0.m0)CompositionLocalsKt.e);
        d.A(511388516);
        final boolean m = d.m((Object)b6);
        final boolean i = d.m((Object)b);
        final Object b7 = d.B();
        da.f f;
        if ((m | i) || (f = (da.f)b7) == z0.d$a.a) {
            f = new da.f(b, b6);
            d.w((Object)f);
        }
        d.H();
        final da.f f2 = f;
        ((SnapshotMutableStateImpl)f2.c).setValue((Object)b2);
        ((SnapshotMutableStateImpl)f2.d).setValue((Object)b3);
        ((SnapshotMutableStateImpl)f2.e).setValue((Object)b4);
        ((SnapshotMutableStateImpl)f2.f).setValue((Object)b5);
        ((SnapshotMutableStateImpl)f2.g).setValue((Object)new u2.d(n3));
        ((SnapshotMutableStateImpl)f2.h).setValue((Object)new u2.d(n4));
        ((SnapshotMutableStateImpl)f2.i).setValue((Object)new u2.d(n5));
        ((SnapshotMutableStateImpl)f2.j).setValue((Object)new u2.d(n2));
        d.H();
        return f2;
    }
    
    public static void T(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 31: {
                new hp.s().b(sqLiteDatabase);
                break;
            }
            case 30: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 29: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 28: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 27: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 26: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 25: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 24: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 23: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 22: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 21: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static void T0(final Class clazz) {
        final String name = clazz.getName();
        RxJavaPlugins.onError((Throwable)new ProtocolViolationException(a.o("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }
    
    public static boolean U(final View view) {
        return view.getClass().getName().contains("instabug");
    }
    
    public static uc.f U0(uc.f f, final String[] array, final Map map) {
        int i = 0;
        final int n = 0;
        if (f == null) {
            if (array == null) {
                return null;
            }
            if (array.length == 1) {
                return map.get(array[0]);
            }
            if (array.length > 1) {
                f = new uc.f();
                for (int length = array.length, j = n; j < length; ++j) {
                    f.a((uc.f)map.get(array[j]));
                }
                return f;
            }
        }
        else {
            if (array != null && array.length == 1) {
                f.a((uc.f)map.get(array[0]));
                return f;
            }
            if (array != null && array.length > 1) {
                while (i < array.length) {
                    f.a((uc.f)map.get(array[i]));
                    ++i;
                }
            }
        }
        return f;
    }
    
    public static void V(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 32: {
                new hp.t().b(sqLiteDatabase);
                break;
            }
            case 31: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 30: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 29: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 28: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 27: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 26: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 25: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 24: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 23: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 22: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 21: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static final String V0(final vn2.a a, String s) {
        ng2.e.f((Object)a, "<this>");
        final String b = a.j().b(s);
        if (b != null) {
            s = b;
        }
        return s;
    }
    
    public static final r82.a W(final q82.c c) {
        final boolean b = c instanceof q82.c$a;
        r82.a a = null;
        q82.c$a c$a;
        if (b) {
            c$a = (q82.c$a)c;
        }
        else {
            c$a = null;
        }
        if (c$a != null) {
            a = c$a.a;
        }
        return a;
    }
    
    public static final ProtoBuf$Type W0(final ProtoBuf$Function protoBuf$Function, final wh2.e e) {
        ng2.e.f((Object)protoBuf$Function, "<this>");
        ng2.e.f((Object)e, "typeTable");
        ProtoBuf$Type protoBuf$Type;
        if (protoBuf$Function.hasReturnType()) {
            protoBuf$Type = protoBuf$Function.getReturnType();
            ng2.e.e((Object)protoBuf$Type, "returnType");
        }
        else {
            if (!protoBuf$Function.hasReturnTypeId()) {
                throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
            }
            protoBuf$Type = e.a(protoBuf$Function.getReturnTypeId());
        }
        return protoBuf$Type;
    }
    
    public static final int X(final xg2.b b) {
        ng2.e.f((Object)b, "<this>");
        return b.a().size();
    }
    
    public static final ProtoBuf$Type X0(final ProtoBuf$Property protoBuf$Property, final wh2.e e) {
        ng2.e.f((Object)protoBuf$Property, "<this>");
        ng2.e.f((Object)e, "typeTable");
        ProtoBuf$Type protoBuf$Type;
        if (protoBuf$Property.hasReturnType()) {
            protoBuf$Type = protoBuf$Property.getReturnType();
            ng2.e.e((Object)protoBuf$Type, "returnType");
        }
        else {
            if (!protoBuf$Property.hasReturnTypeId()) {
                throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
            }
            protoBuf$Type = e.a(protoBuf$Property.getReturnTypeId());
        }
        return protoBuf$Type;
    }
    
    public static String Y(final String s) {
        ng2.e.f((Object)s, "url");
        String l = s;
        if (!xi2.j.I0(s, "http://", false)) {
            l = s;
            if (!xi2.j.I0(s, "https://", false)) {
                l = b.l("http://", s);
            }
        }
        return l;
    }
    
    public static void Y0(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 20: {
                new hp.h().b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static final c91.b Z(final Link link) {
        final SubredditDetail subredditDetail = link.getSubredditDetail();
        Object b;
        if (subredditDetail != null) {
            b = b$a.b(subredditDetail);
        }
        else {
            b = new h$a((Integer)null);
        }
        return (c91.b)b;
    }
    
    public static final void Z0(final ImageView imageView, final String s, final Boolean b) {
        ng2.e.f((Object)imageView, "<this>");
        imageView.setImageDrawable((Drawable)null);
        if (ng2.e.a((Object)b, (Object)Boolean.TRUE)) {
            ((com.bumptech.glide.i)ah0.b.M1(((View)imageView).getContext())).clear((View)imageView);
            final Context context = ((View)imageView).getContext();
            ng2.e.e((Object)context, "context");
            imageView.setImageDrawable((Drawable)new NsfwDrawable(context, NsfwDrawable$Shape.CIRCLE));
        }
        else if (s != null) {
            final Context context2 = ((View)imageView).getContext();
            ng2.e.e((Object)context2, "context");
            ((com.bumptech.glide.h<Object>)ah0.b.M1(context2).r(s).b((h9.a)h9.f.circleCropTransform())).into(imageView);
        }
        else {
            pu2.a.a.a("icon url is null", new Object[0]);
            ((com.bumptech.glide.i)ah0.b.M1(((View)imageView).getContext())).clear((View)imageView);
            final Context context3 = ((View)imageView).getContext();
            ng2.e.e((Object)context3, "context");
            imageView.setImageDrawable(cg.d.J2(2130969565, context3));
        }
    }
    
    public static float[] a0(final RectF rectF) {
        final float left = rectF.left;
        final float top = rectF.top;
        final float right = rectF.right;
        final float bottom = rectF.bottom;
        return new float[] { left, top, right, top, right, bottom, left, bottom };
    }
    
    public static final Set a1(final Object o) {
        final Set<Object> singleton = Collections.singleton(o);
        ng2.e.e((Object)singleton, "singleton(element)");
        return singleton;
    }
    
    public static JSONObject b(String message, final Throwable t) {
        final JSONObject jsonObject = new JSONObject();
        if (t == null) {
            return jsonObject;
        }
        try {
            String s = t.getClass().getName();
            if (message != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append("-");
                sb.append(message);
                s = sb.toString();
            }
            jsonObject.put("name", (Object)s);
            final StackTraceElement stackTraceElement = null;
            final StackTraceElement[] stackTrace = t.getStackTrace();
            int i = 0;
            StackTraceElement stackTraceElement2 = stackTraceElement;
            if (stackTrace != null) {
                stackTraceElement2 = stackTraceElement;
                if (t.getStackTrace().length > 0) {
                    stackTraceElement2 = t.getStackTrace()[0];
                }
            }
            if (stackTraceElement2 != null && stackTraceElement2.getFileName() != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(stackTraceElement2.getFileName());
                sb2.append(":");
                sb2.append(stackTraceElement2.getLineNumber());
                jsonObject.put("location", (Object)sb2.toString());
            }
            else {
                InstabugSDKLogger.w("IBG-CR", "Incomplete crash stacktrace, if you're using Proguard, add the following line to your configuration file to have file name and line number in your crash report:");
                InstabugSDKLogger.w("IBG-CR", "-keepattributes SourceFile,LineNumberTable");
            }
            jsonObject.put("exception", (Object)t.toString());
            if (t.getMessage() != null) {
                jsonObject.put("message", (Object)t.getMessage());
            }
            final StringBuilder sb3 = new StringBuilder(t.toString());
            sb3.append("\n");
            for (StackTraceElement[] stackTrace2 = t.getStackTrace(); i < stackTrace2.length; ++i) {
                final StackTraceElement stackTraceElement3 = stackTrace2[i];
                sb3.append("\t at ");
                sb3.append(stackTraceElement3.toString());
                sb3.append("\n");
            }
            jsonObject.put("stackTrace", (Object)sb3.toString());
            if (t.getCause() != null) {
                jsonObject.put("cause", (Object)b(message, t.getCause()));
            }
        }
        catch (final JSONException ex) {
            if (((Throwable)ex).getMessage() != null) {
                message = ((Throwable)ex).getMessage();
            }
            else {
                message = "Json exception while creating formatted exception";
            }
            InstabugSDKLogger.e("IBG-CR", message, (Throwable)ex);
        }
        return jsonObject;
    }
    
    public static final Error b0(final Exception throwable) {
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        final boolean b = throwable instanceof SocketTimeoutException;
        String s = message;
        if (b) {
            final boolean b2 = message.length() == 0;
            s = message;
            if (b2) {
                s = "timeout";
            }
        }
        Error error;
        if (s.length() == 0) {
            error = Error.UNKNOWN;
        }
        else if (!xi2.j.z0(s, "request_with_file_path_already_exist", true) && !kotlin.text.b.J0((CharSequence)s, (CharSequence)"UNIQUE constraint failed: requests._file (code 2067)", true)) {
            if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"UNIQUE constraint failed: requests._id", false)) {
                error = Error.REQUEST_WITH_ID_ALREADY_EXIST;
            }
            else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"empty_response_body", true)) {
                error = Error.EMPTY_RESPONSE_FROM_SERVER;
            }
            else if (!xi2.j.z0(s, "FNC", true) && !xi2.j.z0(s, "open failed: ENOENT (No such file or directory)", true)) {
                if (!kotlin.text.b.J0((CharSequence)s, (CharSequence)"recvfrom failed: ETIMEDOUT (Connection timed out)", true) && !kotlin.text.b.J0((CharSequence)s, (CharSequence)"timeout", true) && !kotlin.text.b.J0((CharSequence)s, (CharSequence)"Software caused connection abort", true) && !kotlin.text.b.J0((CharSequence)s, (CharSequence)"Read timed out at", true)) {
                    if (!xi2.j.z0(s, "java.io.IOException: 404", true) && !kotlin.text.b.J0((CharSequence)s, (CharSequence)"No address associated with hostname", false)) {
                        if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"Unable to resolve host", false)) {
                            error = Error.UNKNOWN_HOST;
                        }
                        else if (xi2.j.z0(s, "open failed: EACCES (Permission denied)", true)) {
                            error = Error.WRITE_PERMISSION_DENIED;
                        }
                        else if (!xi2.j.z0(s, "write failed: ENOSPC (No space left on device)", true) && !xi2.j.z0(s, "database or disk is full (code 13)", true)) {
                            if (xi2.j.z0(s, "UNIQUE constraint failed: requests._id (code 1555)", true)) {
                                error = Error.REQUEST_ALREADY_EXIST;
                            }
                            else if (xi2.j.z0(s, "fetch download not found", true)) {
                                error = Error.DOWNLOAD_NOT_FOUND;
                            }
                            else if (xi2.j.z0(s, "Fetch data base error", true)) {
                                error = Error.FETCH_DATABASE_ERROR;
                            }
                            else if (!kotlin.text.b.J0((CharSequence)s, (CharSequence)"request_not_successful", true) && !kotlin.text.b.J0((CharSequence)s, (CharSequence)"Failed to connect", true)) {
                                if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"invalid content hash", true)) {
                                    error = Error.INVALID_CONTENT_HASH;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"download_incomplete", true)) {
                                    error = Error.UNKNOWN_IO_ERROR;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"failed_to_update_request", true)) {
                                    error = Error.FAILED_TO_UPDATE_REQUEST;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"failed_to_add_completed_download", true)) {
                                    error = Error.FAILED_TO_ADD_COMPLETED_DOWNLOAD;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"fetch_file_server_invalid_response_type", true)) {
                                    error = Error.FETCH_FILE_SERVER_INVALID_RESPONSE;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"request_does_not_exist", true)) {
                                    error = Error.REQUEST_DOES_NOT_EXIST;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"no_network_connection", true)) {
                                    error = Error.NO_NETWORK_CONNECTION;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"file_not_found", true)) {
                                    error = Error.FILE_NOT_FOUND;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"fetch_file_server_url_invalid", true)) {
                                    error = Error.FETCH_FILE_SERVER_URL_INVALID;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"request_list_not_distinct", true)) {
                                    error = Error.ENQUEUED_REQUESTS_ARE_NOT_DISTINCT;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"enqueue_not_successful", true)) {
                                    error = Error.ENQUEUE_NOT_SUCCESSFUL;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"cannot rename file associated with incomplete download", true)) {
                                    error = Error.FAILED_TO_RENAME_INCOMPLETE_DOWNLOAD_FILE;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"file_cannot_be_renamed", true)) {
                                    error = Error.FAILED_TO_RENAME_FILE;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"file_allocation_error", true)) {
                                    error = Error.FILE_ALLOCATION_FAILED;
                                }
                                else if (kotlin.text.b.J0((CharSequence)s, (CharSequence)"Cleartext HTTP traffic to", true)) {
                                    error = Error.HTTP_CONNECTION_NOT_ALLOWED;
                                }
                                else {
                                    error = Error.UNKNOWN;
                                }
                            }
                            else {
                                error = Error.REQUEST_NOT_SUCCESSFUL;
                            }
                        }
                        else {
                            error = Error.NO_STORAGE_SPACE;
                        }
                    }
                    else {
                        error = Error.HTTP_NOT_FOUND;
                    }
                }
                else {
                    error = Error.CONNECTION_TIMED_OUT;
                }
            }
            else {
                error = Error.FILE_NOT_CREATED;
            }
        }
        else {
            error = Error.REQUEST_WITH_FILE_PATH_ALREADY_EXIST;
        }
        final Error unknown = Error.UNKNOWN;
        Error error2;
        if (error == unknown && b) {
            error2 = Error.CONNECTION_TIMED_OUT;
        }
        else if ((error2 = error) == unknown) {
            error2 = error;
            if (throwable instanceof IOException) {
                error2 = Error.UNKNOWN_IO_ERROR;
            }
        }
        error2.setThrowable(throwable);
        return error2;
    }
    
    public static final Set b1(final Object... array) {
        Object o;
        if (array.length > 0) {
            o = kotlin.collections.b.H2(array);
        }
        else {
            o = EmptySet.INSTANCE;
        }
        return (Set)o;
    }
    
    public static void c(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        InstabugSDKLogger.e("IBG-Core", b5.k.j("Did not migrate from v", n, " to v", n2, ". Falling back to destructive migration"));
        new hp.a().b(sqLiteDatabase);
    }
    
    public static final ug2.d c0(final ug2.e e) {
        ug2.d d;
        if (e instanceof ug2.d) {
            d = (ug2.d)e;
        }
        else {
            if (e instanceof ug2.o) {
                final List upperBounds = ((ug2.o)e).getUpperBounds();
                final Iterator iterator = upperBounds.iterator();
                while (true) {
                    ch2.c c;
                    Object next;
                    do {
                        final boolean hasNext = iterator.hasNext();
                        final ug2.n n = null;
                        final ch2.c c2 = null;
                        if (hasNext) {
                            next = iterator.next();
                            final ug2.n n2 = (ug2.n)next;
                            ng2.e.d((Object)n2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                            final ch2.e f = ((KTypeImpl)n2).f.I0().f();
                            c = c2;
                            if (!(f instanceof ch2.c)) {
                                continue;
                            }
                            c = (ch2.c)f;
                        }
                        else {
                            ug2.n n3;
                            if ((n3 = n) == null) {
                                n3 = (ug2.n)CollectionsKt___CollectionsKt.U4(upperBounds);
                            }
                            if (n3 != null) {
                                d = d0(n3);
                                return d;
                            }
                            d = ng2.h.a((Class)Object.class);
                            return d;
                        }
                    } while (c == null || c.getKind() == ClassKind.INTERFACE || c.getKind() == ClassKind.ANNOTATION_CLASS);
                    final ug2.n n = (ug2.n)next;
                    continue;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot calculate JVM erasure for type: ");
            sb.append(e);
            throw new KotlinReflectionInternalError(sb.toString());
        }
        return d;
    }
    
    public static void c1(final AtomicReference atomicReference, final df2.a a, final Class clazz) {
        if (a != null) {
            boolean b;
            do {
                final boolean compareAndSet = atomicReference.compareAndSet(null, a);
                b = false;
                if (compareAndSet) {
                    b = true;
                    break;
                }
            } while (atomicReference.get() == null);
            if (!b) {
                a.dispose();
                if (atomicReference.get() != DisposableHelper.DISPOSED) {
                    T0(clazz);
                }
            }
            return;
        }
        throw new NullPointerException("next is null");
    }
    
    public static String d(final String s) {
        final DecimalFormat decimalFormat = (DecimalFormat)NumberFormat.getInstance(Locale.getDefault());
        final DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(',');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format(Integer.parseInt(s));
    }
    
    public static final ug2.d d0(final ug2.n n) {
        ng2.e.f((Object)n, "<this>");
        final ug2.e j = n.j();
        if (j != null) {
            final ug2.d c0 = c0(j);
            if (c0 != null) {
                return c0;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot calculate JVM erasure for type: ");
        sb.append(n);
        throw new KotlinReflectionInternalError(sb.toString());
    }
    
    public static final String d1(final ch2.c c, final String s) {
        ng2.e.f((Object)c, "classDescriptor");
        ng2.e.f((Object)s, "jvmDescriptor");
        final String a = c.a;
        final yh2.d i = DescriptorUtilsKt.g((ch2.g)c).i();
        ng2.e.e((Object)i, "fqNameSafe.toUnsafe()");
        final yh2.b g = c.g(i);
        String s2;
        if (g != null) {
            s2 = fi2.b.b(g).e();
            ng2.e.e((Object)s2, "byClassId(it).internalName");
        }
        else {
            s2 = E(c, (th2.q)p2.b.g);
        }
        return kotlin.reflect.jvm.internal.impl.load.kotlin.b.j(s2, s);
    }
    
    public static String e0(final int n, final int[] array, final String[] array2, final int[] array3) {
        final StringBuilder o = d.o('$');
        for (int i = 0; i < n; ++i) {
            final int n2 = array[i];
            if (n2 != 1 && n2 != 2) {
                if (n2 == 3 || n2 == 4 || n2 == 5) {
                    o.append('.');
                    final String s = array2[i];
                    if (s != null) {
                        o.append(s);
                    }
                }
            }
            else {
                o.append('[');
                o.append(array3[i]);
                o.append(']');
            }
        }
        return o.toString();
    }
    
    public static void e1(int n, final long[] array, final long[] array2) {
        final long[] array3 = new long[8];
        o0(array, array3);
        while (true) {
            Q0(array3, array2);
            if (--n <= 0) {
                break;
            }
            o0(array2, array3);
        }
    }
    
    public static final int f(final long n) {
        int n2;
        final boolean b = (n2 = ((Math.abs(n1.c.e(n)) >= 0.5f) ? 1 : 0)) != 0;
        if (Math.abs(n1.c.f(n)) >= 0.5f) {
            n2 = ((b ? 1 : 0) | 0x2);
        }
        return n2;
    }
    
    public static final Object f0(final ni2.e e, final ug2.k k) {
        ng2.e.f((Object)e, "<this>");
        ng2.e.f((Object)k, "p");
        return ((mg2.a)e).invoke();
    }
    
    public static final tg2.g f1(final tg2.i i, int n) {
        ng2.e.f((Object)i, "<this>");
        final boolean b = n > 0;
        final Integer value = n;
        ng2.e.f((Object)value, "step");
        if (b) {
            final int f = ((tg2.g)i).f;
            final int g = ((tg2.g)i).g;
            if (((tg2.g)i).h <= 0) {
                n = -n;
            }
            return new tg2.g(f, g, n);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Step must be positive, was: ");
        sb.append(value);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final long g(final int[] array, final long n) {
        if (array.length == 2) {
            final float n2 = array[0] * -1.0f;
            float n3 = 0.0f;
            Label_0085: {
                float n4;
                if (n1.c.e(n) >= 0.0f) {
                    final float e = n1.c.e(n);
                    n3 = n2;
                    if (n2 <= e) {
                        break Label_0085;
                    }
                    n4 = e;
                }
                else {
                    final float e2 = n1.c.e(n);
                    n3 = n2;
                    if (n2 >= e2) {
                        break Label_0085;
                    }
                    n4 = e2;
                }
                n3 = n4;
            }
            final float n5 = array[1] * -1.0f;
            float n6;
            if (n1.c.f(n) >= 0.0f) {
                final float f = n1.c.f(n);
                n6 = n5;
                if (n5 > f) {
                    n6 = f;
                }
            }
            else {
                final float f2 = n1.c.f(n);
                n6 = n5;
                if (n5 < f2) {
                    n6 = f2;
                }
            }
            return vl.a.T(n3, n6);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public static void g0(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 33: {
                new u().b(sqLiteDatabase);
                break;
            }
            case 32: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 31: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 30: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 29: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 28: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 27: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 26: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 25: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 24: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 23: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 22: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 21: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static ArrayList g1(final String s) {
        final ArrayList list = new ArrayList();
        final String[] split = s.split("/", -1);
        for (int i = 0; i < split.length; ++i) {
            if (!split[i].isEmpty()) {
                list.add(split[i]);
            }
        }
        return list;
    }
    
    public static void h(final long[] array, final long[] array2, final long[] array3) {
        array3[0] = (array[0] ^ array2[0]);
        array3[1] = (array[1] ^ array2[1]);
        array3[2] = (array[2] ^ array2[2]);
        array3[3] = (array[3] ^ array2[3]);
        array3[4] = (array[4] ^ array2[4]);
        array3[5] = (array[5] ^ array2[5]);
        array3[6] = (array2[6] ^ array[6]);
    }
    
    public static final void h0(final CoroutineContext coroutineContext, final Throwable t) {
        if (t instanceof CancellationException) {
            return;
        }
        try {
            RxJavaPlugins.onError(t);
        }
        finally {
            final Throwable t2;
            xd.a.t(t, t2);
            p2.b.K(coroutineContext, t);
        }
    }
    
    public static String h1(final String s) {
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
    
    public static androidx.appcompat.app.e i(final Context context, final String text, final mg2.p p3) {
        final View inflate = LayoutInflater.from(context).inflate(2131624030, (ViewGroup)null);
        final EditText editText = (EditText)inflate.findViewById(2131430220);
        ((TextView)editText).setText((CharSequence)text);
        final EditText editText2 = (EditText)inflate.findViewById(2131429866);
        final RedditAlertDialog redditAlertDialog = new RedditAlertDialog(context, false, false, 6);
        redditAlertDialog.c.setTitle(2131951830).setView(inflate).setCancelable(true).setPositiveButton(2131951829, (DialogInterface$OnClickListener)new vu.g((Object)p3, 1, (Object)editText, (Object)editText2)).setNegativeButton(2131951738, (DialogInterface$OnClickListener)null);
        final androidx.appcompat.app.e f = redditAlertDialog.f();
        ((TextView)editText).addTextChangedListener((TextWatcher)new ll0.a(f, editText, editText2));
        ng2.e.e((Object)editText2, "linkText");
        ((TextView)editText2).addTextChangedListener((TextWatcher)new ll0.b(f, editText2, editText));
        return f;
    }
    
    public static void i0(final boolean b, final String s, final Object... array) {
        if (b) {
            return;
        }
        final StringBuilder t = a.t("hardAssert failed: ");
        t.append(String.format(s, array));
        throw new AssertionError((Object)t.toString());
    }
    
    public static final String i1(String substring) {
        if (substring == null) {
            return null;
        }
        final Locale default1 = Locale.getDefault();
        ng2.e.e((Object)default1, "getDefault()");
        final String lowerCase = substring.toLowerCase(default1);
        ng2.e.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (xi2.j.I0(lowerCase, "/u/", false)) {
            substring = substring.substring(3);
            ng2.e.e((Object)substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        final Locale default2 = Locale.getDefault();
        ng2.e.e((Object)default2, "getDefault()");
        final String lowerCase2 = substring.toLowerCase(default2);
        ng2.e.e((Object)lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        String substring2 = substring;
        if (xi2.j.I0(lowerCase2, "u/", false)) {
            substring2 = substring.substring(2);
            ng2.e.e((Object)substring2, "this as java.lang.String).substring(startIndex)");
        }
        return substring2;
    }
    
    public static void j(final tf2.b b, final df2.a a) {
        if (((CountDownLatch)b).getCount() == 0L) {
            return;
        }
        try {
            z1();
            ((CountDownLatch)b).await();
        }
        catch (final InterruptedException ex) {
            a.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", ex);
        }
    }
    
    public static final boolean j0(final int n, final HashSet set) {
        ng2.e.f((Object)set, "<this>");
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            final Activity activity = ((WeakReference<Activity>)iterator.next()).get();
            if (activity != null && n == activity.hashCode()) {
                return true;
            }
        }
        return false;
    }
    
    public static void j1(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 21: {
                sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS anrs_table ( anr_id TEXT, anr_main_thread_data TEXT, anr_rest_of_threads_data TEXT, anr_upload_state INTEGER, temporary_server_token TEXT, state TEXT, long_message TEXT DEFAULT \"\")");
                break;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static final void k(final ImageView imageView, final c91.b b) {
        ng2.e.f((Object)imageView, "<this>");
        ng2.e.f((Object)b, "communityIcon");
        dg.l0.y(imageView, b);
    }
    
    public static void k0(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 34: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 33: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 32: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 31: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 30: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 29: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 28: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 27: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 26: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 25: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 24: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 23: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 22: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 21: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o(), (hp.b)new p(), (hp.b)new hp.q(), (hp.b)new hp.r(), (hp.b)new hp.s(), (hp.b)new hp.t(), (hp.b)new u(), (hp.b)new v0.i() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static final void k1(String s, final ug2.d d) {
        ng2.e.f((Object)d, "baseClass");
        final StringBuilder sb = new StringBuilder();
        sb.append("in the scope of '");
        sb.append(d.n());
        sb.append('\'');
        final String string = sb.toString();
        if (s == null) {
            s = b.l("Class discriminator was missing and no default polymorphic serializers were registered ", string);
        }
        else {
            s = a.o("Class '", s, "' is not registered for polymorphic serialization ", string, ".\nMark the base class as 'sealed' or register the serializer explicitly.");
        }
        throw new SerializationException(s);
    }
    
    public static final void l(final AvatarView avatarView, final c91.b b) {
        ng2.e.f((Object)avatarView, "<this>");
        ng2.e.f((Object)b, "communityIcon");
        dg.l0.z(avatarView, b);
    }
    
    public static void l0(final long[] array, final long[] array2) {
        final long n = array[0];
        final long n2 = array[1];
        final long n3 = array[2];
        final long n4 = array[3];
        array2[0] = (n & 0x1FFFFFFFFFFFFL);
        array2[1] = ((n >>> 49 ^ n2 << 15) & 0x1FFFFFFFFFFFFL);
        array2[2] = ((n2 >>> 34 ^ n3 << 30) & 0x1FFFFFFFFFFFFL);
        array2[3] = (n3 >>> 19 ^ n4 << 45);
    }
    
    public static final Activity l1(Context baseContext) {
        ng2.e.f((Object)baseContext, "<this>");
        while (!(baseContext instanceof Activity) && baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
            ng2.e.e((Object)baseContext, "context.baseContext");
        }
        return (Activity)baseContext;
    }
    
    public static final Integer m(final int n) {
        return new Integer(n);
    }
    
    public static void m0(long[] array, final long[] array2, final long[] array3) {
        final long[] array4 = new long[4];
        final long[] array5 = new long[4];
        l0(array, array4);
        l0(array2, array5);
        n0(array4[0], array5[0], array3, 0);
        n0(array4[1], array5[1], array3, 1);
        n0(array4[2], array5[2], array3, 2);
        n0(array4[3], array5[3], array3, 3);
        int n2;
        for (int i = 5; i > 0; i = n2) {
            final long n = array3[i];
            n2 = i - 1;
            array3[i] = (n ^ array3[n2]);
        }
        n0(array4[0] ^ array4[1], array5[0] ^ array5[1], array3, 1);
        n0(array4[2] ^ array4[3], array5[2] ^ array5[3], array3, 3);
        for (int j = 7; j > 1; --j) {
            array3[j] ^= array3[j - 2];
        }
        final long n3 = array4[0] ^ array4[2];
        final long n4 = array4[1] ^ array4[3];
        final long n5 = array5[0] ^ array5[2];
        final long n6 = array5[1] ^ array5[3];
        n0(n3 ^ n4, n5 ^ n6, array3, 3);
        array = new long[3];
        n0(n3, n5, array, 0);
        n0(n4, n6, array, 1);
        final long n7 = array[0];
        final long n8 = array[1];
        final long n9 = array[2];
        final long n10 = array3[2] ^ n7;
        array3[2] = n10;
        final long n11 = array3[3] ^ (n7 ^ n8);
        array3[3] = n11;
        final long n12 = array3[4] ^ (n9 ^ n8);
        array3[4] = n12;
        final long n13 = array3[5] ^ n9;
        array3[5] = n13;
        final long n14 = array3[0];
        final long n15 = array3[1];
        final long n16 = array3[6];
        final long n17 = array3[7];
        array3[0] = (n14 ^ n15 << 49);
        array3[1] = (n15 >>> 15 ^ n10 << 34);
        array3[2] = (n10 >>> 30 ^ n11 << 19);
        array3[3] = (n11 >>> 45 ^ n12 << 4 ^ n13 << 53);
        array3[4] = (n12 >>> 60 ^ n16 << 38 ^ n13 >>> 11);
        array3[5] = (n16 >>> 26 ^ n17 << 23);
        array3[6] = n17 >>> 41;
        array3[7] = 0L;
    }
    
    public static final r82.l0 m1(final g82.g g) {
        ng2.e.f((Object)g, "<this>");
        final r82.m0 m0 = new r82.m0(g.a, g.i, g.j, g.t, g.u, g.v, g.w, g.x);
        final BigInteger c = g.c;
        final BigInteger d = g.d;
        final BigInteger e = g.e;
        final String f = g.f;
        final String g2 = g.g;
        final Long h = g.h;
        final r82.a l = g.l;
        final r82.a i = g.m;
        final long n = g.n;
        Long value;
        if (n <= 0L) {
            value = null;
        }
        else {
            value = n;
        }
        final TransactionType$a companion = TransactionType.Companion;
        final String k = g.k;
        companion.getClass();
        ng2.e.f((Object)k, "string");
        while (true) {
            for (TransactionType unknown : TransactionType.values()) {
                if (ng2.e.a((Object)unknown.getTitle(), (Object)k)) {
                    if (unknown == null) {
                        unknown = TransactionType.UNKNOWN;
                    }
                    final PendingTransactionSubtype$a companion2 = PendingTransactionSubtype.Companion;
                    final String o = g.o;
                    companion2.getClass();
                    for (final PendingTransactionSubtype pendingTransactionSubtype : PendingTransactionSubtype.values()) {
                        if (ng2.e.a((Object)pendingTransactionSubtype.getTitle(), (Object)o)) {
                            final PendingTransactionSubtype pendingTransactionSubtype2 = pendingTransactionSubtype;
                            return new r82.l0(c, d, e, f, g2, h, m0, l, i, value, unknown, pendingTransactionSubtype2, g.p, g.q, g.r, g.s);
                        }
                    }
                    final PendingTransactionSubtype pendingTransactionSubtype2 = null;
                    return new r82.l0(c, d, e, f, g2, h, m0, l, i, value, unknown, pendingTransactionSubtype2, g.p, g.q, g.r, g.s);
                }
            }
            TransactionType unknown = null;
            continue;
        }
    }
    
    public static void n(final Class clazz, final Object o) {
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(clazz.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
    
    public static void n0(final long n, long n2, final long[] array, int n3) {
        final long[] array2 = new long[8];
        array2[1] = n2;
        final long n4 = n2 << 1;
        array2[2] = n4;
        final long n5 = n4 ^ n2;
        array2[3] = n5;
        array2[5] = ((array2[4] = n4 << 1) ^ n2);
        array2[7] = ((array2[6] = n5 << 1) ^ n2);
        final int n6 = (int)n;
        n2 = array2[n6 & 0x7];
        long n7 = array2[n6 >>> 3 & 0x7] << 3 ^ n2;
        n2 = 0L;
        int n8 = 36;
        int n9;
        long n12;
        long n13;
        do {
            final int n10 = (int)(n >>> n8);
            final long n11 = array2[n10 & 0x7] ^ array2[n10 >>> 3 & 0x7] << 3 ^ array2[n10 >>> 6 & 0x7] << 6 ^ array2[n10 >>> 9 & 0x7] << 9 ^ array2[n10 >>> 12 & 0x7] << 12;
            n12 = (n7 ^ n11 << n8);
            n13 = (n2 ^ n11 >>> -n8);
            n9 = n8 - 15;
            n7 = n12;
            n2 = n13;
        } while ((n8 = n9) > 0);
        array[n3] ^= (0x1FFFFFFFFFFFFL & n12);
        ++n3;
        array[n3] ^= (n12 >>> 49 ^ n13 << 15);
    }
    
    public static final androidx.fragment.app.q n1(final Context context) {
        ng2.e.f((Object)context, "<this>");
        return (androidx.fragment.app.q)l1(context);
    }
    
    public static void o(final String s) {
        final int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(": glError ");
        sb.append(glGetError);
        Log.e("b", sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append(": glError ");
        sb2.append(glGetError);
        throw new RuntimeException(sb2.toString());
    }
    
    public static void o0(final long[] array, final long[] array2) {
        ah0.b.b0(0, array[0], array2);
        ah0.b.b0(2, array[1], array2);
        ah0.b.b0(4, array[2], array2);
        array2[6] = (array[3] & 0x1L);
    }
    
    public static final String o1(int h) {
        final int i = yi2.a.i;
        final long b1 = xd.a.B1(h, DurationUnit.SECONDS);
        final long n = yi2.a.n(b1, DurationUnit.HOURS);
        h = yi2.a.h(b1);
        final int j = yi2.a.j(b1);
        yi2.a.i(b1);
        final StringBuilder sb = new StringBuilder();
        if (n > 0L) {
            final String format = String.format("%d", Arrays.copyOf(new Object[] { n }, 1));
            ng2.e.e((Object)format, "format(format, *args)");
            sb.append(format);
            sb.append(':');
            final String format2 = String.format("%02d", Arrays.copyOf(new Object[] { h }, 1));
            ng2.e.e((Object)format2, "format(format, *args)");
            sb.append(format2);
        }
        else {
            final String format3 = String.format("%d", Arrays.copyOf(new Object[] { h }, 1));
            ng2.e.e((Object)format3, "format(format, *args)");
            sb.append(format3);
        }
        sb.append(':');
        final String format4 = String.format("%02d", Arrays.copyOf(new Object[] { j }, 1));
        ng2.e.e((Object)format4, "format(format, *args)");
        sb.append(format4);
        final String string = sb.toString();
        ng2.e.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public static void p(final dagger.android.a a, final String s, final Class clazz) {
        if (a != null) {
            return;
        }
        if (!s.contains("%s")) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        }
        if (s.indexOf("%s") == s.lastIndexOf("%s")) {
            throw new NullPointerException(s.replace("%s", clazz.getCanonicalName()));
        }
        throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
    }
    
    public static final boolean p0(final Context context) {
        ng2.e.f((Object)context, "<this>");
        final Object systemService = context.getSystemService("activity");
        ng2.e.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        final List runningAppProcesses = ((ActivityManager)systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                if (activityManager$RunningAppProcessInfo.importance == 100 && ng2.e.a((Object)activityManager$RunningAppProcessInfo.processName, (Object)context.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static String p1(final String s) {
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 >= 'A' && char1 <= 'Z') {
                final char[] charArray = s.toCharArray();
                while (i < length) {
                    final char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char)(c ^ ' ');
                    }
                    ++i;
                }
                return String.valueOf(charArray);
            }
        }
        return s;
    }
    
    public static void q(final Object o) {
        if (o != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    
    public static final boolean q0(final Context context) {
        ng2.e.g((Object)context, "$this$isNetworkAvailable");
        final Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            final ConnectivityManager connectivityManager = (ConnectivityManager)systemService;
            final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            final boolean b = true;
            boolean booleanValue;
            if (!(booleanValue = (activeNetworkInfo != null && activeNetworkInfo.isConnected()))) {
                final NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
                Boolean value = null;
                Label_0125: {
                    if (allNetworkInfo != null) {
                        while (true) {
                            for (final NetworkInfo networkInfo : allNetworkInfo) {
                                ng2.e.b((Object)networkInfo, "it");
                                if (networkInfo.isConnected()) {
                                    final boolean b2 = b;
                                    value = b2;
                                    break Label_0125;
                                }
                            }
                            final boolean b2 = false;
                            continue;
                        }
                    }
                    value = null;
                }
                booleanValue = value;
            }
            return booleanValue;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }
    
    public static final void q1() {
        ng2.e.f((Object)null, "<this>");
        throw null;
    }
    
    public static void r(final Object o) {
        if (o != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
    
    public static final boolean r0(final y81.h h) {
        ng2.e.f((Object)h, "<this>");
        return h.p0 && h.c0;
    }
    
    public static String r1(final int n) {
        final int n2 = 0;
        String d;
        if (n == 0) {
            d = "Blocking";
        }
        else if (n == 1) {
            d = "Optional";
        }
        else {
            int n3 = n2;
            if (n == 2) {
                n3 = 1;
            }
            if (n3 != 0) {
                d = "Async";
            }
            else {
                d = m5.a.d("Invalid(value=", n, ')');
            }
        }
        return d;
    }
    
    public static void s(final Object o) {
        if (o != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    
    public static final boolean s0(final Uri uri, final PackageManager packageManager) {
        ng2.e.f((Object)uri, "uri");
        final String host = uri.getHost();
        final boolean empty = TextUtils.isEmpty((CharSequence)host);
        final boolean b = false;
        if (empty) {
            return false;
        }
        final boolean b2 = host != null && xi2.j.x0(host, ".youtube.com", false);
        Intent launchIntentForPackage = null;
        final boolean b3 = b2 || xi2.j.z0(host, "youtube.com", false) || xi2.j.z0(host, "youtu.be", false);
        if (packageManager != null) {
            launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.google.android.youtube");
        }
        final boolean b4 = launchIntentForPackage != null;
        boolean b5 = b;
        if (b3) {
            b5 = b;
            if (b4) {
                b5 = true;
            }
        }
        return b5;
    }
    
    public static String s1(final String s) {
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 >= 'a' && char1 <= 'z') {
                final char[] charArray = s.toCharArray();
                while (i < length) {
                    final char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char)(c ^ ' ');
                    }
                    ++i;
                }
                return String.valueOf(charArray);
            }
        }
        return s;
    }
    
    public static final void t(final ArrayList list, final List list2) {
        ng2.e.f((Object)list, "<this>");
        ng2.e.f((Object)list2, "other");
        list.clear();
        list.addAll(list2);
    }
    
    public static void t0(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 25: {
                sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ndk_crashes_table ( session_id TEXT PRIMARY KEY,crash_stack_trace TEXT,temp_server_token TEXT,sync_state INTEGER default 0,state_file TEXT)");
                break;
            }
            case 24: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.l(), (hp.b)new hp.m() }, 14).b(sqLiteDatabase);
                break;
            }
            case 23: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m() }, 14).b(sqLiteDatabase);
                break;
            }
            case 22: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m() }, 14).b(sqLiteDatabase);
                break;
            }
            case 21: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m() }, 14).b(sqLiteDatabase);
                break;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m() }, 14).b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static RectF t1(final float[] array) {
        final RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i = 1; i < array.length; i += 2) {
            float right = Math.round(array[i - 1] * 10.0f) / 10.0f;
            float bottom = Math.round(array[i] * 10.0f) / 10.0f;
            float left;
            if (right < (left = rectF.left)) {
                left = right;
            }
            rectF.left = left;
            float top;
            if (bottom < (top = rectF.top)) {
                top = bottom;
            }
            rectF.top = top;
            final float right2 = rectF.right;
            if (right <= right2) {
                right = right2;
            }
            rectF.right = right;
            final float bottom2 = rectF.bottom;
            if (bottom <= bottom2) {
                bottom = bottom2;
            }
            rectF.bottom = bottom;
        }
        rectF.sort();
        return rectF;
    }
    
    public static final void u(final Closeable closeable, final Throwable t) {
        if (closeable != null) {
            if (t == null) {
                closeable.close();
            }
            else {
                try {
                    closeable.close();
                }
                finally {
                    final Throwable t2;
                    xd.a.t(t, t2);
                }
            }
        }
    }
    
    public static void u0(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 26: {
                new n().b(sqLiteDatabase);
                break;
            }
            case 25: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.m(), (hp.b)new n() }, 14).b(sqLiteDatabase);
                break;
            }
            case 24: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n() }, 14).b(sqLiteDatabase);
                break;
            }
            case 23: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n() }, 14).b(sqLiteDatabase);
                break;
            }
            case 22: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n() }, 14).b(sqLiteDatabase);
                break;
            }
            case 21: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n() }, 14).b(sqLiteDatabase);
                break;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n() }, 14).b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static final ProtoBuf$Type u1(final ProtoBuf$ValueParameter protoBuf$ValueParameter, final wh2.e e) {
        ng2.e.f((Object)e, "typeTable");
        ProtoBuf$Type protoBuf$Type;
        if (protoBuf$ValueParameter.hasType()) {
            protoBuf$Type = protoBuf$ValueParameter.getType();
            ng2.e.e((Object)protoBuf$Type, "type");
        }
        else {
            if (!protoBuf$ValueParameter.hasTypeId()) {
                throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
            }
            protoBuf$Type = e.a(protoBuf$ValueParameter.getTypeId());
        }
        return protoBuf$Type;
    }
    
    public static final double v(final double n, final double n2, final double n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            throw new IllegalArgumentException(a.p(sb, n2, '.'));
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static void v0(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 27: {
                new hp.o().b(sqLiteDatabase);
                break;
            }
            case 26: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new n(), (hp.b)new hp.o() }, 14).b(sqLiteDatabase);
                break;
            }
            case 25: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o() }, 14).b(sqLiteDatabase);
                break;
            }
            case 24: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o() }, 14).b(sqLiteDatabase);
                break;
            }
            case 23: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o() }, 14).b(sqLiteDatabase);
                break;
            }
            case 22: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o() }, 14).b(sqLiteDatabase);
                break;
            }
            case 21: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o() }, 14).b(sqLiteDatabase);
                break;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o() }, 14).b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k(), (hp.b)new hp.l(), (hp.b)new hp.m(), (hp.b)new n(), (hp.b)new hp.o() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static void v1(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            default: {
                c(sqLiteDatabase, n, n2);
                break;
            }
            case 22: {
                new hp.j().b(sqLiteDatabase);
                break;
            }
            case 21: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new i(), (hp.b)new hp.j() }, 14).b(sqLiteDatabase);
                break;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j() }, 14).b(sqLiteDatabase);
                break;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j() }, 14).b(sqLiteDatabase);
                break;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j() }, 14).b(sqLiteDatabase);
                break;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j() }, 14).b(sqLiteDatabase);
                break;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j() }, 14).b(sqLiteDatabase);
                break;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j() }, 14).b(sqLiteDatabase);
                break;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j() }, 14).b(sqLiteDatabase);
                break;
            }
        }
    }
    
    public static final float w(final float n, final float n2, final float n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            sb.append(n2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final void w0(final int n, final ImageView imageView) {
        final Drawable drawable = n3.a.getDrawable(((View)imageView).getContext(), 2131233190);
        ng2.e.c((Object)drawable);
        drawable.mutate();
        drawable.setTint(n);
        drawable.setTintMode(PorterDuff$Mode.OVERLAY);
        drawable.setAlpha(77);
        ((View)imageView).setBackgroundColor(n);
        imageView.setImageDrawable(drawable);
    }
    
    public static final tg2.i w1(final int n, final int n2) {
        if (n2 <= Integer.MIN_VALUE) {
            final tg2.i i = tg2.i.i;
            return tg2.i.i;
        }
        return new tg2.i(n, n2 - 1);
    }
    
    public static final int x(final int n, final int n2, final int n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            sb.append(n2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static int x0(final int n, final String s) {
        final int glCreateShader = GLES20.glCreateShader(n);
        final StringBuilder sb = new StringBuilder();
        sb.append("glCreateShader type=");
        sb.append(n);
        o(sb.toString());
        GLES20.glShaderSource(glCreateShader, s);
        GLES20.glCompileShader(glCreateShader);
        final int[] array = { 0 };
        GLES20.glGetShaderiv(glCreateShader, 35713, array, 0);
        int n2 = glCreateShader;
        if (array[0] == 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not compile shader ");
            sb2.append(n);
            sb2.append(":");
            Log.e("b", sb2.toString());
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(" ");
            sb3.append(GLES20.glGetShaderInfoLog(glCreateShader));
            Log.e("b", sb3.toString());
            GLES20.glDeleteShader(glCreateShader);
            n2 = 0;
        }
        return n2;
    }
    
    public static final boolean x1(String s, String q) {
        s = i1(s);
        final String i1 = i1(q);
        q = null;
        if (s != null) {
            final Locale root = Locale.ROOT;
            s = aq2.a.q(root, "ROOT", s, root, "this as java.lang.String).toLowerCase(locale)");
        }
        else {
            s = null;
        }
        if (i1 != null) {
            final Locale root2 = Locale.ROOT;
            q = aq2.a.q(root2, "ROOT", i1, root2, "this as java.lang.String).toLowerCase(locale)");
        }
        return TextUtils.equals((CharSequence)s, (CharSequence)q);
    }
    
    public static final int y(final int n, final tg2.i i) {
        ng2.e.f((Object)i, "range");
        if (i instanceof tg2.e) {
            return ((Number)B(n, (tg2.e)i)).intValue();
        }
        if (!i.isEmpty()) {
            int n2;
            if (n < i.n().intValue()) {
                n2 = i.n().intValue();
            }
            else if ((n2 = n) > i.m().intValue()) {
                n2 = i.m().intValue();
            }
            return n2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void y1(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        switch (n) {
            case 23: {
                sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS experiments_table ( experiment_id INTEGER PRIMARY KEY AUTOINCREMENT,experiment TEXT)");
                break;
            }
            case 22: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.j(), (hp.b)new hp.k() }, 14).b(sqLiteDatabase);
                return;
            }
            case 21: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k() }, 14).b(sqLiteDatabase);
                return;
            }
            case 20: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k() }, 14).b(sqLiteDatabase);
                return;
            }
            case 19: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k() }, 14).b(sqLiteDatabase);
                return;
            }
            case 18: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k() }, 14).b(sqLiteDatabase);
                return;
            }
            case 17: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k() }, 14).b(sqLiteDatabase);
                return;
            }
            case 15: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k() }, 14).b(sqLiteDatabase);
                return;
            }
            case 14: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k() }, 14).b(sqLiteDatabase);
                return;
            }
            case 12: {
                new androidx.compose.ui.platform.k0(new hp.b[] { (hp.b)new hp.c(), (hp.b)new hp.d(), (hp.b)new e9.f(), (hp.b)new hp.e(), (hp.b)new hp.f(), (hp.b)new hp.g(), (hp.b)new hp.h(), (hp.b)new i(), (hp.b)new hp.j(), (hp.b)new hp.k() }, 14).b(sqLiteDatabase);
                return;
            }
        }
        c(sqLiteDatabase, n, n2);
    }
    
    public static final long z(final long n, final long n2, final long n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            throw new IllegalArgumentException(b5.k.k(sb, n2, '.'));
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static String z0(final r51.p p) {
        ng2.e.f((Object)p, "notificationType");
        String a;
        if (p instanceof p$q) {
            a = "private_message";
        }
        else if (p instanceof p$f) {
            a = "comment_reply";
        }
        else if (p instanceof p$o) {
            a = "post_reply";
        }
        else if (p instanceof p$x) {
            a = "username_mention";
        }
        else if (p instanceof p$u) {
            a = "trending";
        }
        else if (p instanceof p$j) {
            a = "mod_mail";
        }
        else if (p instanceof p$p) {
            a = "upvote_post";
        }
        else if (p instanceof p$g) {
            a = "upvote_comment";
        }
        else if (p instanceof p$r) {
            a = "subreddit_recommendation";
        }
        else if (p instanceof p$c) {
            a = "cake_day";
        }
        else if (p instanceof p$s) {
            a = "thread_replies";
        }
        else if (p instanceof p$t) {
            a = "top_level_comment";
        }
        else if (p instanceof p$y) {
            a = "user_new_follower";
        }
        else if (p instanceof p$d) {
            a = "chat_accept_invite";
        }
        else if (p instanceof p$m) {
            a = "post_flair_added";
        }
        else if (p instanceof p$w) {
            a = "user_flair_added";
        }
        else if (p instanceof p$a) {
            a = "broadcast_follower";
        }
        else if (p instanceof p$b) {
            a = "broadcast_recommendation";
        }
        else if (p instanceof p$h) {
            a = "moderated_sr_engagement";
        }
        else if (p instanceof p$i) {
            a = "moderated_sr_content_foundation";
        }
        else if (p instanceof p$k) {
            a = "moderated_sr_milestone";
        }
        else if (p instanceof p$l) {
            a = "new_pinned_post";
        }
        else if (p instanceof p$n) {
            a = "post_follow";
        }
        else if (p instanceof p$e) {
            a = "comment_follow";
        }
        else {
            if (!(p instanceof p$v)) {
                throw new NoWhenBranchMatchedException();
            }
            a = ((p$v)p).a;
        }
        return a;
    }
    
    public static void z1() {
        if (RxJavaPlugins.isFailOnNonBlockingScheduler() && (Thread.currentThread() instanceof rf2.g || RxJavaPlugins.onBeforeBlocking())) {
            final StringBuilder t = a.t("Attempt to block on a Scheduler ");
            t.append(Thread.currentThread().getName());
            t.append(" that doesn't support blocking operators as they may lead to deadlock");
            throw new IllegalStateException(t.toString());
        }
    }
    
    public void L(final String s, final Object... array) {
        ng2.e.g((Object)s, "message");
        this.y0(3, s, null, Arrays.copyOf(array, array.length));
    }
    
    public void O(final String s, final Object... array) {
        this.y0(6, s, null, Arrays.copyOf(array, array.length));
    }
    
    public void P(final Throwable t, final String s, final Object... array) {
        ng2.e.g((Object)s, "message");
        this.y0(6, s, t, Arrays.copyOf(array, array.length));
    }
    
    public long a(final ws0.m m) {
        final int x2 = ((ws0.a)m).x2();
        long n;
        if (x2 > 0) {
            n = TimeUnit.MINUTES.toMillis(x2);
        }
        else {
            kw1.e.a.getClass();
            n = kw1.e$a.b;
        }
        return n;
    }
    
    public Object e(final jh.r r) {
        return Registrar.lambda$getComponents$0$Registrar((jh.c)r);
    }
    
    public void y0(final int n, final String s, final Throwable t, final Object... array) {
    }
}
