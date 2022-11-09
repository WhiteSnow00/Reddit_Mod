// 
// Decompiled by Procyon v0.6.0
// 

package ng;

import android.widget.TextView;
import android.os.BaseBundle;
import re.q2;
import java.util.LinkedHashSet;
import yw1.e$a;
import java.util.concurrent.TimeUnit;
import bt0.l;
import com.reddit.domain.model.Link;
import com.reddit.domain.awards.model.AwardTarget;
import com.reddit.domain.model.Comment;
import o1.p0;
import android.os.Build$VERSION;
import android.graphics.Shader$TileMode;
import um1.g;
import com.reddit.screen.snoovatar.builder.categories.storefront.gallery.v2.GalleryViewV2Screen;
import com.reddit.marketplace.impl.screens.nft.detail.ProductDetailsScreen;
import com.reddit.marketplace.domain.NavigationOrigin;
import ow0.h;
import android.view.ViewParent;
import androidx.appcompat.widget.j1;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.util.Patterns;
import android.view.inputmethod.InputMethodManager;
import android.os.IBinder;
import android.app.Activity;
import java.util.Iterator;
import kotlin.text.Regex;
import kj2.j;
import java.util.List;
import ak0.m;
import java.util.Date;
import z0.o0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import android.os.Looper;
import nf2.a0;
import l0.g0;
import androidx.compose.animation.core.VectorConvertersKt;
import l0.n;
import kotlin.Pair;
import com.reddit.screen.snoovatar.artistpage.ArtistPageScreen;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.chat.model.UserBriefData;
import com.reddit.domain.chat.model.UserData;
import java.util.Map;
import android.view.View;
import sl0.c;
import ah2.f;
import android.text.TextWatcher;
import sl0.b;
import android.content.DialogInterface$OnClickListener;
import com.reddit.screen.dialog.RedditAlertDialog;
import android.widget.EditText;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.appcompat.app.e;
import zg2.p;
import android.content.Context;
import android.os.Bundle;
import bd.c0;
import android.graphics.Color;
import ea0.a;
import tw1.d;
import re.o2;
import kj.k;
import sf2.o;
import h60.i;

public final class f0 implements i, o, k, o2, d
{
    public static u f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final float[][] p;
    public static final float[][] q;
    public static final f0 s;
    public static final int[] t;
    public static final int[] u;
    public static final int[] v;
    public static final int[] w;
    
    public static String A2(final int n) {
        return c0.n("rgba(%d,%d,%d,%.3f)", Color.red(n), Color.green(n), Color.blue(n), Color.alpha(n) / 255.0);
    }
    
