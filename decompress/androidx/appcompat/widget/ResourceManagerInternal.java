// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import j0.g;
import android.content.res.Resources$Theme;
import android.graphics.ColorFilter;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.content.res.Resources;
import android.util.Log;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import u5.e;
import hg1.a;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.content.res.ColorStateList;
import j0.j;
import android.graphics.drawable.Drawable$ConstantState;
import java.lang.ref.WeakReference;
import j0.f;
import android.content.Context;
import java.util.WeakHashMap;
import j0.i;
import android.graphics.PorterDuff$Mode;

public final class ResourceManagerInternal
{
    private static final ResourceManagerInternal.ResourceManagerInternal$a COLOR_FILTER_CACHE;
    private static final boolean DEBUG = false;
    private static final PorterDuff$Mode DEFAULT_MODE;
    private static ResourceManagerInternal INSTANCE;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "ResourceManagerInternal";
    private i<String, b> mDelegates;
    private final WeakHashMap<Context, f<WeakReference<Drawable$ConstantState>>> mDrawableCaches;
    private boolean mHasCheckedVectorDrawableSetup;
    private c mHooks;
    private j<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, j<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;
    
    static {
        DEFAULT_MODE = PorterDuff$Mode.SRC_IN;
        COLOR_FILTER_CACHE = new ResourceManagerInternal.ResourceManagerInternal$a();
    }
    
    public ResourceManagerInternal() {
        this.mDrawableCaches = new WeakHashMap<Context, f<WeakReference<Drawable$ConstantState>>>(0);
    }
    
    private void addDelegate(final String s, final b b) {
        if (this.mDelegates == null) {
            this.mDelegates = (i<String, b>)new i();
        }
        this.mDelegates.put((Object)s, (Object)b);
    }
    
