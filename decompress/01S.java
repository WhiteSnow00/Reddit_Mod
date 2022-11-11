// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Configuration;
import android.content.res.XmlResourceParser;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.content.res.ColorStateList;
import com.bytedance.covode.number.Covode;
import android.util.SparseArray;
import android.content.Context;
import java.util.WeakHashMap;
import android.util.TypedValue;

public final class 01s
{
    public static final ThreadLocal<TypedValue> LIZ;
    public static final WeakHashMap<Context, SparseArray<a>> LIZIZ;
    public static final Object LIZJ;
    
    static {
        Covode.recordClassIndex(235);
        LIZ = new ThreadLocal<TypedValue>();
        LIZIZ = new WeakHashMap<Context, SparseArray<a>>(0);
        LIZJ = new Object();
    }
    
    public static ColorStateList LIZ(final Context context, final int n) {
        if (Build$VERSION.SDK_INT >= 23) {
            return context.getColorStateList(n);
        }
        final ColorStateList lizlll = LIZLLL(context, n);
        if (lizlll != null) {
            return lizlll;
        }
        final ColorStateList lizj = LIZJ(context, n);
        if (lizj != null) {
            synchronized (01s.LIZJ) {
                final WeakHashMap<Context, SparseArray<a>> liziz = 01s.LIZIZ;
                SparseArray sparseArray;
                if ((sparseArray = liziz.get(context)) == null) {
                    sparseArray = new SparseArray();
                    liziz.put(context, (SparseArray<a>)sparseArray);
                }
                sparseArray.append(n, (Object)new a(lizj, context.getResources().getConfiguration()));
                return lizj;
            }
        }
        return 06x.LIZIZ(context, n);
    }
    
    public static Drawable LIZIZ(final Context context, final int n) {
        return 03r.LIZ().LIZ(context, n);
    }
    
    public static ColorStateList LIZJ(final Context context, final int n) {
        final Resources resources = context.getResources();
        final ThreadLocal<TypedValue> liz = 01s.LIZ;
        TypedValue typedValue;
        if ((typedValue = liz.get()) == null) {
            typedValue = new TypedValue();
            liz.set(typedValue);
        }
        int n2 = 1;
        resources.getValue(n, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            n2 = 0;
        }
        if (n2 != 0) {
            return null;
        }
        final Resources resources2 = context.getResources();
        final XmlResourceParser xml = resources2.getXml(n);
        try {
            return 06h.LIZ(resources2, (XmlPullParser)xml, context.getTheme());
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static ColorStateList LIZLLL(final Context context, final int n) {
        synchronized (01s.LIZJ) {
            final SparseArray sparseArray = 01s.LIZIZ.get(context);
            if (sparseArray != null && sparseArray.size() > 0) {
                final a a = (a)sparseArray.get(n);
                if (a != null) {
                    if (a.LIZIZ.equals(context.getResources().getConfiguration())) {
                        return a.LIZ;
                    }
                    sparseArray.remove(n);
                }
            }
            return null;
        }
    }
    
    public static final class a
    {
        public final ColorStateList LIZ;
        public final Configuration LIZIZ;
        
        static {
            Covode.recordClassIndex(236);
        }
        
        public a(final ColorStateList liz, final Configuration liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
    }
}
