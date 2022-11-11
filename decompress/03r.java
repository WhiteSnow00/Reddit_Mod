// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuffColorFilter;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;
import android.util.TypedValue;
import android.graphics.drawable.Drawable$ConstantState;
import java.lang.ref.WeakReference;
import android.content.res.ColorStateList;
import android.content.Context;
import java.util.WeakHashMap;
import android.graphics.PorterDuff$Mode;

public final class 03r
{
    public static final PorterDuff$Mode LIZ;
    public static 03r LIZIZ;
    public static final c LIZJ;
    public WeakHashMap<Context, 051<ColorStateList>> LIZLLL;
    public 13j<String, d> LJ;
    public 051<String> LJFF;
    public final WeakHashMap<Context, 04v<WeakReference<Drawable$ConstantState>>> LJI;
    public TypedValue LJII;
    public boolean LJIIIIZZ;
    public e LJIIIZ;
    
    static {
        Covode.recordClassIndex(481);
        LIZ = PorterDuff$Mode.SRC_IN;
        LIZJ = new c();
    }
    
    public 03r() {
        this.LJI = new WeakHashMap<Context, 04v<WeakReference<Drawable$ConstantState>>>(0);
    }
    
    public static long LIZ(final TypedValue typedValue) {
        return (long)typedValue.assetCookie << 32 | (long)typedValue.data;
    }
    
    public static 03r LIZ() {
        synchronized (03r.class) {
            if (03r.LIZIZ == null) {
                final 03r 03r = X.03r.LIZIZ = new 03r();
                if (Build$VERSION.SDK_INT < 24) {
                    03r.LIZ("vector", (d)new f());
                    03r.LIZ("animated-vector", (d)new b());
                    03r.LIZ("animated-selector", (d)new a());
                }
            }
            return 03r.LIZIZ;
        }
    }
    
    public static PorterDuffColorFilter LIZ(final int n, final PorterDuff$Mode porterDuff$Mode) {
        synchronized (03r.class) {
            final c lizj = 03r.LIZJ;
            PorterDuffColorFilter porterDuffColorFilter;
            if ((porterDuffColorFilter = lizj.LIZ(Integer.valueOf(c.LIZ(n, porterDuff$Mode)))) == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(n, porterDuff$Mode);
                lizj.LIZ(c.LIZ(n, porterDuff$Mode), porterDuffColorFilter);
            }
            return porterDuffColorFilter;
        }
    }
    
    public static PorterDuffColorFilter LIZ(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode, final int[] array) {
        if (list == null || porterDuff$Mode == null) {
            return null;
        }
        return LIZ(list.getColorForState(array, 0), porterDuff$Mode);
    }
    
    private Drawable LIZ(final Context context, final long n) {
        synchronized (this) {
            final 04v 04v = this.LJI.get(context);
            if (04v == null) {
                return null;
            }
            final WeakReference weakReference = (WeakReference)04v.LIZ(n, null);
            if (weakReference != null) {
                final Drawable$ConstantState drawable$ConstantState = (Drawable$ConstantState)weakReference.get();
                if (drawable$ConstantState != null) {
                    return drawable$ConstantState.newDrawable(context.getResources());
                }
                04v.LIZIZ(n);
            }
            return null;
        }
    }
    
    public static void LIZ(final Drawable drawable, final 042 042, final int[] array) {
        if (04a.LIZJ(drawable) && drawable.mutate() != drawable) {
            return;
        }
        if (042.LIZLLL || 042.LIZJ) {
            ColorStateList liz;
            if (042.LIZLLL) {
                liz = 042.LIZ;
            }
            else {
                liz = null;
            }
            PorterDuff$Mode porterDuff$Mode;
            if (042.LIZJ) {
                porterDuff$Mode = 042.LIZIZ;
            }
            else {
                porterDuff$Mode = 03r.LIZ;
            }
            drawable.setColorFilter((ColorFilter)LIZ(liz, porterDuff$Mode, array));
        }
        else {
            drawable.clearColorFilter();
        }
        if (Build$VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }
    
    private void LIZ(final String s, final d d) {
        if (this.LJ == null) {
            this.LJ = new 13j<String, d>();
        }
        this.LJ.put(s, d);
    }
    
    private boolean LIZ(final Context context, final long n, final Drawable drawable) {
        synchronized (this) {
            final Drawable$ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                04v 04v;
                if ((04v = this.LJI.get(context)) == null) {
                    04v = new 04v();
                    this.LJI.put(context, 04v);
                }
                04v.LIZIZ(n, new WeakReference(constantState));
                return true;
            }
            return false;
        }
    }
    
