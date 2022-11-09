// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.util.AttributeSet;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import X.04N;
import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;
import android.text.StaticLayout$Builder;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import android.text.method.TransformationMethod;
import android.view.View;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import android.graphics.RectF;

public class v
{
    public static final RectF LJFF;
    public static ConcurrentHashMap<String, Method> LJI;
    public int LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public int[] LJ;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public TextPaint LJIIIZ;
    public final TextView LJIIJ;
    public final Context LJIIJJI;
    
    static {
        Covode.recordClassIndex(541);
        LJFF = new RectF();
        v.LJI = new ConcurrentHashMap<String, Method>();
        new ConcurrentHashMap();
    }
    
    public v(final TextView ljiij) {
        this.LIZIZ = -1.0f;
        this.LIZJ = -1.0f;
        this.LIZLLL = -1.0f;
        this.LJ = new int[0];
        this.LJIIJ = ljiij;
        this.LJIIJJI = ljiij.getContext();
    }
    
    private int LIZ(final RectF rectF) {
        final int length = this.LJ.length;
        if (length != 0) {
            int n = length - 1;
            int i = 1;
            int n2 = 0;
            while (i <= n) {
                n2 = (i + n) / 2;
                if (this.LIZ(this.LJ[n2], rectF)) {
                    final int n3 = n2 + 1;
                    n2 = i;
                    i = n3;
                }
                else {
                    n = --n2;
                }
            }
            return this.LJ[n2];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }
    
    private StaticLayout LIZ(final CharSequence charSequence, final Layout$Alignment layout$Alignment, final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 23) {
            return this.LIZIZ(charSequence, layout$Alignment, n, n2);
        }
        return new StaticLayout(charSequence, this.LJIIIZ, n, layout$Alignment, this.LJIIJ.getLineSpacingMultiplier(), this.LJIIJ.getLineSpacingExtra(), this.LJIIJ.getIncludeFontPadding());
    }
    
    public static <T> T LIZ(Object o, final String s, T invoke) {
        try {
            o = (invoke = (T)LIZ(s).invoke(o, new Object[0]));
            goto Label_0021;
        }
        catch (final Exception ex) {
            goto Label_0021;
        }
    }
    
