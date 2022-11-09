// 
// Decompiled by Procyon v0.6.0
// 

package h;

import android.widget.AdapterView;
import android.widget.AbsListView;
import android.os.BaseBundle;
import android.view.ViewManager;
import eg.n0;
import android.view.MotionEvent;
import android.location.Location;
import java.util.Calendar;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.view.ActionMode;
import android.view.ActionMode$Callback;
import android.view.KeyboardShortcutGroup;
import java.util.List;
import a4.u1;
import androidx.appcompat.view.menu.i$a;
import java.lang.ref.WeakReference;
import androidx.core.app.NavUtils;
import android.view.MenuInflater;
import android.util.AndroidRuntimeException;
import a4.l0;
import a4.o0;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.n;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.h1;
import android.view.KeyCharacterMap;
import android.view.ViewParent;
import android.view.WindowManager$LayoutParams;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.d$a;
import androidx.appcompat.view.menu.ExpandedMenuView;
import android.app.UiModeManager;
import android.view.MenuItem;
import android.location.LocationManager;
import java.lang.reflect.Method;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.reflect.InvocationTargetException;
import androidx.appcompat.widget.i1;
import a4.f0;
import android.os.Bundle;
import android.media.AudioManager;
import android.view.ViewConfiguration;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.view.Menu;
import androidx.appcompat.view.menu.MenuBuilder;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.z0;
import android.view.Window$Callback;
import java.lang.reflect.Field;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import android.util.LongSparseArray;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.core.app.ActivityCompat;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import java.util.WeakHashMap;
import android.content.res.Resources$Theme;
import a4.t1;
import a4.p0;
import androidx.appcompat.widget.ViewStubCompat;
import android.util.AttributeSet;
import k.d;
import android.util.TypedValue;
import android.app.Activity;
import androidx.appcompat.widget.Toolbar;
import android.view.ViewGroup$LayoutParams;
import android.view.LayoutInflater;
import android.util.Log;
import java.util.Locale;
import java.util.LinkedHashSet;
import android.os.Build$VERSION;
import v3.h;
import android.content.ContextWrapper;
import android.app.Dialog;
import android.os.Build;
import androidx.appcompat.widget.b0;
import k.g;
import android.view.Window;
import android.content.Context;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import android.graphics.Rect;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import a4.s1;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import k.b;
import j0.i;
import android.view.LayoutInflater$Factory2;
import androidx.appcompat.view.menu.MenuBuilder$a;

public final class f extends h.e implements MenuBuilder$a, LayoutInflater$Factory2
{
    public static final j0.i<String, Integer> p0;
    public static final int[] q0;
    public static final boolean r0;
    public static final boolean s0;
    public o A;
    public k.b B;
    public ActionBarContextView C;
    public PopupWindow D;
    public h.i E;
    public s1 F;
    public boolean G;
    public boolean H;
    public ViewGroup I;
    public TextView J;
    public View K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public f.f$n[] T;
    public f.f$n U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public Configuration Z;
    public int a0;
    public int b0;
    public int c0;
    public boolean d0;
    public l e0;
    public j f0;
    public boolean g0;
    public int h0;
    public final f$a i0;
    public boolean j0;
    public Rect k0;
    public Rect l0;
    public h.o m0;
    public OnBackInvokedDispatcher n0;
    public OnBackInvokedCallback o0;
    public final Object q;
    public final Context r;
    public Window s;
    public i t;
    public final c u;
    public a v;
    public g w;
    public CharSequence x;
    public b0 y;
    public d z;
    
    static {
        p0 = new j0.i();
        q0 = new int[] { 16842836 };
        r0 = ("robolectric".equals(Build.FINGERPRINT) ^ true);
        s0 = true;
    }
    
    public f(Context baseContext, final Window window, final c u, final Object q) {
        this.F = null;
        this.G = true;
        this.a0 = -100;
        this.i0 = new f$a(this);
        this.r = baseContext;
        this.u = u;
        this.q = q;
        Label_0110: {
            if (q instanceof Dialog) {
                while (true) {
                    while (baseContext != null) {
                        if (baseContext instanceof androidx.appcompat.app.f) {
                            final androidx.appcompat.app.f f = (androidx.appcompat.app.f)baseContext;
                            if (f != null) {
                                this.a0 = f.getDelegate().k();
                            }
                            break Label_0110;
                        }
                        else {
                            if (!(baseContext instanceof ContextWrapper)) {
                                break;
                            }
                            baseContext = ((ContextWrapper)baseContext).getBaseContext();
                        }
                    }
                    final androidx.appcompat.app.f f = null;
                    continue;
                }
            }
        }
        if (this.a0 == -100) {
            final j0.i<String, Integer> p4 = f.p0;
            final Integer n = (Integer)p4.getOrDefault((Object)this.q.getClass().getName(), (Object)null);
            if (n != null) {
                this.a0 = n;
                p4.remove((Object)this.q.getClass().getName());
            }
        }
        if (window != null) {
            this.M(window);
        }
        androidx.appcompat.widget.i.d();
    }
    
    public static h N(final Context context) {
        if (Build$VERSION.SDK_INT >= 33) {
            return null;
        }
        final h h = h.e.h;
        if (h == null) {
            return null;
        }
        final h b = f.f$f.b(context.getApplicationContext().getResources().getConfiguration());
        h h2;
        if (h.a.isEmpty()) {
            h2 = v3.h.b;
        }
        else {
            final LinkedHashSet set = new LinkedHashSet();
            for (int i = 0; i < b.c() + h.c(); ++i) {
                Locale locale;
                if (i < h.c()) {
                    locale = h.b(i);
                }
                else {
                    locale = b.b(i - h.c());
                }
                if (locale != null) {
                    set.add(locale);
                }
            }
            h2 = v3.h.e(v3.h.b.a((Locale[])set.toArray(new Locale[set.size()])));
        }
        if (h2.a.isEmpty()) {
            h2 = b;
        }
        return h2;
    }
    
    public static Configuration R(final Context context, int n, final h h, final Configuration to, final boolean b) {
        if (n != 1) {
            if (n != 2) {
                if (b) {
                    n = 0;
                }
                else {
                    n = (context.getApplicationContext().getResources().getConfiguration().uiMode & 0x30);
                }
            }
            else {
                n = 32;
            }
        }
        else {
            n = 16;
        }
        final Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        if (to != null) {
            configuration.setTo(to);
        }
        configuration.uiMode = (n | (configuration.uiMode & 0xFFFFFFCF));
        if (h != null) {
            f.f$f.d(configuration, h);
        }
        return configuration;
    }
    
    public final boolean A(final int n) {
        int n2;
        if (n == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            n2 = 108;
        }
        else if ((n2 = n) == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            n2 = 109;
        }
        if (this.R && n2 == 108) {
            return false;
        }
        if (this.N && n2 == 1) {
            this.N = false;
        }
        if (n2 == 1) {
            this.f0();
            return this.R = true;
        }
        if (n2 == 2) {
            this.f0();
            return this.L = true;
        }
        if (n2 == 5) {
            this.f0();
            return this.M = true;
        }
        if (n2 == 10) {
            this.f0();
            return this.P = true;
        }
        if (n2 == 108) {
            this.f0();
            return this.N = true;
        }
        if (n2 != 109) {
            return this.s.requestFeature(n2);
        }
        this.f0();
        return this.O = true;
    }
    