    private Drawable LIZJ(final Context context, final int n) {
        final 13j<String, d> lj = this.LJ;
        Label_0369: {
            if (lj == null || lj.isEmpty()) {
                break Label_0369;
            }
            final 051<String> ljff = this.LJFF;
            if (ljff != null) {
                final String liz = ljff.LIZ(n, null);
                if ("appcompat_skip_skip".equals(liz) || (liz != null && this.LJ.get(liz) == null)) {
                    return null;
                }
            }
            else {
                this.LJFF = new 051<String>();
            }
            if (this.LJII == null) {
                this.LJII = new TypedValue();
            }
            final TypedValue ljii = this.LJII;
            final Resources resources = context.getResources();
            resources.getValue(n, ljii, true);
            final long liz2 = LIZ(ljii);
            final Drawable liz3 = this.LIZ(context, liz2);
            if (liz3 != null) {
                return liz3;
            }
            Drawable drawable = liz3;
            while (true) {
                if (ljii.string == null) {
                    break Label_0351;
                }
                drawable = liz3;
                if (!ljii.string.toString().endsWith(".xml")) {
                    break Label_0351;
                }
                drawable = liz3;
                try {
                    final XmlResourceParser xml = resources.getXml(n);
                    drawable = liz3;
                    final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
                    int next;
                    do {
                        drawable = liz3;
                        next = ((XmlPullParser)xml).next();
                    } while (next != 2 && next != 1);
                    if (next == 2) {
                        drawable = liz3;
                        final String name = ((XmlPullParser)xml).getName();
                        drawable = liz3;
                        this.LJFF.LIZJ(n, name);
                        drawable = liz3;
                        final d d = this.LJ.get(name);
                        Drawable liz4 = liz3;
                        if (d != null) {
                            drawable = liz3;
                            liz4 = d.LIZ(context, (XmlPullParser)xml, attributeSet, context.getTheme());
                        }
                        if ((drawable = liz4) != null) {
                            drawable = liz4;
                            liz4.setChangingConfigurations(ljii.changingConfigurations);
                            drawable = liz4;
                            this.LIZ(context, liz2, liz4);
                            drawable = liz4;
                        }
                        if (drawable == null) {
                            this.LJFF.LIZJ(n, "appcompat_skip_skip");
                        }
                        return drawable;
                    }
                    drawable = liz3;
                    drawable = liz3;
                    final XmlPullParserException ex = new XmlPullParserException("No start tag found");
                    drawable = liz3;
                    throw ex;
                    return null;
                }
                catch (final Exception ex2) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final Drawable LIZ(final Context context, final int n) {
        synchronized (this) {
            return this.LIZ(context, n, false);
        }
    }
    
    public final Drawable LIZ(final Context context, final int n, final boolean b) {
        synchronized (this) {
            if (!this.LJIIIIZZ) {
                this.LJIIIIZZ = true;
                final Drawable liz = this.LIZ(context, 2131230822);
                if (liz == null || (!(liz instanceof 1gf) && !"android.graphics.drawable.VectorDrawable".equals(liz.getClass().getName()))) {
                    this.LJIIIIZZ = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            final Drawable lizj = this.LIZJ(context, n);
            final Drawable drawable = null;
            final PorterDuff$Mode porterDuff$Mode = null;
            Drawable liz2;
            if ((liz2 = lizj) == null) {
                if (this.LJII == null) {
                    this.LJII = new TypedValue();
                }
                final TypedValue ljii = this.LJII;
                context.getResources().getValue(n, ljii, true);
                final long liz3 = LIZ(ljii);
                if ((liz2 = this.LIZ(context, liz3)) == null) {
                    final e ljiiiz = this.LJIIIZ;
                    Drawable liz4;
                    if (ljiiiz == null) {
                        liz4 = null;
                    }
                    else {
                        liz4 = ljiiiz.LIZ(this, context, n);
                    }
                    liz2 = liz4;
                    if (liz4 != null) {
                        liz4.setChangingConfigurations(ljii.changingConfigurations);
                        this.LIZ(context, liz3, liz4);
                        liz2 = liz4;
                    }
                }
            }
            Drawable drawable2;
            if ((drawable2 = liz2) == null) {
                drawable2 = context.getDrawable(n);
            }
            Drawable drawable3;
            if ((drawable3 = drawable2) != null) {
                final ColorStateList liziz = this.LIZIZ(context, n);
                Drawable drawable4;
                if (liziz != null) {
                    Drawable mutate = drawable2;
                    if (04a.LIZJ(drawable2)) {
                        mutate = drawable2.mutate();
                    }
                    final Drawable liziz2 = 08U.LIZIZ(mutate);
                    liziz2.setTintList(liziz);
                    final e ljiiiz2 = this.LJIIIZ;
                    PorterDuff$Mode liz5;
                    if (ljiiiz2 == null) {
                        liz5 = porterDuff$Mode;
                    }
                    else {
                        liz5 = ljiiiz2.LIZ(n);
                    }
                    if (liz5 != null) {
                        liziz2.setTintMode(liz5);
                    }
                    drawable4 = liziz2;
                }
                else {
                    final e ljiiiz3 = this.LJIIIZ;
                    if ((ljiiiz3 == null || !ljiiiz3.LIZ(context, n, drawable2)) && !this.LIZ(context, n, drawable2) && b) {
                        drawable4 = drawable;
                    }
                    else {
                        drawable4 = drawable2;
                    }
                }
                drawable3 = drawable4;
            }
            if (drawable3 != null) {
                04a.LIZIZ(drawable3);
            }
            return drawable3;
        }
    }
    
    public final void LIZ(final e ljiiiz) {
        synchronized (this) {
            this.LJIIIZ = ljiiiz;
        }
    }
    
    public final void LIZ(final Context context) {
        synchronized (this) {
            final 04v 04v = this.LJI.get(context);
            if (04v != null) {
                04v.LIZJ();
            }
        }
    }
    
    public final boolean LIZ(final Context context, final int n, final Drawable drawable) {
        final e ljiiiz = this.LJIIIZ;
        return ljiiiz != null && ljiiiz.LIZIZ(context, n, drawable);
    }
    
    public final ColorStateList LIZIZ(final Context context, final int n) {
        synchronized (this) {
            final WeakHashMap<Context, 051<ColorStateList>> lizlll = this.LIZLLL;
            final ColorStateList list = null;
            ColorStateList list2 = null;
            Label_0042: {
                if (lizlll != null) {
                    final 051 051 = lizlll.get(context);
                    if (051 != null) {
                        list2 = (ColorStateList)051.LIZ(n, null);
                        break Label_0042;
                    }
                }
                list2 = null;
            }
            ColorStateList list3 = list2;
            if (list2 == null) {
                final e ljiiiz = this.LJIIIZ;
                ColorStateList liz;
                if (ljiiiz == null) {
                    liz = list;
                }
                else {
                    liz = ljiiiz.LIZ(context, n);
                }
                if (liz != null) {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = new WeakHashMap<Context, 051<ColorStateList>>();
                    }
                    051 52;
                    if ((52 = this.LIZLLL.get(context)) == null) {
                        52 = new 051();
                        this.LIZLLL.put(context, 52);
                    }
                    52.LIZJ(n, liz);
                }
                list3 = liz;
            }
            return list3;
        }
    }
    
    public interface d
    {
        default static {
            Covode.recordClassIndex(485);
        }
        
        Drawable LIZ(final Context p0, final XmlPullParser p1, final AttributeSet p2, final Resources$Theme p3);
    }
    
    public interface e
    {
        default static {
            Covode.recordClassIndex(486);
        }
        
        ColorStateList LIZ(final Context p0, final int p1);
        
        PorterDuff$Mode LIZ(final int p0);
        
        Drawable LIZ(final 03r p0, final Context p1, final int p2);
        
        boolean LIZ(final Context p0, final int p1, final Drawable p2);
        
        boolean LIZIZ(final Context p0, final int p1, final Drawable p2);
    }
    
    public static final class a implements d
    {
        static {
            Covode.recordClassIndex(482);
        }
        
        @Override
        public final Drawable LIZ(final Context context, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
            try {
                return 1fT.LIZ(context, context.getResources(), xmlPullParser, set, resources$Theme);
            }
            catch (final Exception ex) {
                return null;
            }
        }
    }
    
    public static final class b implements d
    {
        static {
            Covode.recordClassIndex(483);
        }
        
        @Override
        public final Drawable LIZ(final Context context, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
            try {
                return 1gc.LIZ(context, context.getResources(), xmlPullParser, set, resources$Theme);
            }
            catch (final Exception ex) {
                return null;
            }
        }
    }
    
    public static final class c extends 04w<Integer, PorterDuffColorFilter>
    {
        static {
            Covode.recordClassIndex(484);
        }
        
        public c() {
            super(6);
        }
        
        public static int LIZ(final int n, final PorterDuff$Mode porterDuff$Mode) {
            return (n + 31) * 31 + porterDuff$Mode.hashCode();
        }
    }
    
    public static final class f implements d
    {
        static {
            Covode.recordClassIndex(487);
        }
        
        @Override
        public final Drawable LIZ(final Context context, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
            try {
                return 1gf.LIZ(context.getResources(), xmlPullParser, set, resources$Theme);
            }
            catch (final Exception ex) {
                return null;
            }
        }
    }
}