    public static Object B2(final Bundle bundle, final String s, final Class clazz, final Object o) {
        final Object value = ((BaseBundle)bundle).get(s);
        if (value == null) {
            return o;
        }
        if (clazz.isAssignableFrom(value.getClass())) {
            return value;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", s, clazz.getCanonicalName(), value.getClass().getCanonicalName()));
    }
    
    public static void C2(final Object o, final Bundle bundle) {
        if (o instanceof Double) {
            ((BaseBundle)bundle).putDouble("value", (double)o);
            return;
        }
        if (o instanceof Long) {
            ((BaseBundle)bundle).putLong("value", (long)o);
            return;
        }
        ((BaseBundle)bundle).putString("value", o.toString());
    }
    
    public static e U1(final Context context, final String text, final p p3) {
        final View inflate = LayoutInflater.from(context).inflate(2131624029, (ViewGroup)null);
        final EditText editText = (EditText)inflate.findViewById(2131430228);
        ((TextView)editText).setText((CharSequence)text);
        final EditText editText2 = (EditText)inflate.findViewById(2131429874);
        final RedditAlertDialog redditAlertDialog = new RedditAlertDialog(context, false, false, 6);
        redditAlertDialog.c.setTitle(2131951825).setView(inflate).setCancelable(true).setPositiveButton(2131951824, (DialogInterface$OnClickListener)new sl0.a(p3, editText, editText2)).setNegativeButton(2131951733, (DialogInterface$OnClickListener)null);
        final e f = redditAlertDialog.f();
        ((TextView)editText).addTextChangedListener((TextWatcher)new b(f, editText, editText2));
        ah2.f.e((Object)editText2, "linkText");
        ((TextView)editText2).addTextChangedListener((TextWatcher)new c(f, editText2, editText));
        return f;
    }
    
    public static UserData V1(final Map.Entry entry) {
        ah2.f.f((Object)entry, "user");
        return new UserData(entry.getKey(), ((UserBriefData)entry.getValue()).getName(), ((UserBriefData)entry.getValue()).getProfileIcon(), ((UserBriefData)entry.getValue()).getLinkKarma() + ((UserBriefData)entry.getValue()).getCommentKarma(), ((UserBriefData)entry.getValue()).getCreatedUtc(), null, ((UserBriefData)entry.getValue()).isNsfw(), false, 128, null);
    }
    
    public static ArtistPageScreen W1(final String s) {
        ah2.f.f((Object)s, "artistId");
        return new ArtistPageScreen(p2.e.i(new Pair[] { new Pair((Object)"params", (Object)new yl1.c(s)) }));
    }
    
    public static final float X1(final float n, final n n2) {
        ah2.f.f((Object)n2, "<this>");
        return ((l0.f)n2.a(VectorConvertersKt.a).e(new l0.f(0.0f), new l0.f(n))).a;
    }
    
    public static void Y1(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static boolean Z1(final a0 a0) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            a0.onSubscribe(io.reactivex.disposables.a.a());
            final StringBuilder k = a.k("Expected to be called on the main thread but was ");
            k.append(Thread.currentThread().getName());
            a0.onError((Throwable)new IllegalStateException(k.toString()));
            return false;
        }
        return true;
    }
    