    private boolean addDrawableToCache(final Context context, final long n, final Drawable drawable) {
        synchronized (this) {
            final Drawable$ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                f f;
                if ((f = this.mDrawableCaches.get(context)) == null) {
                    f = new f();
                    this.mDrawableCaches.put(context, (f<WeakReference<Drawable$ConstantState>>)f);
                }
                f.g(n, (Object)new WeakReference(constantState));
                return true;
            }
            return false;
        }
    }
    
    private void addTintListToCache(final Context context, final int n, final ColorStateList list) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap<Context, j<ColorStateList>>();
        }
        j j;
        if ((j = this.mTintLists.get(context)) == null) {
            j = new j();
            this.mTintLists.put(context, (j<ColorStateList>)j);
        }
        j.a(n, (Object)list);
    }
    
    private void checkVectorDrawableSetup(final Context context) {
        if (this.mHasCheckedVectorDrawableSetup) {
            return;
        }
        this.mHasCheckedVectorDrawableSetup = true;
        final Drawable drawable = this.getDrawable(context, 2131230905);
        if (drawable != null && isVectorDrawable(drawable)) {
            return;
        }
        this.mHasCheckedVectorDrawableSetup = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }
    
    private static long createCacheKey(final TypedValue typedValue) {
        return (long)typedValue.assetCookie << 32 | (long)typedValue.data;
    }
    
    private Drawable createDrawableIfNeeded(final Context context, final int n) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        final TypedValue mTypedValue = this.mTypedValue;
        context.getResources().getValue(n, mTypedValue, true);
        final long cacheKey = createCacheKey(mTypedValue);
        final Drawable cachedDrawable = this.getCachedDrawable(context, cacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        final c mHooks = this.mHooks;
        Object o = null;
        if (mHooks != null) {
            if (n == 2131230843) {
                o = new LayerDrawable(new Drawable[] { this.getDrawable(context, 2131230842), this.getDrawable(context, 2131230844) });
            }
            else if (n == 2131230878) {
                o = i$a.c(this, context, 2131165244);
            }
            else if (n == 2131230877) {
                o = i$a.c(this, context, 2131165245);
            }
            else if (n == 2131230879) {
                o = i$a.c(this, context, 2131165246);
            }
        }
        if (o != null) {
            ((Drawable)o).setChangingConfigurations(mTypedValue.changingConfigurations);
            this.addDrawableToCache(context, cacheKey, (Drawable)o);
        }
        return (Drawable)o;
    }
    
    private static PorterDuffColorFilter createTintFilter(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode, final int[] array) {
        if (list != null && porterDuff$Mode != null) {
            return getPorterDuffColorFilter(list.getColorForState(array, 0), porterDuff$Mode);
        }
        return null;
    }
    
    public static ResourceManagerInternal get() {
        synchronized (ResourceManagerInternal.class) {
            if (ResourceManagerInternal.INSTANCE == null) {
                installDefaultInflateDelegates(ResourceManagerInternal.INSTANCE = new ResourceManagerInternal());
            }
            return ResourceManagerInternal.INSTANCE;
        }
    }
    
    private Drawable getCachedDrawable(final Context context, final long n) {
        synchronized (this) {
            final f f = this.mDrawableCaches.get(context);
            if (f == null) {
                return null;
            }
            final WeakReference weakReference = (WeakReference)f.e(n, (Long)null);
            if (weakReference != null) {
                final Drawable$ConstantState drawable$ConstantState = (Drawable$ConstantState)weakReference.get();
                if (drawable$ConstantState != null) {
                    return drawable$ConstantState.newDrawable(context.getResources());
                }
                final int f2 = a.f(f.i, n, f.g);
                if (f2 >= 0) {
                    final Object[] h = f.h;
                    final Object o = h[f2];
                    final Object j = j0.f.j;
                    if (o != j) {
                        h[f2] = j;
                        f.f = true;
                    }
                }
            }
            return null;
        }
    }
    
    public static PorterDuffColorFilter getPorterDuffColorFilter(final int n, final PorterDuff$Mode porterDuff$Mode) {
        synchronized (ResourceManagerInternal.class) {
            final ResourceManagerInternal.ResourceManagerInternal$a color_FILTER_CACHE = ResourceManagerInternal.COLOR_FILTER_CACHE;
            color_FILTER_CACHE.getClass();
            final int n2 = (n + 31) * 31;
            PorterDuffColorFilter porterDuffColorFilter;
            if ((porterDuffColorFilter = (PorterDuffColorFilter)((g)color_FILTER_CACHE).get((Object)(porterDuff$Mode.hashCode() + n2))) == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(n, porterDuff$Mode);
                color_FILTER_CACHE.getClass();
                final PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter)((g)color_FILTER_CACHE).put((Object)(porterDuff$Mode.hashCode() + n2), (Object)porterDuffColorFilter);
            }
            return porterDuffColorFilter;
        }
    }
    
    private ColorStateList getTintListFromCache(final Context context, final int n) {
        final WeakHashMap<Context, j<ColorStateList>> mTintLists = this.mTintLists;
        ColorStateList list = null;
        if (mTintLists != null) {
            final j j = mTintLists.get(context);
            list = list;
            if (j != null) {
                list = (ColorStateList)j.f(n, (Integer)null);
            }
        }
        return list;
    }
    
    private static void installDefaultInflateDelegates(final ResourceManagerInternal resourceManagerInternal) {
    }
    
    private static boolean isVectorDrawable(final Drawable drawable) {
        return drawable instanceof e || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }
    
    private Drawable loadDrawableFromDelegates(final Context context, final int n) {
        final i<String, b> mDelegates = this.mDelegates;
        if (mDelegates == null || mDelegates.isEmpty()) {
            return null;
        }
        final j<String> mKnownDrawableIdTags = this.mKnownDrawableIdTags;
        if (mKnownDrawableIdTags != null) {
            final String s = (String)mKnownDrawableIdTags.f(n, (Integer)null);
            if ("appcompat_skip_skip".equals(s) || (s != null && this.mDelegates.getOrDefault((Object)s, (Object)null) == null)) {
                return null;
            }
        }
        else {
            this.mKnownDrawableIdTags = (j<String>)new j();
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        final TypedValue mTypedValue = this.mTypedValue;
        final Resources resources = context.getResources();
        resources.getValue(n, mTypedValue, true);
        final long cacheKey = createCacheKey(mTypedValue);
        final Drawable cachedDrawable = this.getCachedDrawable(context, cacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        final CharSequence string = mTypedValue.string;
        Drawable drawable = cachedDrawable;
        if (string != null) {
            drawable = cachedDrawable;
            if (string.toString().endsWith(".xml")) {
                drawable = cachedDrawable;
                try {
                    final XmlResourceParser xml = resources.getXml(n);
                    drawable = cachedDrawable;
                    final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
                    int next;
                    do {
                        drawable = cachedDrawable;
                        next = ((XmlPullParser)xml).next();
                    } while (next != 2 && next != 1);
                    if (next != 2) {
                        drawable = cachedDrawable;
                        drawable = cachedDrawable;
                        final XmlPullParserException ex = new XmlPullParserException("No start tag found");
                        drawable = cachedDrawable;
                        throw ex;
                    }
                    drawable = cachedDrawable;
                    final String name = ((XmlPullParser)xml).getName();
                    drawable = cachedDrawable;
                    this.mKnownDrawableIdTags.a(n, (Object)name);
                    drawable = cachedDrawable;
                    final b b = (b)this.mDelegates.getOrDefault((Object)name, (Object)null);
                    Drawable a = cachedDrawable;
                    if (b != null) {
                        drawable = cachedDrawable;
                        a = b.a(context, xml, attributeSet, context.getTheme());
                    }
                    if ((drawable = a) != null) {
                        drawable = a;
                        a.setChangingConfigurations(mTypedValue.changingConfigurations);
                        drawable = a;
                        this.addDrawableToCache(context, cacheKey, a);
                        drawable = a;
                    }
                }
                catch (final Exception ex2) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", (Throwable)ex2);
                }
            }
        }
        if (drawable == null) {
            this.mKnownDrawableIdTags.a(n, (Object)"appcompat_skip_skip");
        }
        return drawable;
    }
    
    private Drawable tintDrawable(final Context context, final int n, final boolean b, final Drawable drawable) {
        final ColorStateList tintList = this.getTintList(context, n);
        Drawable drawable2;
        if (tintList != null) {
            final int[] a = d0.a;
            final Drawable mutate = drawable.mutate();
            r3.a.b.h(mutate, tintList);
            final PorterDuff$Mode tintMode = this.getTintMode(n);
            drawable2 = mutate;
            if (tintMode != null) {
                r3.a.b.i(mutate, tintMode);
                drawable2 = mutate;
            }
        }
        else {
            if (this.mHooks != null) {
                boolean b2 = true;
                if (n == 2131230887) {
                    final LayerDrawable layerDrawable = (LayerDrawable)drawable;
                    final Drawable drawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                    final int c = t0.c(2130968821, context);
                    final PorterDuff$Mode b3 = androidx.appcompat.widget.i.b;
                    i$a.e(drawableByLayerId, c, b3);
                    i$a.e(layerDrawable.findDrawableByLayerId(16908303), t0.c(2130968821, context), b3);
                    i$a.e(layerDrawable.findDrawableByLayerId(16908301), t0.c(2130968819, context), b3);
                }
                else if (n != 2131230878 && n != 2131230877 && n != 2131230879) {
                    b2 = false;
                }
                else {
                    final LayerDrawable layerDrawable2 = (LayerDrawable)drawable;
                    final Drawable drawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                    final int b4 = t0.b(2130968821, context);
                    final PorterDuff$Mode b5 = androidx.appcompat.widget.i.b;
                    i$a.e(drawableByLayerId2, b4, b5);
                    i$a.e(layerDrawable2.findDrawableByLayerId(16908303), t0.c(2130968819, context), b5);
                    i$a.e(layerDrawable2.findDrawableByLayerId(16908301), t0.c(2130968819, context), b5);
                }
                if (b2) {
                    drawable2 = drawable;
                    return drawable2;
                }
            }
            drawable2 = drawable;
            if (!this.tintDrawableUsingColorFilter(context, n, drawable)) {
                drawable2 = drawable;
                if (b) {
                    drawable2 = null;
                }
            }
        }
        return drawable2;
    }
    
    public static void tintDrawable(final Drawable drawable, final w0 w0, final int[] array) {
        final int[] state = drawable.getState();
        final int[] a = d0.a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (drawable instanceof LayerDrawable && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        final boolean d = w0.d;
        if (!d && !w0.c) {
            drawable.clearColorFilter();
        }
        else {
            ColorStateList a2;
            if (d) {
                a2 = w0.a;
            }
            else {
                a2 = null;
            }
            PorterDuff$Mode porterDuff$Mode;
            if (w0.c) {
                porterDuff$Mode = w0.b;
            }
            else {
                porterDuff$Mode = ResourceManagerInternal.DEFAULT_MODE;
            }
            drawable.setColorFilter((ColorFilter)createTintFilter(a2, porterDuff$Mode, array));
        }
    }
    
    public Drawable getDrawable(final Context context, final int n) {
        synchronized (this) {
            return this.getDrawable(context, n, false);
        }
    }
    
    public Drawable getDrawable(final Context context, final int n, final boolean b) {
        synchronized (this) {
            this.checkVectorDrawableSetup(context);
            Drawable drawable;
            if ((drawable = this.loadDrawableFromDelegates(context, n)) == null) {
                drawable = this.createDrawableIfNeeded(context, n);
            }
            Drawable drawable2;
            if ((drawable2 = drawable) == null) {
                drawable2 = n3.a.getDrawable(context, n);
            }
            Drawable tintDrawable;
            if ((tintDrawable = drawable2) != null) {
                tintDrawable = this.tintDrawable(context, n, b, drawable2);
            }
            if (tintDrawable != null) {
                d0.a(tintDrawable);
            }
            return tintDrawable;
        }
    }
    
    public ColorStateList getTintList(final Context context, final int n) {
        synchronized (this) {
            ColorStateList tintListFromCache;
            if ((tintListFromCache = this.getTintListFromCache(context, n)) == null) {
                final c mHooks = this.mHooks;
                ColorStateList d;
                if (mHooks == null) {
                    d = null;
                }
                else {
                    d = ((i$a)mHooks).d(n, context);
                }
                tintListFromCache = d;
                if (d != null) {
                    this.addTintListToCache(context, n, d);
                    tintListFromCache = d;
                }
            }
            return tintListFromCache;
        }
    }
    
    public PorterDuff$Mode getTintMode(final int n) {
        final c mHooks = this.mHooks;
        PorterDuff$Mode multiply = null;
        if (mHooks != null) {
            ((i$a)mHooks).getClass();
            if (n == 2131230892) {
                multiply = PorterDuff$Mode.MULTIPLY;
            }
        }
        return multiply;
    }
    
    public void onConfigurationChanged(final Context context) {
        synchronized (this) {
            final f f = this.mDrawableCaches.get(context);
            if (f != null) {
                f.a();
            }
        }
    }
    
    public Drawable onDrawableLoadedFromResources(final Context context, final f1 f1, final int n) {
        synchronized (this) {
            Drawable drawable;
            if ((drawable = this.loadDrawableFromDelegates(context, n)) == null) {
                drawable = ((p0)f1).a(n);
            }
            if (drawable != null) {
                return this.tintDrawable(context, n, false, drawable);
            }
            return null;
        }
    }
    
    public void setHooks(final c mHooks) {
        synchronized (this) {
            this.mHooks = mHooks;
        }
    }
    
    public boolean tintDrawableUsingColorFilter(final Context context, int n, Drawable mutate) {
        final c mHooks = this.mHooks;
        boolean b = true;
        if (mHooks != null) {
            final i$a i$a = (i$a)mHooks;
            PorterDuff$Mode porterDuff$Mode = androidx.appcompat.widget.i.b;
            final boolean a = androidx.appcompat.widget.i$a.a(n, i$a.a);
            final int n2 = 16842801;
            int n3 = 0;
            int alpha = 0;
            Label_0153: {
                int round = 0;
                Label_0131: {
                    if (a) {
                        n = 2130968821;
                    }
                    else if (androidx.appcompat.widget.i$a.a(n, i$a.c)) {
                        n = 2130968819;
                    }
                    else if (androidx.appcompat.widget.i$a.a(n, i$a.d)) {
                        porterDuff$Mode = PorterDuff$Mode.MULTIPLY;
                        n = n2;
                    }
                    else {
                        if (n == 2131230864) {
                            n = 16842800;
                            round = Math.round(40.8f);
                            break Label_0131;
                        }
                        if (n != 2131230846) {
                            n = 0;
                            n3 = 0;
                            alpha = -1;
                            break Label_0153;
                        }
                        n = n2;
                    }
                    round = -1;
                }
                final int n4 = 1;
                alpha = round;
                n3 = n4;
            }
            if (n3 != 0) {
                final int[] a2 = d0.a;
                mutate = mutate.mutate();
                mutate.setColorFilter((ColorFilter)androidx.appcompat.widget.i.c(t0.c(n, context), porterDuff$Mode));
                if (alpha != -1) {
                    mutate.setAlpha(alpha);
                }
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public interface b
    {
        Drawable a(final Context p0, final XmlResourceParser p1, final AttributeSet p2, final Resources$Theme p3);
    }
    
    public interface c
    {
    }
}