    public final void C(final int n) {
        this.U();
        final ViewGroup viewGroup = (ViewGroup)((View)this.I).findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.r).inflate(n, viewGroup);
        this.t.a(this.s.getCallback());
    }
    
    public final void D(final View view) {
        this.U();
        final ViewGroup viewGroup = (ViewGroup)((View)this.I).findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.t.a(this.s.getCallback());
    }
    
    public final void E(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.U();
        final ViewGroup viewGroup = (ViewGroup)((View)this.I).findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, viewGroup$LayoutParams);
        this.t.a(this.s.getCallback());
    }
    
    public final void F(final int a0) {
        if (this.a0 != a0) {
            this.a0 = a0;
            if (this.W) {
                this.L(true, true);
            }
        }
    }
    
    public final void G(final Toolbar toolbar) {
        if (!(this.q instanceof Activity)) {
            return;
        }
        this.Z();
        final a v = this.v;
        if (!(v instanceof y)) {
            this.w = null;
            if (v != null) {
                v.i();
            }
            this.v = null;
            if (toolbar != null) {
                final Object q = this.q;
                CharSequence charSequence;
                if (q instanceof Activity) {
                    charSequence = ((Activity)q).getTitle();
                }
                else {
                    charSequence = this.x;
                }
                final v v2 = new v(toolbar, charSequence, this.t);
                this.v = v2;
                this.t.g = (f$c)v2.c;
                toolbar.setBackInvokedCallbackEnabled(true);
            }
            else {
                this.t.g = null;
            }
            this.p();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }
    
    public final void H(final int b0) {
        this.b0 = b0;
    }
    
    public final void I(final CharSequence text) {
        this.x = text;
        final b0 y = this.y;
        if (y != null) {
            y.setWindowTitle(text);
        }
        else {
            final a v = this.v;
            if (v != null) {
                v.v(text);
            }
            else {
                final TextView j = this.J;
                if (j != null) {
                    j.setText(text);
                }
            }
        }
    }
    
    public final k.b J(final k.b.a a) {
        Label_0729: {
            if (a == null) {
                break Label_0729;
            }
            final k.b b = this.B;
            if (b != null) {
                b.c();
            }
            final e e = new e(a);
            this.Z();
            final a v = this.v;
            if (v != null) {
                final k.b x = v.x(e);
                if ((this.B = x) != null) {
                    final c u = this.u;
                    if (u != null) {
                        u.onSupportActionModeStarted(x);
                    }
                }
            }
            Label_0720: {
                if (this.B != null) {
                    break Label_0720;
                }
                final s1 f = this.F;
                if (f != null) {
                    f.b();
                }
                final k.b b2 = this.B;
                if (b2 != null) {
                    b2.c();
                }
                final c u2 = this.u;
                while (true) {
                    if (u2 == null || this.Y) {
                        break Label_0131;
                    }
                    try {
                        k.b onWindowStartingSupportActionMode = u2.onWindowStartingSupportActionMode((k.b.a)e);
                        while (true) {
                            if (onWindowStartingSupportActionMode != null) {
                                this.B = onWindowStartingSupportActionMode;
                            }
                            else {
                                final ActionBarContextView c = this.C;
                                boolean b3 = true;
                                if (c == null) {
                                    if (this.Q) {
                                        final TypedValue typedValue = new TypedValue();
                                        final Resources$Theme theme = this.r.getTheme();
                                        theme.resolveAttribute(2130968587, typedValue, true);
                                        Object r;
                                        if (typedValue.resourceId != 0) {
                                            final Resources$Theme theme2 = this.r.getResources().newTheme();
                                            theme2.setTo(theme);
                                            theme2.applyStyle(typedValue.resourceId, true);
                                            r = new k.d(this.r, 0);
                                            ((k.d)r).getTheme().setTo(theme2);
                                        }
                                        else {
                                            r = this.r;
                                        }
                                        this.C = new ActionBarContextView((Context)r, null);
                                        e4.i.d(this.D = new PopupWindow((Context)r, (AttributeSet)null, 2130968603), 2);
                                        this.D.setContentView((View)this.C);
                                        this.D.setWidth(-1);
                                        ((Context)r).getTheme().resolveAttribute(2130968581, typedValue, true);
                                        this.C.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, ((Context)r).getResources().getDisplayMetrics()));
                                        this.D.setHeight(-2);
                                        this.E = new h.i(this);
                                    }
                                    else {
                                        final ViewStubCompat viewStubCompat = (ViewStubCompat)((View)this.I).findViewById(2131427494);
                                        if (viewStubCompat != null) {
                                            this.Z();
                                            final a v2 = this.v;
                                            Context e2;
                                            if (v2 != null) {
                                                e2 = v2.e();
                                            }
                                            else {
                                                e2 = null;
                                            }
                                            Context r2 = e2;
                                            if (e2 == null) {
                                                r2 = this.r;
                                            }
                                            viewStubCompat.setLayoutInflater(LayoutInflater.from(r2));
                                            this.C = (ActionBarContextView)viewStubCompat.a();
                                        }
                                    }
                                }
                                if (this.C != null) {
                                    final s1 f2 = this.F;
                                    if (f2 != null) {
                                        f2.b();
                                    }
                                    this.C.h();
                                    final k.e b4 = new k.e(((View)this.C).getContext(), this.C, e);
                                    if (e.b(b4, b4.m)) {
                                        b4.i();
                                        this.C.f(b4);
                                        this.B = b4;
                                        Label_0559: {
                                            if (this.H) {
                                                final ViewGroup i = this.I;
                                                if (i != null) {
                                                    final WeakHashMap a2 = a4.p0.a;
                                                    if (a4.p0.g.c((View)i)) {
                                                        break Label_0559;
                                                    }
                                                }
                                            }
                                            b3 = false;
                                        }
                                        if (b3) {
                                            ((View)this.C).setAlpha(0.0f);
                                            final s1 a3 = a4.p0.a((View)this.C);
                                            a3.a(1.0f);
                                            (this.F = a3).e((t1)new h.j(this));
                                        }
                                        else {
                                            ((View)this.C).setAlpha(1.0f);
                                            this.C.setVisibility(0);
                                            if (((View)this.C).getParent() instanceof View) {
                                                final View view = (View)((View)this.C).getParent();
                                                final WeakHashMap a4 = a4.p0.a;
                                                a4.p0.h.c(view);
                                            }
                                        }
                                        if (this.D != null) {
                                            this.s.getDecorView().post((Runnable)this.E);
                                        }
                                    }
                                    else {
                                        this.B = null;
                                    }
                                }
                            }
                            final k.b b5 = this.B;
                            if (b5 != null) {
                                final c u3 = this.u;
                                if (u3 != null) {
                                    u3.onSupportActionModeStarted(b5);
                                }
                            }
                            this.g0();
                            this.B = this.B;
                            this.g0();
                            return this.B;
                            throw new IllegalArgumentException("ActionMode callback can not be null.");
                            onWindowStartingSupportActionMode = null;
                            continue;
                        }
                    }
                    catch (final AbstractMethodError abstractMethodError) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public final boolean L(final boolean b, boolean b2) {
        final boolean y = this.Y;
        final int n = 0;
        if (y) {
            return false;
        }
        int n2 = this.a0;
        if (n2 == -100) {
            n2 = h.e.g;
        }
        final int a0 = this.a0(n2, this.r);
        final int sdk_INT = Build$VERSION.SDK_INT;
        final LongSparseArray longSparseArray = null;
        h n3;
        if (sdk_INT < 33) {
            n3 = N(this.r);
        }
        else {
            n3 = null;
        }
        h b3 = n3;
        if (!b2 && (b3 = n3) != null) {
            b3 = f.f$f.b(this.r.getResources().getConfiguration());
        }
        final Configuration r = R(this.r, a0, b3, null, false);
        final Context r2 = this.r;
        final boolean d0 = this.d0;
        b2 = true;
        int c0 = 0;
        Label_0266: {
            if (!d0 && this.q instanceof Activity) {
                final PackageManager packageManager = r2.getPackageManager();
                if (packageManager == null) {
                    c0 = 0;
                    break Label_0266;
                }
                int n4;
                if (sdk_INT >= 29) {
                    n4 = 269221888;
                }
                else {
                    n4 = 786432;
                }
                try {
                    final ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(r2, (Class)this.q.getClass()), n4);
                    if (activityInfo != null) {
                        this.c0 = activityInfo.configChanges;
                    }
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", (Throwable)ex);
                    this.c0 = 0;
                }
            }
            this.d0 = true;
            c0 = this.c0;
        }
        Configuration configuration;
        if ((configuration = this.Z) == null) {
            configuration = this.r.getResources().getConfiguration();
        }
        final int uiMode = configuration.uiMode;
        final int n5 = r.uiMode & 0x30;
        final h b4 = f.f$f.b(configuration);
        h b5;
        if (b3 == null) {
            b5 = null;
        }
        else {
            b5 = f.f$f.b(r);
        }
        int n6;
        if ((uiMode & 0x30) != n5) {
            n6 = 512;
        }
        else {
            n6 = 0;
        }
        int n7 = n6;
        if (b5 != null) {
            n7 = n6;
            if (!b4.equals(b5)) {
                n7 = (n6 | 0x4 | 0x2000);
            }
        }
        boolean b6 = false;
        Label_0465: {
            if ((~c0 & n7) != 0x0 && b && this.W && (f.r0 || this.X)) {
                final Object q = this.q;
                if (q instanceof Activity && !((Activity)q).isChild()) {
                    ActivityCompat.recreate((Activity)this.q);
                    b6 = true;
                    break Label_0465;
                }
            }
            b6 = false;
        }
        if (!b6 && n7 != 0) {
            int n8 = n;
            if ((n7 & c0) == n7) {
                n8 = 1;
            }
            final Resources resources = this.r.getResources();
            final Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = ((resources.getConfiguration().uiMode & 0xFFFFFFCF) | n5);
            if (b5 != null) {
                f.f$f.d(configuration2, b5);
            }
            resources.updateConfiguration(configuration2, (DisplayMetrics)null);
            final int sdk_INT2 = Build$VERSION.SDK_INT;
            if (sdk_INT2 < 26) {
                if (sdk_INT2 < 28) {
                    if (!h.u.h) {
                        try {
                            (h.u.g = Resources.class.getDeclaredField("mResourcesImpl")).setAccessible(true);
                        }
                        catch (final NoSuchFieldException ex2) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", (Throwable)ex2);
                        }
                        h.u.h = true;
                    }
                    final Field g = h.u.g;
                    if (g != null) {
                        Object value;
                        try {
                            value = g.get(resources);
                        }
                        catch (final IllegalAccessException ex3) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", (Throwable)ex3);
                            value = null;
                        }
                        if (value != null) {
                            if (!h.u.b) {
                                try {
                                    (h.u.a = value.getClass().getDeclaredField("mDrawableCache")).setAccessible(true);
                                }
                                catch (final NoSuchFieldException ex4) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", (Throwable)ex4);
                                }
                                h.u.b = true;
                            }
                            final Field a2 = h.u.a;
                            Object value2 = null;
                            Label_0764: {
                                if (a2 != null) {
                                    try {
                                        value2 = a2.get(value);
                                        break Label_0764;
                                    }
                                    catch (final IllegalAccessException ex5) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", (Throwable)ex5);
                                    }
                                }
                                value2 = null;
                            }
                            if (value2 != null) {
                                if (!h.u.d) {
                                    try {
                                        h.u.c = Class.forName("android.content.res.ThemedResourceCache");
                                    }
                                    catch (final ClassNotFoundException ex6) {
                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", (Throwable)ex6);
                                    }
                                    h.u.d = true;
                                }
                                final Class c2 = h.u.c;
                                if (c2 != null) {
                                    if (!h.u.f) {
                                        try {
                                            (h.u.e = c2.getDeclaredField("mUnthemedEntries")).setAccessible(true);
                                        }
                                        catch (final NoSuchFieldException ex7) {
                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", (Throwable)ex7);
                                        }
                                        h.u.f = true;
                                    }
                                    final Field e = h.u.e;
                                    if (e != null) {
                                        LongSparseArray longSparseArray2;
                                        try {
                                            longSparseArray2 = (LongSparseArray)e.get(value2);
                                        }
                                        catch (final IllegalAccessException ex8) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", (Throwable)ex8);
                                            longSparseArray2 = longSparseArray;
                                        }
                                        if (longSparseArray2 != null) {
                                            u$a.a(longSparseArray2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final int b7 = this.b0;
            if (b7 != 0) {
                this.r.setTheme(b7);
                this.r.getTheme().applyStyle(this.b0, true);
            }
            b6 = b2;
            if (n8 != 0) {
                final Object q2 = this.q;
                b6 = b2;
                if (q2 instanceof Activity) {
                    final Activity activity = (Activity)q2;
                    if (activity instanceof q) {
                        b6 = b2;
                        if (((q)activity).getLifecycle().b().isAtLeast(Lifecycle.State.CREATED)) {
                            activity.onConfigurationChanged(configuration2);
                            b6 = b2;
                        }
                    }
                    else {
                        b6 = b2;
                        if (this.X) {
                            b6 = b2;
                            if (!this.Y) {
                                activity.onConfigurationChanged(configuration2);
                                b6 = b2;
                            }
                        }
                    }
                }
            }
        }
        if (b6) {
            final Object q3 = this.q;
            if (q3 instanceof androidx.appcompat.app.f) {
                if ((n7 & 0x200) != 0x0) {
                    ((androidx.appcompat.app.f)q3).onNightModeChanged(a0);
                }
                if ((n7 & 0x4) != 0x0) {
                    ((androidx.appcompat.app.f)this.q).onLocalesChanged(b3);
                }
            }
        }
        if (b6 && b5 != null) {
            f.f$f.c(f.f$f.b(this.r.getResources().getConfiguration()));
        }
        if (n2 == 0) {
            this.W(this.r).e();
        }
        else {
            final l e2 = this.e0;
            if (e2 != null) {
                ((f$k)e2).a();
            }
        }
        if (n2 == 3) {
            final Context r3 = this.r;
            if (this.f0 == null) {
                this.f0 = new j(r3);
            }
            ((f$k)this.f0).e();
        }
        else {
            final j f0 = this.f0;
            if (f0 != null) {
                ((f$k)f0).a();
            }
        }
        return b6;
    }
    
    public final void M(final Window s) {
        if (this.s != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        final Window$Callback callback = s.getCallback();
        if (!(callback instanceof i)) {
            s.setCallback((Window$Callback)(this.t = new i(callback)));
            final Context r = this.r;
            final z0 z0 = new z0(r, r.obtainStyledAttributes((AttributeSet)null, f.q0));
            final Drawable f = z0.f(0);
            if (f != null) {
                s.setBackgroundDrawable(f);
            }
            z0.n();
            this.s = s;
            if (Build$VERSION.SDK_INT >= 33) {
                final OnBackInvokedDispatcher n0 = this.n0;
                if (n0 == null) {
                    if (n0 != null) {
                        final OnBackInvokedCallback o0 = this.o0;
                        if (o0 != null) {
                            h.f.f$h.c((Object)n0, (Object)o0);
                            this.o0 = null;
                        }
                    }
                    final Object q = this.q;
                    if (q instanceof Activity && ((Activity)q).getWindow() != null) {
                        this.n0 = h.f.f$h.a((Activity)this.q);
                    }
                    else {
                        this.n0 = null;
                    }
                    this.g0();
                }
            }
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
    
    public final void O(final int n, f.f$n t, final MenuBuilder menuBuilder) {
        f.f$n f$n = t;
        MenuBuilder h = menuBuilder;
        if (menuBuilder == null) {
            f.f$n f$n2;
            if ((f$n2 = t) == null) {
                f$n2 = t;
                if (n >= 0) {
                    final f.f$n[] t2 = this.T;
                    f$n2 = t;
                    if (n < t2.length) {
                        f$n2 = t2[n];
                    }
                }
            }
            f$n = f$n2;
            h = menuBuilder;
            if (f$n2 != null) {
                h = f$n2.h;
                f$n = f$n2;
            }
        }
        if (f$n != null && !f$n.m) {
            return;
        }
        if (!this.Y) {
            t = (f.f$n)this.t;
            final Window$Callback callback = this.s.getCallback();
            t.getClass();
            try {
                ((i)t).j = true;
                callback.onPanelClosed(n, (Menu)h);
            }
            finally {
                ((i)t).j = false;
            }
        }
    }
    
    public final void P(final MenuBuilder menuBuilder) {
        if (this.S) {
            return;
        }
        this.S = true;
        this.y.m();
        final Window$Callback y = this.Y();
        if (y != null && !this.Y) {
            y.onPanelClosed(108, (Menu)menuBuilder);
        }
        this.S = false;
    }
    
    public final void Q(final f.f$n f$n, final boolean b) {
        if (b && f$n.a == 0) {
            final b0 y = this.y;
            if (y != null && y.d()) {
                this.P(f$n.h);
                return;
            }
        }
        final WindowManager windowManager = (WindowManager)this.r.getSystemService("window");
        if (windowManager != null && f$n.m) {
            final m e = f$n.e;
            if (e != null) {
                ((ViewManager)windowManager).removeView((View)e);
                if (b) {
                    this.O(f$n.a, f$n, null);
                }
            }
        }
        f$n.k = false;
        f$n.l = false;
        f$n.m = false;
        f$n.f = null;
        f$n.n = true;
        if (this.U == f$n) {
            this.U = null;
        }
        if (f$n.a == 0) {
            this.g0();
        }
    }
    
    public final boolean S(final KeyEvent keyEvent) {
        final Object q = this.q;
        final boolean b = q instanceof a4.i.a;
        final boolean b2 = true;
        boolean v = true;
        if (b || q instanceof h.m) {
            final View decorView = this.s.getDecorView();
            if (decorView != null && a4.i.a(decorView, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getKeyCode() == 82) {
            final i t = this.t;
            final Window$Callback callback = this.s.getCallback();
            t.getClass();
            try {
                t.i = true;
                final boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                t.i = false;
                if (dispatchKeyEvent) {
                    return true;
                }
            }
            finally {
                t.i = false;
            }
        }
        final int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode != 4) {
                if (keyCode == 82) {
                    boolean b3 = b2;
                    if (keyEvent.getRepeatCount() != 0) {
                        return b3;
                    }
                    final f.f$n x = this.X(0);
                    b3 = b2;
                    if (!x.m) {
                        this.e0(x, keyEvent);
                        b3 = b2;
                        return b3;
                    }
                    return b3;
                }
            }
            else {
                if ((keyEvent.getFlags() & 0x80) == 0x0) {
                    v = false;
                }
                this.V = v;
            }
        }
        else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.B != null) {
                    return b2;
                }
                final f.f$n x2 = this.X(0);
                final b0 y = this.y;
                int n = 0;
                Label_0426: {
                    if (y != null && y.b() && !ViewConfiguration.get(this.r).hasPermanentMenuKey()) {
                        if (this.y.d()) {
                            n = (this.y.e() ? 1 : 0);
                            break Label_0426;
                        }
                        if (!this.Y && this.e0(x2, keyEvent)) {
                            n = (this.y.c() ? 1 : 0);
                            break Label_0426;
                        }
                    }
                    else {
                        n = (x2.m ? 1 : 0);
                        if (n != 0 || x2.l) {
                            this.Q(x2, true);
                            break Label_0426;
                        }
                        if (x2.k) {
                            boolean e0;
                            if (x2.o) {
                                x2.k = false;
                                e0 = this.e0(x2, keyEvent);
                            }
                            else {
                                e0 = true;
                            }
                            if (e0) {
                                this.c0(x2, keyEvent);
                                n = 1;
                                break Label_0426;
                            }
                        }
                    }
                    n = 0;
                }
                boolean b3 = b2;
                if (n == 0) {
                    return b3;
                }
                final AudioManager audioManager = (AudioManager)this.r.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    b3 = b2;
                    return b3;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                b3 = b2;
                return b3;
            }
        }
        else if (this.b0()) {
            return b2;
        }
        return false;
    }
    
    public final void T(final int n) {
        final f.f$n x = this.X(n);
        if (x.h != null) {
            final Bundle p = new Bundle();
            x.h.saveActionViewStates(p);
            if (((BaseBundle)p).size() > 0) {
                x.p = p;
            }
            x.h.stopDispatchingItemsChanged();
            x.h.clear();
        }
        x.o = true;
        x.n = true;
        if ((n == 108 || n == 0) && this.y != null) {
            final f.f$n x2 = this.X(0);
            x2.k = false;
            this.e0(x2, null);
        }
    }
    
    public final void U() {
        if (!this.H) {
            final TypedArray obtainStyledAttributes = this.r.obtainStyledAttributes(gn.a.Z);
            if (!obtainStyledAttributes.hasValue(117)) {
                obtainStyledAttributes.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (obtainStyledAttributes.getBoolean(126, false)) {
                this.A(1);
            }
            else if (obtainStyledAttributes.getBoolean(117, false)) {
                this.A(108);
            }
            if (obtainStyledAttributes.getBoolean(118, false)) {
                this.A(109);
            }
            if (obtainStyledAttributes.getBoolean(119, false)) {
                this.A(10);
            }
            this.Q = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            this.V();
            this.s.getDecorView();
            final LayoutInflater from = LayoutInflater.from(this.r);
            ViewGroup viewGroup;
            if (!this.R) {
                if (this.Q) {
                    viewGroup = (ViewGroup)from.inflate(2131623998, (ViewGroup)null);
                    this.O = false;
                    this.N = false;
                }
                else if (this.N) {
                    final TypedValue typedValue = new TypedValue();
                    this.r.getTheme().resolveAttribute(2130968587, typedValue, true);
                    Object r;
                    if (typedValue.resourceId != 0) {
                        r = new k.d(this.r, typedValue.resourceId);
                    }
                    else {
                        r = this.r;
                    }
                    final ViewGroup viewGroup2 = (ViewGroup)LayoutInflater.from((Context)r).inflate(2131624009, (ViewGroup)null);
                    (this.y = (b0)((View)viewGroup2).findViewById(2131428653)).setWindowCallback(this.Y());
                    if (this.O) {
                        this.y.k(109);
                    }
                    if (this.L) {
                        this.y.k(2);
                    }
                    viewGroup = viewGroup2;
                    if (this.M) {
                        this.y.k(5);
                        viewGroup = viewGroup2;
                    }
                }
                else {
                    viewGroup = null;
                }
            }
            else if (this.P) {
                viewGroup = (ViewGroup)from.inflate(2131624008, (ViewGroup)null);
            }
            else {
                viewGroup = (ViewGroup)from.inflate(2131624007, (ViewGroup)null);
            }
            if (viewGroup == null) {
                final StringBuilder k = a.k("AppCompat does not support the current theme features: { windowActionBar: ");
                k.append(this.N);
                k.append(", windowActionBarOverlay: ");
                k.append(this.O);
                k.append(", android:windowIsFloating: ");
                k.append(this.Q);
                k.append(", windowActionModeOverlay: ");
                k.append(this.P);
                k.append(", windowNoTitle: ");
                k.append(this.R);
                k.append(" }");
                throw new IllegalArgumentException(k.toString());
            }
            final h.g g = new h.g(this);
            final WeakHashMap a = a4.p0.a;
            a4.p0.i.u((View)viewGroup, g);
            if (this.y == null) {
                this.J = (TextView)((View)viewGroup).findViewById(2131431743);
            }
            final Method a2 = i1.a;
            try {
                final Method method = ((View)viewGroup).getClass().getMethod("makeOptionalFitsSystemWindows", (Class<?>[])new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(viewGroup, new Object[0]);
            }
            catch (final IllegalAccessException ex) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", (Throwable)ex);
            }
            catch (final InvocationTargetException ex2) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", (Throwable)ex2);
            }
            catch (final NoSuchMethodException ex3) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            }
            final ContentFrameLayout contentFrameLayout = (ContentFrameLayout)((View)viewGroup).findViewById(2131427432);
            final ViewGroup viewGroup3 = (ViewGroup)this.s.findViewById(16908290);
            if (viewGroup3 != null) {
                while (viewGroup3.getChildCount() > 0) {
                    final View child = viewGroup3.getChildAt(0);
                    viewGroup3.removeViewAt(0);
                    ((ViewGroup)contentFrameLayout).addView(child);
                }
                ((View)viewGroup3).setId(-1);
                ((View)contentFrameLayout).setId(16908290);
                if (viewGroup3 instanceof FrameLayout) {
                    ((View)viewGroup3).setForeground((Drawable)null);
                }
            }
            this.s.setContentView((View)viewGroup);
            contentFrameLayout.setAttachListener((ContentFrameLayout.a)new h.h(this));
            this.I = viewGroup;
            final Object q = this.q;
            CharSequence charSequence;
            if (q instanceof Activity) {
                charSequence = ((Activity)q).getTitle();
            }
            else {
                charSequence = this.x;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                final b0 y = this.y;
                if (y != null) {
                    y.setWindowTitle(charSequence);
                }
                else {
                    final a v = this.v;
                    if (v != null) {
                        v.v(charSequence);
                    }
                    else {
                        final TextView j = this.J;
                        if (j != null) {
                            j.setText(charSequence);
                        }
                    }
                }
            }
            final ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout)((View)this.I).findViewById(16908290);
            final View decorView = this.s.getDecorView();
            contentFrameLayout2.l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            final WeakHashMap a3 = a4.p0.a;
            if (a4.p0.g.c((View)contentFrameLayout2)) {
                ((View)contentFrameLayout2).requestLayout();
            }
            final TypedArray obtainStyledAttributes2 = this.r.obtainStyledAttributes(gn.a.Z);
            obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
            obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
            if (obtainStyledAttributes2.hasValue(122)) {
                obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
            }
            if (obtainStyledAttributes2.hasValue(123)) {
                obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
            }
            if (obtainStyledAttributes2.hasValue(120)) {
                obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
            }
            if (obtainStyledAttributes2.hasValue(121)) {
                obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
            }
            obtainStyledAttributes2.recycle();
            ((View)contentFrameLayout2).requestLayout();
            this.H = true;
            final f.f$n x = this.X(0);
            if (!this.Y && x.h == null) {
                this.h0 |= 0x1000;
                if (!this.g0) {
                    a4.p0.d.m(this.s.getDecorView(), (Runnable)this.i0);
                    this.g0 = true;
                }
            }
        }
    }
    
    public final void V() {
        if (this.s == null) {
            final Object q = this.q;
            if (q instanceof Activity) {
                this.M(((Activity)q).getWindow());
            }
        }
        if (this.s != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }
    
    public final f$k W(Context applicationContext) {
        if (this.e0 == null) {
            if (h.x.d == null) {
                applicationContext = applicationContext.getApplicationContext();
                h.x.d = new x(applicationContext, (LocationManager)applicationContext.getSystemService("location"));
            }
            this.e0 = new l(h.x.d);
        }
        return (f$k)this.e0;
    }
    
    public final f.f$n X(final int n) {
        final f.f$n[] t = this.T;
        f.f$n[] t2 = null;
        Label_0042: {
            if (t != null) {
                t2 = t;
                if (t.length > n) {
                    break Label_0042;
                }
            }
            t2 = new f.f$n[n + 1];
            if (t != null) {
                System.arraycopy(t, 0, t2, 0, t.length);
            }
            this.T = t2;
        }
        f.f$n f$n;
        if ((f$n = t2[n]) == null) {
            f$n = new f.f$n(n);
            t2[n] = f$n;
        }
        return f$n;
    }
    
    public final Window$Callback Y() {
        return this.s.getCallback();
    }
    
    public final void Z() {
        this.U();
        if (this.N) {
            if (this.v == null) {
                final Object q = this.q;
                if (q instanceof Activity) {
                    this.v = new y((Activity)this.q, this.O);
                }
                else if (q instanceof Dialog) {
                    this.v = new y((Dialog)this.q);
                }
                final a v = this.v;
                if (v != null) {
                    v.m(this.j0);
                }
            }
        }
    }
    
    public final boolean a(final MenuBuilder menuBuilder, final MenuItem menuItem) {
        final Window$Callback y = this.Y();
        if (y != null && !this.Y) {
            final MenuBuilder rootMenu = menuBuilder.getRootMenu();
            final f.f$n[] t = this.T;
            int length;
            int i;
            if (t != null) {
                length = t.length;
                i = 0;
            }
            else {
                length = (i = 0);
            }
            while (true) {
                while (i < length) {
                    final f.f$n f$n = t[i];
                    if (f$n != null && f$n.h == rootMenu) {
                        if (f$n != null) {
                            return y.onMenuItemSelected(f$n.a, menuItem);
                        }
                        return false;
                    }
                    else {
                        ++i;
                    }
                }
                final f.f$n f$n = null;
                continue;
            }
        }
        return false;
    }
    
    public final int a0(final int n, final Context context) {
        if (n != -100) {
            int c;
            if ((c = n) != -1) {
                if (n != 0) {
                    c = n;
                    if (n != 1 && (c = n) != 2) {
                        if (n == 3) {
                            if (this.f0 == null) {
                                this.f0 = new j(context);
                            }
                            return this.f0.c();
                        }
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
                else {
                    if (((UiModeManager)context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                        return -1;
                    }
                    c = this.W(context).c();
                }
            }
            return c;
        }
        return -1;
    }
    
    public final void b(final MenuBuilder menuBuilder) {
        final b0 y = this.y;
        if (y != null && y.b() && (!ViewConfiguration.get(this.r).hasPermanentMenuKey() || this.y.g())) {
            final Window$Callback y2 = this.Y();
            if (this.y.d()) {
                this.y.e();
                if (!this.Y) {
                    y2.onPanelClosed(108, (Menu)this.X(0).h);
                }
            }
            else if (y2 != null && !this.Y) {
                if (this.g0 && (0x1 & this.h0) != 0x0) {
                    this.s.getDecorView().removeCallbacks((Runnable)this.i0);
                    this.i0.run();
                }
                final f.f$n x = this.X(0);
                final MenuBuilder h = x.h;
                if (h != null && !x.o && y2.onPreparePanel(0, x.g, (Menu)h)) {
                    y2.onMenuOpened(108, (Menu)x.h);
                    this.y.c();
                }
            }
        }
        else {
            final f.f$n x2 = this.X(0);
            x2.n = true;
            this.Q(x2, false);
            this.c0(x2, null);
        }
    }
    
    public final boolean b0() {
        final boolean v = this.V;
        this.V = false;
        final f.f$n x = this.X(0);
        if (x.m) {
            if (!v) {
                this.Q(x, true);
            }
            return true;
        }
        final k.b b = this.B;
        if (b != null) {
            b.c();
            return true;
        }
        this.Z();
        final a v2 = this.v;
        return v2 != null && v2.b();
    }
    
    public final void c(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.U();
        ((ViewGroup)((View)this.I).findViewById(16908290)).addView(view, viewGroup$LayoutParams);
        this.t.a(this.s.getCallback());
    }
    
    public final void c0(final f.f$n f$n, final KeyEvent keyEvent) {
        if (!f$n.m) {
            if (!this.Y) {
                if (f$n.a == 0 && (this.r.getResources().getConfiguration().screenLayout & 0xF) == 0x4) {
                    return;
                }
                final Window$Callback y = this.Y();
                if (y != null && !y.onMenuOpened(f$n.a, (Menu)f$n.h)) {
                    this.Q(f$n, true);
                    return;
                }
                final WindowManager windowManager = (WindowManager)this.r.getSystemService("window");
                if (windowManager == null) {
                    return;
                }
                if (!this.e0(f$n, keyEvent)) {
                    return;
                }
                final m e = f$n.e;
                int n = 0;
                Label_0785: {
                    Label_0782: {
                        if (e == null || f$n.n) {
                            if (e == null) {
                                this.Z();
                                final a v = this.v;
                                Context e2;
                                if (v != null) {
                                    e2 = v.e();
                                }
                                else {
                                    e2 = null;
                                }
                                Context r = e2;
                                if (e2 == null) {
                                    r = this.r;
                                }
                                final TypedValue typedValue = new TypedValue();
                                final Resources$Theme theme = r.getResources().newTheme();
                                theme.setTo(r.getTheme());
                                theme.resolveAttribute(2130968580, typedValue, true);
                                final int resourceId = typedValue.resourceId;
                                if (resourceId != 0) {
                                    theme.applyStyle(resourceId, true);
                                }
                                theme.resolveAttribute(2130969459, typedValue, true);
                                final int resourceId2 = typedValue.resourceId;
                                if (resourceId2 != 0) {
                                    theme.applyStyle(resourceId2, true);
                                }
                                else {
                                    theme.applyStyle(2132017852, true);
                                }
                                final k.d j = new k.d(r, 0);
                                j.getTheme().setTo(theme);
                                f$n.j = j;
                                final TypedArray obtainStyledAttributes = ((Context)j).obtainStyledAttributes(gn.a.Z);
                                f$n.b = obtainStyledAttributes.getResourceId(86, 0);
                                f$n.d = obtainStyledAttributes.getResourceId(1, 0);
                                obtainStyledAttributes.recycle();
                                f$n.e = new m(f$n.j);
                                f$n.c = 81;
                            }
                            else if (f$n.n && ((ViewGroup)e).getChildCount() > 0) {
                                ((ViewGroup)f$n.e).removeAllViews();
                            }
                            final View g = f$n.g;
                            boolean b = false;
                            Label_0609: {
                                Label_0602: {
                                    if (g == null) {
                                        if (f$n.h != null) {
                                            if (this.A == null) {
                                                this.A = new o();
                                            }
                                            final o a = this.A;
                                            if (f$n.i == null) {
                                                final androidx.appcompat.view.menu.d i = new androidx.appcompat.view.menu.d((Context)f$n.j);
                                                f$n.i = i;
                                                i.j = (i$a)a;
                                                f$n.h.addMenuPresenter((androidx.appcompat.view.menu.i)i);
                                            }
                                            final androidx.appcompat.view.menu.d k = f$n.i;
                                            final m e3 = f$n.e;
                                            if (k.i == null) {
                                                k.i = (ExpandedMenuView)k.g.inflate(2131623999, (ViewGroup)e3, false);
                                                if (k.k == null) {
                                                    k.k = new d$a(k);
                                                }
                                                ((AbsListView)k.i).setAdapter((ListAdapter)k.k);
                                                ((AdapterView)k.i).setOnItemClickListener((AdapterView$OnItemClickListener)k);
                                            }
                                            if ((f$n.f = (View)k.i) != null) {
                                                break Label_0602;
                                            }
                                        }
                                        b = false;
                                        break Label_0609;
                                    }
                                    f$n.f = g;
                                }
                                b = true;
                            }
                            if (b) {
                                boolean b2 = false;
                                Label_0674: {
                                    Label_0672: {
                                        if (f$n.f != null) {
                                            if (f$n.g == null) {
                                                final androidx.appcompat.view.menu.d l = f$n.i;
                                                if (l.k == null) {
                                                    l.k = new d$a(l);
                                                }
                                                if (l.k.getCount() <= 0) {
                                                    break Label_0672;
                                                }
                                            }
                                            b2 = true;
                                            break Label_0674;
                                        }
                                    }
                                    b2 = false;
                                }
                                if (b2) {
                                    ViewGroup$LayoutParams layoutParams;
                                    if ((layoutParams = f$n.f.getLayoutParams()) == null) {
                                        layoutParams = new ViewGroup$LayoutParams(-2, -2);
                                    }
                                    f$n.e.setBackgroundResource(f$n.b);
                                    final ViewParent parent = f$n.f.getParent();
                                    if (parent instanceof ViewGroup) {
                                        ((ViewGroup)parent).removeView(f$n.f);
                                    }
                                    ((ViewGroup)f$n.e).addView(f$n.f, layoutParams);
                                    if (!f$n.f.hasFocus()) {
                                        f$n.f.requestFocus();
                                    }
                                    break Label_0782;
                                }
                            }
                            f$n.n = true;
                            return;
                        }
                        final View g2 = f$n.g;
                        if (g2 != null) {
                            final ViewGroup$LayoutParams layoutParams2 = g2.getLayoutParams();
                            if (layoutParams2 != null && layoutParams2.width == -1) {
                                n = -1;
                                break Label_0785;
                            }
                        }
                    }
                    n = -2;
                }
                f$n.l = false;
                final WindowManager$LayoutParams windowManager$LayoutParams = new WindowManager$LayoutParams(n, -2, 0, 0, 1002, 8519680, -3);
                windowManager$LayoutParams.gravity = f$n.c;
                windowManager$LayoutParams.windowAnimations = f$n.d;
                ((ViewManager)windowManager).addView((View)f$n.e, (ViewGroup$LayoutParams)windowManager$LayoutParams);
                f$n.m = true;
                if (f$n.a == 0) {
                    this.g0();
                }
            }
        }
    }
    
    public final void d() {
        if (h.e.q(this.r)) {
            final h h = h.e.h;
            if (h != null && !h.equals(h.e.i)) {
                h.e.f.execute((Runnable)new androidx.activity.g((Object)this.r, 1));
            }
        }
        this.L(true, true);
    }
    
    public final boolean d0(final f.f$n f$n, final int n, final KeyEvent keyEvent) {
        final boolean system = keyEvent.isSystem();
        final boolean b = false;
        if (system) {
            return false;
        }
        if (!f$n.k) {
            final boolean performShortcut = b;
            if (!this.e0(f$n, keyEvent)) {
                return performShortcut;
            }
        }
        final MenuBuilder h = f$n.h;
        boolean performShortcut = b;
        if (h != null) {
            performShortcut = h.performShortcut(n, keyEvent, 1);
        }
        return performShortcut;
    }
    
    public final Context e(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_1       
        //     2: putfield        h/f.W:Z
        //     5: aload_0        
        //     6: getfield        h/f.a0:I
        //     9: istore_2       
        //    10: iload_2        
        //    11: bipush          -100
        //    13: if_icmpeq       19
        //    16: goto            23
        //    19: getstatic       h/e.g:I
        //    22: istore_2       
        //    23: aload_0        
        //    24: iload_2        
        //    25: aload_1        
        //    26: invokevirtual   h/f.a0:(ILandroid/content/Context;)I
        //    29: istore_2       
        //    30: aload_1        
        //    31: invokestatic    h/e.q:(Landroid/content/Context;)Z
        //    34: ifeq            41
        //    37: aload_1        
        //    38: invokestatic    h/e.K:(Landroid/content/Context;)V
        //    41: aload_1        
        //    42: invokestatic    h/f.N:(Landroid/content/Context;)Lv3/h;
        //    45: astore_3       
        //    46: getstatic       h/f.s0:Z
        //    49: ifeq            80
        //    52: aload_1        
        //    53: instanceof      Landroid/view/ContextThemeWrapper;
        //    56: ifeq            80
        //    59: aload_1        
        //    60: iload_2        
        //    61: aload_3        
        //    62: aconst_null    
        //    63: iconst_0       
        //    64: invokestatic    h/f.R:(Landroid/content/Context;ILv3/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
        //    67: astore          4
        //    69: aload_1        
        //    70: checkcast       Landroid/view/ContextThemeWrapper;
        //    73: aload           4
        //    75: invokevirtual   android/view/ContextThemeWrapper.applyOverrideConfiguration:(Landroid/content/res/Configuration;)V
        //    78: aload_1        
        //    79: areturn        
        //    80: aload_1        
        //    81: instanceof      Lk/d;
        //    84: ifeq            108
        //    87: aload_1        
        //    88: iload_2        
        //    89: aload_3        
        //    90: aconst_null    
        //    91: iconst_0       
        //    92: invokestatic    h/f.R:(Landroid/content/Context;ILv3/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
        //    95: astore          4
        //    97: aload_1        
        //    98: checkcast       Lk/d;
        //   101: aload           4
        //   103: invokevirtual   k/d.a:(Landroid/content/res/Configuration;)V
        //   106: aload_1        
        //   107: areturn        
        //   108: getstatic       h/f.r0:Z
        //   111: ifne            116
        //   114: aload_1        
        //   115: areturn        
        //   116: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   119: istore          5
        //   121: new             Landroid/content/res/Configuration;
        //   124: dup            
        //   125: invokespecial   android/content/res/Configuration.<init>:()V
        //   128: astore          4
        //   130: aload           4
        //   132: iconst_m1      
        //   133: putfield        android/content/res/Configuration.uiMode:I
        //   136: aload           4
        //   138: fconst_0       
        //   139: putfield        android/content/res/Configuration.fontScale:F
        //   142: aload_1        
        //   143: aload           4
        //   145: invokevirtual   android/content/Context.createConfigurationContext:(Landroid/content/res/Configuration;)Landroid/content/Context;
        //   148: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   151: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //   154: astore          6
        //   156: aload_1        
        //   157: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   160: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //   163: astore          4
        //   165: aload           6
        //   167: aload           4
        //   169: getfield        android/content/res/Configuration.uiMode:I
        //   172: putfield        android/content/res/Configuration.uiMode:I
        //   175: aload           6
        //   177: aload           4
        //   179: invokevirtual   android/content/res/Configuration.equals:(Landroid/content/res/Configuration;)Z
        //   182: ifne            862
        //   185: new             Landroid/content/res/Configuration;
        //   188: dup            
        //   189: invokespecial   android/content/res/Configuration.<init>:()V
        //   192: astore          7
        //   194: aload           7
        //   196: fconst_0       
        //   197: putfield        android/content/res/Configuration.fontScale:F
        //   200: aload           6
        //   202: aload           4
        //   204: invokevirtual   android/content/res/Configuration.diff:(Landroid/content/res/Configuration;)I
        //   207: ifne            217
        //   210: aload           7
        //   212: astore          4
        //   214: goto            865
        //   217: aload           6
        //   219: getfield        android/content/res/Configuration.fontScale:F
        //   222: fstore          8
        //   224: aload           4
        //   226: getfield        android/content/res/Configuration.fontScale:F
        //   229: fstore          9
        //   231: fload           8
        //   233: fload           9
        //   235: fcmpl          
        //   236: ifeq            246
        //   239: aload           7
        //   241: fload           9
        //   243: putfield        android/content/res/Configuration.fontScale:F
        //   246: aload           6
        //   248: getfield        android/content/res/Configuration.mcc:I
        //   251: istore          10
        //   253: aload           4
        //   255: getfield        android/content/res/Configuration.mcc:I
        //   258: istore          11
        //   260: iload           10
        //   262: iload           11
        //   264: if_icmpeq       274
        //   267: aload           7
        //   269: iload           11
        //   271: putfield        android/content/res/Configuration.mcc:I
        //   274: aload           6
        //   276: getfield        android/content/res/Configuration.mnc:I
        //   279: istore          10
        //   281: aload           4
        //   283: getfield        android/content/res/Configuration.mnc:I
        //   286: istore          11
        //   288: iload           10
        //   290: iload           11
        //   292: if_icmpeq       302
        //   295: aload           7
        //   297: iload           11
        //   299: putfield        android/content/res/Configuration.mnc:I
        //   302: aload           6
        //   304: aload           4
        //   306: aload           7
        //   308: invokestatic    h/f$f.a:(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V
        //   311: aload           6
        //   313: getfield        android/content/res/Configuration.touchscreen:I
        //   316: istore          11
        //   318: aload           4
        //   320: getfield        android/content/res/Configuration.touchscreen:I
        //   323: istore          10
        //   325: iload           11
        //   327: iload           10
        //   329: if_icmpeq       339
        //   332: aload           7
        //   334: iload           10
        //   336: putfield        android/content/res/Configuration.touchscreen:I
        //   339: aload           6
        //   341: getfield        android/content/res/Configuration.keyboard:I
        //   344: istore          11
        //   346: aload           4
        //   348: getfield        android/content/res/Configuration.keyboard:I
        //   351: istore          10
        //   353: iload           11
        //   355: iload           10
        //   357: if_icmpeq       367
        //   360: aload           7
        //   362: iload           10
        //   364: putfield        android/content/res/Configuration.keyboard:I
        //   367: aload           6
        //   369: getfield        android/content/res/Configuration.keyboardHidden:I
        //   372: istore          10
        //   374: aload           4
        //   376: getfield        android/content/res/Configuration.keyboardHidden:I
        //   379: istore          11
        //   381: iload           10
        //   383: iload           11
        //   385: if_icmpeq       395
        //   388: aload           7
        //   390: iload           11
        //   392: putfield        android/content/res/Configuration.keyboardHidden:I
        //   395: aload           6
        //   397: getfield        android/content/res/Configuration.navigation:I
        //   400: istore          10
        //   402: aload           4
        //   404: getfield        android/content/res/Configuration.navigation:I
        //   407: istore          11
        //   409: iload           10
        //   411: iload           11
        //   413: if_icmpeq       423
        //   416: aload           7
        //   418: iload           11
        //   420: putfield        android/content/res/Configuration.navigation:I
        //   423: aload           6
        //   425: getfield        android/content/res/Configuration.navigationHidden:I
        //   428: istore          11
        //   430: aload           4
        //   432: getfield        android/content/res/Configuration.navigationHidden:I
        //   435: istore          10
        //   437: iload           11
        //   439: iload           10
        //   441: if_icmpeq       451
        //   444: aload           7
        //   446: iload           10
        //   448: putfield        android/content/res/Configuration.navigationHidden:I
        //   451: aload           6
        //   453: getfield        android/content/res/Configuration.orientation:I
        //   456: istore          10
        //   458: aload           4
        //   460: getfield        android/content/res/Configuration.orientation:I
        //   463: istore          11
        //   465: iload           10
        //   467: iload           11
        //   469: if_icmpeq       479
        //   472: aload           7
        //   474: iload           11
        //   476: putfield        android/content/res/Configuration.orientation:I
        //   479: aload           6
        //   481: getfield        android/content/res/Configuration.screenLayout:I
        //   484: istore          10
        //   486: aload           4
        //   488: getfield        android/content/res/Configuration.screenLayout:I
        //   491: bipush          15
        //   493: iand           
        //   494: istore          11
        //   496: iload           10
        //   498: bipush          15
        //   500: iand           
        //   501: iload           11
        //   503: if_icmpeq       519
        //   506: aload           7
        //   508: aload           7
        //   510: getfield        android/content/res/Configuration.screenLayout:I
        //   513: iload           11
        //   515: ior            
        //   516: putfield        android/content/res/Configuration.screenLayout:I
        //   519: aload           6
        //   521: getfield        android/content/res/Configuration.screenLayout:I
        //   524: istore          10
        //   526: aload           4
        //   528: getfield        android/content/res/Configuration.screenLayout:I
        //   531: sipush          192
        //   534: iand           
        //   535: istore          11
        //   537: iload           10
        //   539: sipush          192
        //   542: iand           
        //   543: iload           11
        //   545: if_icmpeq       561
        //   548: aload           7
        //   550: aload           7
        //   552: getfield        android/content/res/Configuration.screenLayout:I
        //   555: iload           11
        //   557: ior            
        //   558: putfield        android/content/res/Configuration.screenLayout:I
        //   561: aload           6
        //   563: getfield        android/content/res/Configuration.screenLayout:I
        //   566: istore          11
        //   568: aload           4
        //   570: getfield        android/content/res/Configuration.screenLayout:I
        //   573: bipush          48
        //   575: iand           
        //   576: istore          10
        //   578: iload           11
        //   580: bipush          48
        //   582: iand           
        //   583: iload           10
        //   585: if_icmpeq       601
        //   588: aload           7
        //   590: aload           7
        //   592: getfield        android/content/res/Configuration.screenLayout:I
        //   595: iload           10
        //   597: ior            
        //   598: putfield        android/content/res/Configuration.screenLayout:I
        //   601: aload           6
        //   603: getfield        android/content/res/Configuration.screenLayout:I
        //   606: istore          11
        //   608: aload           4
        //   610: getfield        android/content/res/Configuration.screenLayout:I
        //   613: sipush          768
        //   616: iand           
        //   617: istore          10
        //   619: iload           11
        //   621: sipush          768
        //   624: iand           
        //   625: iload           10
        //   627: if_icmpeq       643
        //   630: aload           7
        //   632: aload           7
        //   634: getfield        android/content/res/Configuration.screenLayout:I
        //   637: iload           10
        //   639: ior            
        //   640: putfield        android/content/res/Configuration.screenLayout:I
        //   643: iload           5
        //   645: bipush          26
        //   647: if_icmplt       659
        //   650: aload           6
        //   652: aload           4
        //   654: aload           7
        //   656: invokestatic    h/f$g.a:(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V
        //   659: aload           6
        //   661: getfield        android/content/res/Configuration.uiMode:I
        //   664: istore          5
        //   666: aload           4
        //   668: getfield        android/content/res/Configuration.uiMode:I
        //   671: bipush          15
        //   673: iand           
        //   674: istore          10
        //   676: iload           5
        //   678: bipush          15
        //   680: iand           
        //   681: iload           10
        //   683: if_icmpeq       699
        //   686: aload           7
        //   688: aload           7
        //   690: getfield        android/content/res/Configuration.uiMode:I
        //   693: iload           10
        //   695: ior            
        //   696: putfield        android/content/res/Configuration.uiMode:I
        //   699: aload           6
        //   701: getfield        android/content/res/Configuration.uiMode:I
        //   704: istore          5
        //   706: aload           4
        //   708: getfield        android/content/res/Configuration.uiMode:I
        //   711: bipush          48
        //   713: iand           
        //   714: istore          10
        //   716: iload           5
        //   718: bipush          48
        //   720: iand           
        //   721: iload           10
        //   723: if_icmpeq       739
        //   726: aload           7
        //   728: aload           7
        //   730: getfield        android/content/res/Configuration.uiMode:I
        //   733: iload           10
        //   735: ior            
        //   736: putfield        android/content/res/Configuration.uiMode:I
        //   739: aload           6
        //   741: getfield        android/content/res/Configuration.screenWidthDp:I
        //   744: istore          10
        //   746: aload           4
        //   748: getfield        android/content/res/Configuration.screenWidthDp:I
        //   751: istore          5
        //   753: iload           10
        //   755: iload           5
        //   757: if_icmpeq       767
        //   760: aload           7
        //   762: iload           5
        //   764: putfield        android/content/res/Configuration.screenWidthDp:I
        //   767: aload           6
        //   769: getfield        android/content/res/Configuration.screenHeightDp:I
        //   772: istore          5
        //   774: aload           4
        //   776: getfield        android/content/res/Configuration.screenHeightDp:I
        //   779: istore          10
        //   781: iload           5
        //   783: iload           10
        //   785: if_icmpeq       795
        //   788: aload           7
        //   790: iload           10
        //   792: putfield        android/content/res/Configuration.screenHeightDp:I
        //   795: aload           6
        //   797: getfield        android/content/res/Configuration.smallestScreenWidthDp:I
        //   800: istore          5
        //   802: aload           4
        //   804: getfield        android/content/res/Configuration.smallestScreenWidthDp:I
        //   807: istore          10
        //   809: iload           5
        //   811: iload           10
        //   813: if_icmpeq       823
        //   816: aload           7
        //   818: iload           10
        //   820: putfield        android/content/res/Configuration.smallestScreenWidthDp:I
        //   823: aload           6
        //   825: getfield        android/content/res/Configuration.densityDpi:I
        //   828: istore          10
        //   830: aload           4
        //   832: getfield        android/content/res/Configuration.densityDpi:I
        //   835: istore          5
        //   837: aload           7
        //   839: astore          4
        //   841: iload           10
        //   843: iload           5
        //   845: if_icmpeq       865
        //   848: aload           7
        //   850: iload           5
        //   852: putfield        android/content/res/Configuration.densityDpi:I
        //   855: aload           7
        //   857: astore          4
        //   859: goto            865
        //   862: aconst_null    
        //   863: astore          4
        //   865: aload_1        
        //   866: iload_2        
        //   867: aload_3        
        //   868: aload           4
        //   870: iconst_1       
        //   871: invokestatic    h/f.R:(Landroid/content/Context;ILv3/h;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
        //   874: astore          7
        //   876: new             Lk/d;
        //   879: dup            
        //   880: aload_1        
        //   881: ldc_w           2132017864
        //   884: invokespecial   k/d.<init>:(Landroid/content/Context;I)V
        //   887: astore          4
        //   889: aload           4
        //   891: aload           7
        //   893: invokevirtual   k/d.a:(Landroid/content/res/Configuration;)V
        //   896: aload_1        
        //   897: invokevirtual   android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
        //   900: astore_1       
        //   901: aload_1        
        //   902: ifnull          910
        //   905: iconst_1       
        //   906: istore_2       
        //   907: goto            912
        //   910: iconst_0       
        //   911: istore_2       
        //   912: iload_2        
        //   913: ifeq            1050
        //   916: aload           4
        //   918: invokevirtual   k/d.getTheme:()Landroid/content/res/Resources$Theme;
        //   921: astore_1       
        //   922: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   925: bipush          29
        //   927: if_icmplt       937
        //   930: aload_1        
        //   931: invokestatic    p3/j.a:(Landroid/content/res/Resources$Theme;)V
        //   934: goto            1050
        //   937: getstatic       p3/i.a:Ljava/lang/Object;
        //   940: astore          7
        //   942: aload           7
        //   944: monitorenter   
        //   945: getstatic       p3/i.c:Z
        //   948: istore          12
        //   950: iload           12
        //   952: ifne            997
        //   955: ldc_w           Landroid/content/res/Resources$Theme;.class
        //   958: ldc_w           "rebase"
        //   961: iconst_0       
        //   962: anewarray       Ljava/lang/Class;
        //   965: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   968: astore_3       
        //   969: aload_3        
        //   970: putstatic       p3/i.b:Ljava/lang/reflect/Method;
        //   973: aload_3        
        //   974: iconst_1       
        //   975: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   978: goto            993
        //   981: astore_3       
        //   982: ldc_w           "ResourcesCompat"
        //   985: ldc_w           "Failed to retrieve rebase() method"
        //   988: aload_3        
        //   989: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   992: pop            
        //   993: iconst_1       
        //   994: putstatic       p3/i.c:Z
        //   997: getstatic       p3/i.b:Ljava/lang/reflect/Method;
        //  1000: astore_3       
        //  1001: aload_3        
        //  1002: ifnull          1038
        //  1005: aload_3        
        //  1006: aload_1        
        //  1007: iconst_0       
        //  1008: anewarray       Ljava/lang/Object;
        //  1011: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //  1014: pop            
        //  1015: goto            1038
        //  1018: astore_1       
        //  1019: goto            1023
        //  1022: astore_1       
        //  1023: ldc_w           "ResourcesCompat"
        //  1026: ldc_w           "Failed to invoke rebase() method via reflection"
        //  1029: aload_1        
        //  1030: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1033: pop            
        //  1034: aconst_null    
        //  1035: putstatic       p3/i.b:Ljava/lang/reflect/Method;
        //  1038: aload           7
        //  1040: monitorexit    
        //  1041: goto            1050
        //  1044: astore_1       
        //  1045: aload           7
        //  1047: monitorexit    
        //  1048: aload_1        
        //  1049: athrow         
        //  1050: aload           4
        //  1052: areturn        
        //  1053: astore          4
        //  1055: goto            80
        //  1058: astore          4
        //  1060: goto            108
        //  1063: astore_1       
        //  1064: goto            910
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  69     78     1053   1058   Ljava/lang/IllegalStateException;
        //  97     106    1058   1063   Ljava/lang/IllegalStateException;
        //  896    901    1063   1067   Ljava/lang/NullPointerException;
        //  945    950    1044   1050   Any
        //  955    978    981    993    Ljava/lang/NoSuchMethodException;
        //  955    978    1044   1050   Any
        //  982    993    1044   1050   Any
        //  993    997    1044   1050   Any
        //  997    1001   1044   1050   Any
        //  1005   1015   1022   1023   Ljava/lang/IllegalAccessException;
        //  1005   1015   1018   1022   Ljava/lang/reflect/InvocationTargetException;
        //  1005   1015   1044   1050   Any
        //  1023   1038   1044   1050   Any
        //  1038   1041   1044   1050   Any
        //  1045   1048   1044   1050   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 498, Size: 498
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    public final boolean e0(final f.f$n u, final KeyEvent keyEvent) {
        if (this.Y) {
            return false;
        }
        if (u.k) {
            return true;
        }
        final f.f$n u2 = this.U;
        if (u2 != null && u2 != u) {
            this.Q(u2, false);
        }
        final Window$Callback y = this.Y();
        if (y != null) {
            u.g = y.onCreatePanelView(u.a);
        }
        final int a = u.a;
        final boolean b = a == 0 || a == 108;
        if (b) {
            final b0 y2 = this.y;
            if (y2 != null) {
                y2.f();
            }
        }
        if (u.g == null && (!b || !(this.v instanceof v))) {
            final MenuBuilder h = u.h;
            if (h == null || u.o) {
                if (h == null) {
                    final Context r = this.r;
                    final int a2 = u.a;
                    Object o = null;
                    Label_0356: {
                        if (a2 != 0) {
                            o = r;
                            if (a2 != 108) {
                                break Label_0356;
                            }
                        }
                        o = r;
                        if (this.y != null) {
                            final TypedValue typedValue = new TypedValue();
                            final Resources$Theme theme = r.getTheme();
                            theme.resolveAttribute(2130968587, typedValue, true);
                            Resources$Theme theme2;
                            if (typedValue.resourceId != 0) {
                                theme2 = r.getResources().newTheme();
                                theme2.setTo(theme);
                                theme2.applyStyle(typedValue.resourceId, true);
                                theme2.resolveAttribute(2130968588, typedValue, true);
                            }
                            else {
                                theme.resolveAttribute(2130968588, typedValue, true);
                                theme2 = null;
                            }
                            Resources$Theme theme3 = theme2;
                            if (typedValue.resourceId != 0) {
                                if ((theme3 = theme2) == null) {
                                    theme3 = r.getResources().newTheme();
                                    theme3.setTo(theme);
                                }
                                theme3.applyStyle(typedValue.resourceId, true);
                            }
                            o = r;
                            if (theme3 != null) {
                                o = new k.d(r, 0);
                                ((k.d)o).getTheme().setTo(theme3);
                            }
                        }
                    }
                    final MenuBuilder h2 = new MenuBuilder((Context)o);
                    h2.setCallback((MenuBuilder.MenuBuilder$a)this);
                    final MenuBuilder h3 = u.h;
                    if (h2 != h3) {
                        if (h3 != null) {
                            h3.removeMenuPresenter((androidx.appcompat.view.menu.i)u.i);
                        }
                        u.h = h2;
                        final androidx.appcompat.view.menu.d i = u.i;
                        if (i != null) {
                            h2.addMenuPresenter((androidx.appcompat.view.menu.i)i);
                        }
                    }
                    if (u.h == null) {
                        return false;
                    }
                }
                if (b) {
                    final b0 y3 = this.y;
                    if (y3 != null) {
                        if (this.z == null) {
                            this.z = new d();
                        }
                        y3.a(u.h, this.z);
                    }
                }
                u.h.stopDispatchingItemsChanged();
                if (!y.onCreatePanelMenu(u.a, (Menu)u.h)) {
                    final MenuBuilder h4 = u.h;
                    if (h4 != null) {
                        if (h4 != null) {
                            h4.removeMenuPresenter((androidx.appcompat.view.menu.i)u.i);
                        }
                        u.h = null;
                    }
                    if (b) {
                        final b0 y4 = this.y;
                        if (y4 != null) {
                            y4.a(null, this.z);
                        }
                    }
                    return false;
                }
                u.o = false;
            }
            u.h.stopDispatchingItemsChanged();
            final Bundle p2 = u.p;
            if (p2 != null) {
                u.h.restoreActionViewStates(p2);
                u.p = null;
            }
            if (!y.onPreparePanel(0, u.g, (Menu)u.h)) {
                if (b) {
                    final b0 y5 = this.y;
                    if (y5 != null) {
                        y5.a(null, this.z);
                    }
                }
                u.h.startDispatchingItemsChanged();
                return false;
            }
            int deviceId;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            }
            else {
                deviceId = -1;
            }
            u.h.setQwertyMode(KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
            u.h.startDispatchingItemsChanged();
        }
        u.k = true;
        u.l = false;
        this.U = u;
        return true;
    }
    
    public final View f(String string, final Context context, final AttributeSet set) {
        if (this.m0 == null) {
            final String string2 = this.r.obtainStyledAttributes(gn.a.Z).getString(116);
            if (string2 == null) {
                this.m0 = new h.o();
            }
            else {
                try {
                    this.m0 = (h.o)this.r.getClassLoader().loadClass(string2).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                }
                finally {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string2);
                    sb.append(". Falling back to default.");
                    final Throwable t;
                    Log.i("AppCompatDelegate", sb.toString(), t);
                    this.m0 = new h.o();
                }
            }
        }
        final h.o m0 = this.m0;
        final int a = h1.a;
        m0.getClass();
        int n = 4;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, gn.a.p0, 0, 0);
        final int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Object o;
        if (resourceId != 0 && (!(context instanceof k.d) || ((k.d)context).a != resourceId)) {
            o = new k.d(context, resourceId);
        }
        else {
            o = context;
        }
        string.getClass();
        Label_0650: {
            switch (string) {
                case "Button": {
                    n = 13;
                    break Label_0650;
                }
                case "EditText": {
                    n = 12;
                    break Label_0650;
                }
                case "CheckBox": {
                    n = 11;
                    break Label_0650;
                }
                case "AutoCompleteTextView": {
                    n = 10;
                    break Label_0650;
                }
                case "ImageView": {
                    n = 9;
                    break Label_0650;
                }
                case "ToggleButton": {
                    n = 8;
                    break Label_0650;
                }
                case "RadioButton": {
                    n = 7;
                    break Label_0650;
                }
                case "Spinner": {
                    n = 6;
                    break Label_0650;
                }
                case "SeekBar": {
                    n = 5;
                    break Label_0650;
                }
                case "ImageButton": {
                    break Label_0650;
                }
                case "TextView": {
                    n = 3;
                    break Label_0650;
                }
                case "MultiAutoCompleteTextView": {
                    n = 2;
                    break Label_0650;
                }
                case "CheckedTextView": {
                    n = 1;
                    break Label_0650;
                }
                case "RatingBar": {
                    n = 0;
                    break Label_0650;
                }
                default:
                    break;
            }
            n = -1;
        }
        final View view = null;
        Object o2 = null;
        switch (n) {
            default: {
                o2 = null;
                break;
            }
            case 13: {
                o2 = m0.b((Context)o, set);
                m0.g((TextView)o2, string);
                break;
            }
            case 12: {
                o2 = new androidx.appcompat.widget.j((Context)o, set);
                break;
            }
            case 11: {
                o2 = m0.c((Context)o, set);
                m0.g((TextView)o2, string);
                break;
            }
            case 10: {
                o2 = m0.a((Context)o, set);
                m0.g((TextView)o2, string);
                break;
            }
            case 9: {
                o2 = new AppCompatImageView((Context)o, set);
                break;
            }
            case 8: {
                o2 = new a0((Context)o, set);
                break;
            }
            case 7: {
                o2 = m0.d((Context)o, set);
                m0.g((TextView)o2, string);
                break;
            }
            case 6: {
                o2 = new AppCompatSpinner((Context)o, set);
                break;
            }
            case 5: {
                o2 = new AppCompatSeekBar((Context)o, set);
                break;
            }
            case 4: {
                o2 = new AppCompatImageButton((Context)o, set);
                break;
            }
            case 3: {
                o2 = m0.e((Context)o, set);
                m0.g((TextView)o2, string);
                break;
            }
            case 2: {
                o2 = new n((Context)o, set);
                break;
            }
            case 1: {
                o2 = new AppCompatCheckedTextView((Context)o, set);
                break;
            }
            case 0: {
                o2 = new r((Context)o, set);
                break;
            }
        }
        Object o3 = o2;
        if (o2 == null) {
            o3 = o2;
            if (context != o) {
                String attributeValue = string;
                if (string.equals("view")) {
                    attributeValue = set.getAttributeValue((String)null, "class");
                }
                View view2 = null;
                try {
                    final Object[] a2 = m0.a;
                    a2[0] = o;
                    a2[1] = set;
                    if (-1 == attributeValue.indexOf(46)) {
                        int n2 = 0;
                        while (true) {
                            final String[] g = h.o.g;
                            if (n2 >= 3) {
                                final Object[] a3 = m0.a;
                                a3[1] = (a3[0] = null);
                                break;
                            }
                            if (m0.f((Context)o, attributeValue, g[n2]) != null) {
                                break;
                            }
                            ++n2;
                        }
                    }
                    else {
                        m0.f((Context)o, attributeValue, (String)null);
                    }
                }
                catch (final Exception ex) {
                    final Object[] a4 = m0.a;
                    a4[1] = (a4[0] = null);
                    view2 = view;
                }
                finally {
                    final Object[] a5 = m0.a;
                    a5[1] = (a5[0] = null);
                }
                o3 = view2;
            }
        }
        if (o3 != null) {
            final Context context2 = ((View)o3).getContext();
            if (context2 instanceof ContextWrapper) {
                final WeakHashMap a6 = a4.p0.a;
                if (a4.p0.c.a((View)o3)) {
                    final TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(set, h.o.c);
                    string = obtainStyledAttributes2.getString(0);
                    if (string != null) {
                        ((View)o3).setOnClickListener((View$OnClickListener)new o$a((View)o3, string));
                    }
                    obtainStyledAttributes2.recycle();
                }
            }
            if (Build$VERSION.SDK_INT <= 28) {
                final TypedArray obtainStyledAttributes3 = ((Context)o).obtainStyledAttributes(set, h.o.d);
                if (obtainStyledAttributes3.hasValue(0)) {
                    final boolean boolean1 = obtainStyledAttributes3.getBoolean(0, false);
                    final WeakHashMap a7 = a4.p0.a;
                    ((p0.b<Boolean>)new o0()).e((View)o3, Boolean.valueOf(boolean1));
                }
                obtainStyledAttributes3.recycle();
                final TypedArray obtainStyledAttributes4 = ((Context)o).obtainStyledAttributes(set, h.o.e);
                if (obtainStyledAttributes4.hasValue(0)) {
                    a4.p0.m((View)o3, (CharSequence)obtainStyledAttributes4.getString(0));
                }
                obtainStyledAttributes4.recycle();
                final TypedArray obtainStyledAttributes5 = ((Context)o).obtainStyledAttributes(set, h.o.f);
                if (obtainStyledAttributes5.hasValue(0)) {
                    final boolean boolean2 = obtainStyledAttributes5.getBoolean(0, false);
                    final WeakHashMap a8 = a4.p0.a;
                    ((p0.b<Boolean>)new l0()).e((View)o3, Boolean.valueOf(boolean2));
                }
                obtainStyledAttributes5.recycle();
            }
        }
        return (View)o3;
    }
    
    public final void f0() {
        if (!this.H) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
    
    public final <T extends View> T g(final int n) {
        this.U();
        return (T)this.s.findViewById(n);
    }
    
    public final void g0() {
        if (Build$VERSION.SDK_INT >= 33) {
            final OnBackInvokedDispatcher n0 = this.n0;
            boolean b = false;
            Label_0045: {
                if (n0 != null) {
                    if (!this.X(0).m) {
                        if (this.B == null) {
                            break Label_0045;
                        }
                    }
                    b = true;
                }
            }
            if (b && this.o0 == null) {
                this.o0 = f.f$h.b((Object)this.n0, this);
            }
            else if (!b) {
                final OnBackInvokedCallback o0 = this.o0;
                if (o0 != null) {
                    f.f$h.c((Object)this.n0, (Object)o0);
                }
            }
        }
    }
    
    public final Context i() {
        return this.r;
    }
    
    public final b j() {
        return new b();
    }
    
    public final int k() {
        return this.a0;
    }
    
    public final MenuInflater m() {
        if (this.w == null) {
            this.Z();
            final a v = this.v;
            Context context;
            if (v != null) {
                context = v.e();
            }
            else {
                context = this.r;
            }
            this.w = new g(context);
        }
        return this.w;
    }
    
    public final a n() {
        this.Z();
        return this.v;
    }
    
    public final void o() {
        final LayoutInflater from = LayoutInflater.from(this.r);
        if (from.getFactory() == null) {
            from.setFactory2((LayoutInflater$Factory2)this);
        }
        else if (!(from.getFactory2() instanceof f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }
    
    public final View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        return this.f(s, context, set);
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.f(s, context, set);
    }
    
    public final void p() {
        if (this.v != null) {
            this.Z();
            if (!this.v.g()) {
                this.h0 |= 0x1;
                if (!this.g0) {
                    final View decorView = this.s.getDecorView();
                    final f$a i0 = this.i0;
                    final WeakHashMap a = a4.p0.a;
                    a4.p0.d.m(decorView, (Runnable)i0);
                    this.g0 = true;
                }
            }
        }
    }
    
    public final void r(Configuration a) {
        if (this.N && this.H) {
            this.Z();
            final a v = this.v;
            if (v != null) {
                v.h();
            }
        }
        a = (Configuration)androidx.appcompat.widget.i.a();
        final Context r = this.r;
        synchronized (a) {
            ((androidx.appcompat.widget.i)a).a.onConfigurationChanged(r);
            monitorexit(a);
            this.Z = new Configuration(this.r.getResources().getConfiguration());
            this.L(false, false);
        }
    }
    
    public final void s() {
        this.L(false, this.W = true);
        this.V();
        final Object q = this.q;
        Label_0105: {
            if (!(q instanceof Activity)) {
                break Label_0105;
            }
            Object o = null;
            while (true) {
                try {
                    o = NavUtils.getParentActivityName((Activity)q);
                    if (o != null) {
                        o = this.v;
                        if (o == null) {
                            this.j0 = true;
                        }
                        else {
                            ((a)o).m(true);
                        }
                    }
                    synchronized (h.e.o) {
                        h.e.z((h.e)this);
                        h.e.n.add((Object)new WeakReference(this));
                    }
                    this.Z = new Configuration(this.r.getResources().getConfiguration());
                    this.X = true;
                }
                catch (final IllegalArgumentException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void t() {
        if (this.q instanceof Activity) {
            synchronized (h.e.o) {
                h.e.z((h.e)this);
            }
        }
        if (this.g0) {
            this.s.getDecorView().removeCallbacks((Runnable)this.i0);
        }
        this.Y = true;
        Label_0132: {
            if (this.a0 != -100) {
                final Object q = this.q;
                if (q instanceof Activity && ((Activity)q).isChangingConfigurations()) {
                    f.p0.put((Object)this.q.getClass().getName(), (Object)this.a0);
                    break Label_0132;
                }
            }
            f.p0.remove((Object)this.q.getClass().getName());
        }
        final a v = this.v;
        if (v != null) {
            v.i();
        }
        final l e0 = this.e0;
        if (e0 != null) {
            ((f$k)e0).a();
        }
        final j f0 = this.f0;
        if (f0 != null) {
            ((f$k)f0).a();
        }
    }
    
    public final void u() {
        this.U();
    }
    
    public final void v() {
        this.Z();
        final a v = this.v;
        if (v != null) {
            v.t(true);
        }
    }
    
    public final void w() {
    }
    
    public final void x() {
        this.L(true, false);
    }
    
    public final void y() {
        this.Z();
        final a v = this.v;
        if (v != null) {
            v.t(false);
        }
    }
    
    public final class b implements h.b
    {
    }
    
    public final class d implements i$a
    {
        public final void b(final MenuBuilder menuBuilder, final boolean b) {
            h.f.this.P(menuBuilder);
        }
        
        public final boolean c(final MenuBuilder menuBuilder) {
            final Window$Callback y = h.f.this.Y();
            if (y != null) {
                y.onMenuOpened(108, (Menu)menuBuilder);
            }
            return true;
        }
    }
    
    public final class e implements a
    {
        public a a;
        
        public e(final a a) {
            this.a = a;
        }
        
        @Override
        public final boolean a(final b b, final MenuBuilder menuBuilder) {
            final ViewGroup i = f.this.I;
            final WeakHashMap a = a4.p0.a;
            a4.p0.h.c((View)i);
            return this.a.a(b, menuBuilder);
        }
        
        @Override
        public final boolean b(final b b, final MenuBuilder menuBuilder) {
            return this.a.b(b, menuBuilder);
        }
        
        @Override
        public final boolean c(final b b, final MenuItem menuItem) {
            return this.a.c(b, menuItem);
        }
        
        @Override
        public final void d(final b b) {
            this.a.d(b);
            final f b2 = f.this;
            if (b2.D != null) {
                b2.s.getDecorView().removeCallbacks((Runnable)f.this.E);
            }
            final f b3 = f.this;
            if (b3.C != null) {
                final s1 f = b3.F;
                if (f != null) {
                    f.b();
                }
                final f b4 = h.f.this;
                final s1 a = a4.p0.a((View)b4.C);
                a.a(0.0f);
                b4.F = a;
                h.f.this.F.e((t1)new u1() {
                    public final void j() {
                        f.this.C.setVisibility(8);
                        final f b = f.this;
                        final PopupWindow d = b.D;
                        if (d != null) {
                            d.dismiss();
                        }
                        else if (((View)b.C).getParent() instanceof View) {
                            final View view = (View)((View)f.this.C).getParent();
                            final WeakHashMap a = a4.p0.a;
                            a4.p0.h.c(view);
                        }
                        f.this.C.h();
                        f.this.F.e((t1)null);
                        final f b2 = f.this;
                        b2.F = null;
                        final ViewGroup i = b2.I;
                        final WeakHashMap a2 = a4.p0.a;
                        a4.p0.h.c((View)i);
                    }
                });
            }
            final f b5 = f.this;
            final c u = b5.u;
            if (u != null) {
                u.onSupportActionModeFinished(b5.B);
            }
            final f b6 = f.this;
            b6.B = null;
            final ViewGroup i = b6.I;
            final WeakHashMap a2 = a4.p0.a;
            a4.p0.h.c((View)i);
            f.this.g0();
        }
    }
    
    public final class i extends k.i
    {
        public f$c g;
        public boolean h;
        public boolean i;
        public boolean j;
        
        public i(final Window$Callback window$Callback) {
            super(window$Callback);
        }
        
        public final void a(final Window$Callback window$Callback) {
            try {
                this.h = true;
                window$Callback.onContentChanged();
            }
            finally {
                this.h = false;
            }
        }
        
        @Override
        public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
            if (this.i) {
                return super.f.dispatchKeyEvent(keyEvent);
            }
            return f.this.S(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }
        
        @Override
        public final boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
            final boolean dispatchKeyShortcutEvent = super.dispatchKeyShortcutEvent(keyEvent);
            boolean b = false;
            if (!dispatchKeyShortcutEvent) {
                final f k = f.this;
                final int keyCode = keyEvent.getKeyCode();
                k.Z();
                final h.a v = k.v;
                boolean b2 = false;
                Label_0157: {
                    Label_0148: {
                        if (v == null || !v.j(keyCode, keyEvent)) {
                            final f.f$n u = k.U;
                            if (u == null || !k.d0(u, keyEvent.getKeyCode(), keyEvent)) {
                                if (k.U == null) {
                                    final f.f$n x = k.X(0);
                                    k.e0(x, keyEvent);
                                    final boolean d0 = k.d0(x, keyEvent.getKeyCode(), keyEvent);
                                    x.k = false;
                                    if (d0) {
                                        break Label_0148;
                                    }
                                }
                                b2 = false;
                                break Label_0157;
                            }
                            final f.f$n u2 = k.U;
                            if (u2 != null) {
                                u2.l = true;
                            }
                        }
                    }
                    b2 = true;
                }
                if (!b2) {
                    return b;
                }
            }
            b = true;
            return b;
        }
        
        public final void onContentChanged() {
            if (this.h) {
                super.f.onContentChanged();
            }
        }
        
        @Override
        public final boolean onCreatePanelMenu(final int n, final Menu menu) {
            return (n != 0 || menu instanceof MenuBuilder) && super.onCreatePanelMenu(n, menu);
        }
        
        @Override
        public final View onCreatePanelView(final int n) {
            final f$c g = this.g;
            if (g != null) {
                final v.e e = (v.e)g;
                View view;
                if (n == 0) {
                    view = new View(e.a.a.getContext());
                }
                else {
                    view = null;
                }
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(n);
        }
        
        @Override
        public final boolean onMenuOpened(final int n, final Menu menu) {
            super.onMenuOpened(n, menu);
            final f k = f.this;
            if (n == 108) {
                k.Z();
                final h.a v = k.v;
                if (v != null) {
                    v.c(true);
                }
            }
            else {
                k.getClass();
            }
            return true;
        }
        
        @Override
        public final void onPanelClosed(final int n, final Menu menu) {
            if (this.j) {
                super.f.onPanelClosed(n, menu);
                return;
            }
            super.onPanelClosed(n, menu);
            final f k = f.this;
            if (n == 108) {
                k.Z();
                final h.a v = k.v;
                if (v != null) {
                    v.c(false);
                }
            }
            else if (n == 0) {
                final f.f$n x = k.X(n);
                if (x.m) {
                    k.Q(x, false);
                }
            }
            else {
                k.getClass();
            }
        }
        
        @Override
        public final boolean onPreparePanel(final int n, final View view, final Menu menu) {
            MenuBuilder menuBuilder;
            if (menu instanceof MenuBuilder) {
                menuBuilder = (MenuBuilder)menu;
            }
            else {
                menuBuilder = null;
            }
            if (n == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            final f$c g = this.g;
            if (g != null) {
                final v.e e = (v.e)g;
                if (n == 0) {
                    final v a = e.a;
                    if (!a.d) {
                        a.a.m = true;
                        a.d = true;
                    }
                }
            }
            final boolean onPreparePanel = super.onPreparePanel(n, view, menu);
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(false);
            }
            return onPreparePanel;
        }
        
        @Override
        public final void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> list, final Menu menu, final int n) {
            final MenuBuilder h = f.this.X(0).h;
            if (h != null) {
                super.onProvideKeyboardShortcuts(list, (Menu)h, n);
            }
            else {
                super.onProvideKeyboardShortcuts(list, menu, n);
            }
        }
        
        public final ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
            return null;
        }
        
        @Override
        public final ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback, final int n) {
            final f k = f.this;
            if (k.G && n == 0) {
                final k.f.a a = new k.f.a(k.r, actionMode$Callback);
                final b j = f.this.J(a);
                k.f e;
                if (j != null) {
                    e = a.e(j);
                }
                else {
                    e = null;
                }
                return e;
            }
            return super.onWindowStartingActionMode(actionMode$Callback, n);
        }
    }
    
    public final class j extends f$k
    {
        public final PowerManager c;
        
        public j(final Context context) {
            super(f.this);
            this.c = (PowerManager)context.getApplicationContext().getSystemService("power");
        }
        
        public final IntentFilter b() {
            final IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }
        
        public final int c() {
            int n;
            if (this.c.isPowerSaveMode()) {
                n = 2;
            }
            else {
                n = 1;
            }
            return n;
        }
        
        public final void d() {
            f.this.L(true, true);
        }
    }
    
    public final class l extends f$k
    {
        public final x c;
        
        public l(final x c) {
            super(f.this);
            this.c = c;
        }
        
        public final IntentFilter b() {
            final IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }
        
        public final int c() {
            final x c = this.c;
            final x$a c2 = c.c;
            final long b = c2.b;
            final long currentTimeMillis = System.currentTimeMillis();
            final int n = 0;
            boolean a = false;
            final int n2 = 1;
            int n3 = 0;
            Label_0491: {
                if (b > currentTimeMillis) {
                    n3 = (c2.a ? 1 : 0);
                }
                else {
                    final int w = at1.a.W(c.a, "android.permission.ACCESS_COARSE_LOCATION");
                    final Location location = null;
                    Location lastKnownLocation = null;
                    if (w == 0) {
                        Label_0119: {
                            try {
                                if (c.b.isProviderEnabled("network")) {
                                    lastKnownLocation = c.b.getLastKnownLocation("network");
                                    break Label_0119;
                                }
                            }
                            catch (final Exception ex) {
                                Log.d("TwilightManager", "Failed to get last known location", (Throwable)ex);
                            }
                            lastKnownLocation = null;
                        }
                    }
                    else {
                        lastKnownLocation = null;
                    }
                    Location lastKnownLocation2 = location;
                    if (at1.a.W(c.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        lastKnownLocation2 = location;
                        try {
                            if (c.b.isProviderEnabled("gps")) {
                                lastKnownLocation2 = c.b.getLastKnownLocation("gps");
                            }
                        }
                        catch (final Exception ex2) {
                            Log.d("TwilightManager", "Failed to get last known location", (Throwable)ex2);
                            lastKnownLocation2 = location;
                        }
                    }
                    Location location2 = null;
                    Label_0231: {
                        if (lastKnownLocation2 != null && lastKnownLocation != null) {
                            location2 = lastKnownLocation;
                            if (lastKnownLocation2.getTime() <= lastKnownLocation.getTime()) {
                                break Label_0231;
                            }
                        }
                        else {
                            location2 = lastKnownLocation;
                            if (lastKnownLocation2 == null) {
                                break Label_0231;
                            }
                        }
                        location2 = lastKnownLocation2;
                    }
                    if (location2 != null) {
                        final x$a c3 = c.c;
                        final long currentTimeMillis2 = System.currentTimeMillis();
                        if (h.w.d == null) {
                            h.w.d = new w();
                        }
                        final w d = h.w.d;
                        d.a(location2.getLatitude(), location2.getLongitude(), currentTimeMillis2 - 86400000L);
                        d.a(location2.getLatitude(), location2.getLongitude(), currentTimeMillis2);
                        if (d.c == 1) {
                            a = true;
                        }
                        final long b2 = d.b;
                        final long a2 = d.a;
                        d.a(location2.getLatitude(), location2.getLongitude(), currentTimeMillis2 + 86400000L);
                        final long b3 = d.b;
                        long b4;
                        if (b2 != -1L && a2 != -1L) {
                            long n4;
                            if (currentTimeMillis2 > a2) {
                                n4 = b3 + 0L;
                            }
                            else if (currentTimeMillis2 > b2) {
                                n4 = a2 + 0L;
                            }
                            else {
                                n4 = b2 + 0L;
                            }
                            b4 = n4 + 60000L;
                        }
                        else {
                            b4 = 43200000L + currentTimeMillis2;
                        }
                        c3.a = a;
                        c3.b = b4;
                        n3 = (c2.a ? 1 : 0);
                    }
                    else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        final int value = Calendar.getInstance().get(11);
                        if (value >= 6) {
                            n3 = n;
                            if (value < 22) {
                                break Label_0491;
                            }
                        }
                        n3 = 1;
                    }
                }
            }
            int n5 = n2;
            if (n3 != 0) {
                n5 = 2;
            }
            return n5;
        }
        
        public final void d() {
            f.this.L(true, true);
        }
    }
    
    public final class m extends ContentFrameLayout
    {
        public m(final k.d d) {
            super((Context)d, null);
        }
        
        public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
            return f.this.S(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }
        
        public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                final int n = (int)motionEvent.getX();
                final int n2 = (int)motionEvent.getY();
                if (n < -5 || n2 < -5 || n > ((View)this).getWidth() + 5 || n2 > ((View)this).getHeight() + 5) {
                    final f n3 = f.this;
                    n3.Q(n3.X(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        
        public final void setBackgroundResource(final int n) {
            ((View)this).setBackgroundDrawable(eg.n0.L(((View)this).getContext(), n));
        }
    }
    
    public final class o implements i$a
    {
        public final void b(MenuBuilder menuBuilder, final boolean b) {
            final MenuBuilder rootMenu = menuBuilder.getRootMenu();
            int i = 0;
            final boolean b2 = rootMenu != menuBuilder;
            final f f = h.f.this;
            if (b2) {
                menuBuilder = rootMenu;
            }
            final f.f$n[] t = f.T;
            int length;
            if (t != null) {
                length = t.length;
            }
            else {
                length = 0;
            }
            while (true) {
                while (i < length) {
                    final f.f$n f$n = t[i];
                    if (f$n != null && f$n.h == menuBuilder) {
                        final f.f$n f$n2 = f$n;
                        if (f$n2 != null) {
                            if (b2) {
                                h.f.this.O(f$n2.a, f$n2, rootMenu);
                                h.f.this.Q(f$n2, true);
                            }
                            else {
                                h.f.this.Q(f$n2, b);
                            }
                        }
                        return;
                    }
                    ++i;
                }
                final f.f$n f$n2 = null;
                continue;
            }
        }
        
        public final boolean c(final MenuBuilder menuBuilder) {
            if (menuBuilder == menuBuilder.getRootMenu()) {
                final f f = h.f.this;
                if (f.N) {
                    final Window$Callback y = f.Y();
                    if (y != null && !h.f.this.Y) {
                        y.onMenuOpened(108, (Menu)menuBuilder);
                    }
                }
            }
            return true;
        }
    }
}