    public static void a2(final Object o) {
        if (o != null) {
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }
    
    public static final long b2(final int n, final z0.d d) {
        return g2.a.a.a((Context)d.t(AndroidCompositionLocals_androidKt.b), n);
    }
    
    public static long c2(final Date date) {
        return date.getTime() / 1000L + 2082844800L;
    }
    
    public static Date d2(final long n) {
        return new Date((n - 2082844800L) * 1000L);
    }
    
    public static String e2(final String s) {
        final StringBuilder q = ak0.m.q(ak0.n.f(s, ak0.n.f(s, 5)), ".", s, ",.", s);
        q.append(" *");
        return q.toString();
    }
    
    public static final String f2(final String s) {
        ah2.f.f((Object)s, "sessionId");
        List d2 = kotlin.text.b.D2(0, 6, (CharSequence)s, new char[] { '.' });
        if (d2.isEmpty()) {
            d2 = null;
        }
        String s2 = s;
        if (d2 != null) {
            s2 = d2.get(0);
            if (s2 == null) {
                s2 = s;
            }
        }
        return s2;
    }
    
    public static String g2(String l) {
        if (l == null) {
            return null;
        }
        if (!kj2.j.e2(l, "https://", false)) {
            l = ak0.m.l("https://www.redditstatic.com/desktop2x/", l);
        }
        return l;
    }
    
    public static String h2(final String s) {
        ah2.f.f((Object)s, "url");
        String l = s;
        if (!kj2.j.e2(s, "http://", false)) {
            l = s;
            if (!kj2.j.e2(s, "https://", false)) {
                l = ak0.m.l("http://", s);
            }
        }
        return l;
    }
    
    public static String i2(final int n) {
        switch (n) {
            default: {
                return a2.b.f(32, "unknown status code: ", n);
            }
            case 22: {
                return "RECONNECTION_TIMED_OUT";
            }
            case 21: {
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            }
            case 20: {
                return "CONNECTION_SUSPENDED_DURING_CALL";
            }
            case 19: {
                return "REMOTE_EXCEPTION";
            }
            case 18: {
                return "DEAD_CLIENT";
            }
            case 17: {
                return "API_NOT_CONNECTED";
            }
            case 16: {
                return "CANCELED";
            }
            case 15: {
                return "TIMEOUT";
            }
            case 14: {
                return "INTERRUPTED";
            }
            case 13: {
                return "ERROR";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 0: {
                return "SUCCESS";
            }
            case -1: {
                return "SUCCESS_CACHE";
            }
        }
    }
    
    public static gh2.i j2(final int n, final CharSequence charSequence) {
        final int length = charSequence.length();
        final int n2 = 0;
        if (length > 0) {
            final Iterator iterator = new Regex("\\s|\\n").split(charSequence, 0).iterator();
            int n3 = n2;
            while (iterator.hasNext()) {
                final int n4 = ((String)iterator.next()).length() + n3;
                if (n4 >= n) {
                    return new gh2.i(n3, n4 - 1);
                }
                n3 = n4 + 1;
            }
        }
        return gh2.i.i;
    }
    
    public static final void k2(final Activity activity, final IBinder binder) {
        ah2.f.f((Object)activity, "activity");
        final Object systemService = activity.getSystemService("input_method");
        ah2.f.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        final InputMethodManager inputMethodManager = (InputMethodManager)systemService;
        IBinder windowToken = binder;
        if (binder == null) {
            View currentFocus;
            if ((currentFocus = activity.getCurrentFocus()) == null) {
                currentFocus = new View((Context)activity);
            }
            windowToken = currentFocus.getWindowToken();
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }
    
    public static boolean l2(final CharSequence charSequence) {
        boolean b = true;
        if (charSequence == null || charSequence.length() <= 0 || !Patterns.WEB_URL.matcher(charSequence).matches()) {
            b = false;
        }
        return b;
    }
    
    public static void m2(final int[] array, final int[] array2, final int[] array3) {
        final int[] array4 = new int[10];
        android.support.v4.media.b.u1(array, array2, array4);
        q2(array4, array3);
    }
    
    public static h9.f n2() {
        final h9.a set = h9.f.noAnimation().set(mr0.a.a, (Object)Boolean.TRUE);
        ah2.f.e((Object)set, "noAnimation()\n      .set\u2026.DISABLE_ANIMATION, true)");
        return (h9.f)set;
    }
    
    public static void o2(final View view, final EditorInfo editorInfo, final InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
                if (viewParent instanceof j1) {
                    editorInfo.hintText = ((j1)viewParent).a();
                    break;
                }
            }
        }
    }
    
    public static ProductDetailsScreen p2(final h h, final NavigationOrigin navigationOrigin, tx0.b b, final int n) {
        if ((n & 0x4) != 0x0) {
            b = null;
        }
        ah2.f.f((Object)navigationOrigin, "navigationOrigin");
        return new ProductDetailsScreen(h, navigationOrigin, (ow0.k)b, (ow0.i)null);
    }
    
    public static void q2(final int[] array, final int[] array2) {
        final long n = (long)array[5] & 0xFFFFFFFFL;
        final long n2 = (long)array[6] & 0xFFFFFFFFL;
        final long n3 = (long)array[7] & 0xFFFFFFFFL;
        final long n4 = (long)array[8] & 0xFFFFFFFFL;
        final long n5 = (long)array[9] & 0xFFFFFFFFL;
        final long n6 = ((long)array[0] & 0xFFFFFFFFL) + n + (n << 31) + 0L;
        array2[0] = (int)n6;
        final long n7 = ((long)array[1] & 0xFFFFFFFFL) + n2 + (n2 << 31) + (n6 >>> 32);
        array2[1] = (int)n7;
        final long n8 = ((long)array[2] & 0xFFFFFFFFL) + n3 + (n3 << 31) + (n7 >>> 32);
        array2[2] = (int)n8;
        final long n9 = ((long)array[3] & 0xFFFFFFFFL) + n4 + (n4 << 31) + (n8 >>> 32);
        array2[3] = (int)n9;
        final long n10 = (0xFFFFFFFFL & (long)array[4]) + n5 + (n5 << 31) + (n9 >>> 32);
        array2[4] = (int)n10;
        r2((int)(n10 >>> 32), array2);
    }
    
    public static void r2(int o1, final int[] array) {
        Label_0109: {
            if (o1 != 0) {
                final long n = -2147483647;
                final long n2 = o1;
                o1 = 0;
                final long n3 = (n2 & 0xFFFFFFFFL) * (n & 0xFFFFFFFFL) + ((long)array[0] & 0xFFFFFFFFL) + 0L;
                array[0] = (int)n3;
                final long n4 = (n3 >>> 32) + (0xFFFFFFFFL & (long)array[1]);
                array[1] = (int)n4;
                if (n4 >>> 32 != 0L) {
                    o1 = android.support.v4.media.a.o1(5, 2, array);
                }
                if (o1 != 0) {
                    break Label_0109;
                }
            }
            if (array[4] != -1 || !android.support.v4.media.b.f1(array, f0.h)) {
                return;
            }
        }
        android.support.v4.media.a.A(5, -2147483647, array);
    }
    
    public static final void s2(final Activity activity) {
        ah2.f.f((Object)activity, "activity");
        final Object systemService = activity.getSystemService("input_method");
        ah2.f.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        final InputMethodManager inputMethodManager = (InputMethodManager)systemService;
        View view;
        if ((view = activity.getCurrentFocus()) == null) {
            view = activity.getWindow().peekDecorView();
        }
        inputMethodManager.showSoftInput(view, 0);
    }
    
    public static void t2(final int[] array, final int[] array2) {
        final int[] array3 = new int[10];
        android.support.v4.media.b.A1(array, array3);
        q2(array3, array2);
    }
    
    public static void u2(int n, final int[] array, final int[] array2) {
        final int[] array3 = new int[10];
        android.support.v4.media.b.A1(array, array3);
        while (true) {
            q2(array3, array2);
            if (--n <= 0) {
                break;
            }
            android.support.v4.media.b.A1(array2, array3);
        }
    }
    
    public static GalleryViewV2Screen v2(final String s, final um1.f f, final List list) {
        f.f((Object)f, "initiallySelectedMode");
        f.f((Object)list, "selectableModes");
        return new GalleryViewV2Screen(p2.e.i(new Pair[] { new Pair((Object)"params", (Object)new g(s, f, list)) }));
    }
    
    public static void w2(final int[] array, final int[] array2, final int[] array3) {
        if (android.support.v4.media.b.C1(array, array2, array3) != 0) {
            final long n = ((long)array3[0] & 0xFFFFFFFFL) - (0xFFFFFFFFL & (long)(-2147483647));
            array3[0] = (int)n;
            if (n >> 32 != 0L) {
                android.support.v4.media.a.e0(5, 1, array3);
            }
        }
    }
    
    public static final Shader$TileMode x2(final int n) {
        final int n2 = 0;
        Shader$TileMode shader$TileMode;
        if (n == 0) {
            shader$TileMode = Shader$TileMode.CLAMP;
        }
        else if (n == 1) {
            shader$TileMode = Shader$TileMode.REPEAT;
        }
        else if (n == 2) {
            shader$TileMode = Shader$TileMode.MIRROR;
        }
        else {
            int n3 = n2;
            if (n == 3) {
                n3 = 1;
            }
            if (n3 != 0) {
                if (Build$VERSION.SDK_INT >= 31) {
                    shader$TileMode = p0.a.b();
                }
                else {
                    shader$TileMode = Shader$TileMode.CLAMP;
                }
            }
            else {
                shader$TileMode = Shader$TileMode.CLAMP;
            }
        }
        return shader$TileMode;
    }
    
    public static final AwardTarget y2(final Comment comment) {
        return new AwardTarget(comment.getKindWithId(), comment.getAuthor(), comment.getAuthorKindWithId(), AwardTarget.Type.COMMENT);
    }
    
    public static final AwardTarget z2(final Link link) {
        ah2.f.f((Object)link, "<this>");
        return new AwardTarget(link.getKindWithId(), link.getAuthor(), link.getAuthorId(), AwardTarget.Type.POST);
    }
    
    public long S(final l l) {
        final int w2 = ((bt0.a)l).w2();
        long n;
        if (w2 > 0) {
            n = TimeUnit.MINUTES.toMillis(w2);
        }
        else {
            yw1.e.a.getClass();
            n = e$a.b;
        }
        return n;
    }
    
    public Object l1() {
        return new LinkedHashSet();
    }
    
    public Object zza() {
        final List a = q2.a;
        return com.google.android.gms.internal.measurement.j.g.a().k();
    }
}
