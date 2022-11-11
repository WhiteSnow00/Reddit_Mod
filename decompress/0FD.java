// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Typeface;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.util.FontSpan;
import android.text.style.AbsoluteSizeSpan;
import android.text.Spannable;
import android.graphics.Paint;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.util.SparseIntArray;

public final class 0fd
{
    public static final SparseIntArray LIZ;
    public static final SparseIntArray LIZIZ;
    public static final SparseIntArray LIZJ;
    
    static {
        Covode.recordClassIndex(6113);
        final SparseIntArray sparseIntArray = LIZ = new SparseIntArray();
        final SparseIntArray sparseIntArray2 = LIZIZ = new SparseIntArray();
        final SparseIntArray sparseIntArray3 = LIZJ = new SparseIntArray();
        sparseIntArray.put(0, 2131886504);
        sparseIntArray.put(1, 2131886507);
        sparseIntArray.put(2, 2131886510);
        sparseIntArray.put(3, 2131886513);
        sparseIntArray.put(4, 2131886516);
        sparseIntArray.put(5, 2131886519);
        sparseIntArray.put(6, 2131886522);
        sparseIntArray.put(7, 2131886525);
        sparseIntArray.put(8, 2131886528);
        sparseIntArray2.put(0, 2131166318);
        sparseIntArray2.put(1, 2131166319);
        sparseIntArray2.put(2, 2131166320);
        sparseIntArray2.put(3, 2131166321);
        sparseIntArray2.put(4, 2131166322);
        sparseIntArray2.put(5, 2131166323);
        sparseIntArray2.put(6, 2131166324);
        sparseIntArray2.put(7, 2131166325);
        sparseIntArray2.put(8, 2131166326);
        sparseIntArray3.put(0, 2131166309);
        sparseIntArray3.put(1, 2131166310);
        sparseIntArray3.put(2, 2131166311);
        sparseIntArray3.put(3, 2131166312);
        sparseIntArray3.put(4, 2131166313);
        sparseIntArray3.put(5, 2131166314);
        sparseIntArray3.put(6, 2131166315);
        sparseIntArray3.put(7, 2131166316);
        sparseIntArray3.put(8, 2131166317);
    }
    
    public static String LIZ(final int n) {
        if (n == 700) {
            return 7wf.LIZIZ;
        }
        if (n == 600) {
            return 7wf.LJI;
        }
        return 7wf.LIZ;
    }
    
    public static void LIZ(final Context context, final Paint paint, final int n, final int n2) {
        if (context != null && paint != null) {
            paint.setTextSize((float)context.getResources().getDimensionPixelSize(0fd.LIZIZ.get(n)));
            paint.setTypeface(LIZIZ(n2));
        }
    }
    
    public static void LIZ(final Context context, final Spannable spannable, final int n, final int n2, final int n3, final int n4) {
        if (context != null && spannable != null) {
            spannable.setSpan((Object)new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(0fd.LIZIZ.get(n4))), n, n2, n3);
        }
    }
    
    public static void LIZ(final Context context, final Spannable spannable, final int n, final int n2, final int n3, final int n4, final int n5) {
        LIZ(context, spannable, n, n2, n3, n4);
        LIZ(spannable, n, n2, n3, n5);
    }
    
    public static void LIZ(final Spannable spannable, final int n, final int n2, final int n3, final int n4) {
        if (spannable != null) {
            spannable.setSpan((Object)new FontSpan(LIZ(n4)), n, n2, n3);
        }
    }
    
    public static void LIZ(final TextView textView, final int n) {
        if (textView != null) {
            textView.setTypeface(LIZIZ(n));
        }
    }
    
    public static Typeface LIZIZ(final int n) {
        return 7we.LIZ().LIZ(LIZ(n));
    }
}
