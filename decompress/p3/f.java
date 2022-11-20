// 
// Decompiled by Procyon v0.6.0
// 

package p3;

import android.os.Handler;
import android.os.Looper;
import z3.b;
import android.content.res.Configuration;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import j0.g;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.Log;
import q3.i;
import android.content.res.Resources$NotFoundException;
import android.graphics.Typeface;
import android.content.Context;
import android.util.SparseArray;
import java.util.WeakHashMap;
import android.util.TypedValue;

public final class f
{
    public static final ThreadLocal<TypedValue> a;
    public static final WeakHashMap<d, SparseArray<c>> b;
    public static final Object c;
    
    static {
        a = new ThreadLocal<TypedValue>();
        b = new WeakHashMap<d, SparseArray<c>>(0);
        c = new Object();
    }
    
    public static Typeface a(final int n, final Context context) throws Resources$NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, n, new TypedValue(), 0, null, false);
    }
    
    public static Typeface b(final Context context, final int n, final TypedValue typedValue, final int n2, final e e, final boolean b) {
        final Resources resources = context.getResources();
        resources.getValue(n, typedValue, true);
        final CharSequence string = typedValue.string;
        if (string == null) {
            final StringBuilder t = a.t("Resource \"");
            t.append(resources.getResourceName(n));
            t.append("\" (");
            t.append(Integer.toHexString(n));
            t.append(") is not a Font: ");
            t.append(typedValue);
            throw new Resources$NotFoundException(t.toString());
        }
        final String string2 = string.toString();
        final boolean startsWith = string2.startsWith("res/");
        final Typeface typeface = null;
        Typeface a = null;
        Label_0379: {
            if (!startsWith) {
                a = typeface;
                if (e != null) {
                    e.a(-3);
                    a = typeface;
                }
            }
            else {
                final int assetCookie = typedValue.assetCookie;
                final g b2 = i.b;
                final Typeface typeface2 = (Typeface)b2.get((Object)i.b(resources, n, string2, assetCookie, n2));
                Label_0127: {
                    if (typeface2 != null) {
                        a = typeface2;
                        if (e != null) {
                            e.b(typeface2);
                            a = typeface2;
                        }
                    }
                    else {
                        try {
                            if (string2.toLowerCase().endsWith(".xml")) {
                                final p3.d.b a2 = p3.d.a(resources.getXml(n), resources);
                                if (a2 != null) {
                                    a = i.a(context, a2, resources, n, string2, typedValue.assetCookie, n2, e, b);
                                    break Label_0379;
                                }
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                a = typeface;
                                if (e != null) {
                                    e.a(-3);
                                    a = typeface;
                                }
                                break Label_0379;
                            }
                            else {
                                final int assetCookie2 = typedValue.assetCookie;
                                final Typeface d = i.a.d(context, resources, n, string2, n2);
                                if (d != null) {
                                    b2.put((Object)i.b(resources, n, string2, assetCookie2, n2), (Object)d);
                                }
                                a = d;
                                if (e == null) {
                                    break Label_0127;
                                }
                                if (d != null) {
                                    e.b(d);
                                    a = d;
                                    break Label_0127;
                                }
                                e.a(-3);
                                a = d;
                                break Label_0127;
                            }
                        }
                        catch (final IOException ex) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Failed to read xml resource ");
                            sb.append(string2);
                            Log.e("ResourcesCompat", sb.toString(), (Throwable)ex);
                        }
                        catch (final XmlPullParserException ex2) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failed to parse xml resource ");
                            sb2.append(string2);
                            Log.e("ResourcesCompat", sb2.toString(), (Throwable)ex2);
                        }
                        a = typeface;
                        if (e != null) {
                            e.a(-3);
                            a = typeface;
                        }
                    }
                }
            }
        }
        if (a == null && e == null) {
            final StringBuilder t2 = a.t("Font resource ID #0x");
            t2.append(Integer.toHexString(n));
            t2.append(" could not be retrieved.");
            throw new Resources$NotFoundException(t2.toString());
        }
        return a;
    }
    
    public static final class a
    {
        public static Drawable a(final Resources resources, final int n, final Resources$Theme resources$Theme) {
            return resources.getDrawable(n, resources$Theme);
        }
        
        public static Drawable b(final Resources resources, final int n, final int n2, final Resources$Theme resources$Theme) {
            return resources.getDrawableForDensity(n, n2, resources$Theme);
        }
    }
    
    public static final class b
    {
        public static int a(final Resources resources, final int n, final Resources$Theme resources$Theme) {
            return resources.getColor(n, resources$Theme);
        }
        
        public static ColorStateList b(final Resources resources, final int n, final Resources$Theme resources$Theme) {
            return resources.getColorStateList(n, resources$Theme);
        }
    }
    
    public static final class c
    {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;
        
        public c(final ColorStateList a, final Configuration b, final Resources$Theme resources$Theme) {
            this.a = a;
            this.b = b;
            int hashCode;
            if (resources$Theme == null) {
                hashCode = 0;
            }
            else {
                hashCode = resources$Theme.hashCode();
            }
            this.c = hashCode;
        }
    }
    
    public static final class d
    {
        public final Resources a;
        public final Resources$Theme b;
        
        public d(final Resources a, final Resources$Theme b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && d.class == o.getClass()) {
                final d d = (d)o;
                if (!this.a.equals(d.a) || !z3.b.a(this.b, d.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return z3.b.b(this.a, this.b);
        }
    }
    
    public abstract static class e
    {
        public final void a(final int n) {
            new Handler(Looper.getMainLooper()).post((Runnable)new h(this, n, 0));
        }
        
        public final void b(final Typeface typeface) {
            new Handler(Looper.getMainLooper()).post((Runnable)new p3.g(0, this, typeface));
        }
        
        public abstract void c(final int p0);
        
        public abstract void d(final Typeface p0);
    }
}
