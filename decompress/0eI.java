// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.view.View;
import android.content.res.TypedArray;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.util.SparseIntArray;
import android.util.SparseArray;
import android.util.TypedValue;

public final class 0eI
{
    public static final ThreadLocal<TypedValue> LIZ;
    public static final SparseArray<SparseIntArray> LIZIZ;
    
    static {
        Covode.recordClassIndex(5951);
        LIZ = new ThreadLocal<TypedValue>();
        LIZIZ = new SparseArray();
    }
    
    public static int LIZ(final Context context, final int n) {
        final TypedValue liz = LIZ();
        context.getTheme().resolveAttribute(n, liz, true);
        return liz.data;
    }
    
    public static int LIZ(final Context context, final int n, final int n2) {
        if (n == -1) {
            return -1;
        }
        final SparseArray<SparseIntArray> liziz = 0eI.LIZIZ;
        SparseIntArray sparseIntArray = (SparseIntArray)liziz.get(n);
        if (sparseIntArray != null) {
            final int n3;
            if ((n3 = sparseIntArray.get(n2, -1)) != -1) {
                return n3;
            }
        }
        else {
            sparseIntArray = new SparseIntArray();
            liziz.put(n, (Object)sparseIntArray);
        }
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, new int[] { n2 });
        int n3 = obtainStyledAttributes.getResourceId(0, -1);
        if (n3 != -1) {
            sparseIntArray.put(n2, n3);
        }
        obtainStyledAttributes.recycle();
        return n3;
    }
    
    public static int LIZ(final Context context, final TypedArray typedArray, final int n) {
        if (!typedArray.hasValue(n)) {
            return -1;
        }
        final TypedValue liz = LIZ();
        typedArray.getValue(n, liz);
        if (liz.type == 2) {
            return LIZ(context, 2131886327, liz.data);
        }
        return liz.resourceId;
    }
    
    public static int LIZ(final View view, final int n) {
        return LIZ(view.getContext(), n);
    }
    
    public static TypedValue LIZ() {
        final ThreadLocal<TypedValue> liz = 0eI.LIZ;
        TypedValue typedValue;
        if ((typedValue = liz.get()) == null) {
            typedValue = new TypedValue();
            liz.set(typedValue);
        }
        LIZ(typedValue);
        return typedValue;
    }
    
    public static void LIZ(final TypedValue typedValue) {
        typedValue.type = 0;
        typedValue.string = null;
        typedValue.data = 0;
        typedValue.assetCookie = 0;
        typedValue.resourceId = 0;
        typedValue.changingConfigurations = -1;
        typedValue.density = 0;
        if (Build$VERSION.SDK_INT >= 29) {
            typedValue.sourceResourceId = 0;
        }
    }
    
    public static 1Iu LIZIZ(final Context context, final int n) {
        final Drawable liz = 0ep.a.LIZ.LIZ(context, LIZ(context, 2131886327, n));
        if (liz == null) {
            return null;
        }
        return new 1Iu(liz);
    }
}