    public static Method LIZ(final String s) {
        try {
            Method method;
            if ((method = v.LJI.get(s)) == null) {
                final Method declaredMethod = TextView.class.getDeclaredMethod(s, (Class<?>[])new Class[0]);
                if ((method = declaredMethod) != null) {
                    declaredMethod.setAccessible(true);
                    v.LJI.put(s, declaredMethod);
                    method = declaredMethod;
                }
            }
            return method;
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    private void LIZ(final float textSize) {
        if (textSize == this.LJIIJ.getPaint().getTextSize()) {
            return;
        }
        this.LJIIJ.getPaint().setTextSize(textSize);
        final boolean inLayout = this.LJIIJ.isInLayout();
        if (this.LJIIJ.getLayout() == null) {
            return;
        }
        this.LJII = false;
        while (true) {
            try {
                final Method liz = LIZ("nullLayouts");
                if (liz != null) {
                    liz.invoke(this.LJIIJ, new Object[0]);
                }
                if (!inLayout) {
                    this.LJIIJ.requestLayout();
                }
                else {
                    this.LJIIJ.forceLayout();
                }
                this.LJIIJ.invalidate();
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
    
    private void LIZ(final float lizj, final float lizlll, final float liziz) {
        if (lizj <= 0.0f) {
            final StringBuilder sb = new StringBuilder("Minimum auto-size text size (");
            sb.append(lizj);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        }
        if (lizlll <= lizj) {
            final StringBuilder sb2 = new StringBuilder("Maximum auto-size text size (");
            sb2.append(lizlll);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(lizj);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (liziz > 0.0f) {
            this.LIZ = 1;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
            this.LIZIZ = liziz;
            this.LJIIIIZZ = false;
            return;
        }
        final StringBuilder sb3 = new StringBuilder("The auto-size step granularity (");
        sb3.append(liziz);
        sb3.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(sb3.toString());
    }
    
    private void LIZ(final TypedArray typedArray) {
        final int length = typedArray.length();
        final int[] array = new int[length];
        if (length > 0) {
            int n = 0;
            do {
                array[n] = typedArray.getDimensionPixelSize(n, -1);
            } while (++n < length);
            this.LJ = this.LIZ(array);
            this.LIZJ();
        }
    }
    
    private boolean LIZ(final int n, final RectF rectF) {
        final CharSequence text = this.LJIIJ.getText();
        final TransformationMethod transformationMethod = this.LJIIJ.getTransformationMethod();
        CharSequence charSequence = text;
        if (transformationMethod != null) {
            final CharSequence transformation = transformationMethod.getTransformation(text, (View)this.LJIIJ);
            charSequence = text;
            if (transformation != null) {
                charSequence = transformation;
            }
        }
        final int maxLines = this.LJIIJ.getMaxLines();
        this.LIZIZ(n);
        final StaticLayout liz = this.LIZ(charSequence, LIZ(this.LJIIJ, "getLayoutAlignment", Layout$Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (liz.getLineCount() <= maxLines && liz.getLineEnd(liz.getLineCount() - 1) == charSequence.length())) && liz.getHeight() <= rectF.bottom;
    }
    
    private int[] LIZ(int[] array) {
        final int length = array.length;
        if (length == 0) {
            return array;
        }
        Arrays.sort(array);
        final ArrayList list = new ArrayList();
        final int n = 0;
        int n2 = 0;
        do {
            final int n3 = array[n2];
            if (n3 > 0 && Collections.binarySearch(list, n3) < 0) {
                list.add(n3);
            }
        } while (++n2 < length);
        if (length == list.size()) {
            return array;
        }
        final int size = list.size();
        array = new int[size];
        for (int i = n; i < size; ++i) {
            array[i] = (int)list.get(i);
        }
        return array;
    }
    
    private StaticLayout LIZIZ(final CharSequence charSequence, final Layout$Alignment alignment, int maxLines, final int n) {
        final StaticLayout$Builder obtain = StaticLayout$Builder.obtain(charSequence, 0, charSequence.length(), this.LJIIIZ, maxLines);
        final StaticLayout$Builder setHyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.LJIIJ.getLineSpacingExtra(), this.LJIIJ.getLineSpacingMultiplier()).setIncludePad(this.LJIIJ.getIncludeFontPadding()).setBreakStrategy(this.LJIIJ.getBreakStrategy()).setHyphenationFrequency(this.LJIIJ.getHyphenationFrequency());
        maxLines = n;
        if (n == -1) {
            maxLines = Integer.MAX_VALUE;
        }
        setHyphenationFrequency.setMaxLines(maxLines);
        try {
            TextDirectionHeuristic textDirectionHeuristic;
            if (Build$VERSION.SDK_INT >= 29) {
                textDirectionHeuristic = this.LJIIJ.getTextDirectionHeuristic();
            }
            else {
                textDirectionHeuristic = LIZ(this.LJIIJ, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
            }
            obtain.setTextDirection(textDirectionHeuristic);
            return obtain.build();
        }
        catch (final ClassCastException ex) {
            return obtain.build();
        }
    }
    
    private void LIZIZ(final int n) {
        final TextPaint ljiiiz = this.LJIIIZ;
        if (ljiiiz == null) {
            this.LJIIIZ = new TextPaint();
        }
        else {
            ljiiiz.reset();
        }
        this.LJIIIZ.set(this.LJIIJ.getPaint());
        this.LJIIIZ.setTextSize((float)n);
    }
    
    private boolean LIZJ() {
        final int[] lj = this.LJ;
        final int length = lj.length;
        final boolean ljiiiizz = length > 0;
        this.LJIIIIZZ = ljiiiizz;
        if (ljiiiizz) {
            this.LIZ = 1;
            this.LIZJ = (float)lj[0];
            this.LIZLLL = (float)lj[length - 1];
            this.LIZIZ = -1.0f;
        }
        return ljiiiizz;
    }
    
    private boolean LIZLLL() {
        final boolean ljff = this.LJFF();
        int i = 0;
        if (ljff && this.LIZ == 1) {
            if (!this.LJIIIIZZ || this.LJ.length == 0) {
                final int n = (int)Math.floor((this.LIZLLL - this.LIZJ) / this.LIZIZ) + 1;
                final int[] array = new int[n];
                while (i < n) {
                    array[i] = Math.round(this.LIZJ + i * this.LIZIZ);
                    ++i;
                }
                this.LJ = this.LIZ(array);
            }
            this.LJII = true;
        }
        else {
            this.LJII = false;
        }
        return this.LJII;
    }
    
    private void LJ() {
        this.LIZ = 0;
        this.LIZJ = -1.0f;
        this.LIZLLL = -1.0f;
        this.LIZIZ = -1.0f;
        this.LJ = new int[0];
        this.LJII = false;
    }
    
    private boolean LJFF() {
        return !(this.LJIIJ instanceof 04N);
    }
    
    public final void LIZ() {
        if (!this.LIZIZ()) {
            return;
        }
        Label_0216: {
            if (this.LJII) {
                if (this.LJIIJ.getMeasuredHeight() > 0 && this.LJIIJ.getMeasuredWidth() > 0) {
                    boolean b;
                    if (Build$VERSION.SDK_INT >= 29) {
                        b = this.LJIIJ.isHorizontallyScrollable();
                    }
                    else {
                        b = LIZ(this.LJIIJ, "getHorizontallyScrolling", false);
                    }
                    int n;
                    if (b) {
                        n = 1048576;
                    }
                    else {
                        n = this.LJIIJ.getMeasuredWidth() - this.LJIIJ.getTotalPaddingLeft() - this.LJIIJ.getTotalPaddingRight();
                    }
                    final int n2 = this.LJIIJ.getHeight() - this.LJIIJ.getCompoundPaddingBottom() - this.LJIIJ.getCompoundPaddingTop();
                    if (n > 0) {
                        if (n2 > 0) {
                            final RectF ljff = v.LJFF;
                            synchronized (ljff) {
                                ljff.setEmpty();
                                ljff.right = (float)n;
                                ljff.bottom = (float)n2;
                                final float n3 = (float)this.LIZ(ljff);
                                if (n3 != this.LJIIJ.getTextSize()) {
                                    this.LIZ(0, n3);
                                }
                            }
                            break Label_0216;
                        }
                    }
                }
                return;
            }
        }
        this.LJII = true;
    }
    
    public final void LIZ(final int n) {
        if (this.LJFF()) {
            if (n != 0) {
                if (n != 1) {
                    throw new IllegalArgumentException("Unknown auto-size text type: ".concat(String.valueOf(n)));
                }
                final DisplayMetrics displayMetrics = this.LJIIJJI.getResources().getDisplayMetrics();
                this.LIZ(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (this.LIZLLL()) {
                    this.LIZ();
                }
            }
            else {
                this.LJ();
            }
        }
    }
    
    public final void LIZ(final int n, final float n2) {
        final Context ljiijji = this.LJIIJJI;
        Resources resources;
        if (ljiijji == null) {
            resources = Resources.getSystem();
        }
        else {
            resources = ljiijji.getResources();
        }
        this.LIZ(TypedValue.applyDimension(n, n2, resources.getDisplayMetrics()));
    }
    
    public final void LIZ(final int n, final int n2, final int n3, final int n4) {
        if (this.LJFF()) {
            final DisplayMetrics displayMetrics = this.LJIIJJI.getResources().getDisplayMetrics();
            this.LIZ(TypedValue.applyDimension(n4, (float)n, displayMetrics), TypedValue.applyDimension(n4, (float)n2, displayMetrics), TypedValue.applyDimension(n4, (float)n3, displayMetrics));
            if (this.LIZLLL()) {
                this.LIZ();
            }
        }
    }
    
    public final void LIZ(final AttributeSet set, int resourceId) {
        final TypedArray obtainStyledAttributes = this.LJIIJJI.obtainStyledAttributes(set, new int[] { 16842804, 2130969061, 2130969062, 2130969063, 2130969064, 2130969065, 2130969481, 2130969482, 2130969483, 2130969484, 2130969486, 2130969487, 2130969488, 2130969489, 2130969564, 2130969583, 2130969592, 2130969774, 2130969904, 2130971189, 2130971220 }, resourceId, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            this.LIZ = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension;
        if (obtainStyledAttributes.hasValue(4)) {
            dimension = obtainStyledAttributes.getDimension(4, -1.0f);
        }
        else {
            dimension = -1.0f;
        }
        float dimension2;
        if (obtainStyledAttributes.hasValue(2)) {
            dimension2 = obtainStyledAttributes.getDimension(2, -1.0f);
        }
        else {
            dimension2 = -1.0f;
        }
        float dimension3;
        if (obtainStyledAttributes.hasValue(1)) {
            dimension3 = obtainStyledAttributes.getDimension(1, -1.0f);
        }
        else {
            dimension3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3)) {
            resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId > 0) {
                final TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                this.LIZ(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (this.LJFF()) {
            if (this.LIZ == 1) {
                if (!this.LJIIIIZZ) {
                    final DisplayMetrics displayMetrics = this.LJIIJJI.getResources().getDisplayMetrics();
                    float applyDimension = dimension2;
                    if (dimension2 == -1.0f) {
                        applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    float applyDimension2 = dimension3;
                    if (dimension3 == -1.0f) {
                        applyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    float n = dimension;
                    if (dimension == -1.0f) {
                        n = 1.0f;
                    }
                    this.LIZ(applyDimension, applyDimension2, n);
                }
                this.LIZLLL();
            }
        }
        else {
            this.LIZ = 0;
        }
    }
    
    public final void LIZ(final int[] array, final int n) {
        if (this.LJFF()) {
            final int length = array.length;
            int n2 = 0;
            if (length > 0) {
                final int[] array2 = new int[length];
                int[] copy;
                if (n == 0) {
                    copy = Arrays.copyOf(array, length);
                }
                else {
                    final DisplayMetrics displayMetrics = this.LJIIJJI.getResources().getDisplayMetrics();
                    do {
                        array2[n2] = Math.round(TypedValue.applyDimension(n, (float)array[n2], displayMetrics));
                        ++n2;
                        copy = array2;
                    } while (n2 < length);
                }
                this.LJ = this.LIZ(copy);
                if (!this.LIZJ()) {
                    final StringBuilder sb = new StringBuilder("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(array));
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            else {
                this.LJIIIIZZ = false;
            }
            if (this.LIZLLL()) {
                this.LIZ();
            }
        }
    }
    
    public final boolean LIZIZ() {
        return this.LJFF() && this.LIZ != 0;
    }
}
