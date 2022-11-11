// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.customview.view.AbsSavedState;
import android.view.View$BaseSavedState;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable$Callback;
import android.util.SparseArray;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Region$Op;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import androidx.core.g.t;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Collection;
import java.util.Collections;
import android.view.MotionEvent;
import android.os.SystemClock;
import android.graphics.RectF;
import android.view.ViewParent;
import android.graphics.Matrix;
import android.view.Gravity;
import java.util.HashMap;
import android.text.TextUtils;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import java.util.List;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.graphics.Rect;
import android.view.View;
import java.util.Comparator;
import java.lang.reflect.Constructor;
import java.util.Map;
import android.view.ViewGroup;

public class 1nH extends ViewGroup implements 14d, 1fn
{
    public static final String LIZ;
    public static final Class<?>[] LIZIZ;
    public static final ThreadLocal<Map<String, Constructor<b>>> LIZJ;
    public static final Comparator<View> LIZLLL;
    public static final 07T.a<Rect> LJII;
    public 07p LJ;
    public boolean LJFF;
    public ViewGroup$OnHierarchyChangeListener LJI;
    public final List<View> LJIIIIZZ;
    public final 05l<View> LJIIIZ;
    public final List<View> LJIIJ;
    public final List<View> LJIIJJI;
    public Paint LJIIL;
    public final int[] LJIILIIL;
    public final int[] LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public int[] LJIIZILJ;
    public View LJIJ;
    public View LJIJI;
    public f LJIJJ;
    public boolean LJIJJLI;
    public Drawable LJIL;
    public 085 LJJ;
    public final 084 LJJI;
    
    static {
        Covode.recordClassIndex(644);
        final Package package1 = 1nH.class.getPackage();
        String name;
        if (package1 != null) {
            name = package1.getName();
        }
        else {
            name = null;
        }
        LIZ = name;
        LIZLLL = new g();
        LIZIZ = new Class[] { Context.class, AttributeSet.class };
        LIZJ = new ThreadLocal<Map<String, Constructor<b>>>();
        LJII = new 07T.c<Rect>(12);
    }
    
    public 1nH(final Context context) {
        this(context, null);
    }
    
    public 1nH(final Context context, final AttributeSet set) {
        this(context, set, 2130969398);
    }
    
    public 1nH(final Context context, final AttributeSet set, int i) {
        super(context, set, i);
        this.LJIIIIZZ = new ArrayList<View>();
        this.LJIIIZ = new 05l<View>();
        this.LJIIJ = new ArrayList<View>();
        this.LJIIJJI = new ArrayList<View>();
        this.LJIILIIL = new int[2];
        this.LJIILJJIL = new int[2];
        this.LJJI = new 084();
        final int n = 0;
        TypedArray typedArray;
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(set, new int[] { 2130969748, 2130971108 }, 0, 2131886866);
        }
        else {
            typedArray = context.obtainStyledAttributes(set, new int[] { 2130969748, 2130971108 }, i, 0);
        }
        if (Build$VERSION.SDK_INT >= 29) {
            if (i == 0) {
                this.saveAttributeDataForStyleable(context, new int[] { 2130969748, 2130971108 }, set, typedArray, 0, 2131886866);
            }
            else {
                this.saveAttributeDataForStyleable(context, new int[] { 2130969748, 2130971108 }, set, typedArray, i, 0);
            }
        }
        i = typedArray.getResourceId(0, 0);
        if (i != 0) {
            final Resources resources = context.getResources();
            this.LJIIZILJ = resources.getIntArray(i);
            final float density = resources.getDisplayMetrics().density;
            int length;
            int[] ljiizilj;
            for (length = this.LJIIZILJ.length, i = n; i < length; ++i) {
                ljiizilj = this.LJIIZILJ;
                ljiizilj[i] *= (int)density;
            }
        }
        this.LJIL = typedArray.getDrawable(1);
        typedArray.recycle();
        this.LIZJ();
        super.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)new d());
        if (((View)this).getImportantForAccessibility() == 0) {
            ((View)this).setImportantForAccessibility(1);
        }
    }
    
    public static b LIZ(final Context context, final AttributeSet set, final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        String s2;
        if (s.startsWith(".")) {
            final StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(s);
            s2 = sb.toString();
        }
        else if (s.indexOf(46) >= 0) {
            s2 = s;
        }
        else {
            final String liz = 1nH.LIZ;
            s2 = s;
            if (!TextUtils.isEmpty((CharSequence)liz)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(liz);
                sb2.append('.');
                sb2.append(s);
                s2 = sb2.toString();
            }
        }
        try {
            final ThreadLocal<Map<String, Constructor<b>>> lizj = 1nH.LIZJ;
            Map map;
            if ((map = lizj.get()) == null) {
                map = new HashMap();
                lizj.set(map);
            }
            Constructor<?> constructor;
            if ((constructor = (Constructor)map.get(s2)) == null) {
                constructor = Class.forName(s2, false, context.getClassLoader()).getConstructor(1nH.LIZIZ);
                constructor.setAccessible(true);
                map.put(s2, constructor);
            }
            return (b)constructor.newInstance(context, set);
        }
        catch (final Exception ex) {
            throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(s2)), ex);
        }
    }
    
    public static Rect LIZ() {
        Rect rect;
        if ((rect = 1nH.LJII.LIZ()) == null) {
            rect = new Rect();
        }
        return rect;
    }
    
    private void LIZ(int n, final Rect rect, final Rect rect2, final e e, final int n2, final int n3) {
        final int absoluteGravity = Gravity.getAbsoluteGravity(LJ(e.LIZJ), n);
        n = Gravity.getAbsoluteGravity(LIZJ(e.LIZLLL), n);
        final int n4 = absoluteGravity & 0x7;
        final int n5 = absoluteGravity & 0x70;
        final int n6 = n & 0x7;
        final int n7 = n & 0x70;
        if (n6 != 1) {
            if (n6 != 5) {
                n = rect.left;
            }
            else {
                n = rect.right;
            }
        }
        else {
            n = rect.left + rect.width() / 2;
        }
        int n8;
        if (n7 != 16) {
            if (n7 != 80) {
                n8 = rect.top;
            }
            else {
                n8 = rect.bottom;
            }
        }
        else {
            n8 = rect.top + rect.height() / 2;
        }
        int n9;
        if (n4 != 1) {
            n9 = n;
            if (n4 != 5) {
                n9 = n - n2;
            }
        }
        else {
            n9 = n - n2 / 2;
        }
        if (n5 != 16) {
            n = n8;
            if (n5 != 80) {
                n = n8 - n3;
            }
        }
        else {
            n = n8 - n3 / 2;
        }
        rect2.set(n9, n, n2 + n9, n3 + n);
    }
    
    private void LIZ(final e e, final Rect rect, final int n, final int n2) {
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int max = Math.max(this.getPaddingLeft() + e.leftMargin, Math.min(rect.left, width - this.getPaddingRight() - n - e.rightMargin));
        final int max2 = Math.max(this.getPaddingTop() + e.topMargin, Math.min(rect.top, height - this.getPaddingBottom() - n2 - e.bottomMargin));
        rect.set(max, max2, n + max, n2 + max2);
    }
    
    public static void LIZ(final Rect rect) {
        rect.setEmpty();
        1nH.LJII.LIZ(rect);
    }
    
    private void LIZ(final View view, final Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix = 05m.LIZ.get();
        if (matrix == null) {
            matrix = new Matrix();
            05m.LIZ.set(matrix);
        }
        else {
            matrix.reset();
        }
        05m.LIZ((ViewParent)this, view, matrix);
        RectF rectF;
        if ((rectF = 05m.LIZIZ.get()) == null) {
            rectF = new RectF();
            05m.LIZIZ.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int)(rectF.left + 0.5f), (int)(rectF.top + 0.5f), (int)(rectF.right + 0.5f), (int)(rectF.bottom + 0.5f));
    }
    
    private void LIZ(final View view, final boolean b, final Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
            return;
        }
        if (b) {
            this.LIZ(view, rect);
            return;
        }
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }
    
    private void LIZ(final boolean b) {
        final int childCount = this.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final b liz = ((e)child.getLayoutParams()).LIZ;
            if (liz != null) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (b) {
                    liz.onInterceptTouchEvent(this, child, obtain);
                }
                else {
                    liz.onTouchEvent(this, child, obtain);
                }
                obtain.recycle();
            }
        }
        for (int j = 0; j < childCount; ++j) {
            ((e)this.getChildAt(j).getLayoutParams()).LJIIL = false;
        }
        this.LJIJ = null;
        this.LJIILL = false;
    }
    
    private boolean LIZ(final MotionEvent motionEvent, final int n) {
        final int actionMasked = motionEvent.getActionMasked();
        final List<View> ljiij = this.LJIIJ;
        ljiij.clear();
        final boolean childrenDrawingOrderEnabled = this.isChildrenDrawingOrderEnabled();
        final int childCount = this.getChildCount();
        for (int i = childCount - 1; i >= 0; --i) {
            int childDrawingOrder;
            if (childrenDrawingOrderEnabled) {
                childDrawingOrder = this.getChildDrawingOrder(childCount, i);
            }
            else {
                childDrawingOrder = i;
            }
            ljiij.add(this.getChildAt(childDrawingOrder));
        }
        final Comparator<View> lizlll = 1nH.LIZLLL;
        if (lizlll != null) {
            Collections.sort((List<Object>)ljiij, (Comparator<? super Object>)lizlll);
        }
        final int size = ljiij.size();
        MotionEvent motionEvent2 = null;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
    Label_0238_Outer:
        while (true) {
            n5 = n3;
            if (n2 >= size) {
                break;
            }
            final View ljij = ljiij.get(n2);
            final e e = (e)ljij.getLayoutParams();
            final b liz = e.LIZ;
            while (true) {
                int n8 = 0;
                Label_0331: {
                    Label_0309: {
                        if (n3 == 0 && n4 == 0) {
                            break Label_0309;
                        }
                        MotionEvent obtain;
                        int n6;
                        int n7;
                        if (actionMasked != 0) {
                            obtain = motionEvent2;
                            n6 = n4;
                            n7 = n3;
                            if (liz != null) {
                                if ((obtain = motionEvent2) == null) {
                                    final long uptimeMillis = SystemClock.uptimeMillis();
                                    obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                }
                                if (n != 0) {
                                    if (n != 1) {
                                        n7 = n3;
                                        n6 = n4;
                                    }
                                    else {
                                        liz.onTouchEvent(this, ljij, obtain);
                                        n6 = n4;
                                        n7 = n3;
                                    }
                                }
                                else {
                                    liz.onInterceptTouchEvent(this, ljij, obtain);
                                    n6 = n4;
                                    n7 = n3;
                                }
                            }
                        }
                        else {
                            n8 = n3;
                            if (n3 == 0) {
                                break Label_0309;
                            }
                            break Label_0331;
                        }
                        ++n2;
                        motionEvent2 = obtain;
                        n4 = n6;
                        n3 = n7;
                        continue Label_0238_Outer;
                    }
                    n8 = n3;
                    if (liz != null) {
                        boolean b;
                        if (n != 0) {
                            if (n != 1) {
                                n8 = n3;
                                break Label_0331;
                            }
                            b = liz.onTouchEvent(this, ljij, motionEvent);
                        }
                        else {
                            b = liz.onInterceptTouchEvent(this, ljij, motionEvent);
                        }
                        n8 = (b ? 1 : 0);
                        if (b) {
                            this.LJIJ = ljij;
                            n8 = (b ? 1 : 0);
                        }
                    }
                }
                if (e.LIZ == null) {
                    e.LJIIL = false;
                }
                final boolean ljiil = e.LJIIL;
                if (!e.LJIIL) {
                    final boolean ljiil2 = (e.LIZ != null && e.LIZ.blocksInteractionBelow(this, ljij)) | e.LJIIL;
                    if (!(e.LJIIL = ljiil2)) {
                        final int n9 = 0;
                        MotionEvent obtain = motionEvent2;
                        int n6 = n9;
                        int n7 = n8;
                        if (!ljiil2) {
                            continue;
                        }
                        n5 = n8;
                        if (false) {
                            obtain = motionEvent2;
                            n6 = n9;
                            n7 = n8;
                            continue;
                        }
                        break;
                    }
                }
                n5 = n8;
                if (!ljiil) {
                    final int n6 = 1;
                    final MotionEvent obtain = motionEvent2;
                    final int n7 = n8;
                    continue;
                }
                break;
            }
            break;
        }
        ljiij.clear();
        return n5 != 0;
    }
    
    private int LIZIZ(final int n) {
        final int[] ljiizilj = this.LJIIZILJ;
        if (ljiizilj == null) {
            return 0;
        }
        if (n < 0 || n >= ljiizilj.length) {
            return 0;
        }
        return ljiizilj[n];
    }
    
    private void LIZIZ() {
        this.LJIIIIZZ.clear();
        final 05l<View> ljiiiz = this.LJIIIZ;
        for (int size = ljiiiz.LIZIZ.size(), i = 0; i < size; ++i) {
            final ArrayList list = ljiiiz.LIZIZ.LIZJ(i);
            if (list != null) {
                list.clear();
                ljiiiz.LIZ.LIZ(list);
            }
        }
        ljiiiz.LIZIZ.clear();
        for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j) {
            final View child = this.getChildAt(j);
            final e lizlll = this.LIZLLL(child);
            Label_0127: {
                if (lizlll.LJFF == -1) {
                    lizlll.LJIIJJI = null;
                    lizlll.LJIIJ = null;
                }
                else {
                    Label_0405: {
                        if (lizlll.LJIIJ != null && lizlll.LJIIJ.getId() == lizlll.LJFF) {
                            View ljiij = lizlll.LJIIJ;
                            for (ViewParent viewParent = lizlll.LJIIJ.getParent(); viewParent != this; viewParent = viewParent.getParent()) {
                                if (viewParent == null || viewParent == child) {
                                    lizlll.LJIIJJI = null;
                                    lizlll.LJIIJ = null;
                                    break Label_0405;
                                }
                                if (viewParent instanceof View) {
                                    ljiij = (View)viewParent;
                                }
                            }
                            lizlll.LJIIJJI = ljiij;
                            break Label_0127;
                        }
                    }
                    lizlll.LJIIJ = this.findViewById(lizlll.LJFF);
                    if (lizlll.LJIIJ != null) {
                        if (lizlll.LJIIJ == this) {
                            if (!this.isInEditMode()) {
                                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                            }
                            lizlll.LJIIJJI = null;
                            lizlll.LJIIJ = null;
                        }
                        else {
                            View ljiij2 = lizlll.LJIIJ;
                            ViewParent viewParent2 = lizlll.LJIIJ.getParent();
                            while (viewParent2 != this && viewParent2 != null) {
                                if (viewParent2 == child) {
                                    if (this.isInEditMode()) {
                                        lizlll.LJIIJJI = null;
                                        lizlll.LJIIJ = null;
                                        break Label_0127;
                                    }
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                                else {
                                    if (viewParent2 instanceof View) {
                                        ljiij2 = (View)viewParent2;
                                    }
                                    viewParent2 = viewParent2.getParent();
                                }
                            }
                            lizlll.LJIIJJI = ljiij2;
                        }
                    }
                    else {
                        if (!this.isInEditMode()) {
                            final StringBuilder sb = new StringBuilder("Could not find CoordinatorLayout descendant view with id ");
                            sb.append(this.getResources().getResourceName(lizlll.LJFF));
                            sb.append(" to anchor view ");
                            sb.append(child);
                            throw new IllegalStateException(sb.toString());
                        }
                        lizlll.LJIIJJI = null;
                        lizlll.LJIIJ = null;
                    }
                }
            }
            this.LJIIIZ.LIZ(child);
            for (int k = 0; k < childCount; ++k) {
                if (k != j) {
                    final View child2 = this.getChildAt(k);
                    if (child2 != lizlll.LJIIJJI) {
                        final int layoutDirection = ((View)this).getLayoutDirection();
                        final int absoluteGravity = Gravity.getAbsoluteGravity(((e)child2.getLayoutParams()).LJI, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(lizlll.LJII, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            if (lizlll.LIZ == null || !lizlll.LIZ.layoutDependsOn(this, child, child2)) {
                                continue;
                            }
                        }
                    }
                    if (!this.LJIIIZ.LIZIZ.containsKey(child2)) {
                        this.LJIIIZ.LIZ(child2);
                    }
                    final 05l<View> ljiiiz2 = this.LJIIIZ;
                    if (!ljiiiz2.LIZIZ.containsKey(child2) || !ljiiiz2.LIZIZ.containsKey(child)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList list2;
                    if ((list2 = ljiiiz2.LIZIZ.get(child2)) == null) {
                        if ((list2 = ljiiiz2.LIZ.LIZ()) == null) {
                            list2 = new ArrayList();
                        }
                        ljiiiz2.LIZIZ.put(child2, list2);
                    }
                    list2.add(child);
                }
            }
        }
        this.LJIIIIZZ.addAll(this.LJIIIZ.LIZ());
        Collections.reverse(this.LJIIIIZZ);
    }
    
    public static int LIZJ(int n) {
        int n2 = n;
        if ((n & 0x7) == 0x0) {
            n2 = (n | 0x800003);
        }
        n = n2;
        if ((n2 & 0x70) == 0x0) {
            n = (n2 | 0x30);
        }
        return n;
    }
    
    private void LIZJ() {
        if (((View)this).getFitsSystemWindows()) {
            if (this.LJJ == null) {
                this.LJJ = (085)new CoordinatorLayout.CoordinatorLayout$1(this);
            }
            t.LIZ((View)this, this.LJJ);
            this.setSystemUiVisibility(1280);
            return;
        }
        t.LIZ((View)this, (085)null);
    }
    
    private void LIZJ(final View view, final int ljiiiizz) {
        final e e = (e)view.getLayoutParams();
        if (e.LJIIIIZZ != ljiiiizz) {
            t.LIZJ(view, ljiiiizz - e.LJIIIIZZ);
            e.LJIIIIZZ = ljiiiizz;
        }
    }
    
    public static int LIZLLL(final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 8388661;
        }
        return n2;
    }
    
    private e LIZLLL(final View view) {
        final e e = (e)view.getLayoutParams();
        if (!e.LIZIZ) {
            if (view instanceof a) {
                e.LIZ(((a)view).getBehavior());
                e.LIZIZ = true;
            }
            else {
                Label_0073: {
                    for (Class<? extends View> clazz = view.getClass(); clazz != null; clazz = (Class<? extends View>)clazz.getSuperclass()) {
                        final c c = clazz.getAnnotation(c.class);
                        if (c != null) {
                            break Label_0073;
                        }
                    }
                    while (true) {
                        break Label_0100;
                        try {
                            final c c;
                            e.LIZ((b)c.LIZ().getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
                            e.LIZIZ = true;
                        }
                        catch (final Exception ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        return e;
    }
    
    private void LIZLLL(final View view, final int ljiiiz) {
        final e e = (e)view.getLayoutParams();
        if (e.LJIIIZ != ljiiiz) {
            t.LIZIZ(view, ljiiiz - e.LJIIIZ);
            e.LJIIIZ = ljiiiz;
        }
    }
    
    public static int LJ(final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 17;
        }
        return n2;
    }
    
    public final void LIZ(final int n) {
        final int layoutDirection = ((View)this).getLayoutDirection();
        final int size = this.LJIIIIZZ.size();
        final Rect liz = LIZ();
        final Rect liz2 = LIZ();
        final Rect liz3 = LIZ();
        for (int i = 0; i < size; ++i) {
            final View view = this.LJIIIIZZ.get(i);
            final e e = (e)view.getLayoutParams();
            if (n != 0 || view.getVisibility() != 8) {
                for (int j = 0; j < i; ++j) {
                    if (e.LJIIJJI == this.LJIIIIZZ.get(j)) {
                        final e e2 = (e)view.getLayoutParams();
                        if (e2.LJIIJ != null) {
                            final Rect liz4 = LIZ();
                            final Rect liz5 = LIZ();
                            final Rect liz6 = LIZ();
                            this.LIZ(e2.LJIIJ, liz4);
                            this.LIZ(view, false, liz5);
                            final int measuredWidth = view.getMeasuredWidth();
                            final int measuredHeight = view.getMeasuredHeight();
                            this.LIZ(layoutDirection, liz4, liz6, e2, measuredWidth, measuredHeight);
                            int n2;
                            if (liz6.left != liz5.left || liz6.top != liz5.top) {
                                n2 = 1;
                            }
                            else {
                                n2 = 0;
                            }
                            this.LIZ(e2, liz6, measuredWidth, measuredHeight);
                            final int n3 = liz6.left - liz5.left;
                            final int n4 = liz6.top - liz5.top;
                            if (n3 != 0) {
                                t.LIZJ(view, n3);
                            }
                            if (n4 != 0) {
                                t.LIZIZ(view, n4);
                            }
                            if (n2 != 0) {
                                final b liz7 = e2.LIZ;
                                if (liz7 != null) {
                                    liz7.onDependentViewChanged(this, view, e2.LJIIJ);
                                }
                            }
                            LIZ(liz4);
                            LIZ(liz5);
                            LIZ(liz6);
                        }
                    }
                }
                this.LIZ(view, true, liz2);
                if (e.LJI != 0 && !liz2.isEmpty()) {
                    final int absoluteGravity = Gravity.getAbsoluteGravity(e.LJI, layoutDirection);
                    final int n5 = absoluteGravity & 0x70;
                    if (n5 != 48) {
                        if (n5 == 80) {
                            liz.bottom = Math.max(liz.bottom, this.getHeight() - liz2.top);
                        }
                    }
                    else {
                        liz.top = Math.max(liz.top, liz2.bottom);
                    }
                    final int n6 = absoluteGravity & 0x7;
                    if (n6 != 3) {
                        if (n6 == 5) {
                            liz.right = Math.max(liz.right, this.getWidth() - liz2.left);
                        }
                    }
                    else {
                        liz.left = Math.max(liz.left, liz2.right);
                    }
                }
                if (e.LJII != 0 && view.getVisibility() == 0 && view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                    final e e3 = (e)view.getLayoutParams();
                    final b liz8 = e3.LIZ;
                    final Rect liz9 = LIZ();
                    final Rect liz10 = LIZ();
                    liz10.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (liz8 != null && liz8.getInsetDodgeRect(this, view, liz9)) {
                        if (!liz10.contains(liz9)) {
                            final StringBuilder sb = new StringBuilder("Rect should be within the child's bounds. Rect:");
                            sb.append(liz9.toShortString());
                            sb.append(" | Bounds:");
                            sb.append(liz10.toShortString());
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    else {
                        liz9.set(liz10);
                    }
                    LIZ(liz10);
                    Label_0966: {
                        if (!liz9.isEmpty()) {
                            final int absoluteGravity2 = Gravity.getAbsoluteGravity(e3.LJII, layoutDirection);
                            while (true) {
                                Label_1010: {
                                    if ((absoluteGravity2 & 0x30) != 0x30) {
                                        break Label_1010;
                                    }
                                    final int n7 = liz9.top - e3.topMargin - e3.LJIIIZ;
                                    if (n7 >= liz.top) {
                                        break Label_1010;
                                    }
                                    this.LIZLLL(view, liz.top - n7);
                                    final int n8 = 1;
                                    while (true) {
                                        Label_0995: {
                                            if ((absoluteGravity2 & 0x50) != 0x50) {
                                                break Label_0995;
                                            }
                                            final int n9 = this.getHeight() - liz9.bottom - e3.bottomMargin + e3.LJIIIZ;
                                            if (n9 >= liz.bottom) {
                                                break Label_0995;
                                            }
                                            this.LIZLLL(view, n9 - liz.bottom);
                                            while (true) {
                                                Label_0989: {
                                                    if ((absoluteGravity2 & 0x3) != 0x3) {
                                                        break Label_0989;
                                                    }
                                                    final int n10 = liz9.left - e3.leftMargin - e3.LJIIIIZZ;
                                                    if (n10 >= liz.left) {
                                                        break Label_0989;
                                                    }
                                                    this.LIZJ(view, liz.left - n10);
                                                    final int n11 = 1;
                                                    if ((absoluteGravity2 & 0x5) == 0x5) {
                                                        final int n12 = this.getWidth() - liz9.right - e3.rightMargin + e3.LJIIIIZZ;
                                                        if (n12 < liz.right) {
                                                            this.LIZJ(view, n12 - liz.right);
                                                            break Label_0966;
                                                        }
                                                    }
                                                    if (n11 == 0) {
                                                        this.LIZJ(view, 0);
                                                    }
                                                    break Label_0966;
                                                }
                                                final int n11 = 0;
                                                continue;
                                            }
                                        }
                                        if (n8 == 0) {
                                            this.LIZLLL(view, 0);
                                        }
                                        continue;
                                    }
                                }
                                final int n8 = 0;
                                continue;
                            }
                        }
                    }
                    LIZ(liz9);
                }
                if (n != 2) {
                    liz3.set(((e)view.getLayoutParams()).LJIILJJIL);
                    if (liz3.equals((Object)liz2)) {
                        continue;
                    }
                    ((e)view.getLayoutParams()).LJIILJJIL.set(liz2);
                }
                for (int k = i + 1; k < size; ++k) {
                    final View view2 = this.LJIIIIZZ.get(k);
                    final e e4 = (e)view2.getLayoutParams();
                    final b liz11 = e4.LIZ;
                    if (liz11 != null && liz11.layoutDependsOn(this, view2, view)) {
                        if (n == 0) {
                            if (e4.LJIILIIL) {
                                e4.LJIILIIL = false;
                                continue;
                            }
                        }
                        else if (n == 2) {
                            liz11.onDependentViewRemoved(this, view2, view);
                            continue;
                        }
                        final boolean onDependentViewChanged = liz11.onDependentViewChanged(this, view2, view);
                        if (n == 1) {
                            e4.LJIILIIL = onDependentViewChanged;
                        }
                    }
                }
            }
        }
        LIZ(liz);
        LIZ(liz2);
        LIZ(liz3);
    }
    
    public final void LIZ(final View view) {
        final List liziz = this.LJIIIZ.LIZIZ(view);
        if (liziz != null && !liziz.isEmpty()) {
            for (int i = 0; i < liziz.size(); ++i) {
                final View view2 = liziz.get(i);
                final b liz = ((e)view2.getLayoutParams()).LIZ;
                if (liz != null) {
                    liz.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }
    
    public final void LIZ(final View view, final int n) {
        this.LJJI.LIZ(n);
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final e e = (e)child.getLayoutParams();
            if (e.LIZ(n)) {
                final b liz = e.LIZ;
                if (liz != null) {
                    liz.onStopNestedScroll(this, child, view, n);
                }
                e.LIZ(n, false);
                e.LJIILIIL = false;
            }
        }
        this.LJIJI = null;
    }
    
    public final void LIZ(final View view, final int n, final int n2, final int n3, final int n4) {
        this.measureChildWithMargins(view, n, n2, n3, n4);
    }
    
    public final void LIZ(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.LIZ(view, n, n2, n3, n4, 0, this.LJIILJJIL);
    }
    
    public final void LIZ(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        final int childCount = this.getChildCount();
        int n6 = 0;
        int i = 0;
        int n7 = 0;
        int n8 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n9 = n8;
            int n10 = n7;
            int n11 = n6;
            if (child.getVisibility() != 8) {
                final e e = (e)child.getLayoutParams();
                n9 = n8;
                n10 = n7;
                n11 = n6;
                if (e.LIZ(n5)) {
                    final b liz = e.LIZ;
                    n9 = n8;
                    n10 = n7;
                    n11 = n6;
                    if (liz != null) {
                        final int[] ljiiliil = this.LJIILIIL;
                        ljiiliil[1] = (ljiiliil[0] = 0);
                        liz.onNestedScroll(this, child, view, n, n2, n3, n4, n5, ljiiliil);
                        final int[] ljiiliil2 = this.LJIILIIL;
                        int n12;
                        if (n3 > 0) {
                            n12 = Math.max(n7, ljiiliil2[0]);
                        }
                        else {
                            n12 = Math.min(n7, ljiiliil2[0]);
                        }
                        int n13;
                        if (n4 > 0) {
                            n13 = Math.max(n8, this.LJIILIIL[1]);
                        }
                        else {
                            n13 = Math.min(n8, this.LJIILIIL[1]);
                        }
                        n11 = 1;
                        n10 = n12;
                        n9 = n13;
                    }
                }
            }
            ++i;
            n8 = n9;
            n7 = n10;
            n6 = n11;
        }
        array[0] += n7;
        array[1] += n8;
        if (n6 != 0) {
            this.LIZ(1);
        }
    }
    
    public final void LIZ(final View view, final int n, final int n2, final int[] array, final int n3) {
        final int childCount = this.getChildCount();
        int n4 = 0;
        int i = 0;
        int n5 = 0;
        int n6 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n7 = n6;
            int n8 = n5;
            int n9 = n4;
            if (child.getVisibility() != 8) {
                final e e = (e)child.getLayoutParams();
                n7 = n6;
                n8 = n5;
                n9 = n4;
                if (e.LIZ(n3)) {
                    final b liz = e.LIZ;
                    n7 = n6;
                    n8 = n5;
                    n9 = n4;
                    if (liz != null) {
                        final int[] ljiiliil = this.LJIILIIL;
                        ljiiliil[1] = (ljiiliil[0] = 0);
                        liz.onNestedPreScroll(this, child, view, n, n2, ljiiliil, n3);
                        final int[] ljiiliil2 = this.LJIILIIL;
                        int n10;
                        if (n > 0) {
                            n10 = Math.max(n5, ljiiliil2[0]);
                        }
                        else {
                            n10 = Math.min(n5, ljiiliil2[0]);
                        }
                        final int[] ljiiliil3 = this.LJIILIIL;
                        int n11;
                        if (n2 > 0) {
                            n11 = Math.max(n6, ljiiliil3[1]);
                        }
                        else {
                            n11 = Math.min(n6, ljiiliil3[1]);
                        }
                        n9 = 1;
                        n8 = n10;
                        n7 = n11;
                    }
                }
            }
            ++i;
            n6 = n7;
            n5 = n8;
            n4 = n9;
        }
        array[0] = n5;
        array[1] = n6;
        if (n4 != 0) {
            this.LIZ(1);
        }
    }
    
    public final boolean LIZ(final View view, final int n, final int n2) {
        final Rect liz = LIZ();
        this.LIZ(view, liz);
        try {
            return liz.contains(n, n2);
        }
        finally {
            LIZ(liz);
        }
    }
    
    public final boolean LIZ(final View view, final View view2, final int n, final int n2) {
        final int childCount = this.getChildCount();
        int i = 0;
        boolean b = false;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            boolean b2 = b;
            if (child.getVisibility() != 8) {
                final e e = (e)child.getLayoutParams();
                final b liz = e.LIZ;
                if (liz != null) {
                    final boolean onStartNestedScroll = liz.onStartNestedScroll(this, child, view, view2, n, n2);
                    b2 = (b | onStartNestedScroll);
                    e.LIZ(n2, onStartNestedScroll);
                }
                else {
                    e.LIZ(n2, false);
                    b2 = b;
                }
            }
            ++i;
            b = b2;
        }
        return b;
    }
    
    public final List<View> LIZIZ(final View view) {
        final 05l<View> ljiiiz = this.LJIIIZ;
        final int size = ljiiiz.LIZIZ.size();
        ArrayList<View> list = null;
        ArrayList<View> list3;
        for (int i = 0; i < size; ++i, list = list3) {
            final ArrayList list2 = ljiiiz.LIZIZ.LIZJ(i);
            list3 = list;
            if (list2 != null) {
                list3 = list;
                if (list2.contains(view)) {
                    if ((list3 = list) == null) {
                        list3 = new ArrayList<View>();
                    }
                    list3.add(ljiiiz.LIZIZ.LIZIZ(i));
                }
            }
        }
        this.LJIIJJI.clear();
        if (list != null) {
            this.LJIIJJI.addAll(list);
        }
        return this.LJIIJJI;
    }
    
    public final void LIZIZ(final View view, int max) {
        final e e = (e)view.getLayoutParams();
        final View ljiij = e.LJIIJ;
        final int n = 0;
        if (ljiij == null && e.LJFF != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (e.LJIIJ != null) {
            final View ljiij2 = e.LJIIJ;
            final Rect liz = LIZ();
            final Rect liz2 = LIZ();
            try {
                this.LIZ(ljiij2, liz);
                final e e2 = (e)view.getLayoutParams();
                final int measuredWidth = view.getMeasuredWidth();
                final int measuredHeight = view.getMeasuredHeight();
                this.LIZ(max, liz, liz2, e2, measuredWidth, measuredHeight);
                this.LIZ(e2, liz2, measuredWidth, measuredHeight);
                view.layout(liz2.left, liz2.top, liz2.right, liz2.bottom);
                return;
            }
            finally {
                LIZ(liz);
                LIZ(liz2);
            }
        }
        if (e.LJ >= 0) {
            final int lj = e.LJ;
            final e e3 = (e)view.getLayoutParams();
            final int absoluteGravity = Gravity.getAbsoluteGravity(LIZLLL(e3.LIZJ), max);
            final int n2 = absoluteGravity & 0x7;
            final int n3 = absoluteGravity & 0x70;
            final int width = this.getWidth();
            final int height = this.getHeight();
            final int measuredWidth2 = view.getMeasuredWidth();
            final int measuredHeight2 = view.getMeasuredHeight();
            int n4 = lj;
            if (max == 1) {
                n4 = width - lj;
            }
            max = this.LIZIZ(n4) - measuredWidth2;
            if (n2 != 1) {
                if (n2 == 5) {
                    max += measuredWidth2;
                }
            }
            else {
                max += measuredWidth2 / 2;
            }
            int n5;
            if (n3 != 16) {
                if (n3 != 80) {
                    n5 = n;
                }
                else {
                    n5 = measuredHeight2 + 0;
                }
            }
            else {
                n5 = 0 + measuredHeight2 / 2;
            }
            max = Math.max(this.getPaddingLeft() + e3.leftMargin, Math.min(max, width - this.getPaddingRight() - measuredWidth2 - e3.rightMargin));
            final int max2 = Math.max(this.getPaddingTop() + e3.topMargin, Math.min(n5, height - this.getPaddingBottom() - measuredHeight2 - e3.bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        final e e4 = (e)view.getLayoutParams();
        final Rect liz3 = LIZ();
        liz3.set(this.getPaddingLeft() + e4.leftMargin, this.getPaddingTop() + e4.topMargin, this.getWidth() - this.getPaddingRight() - e4.rightMargin, this.getHeight() - this.getPaddingBottom() - e4.bottomMargin);
        if (this.LJ != null && ((View)this).getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            liz3.left += this.LJ.LIZ.LJI().LIZIZ;
            liz3.top += this.LJ.LIZ.LJI().LIZJ;
            liz3.right -= this.LJ.LIZ.LJI().LIZLLL;
            liz3.bottom -= this.LJ.LIZ.LJI().LJ;
        }
        final Rect liz4 = LIZ();
        07x.LIZ(LIZJ(e4.LIZJ), view.getMeasuredWidth(), view.getMeasuredHeight(), liz3, liz4, max);
        view.layout(liz4.left, liz4.top, liz4.right, liz4.bottom);
        LIZ(liz3);
        LIZ(liz4);
    }
    
    public final void LIZIZ(final View view, final View ljiji, final int n, final int n2) {
        this.LJJI.LIZ(n, n2);
        this.LJIJI = ljiji;
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final e e = (e)child.getLayoutParams();
            if (e.LIZ(n2)) {
                final b liz = e.LIZ;
                if (liz != null) {
                    liz.onNestedScrollAccepted(this, child, view, ljiji, n, n2);
                }
            }
        }
    }
    
    public final List<View> LIZJ(final View view) {
        final List liziz = this.LJIIIZ.LIZIZ(view);
        this.LJIIJJI.clear();
        if (liziz != null) {
            this.LJIIJJI.addAll(liziz);
        }
        return this.LJIIJJI;
    }
    
    public boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof e && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public boolean drawChild(final Canvas canvas, final View view, final long n) {
        final e e = (e)view.getLayoutParams();
        if (e.LIZ != null) {
            final float scrimOpacity = e.LIZ.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.LJIIL == null) {
                    this.LJIIL = new Paint();
                }
                this.LJIIL.setColor(e.LIZ.getScrimColor(this, view));
                final Paint ljiil = this.LJIIL;
                final int round = Math.round(scrimOpacity * 255.0f);
                int alpha;
                if (round < 0) {
                    alpha = 0;
                }
                else if ((alpha = round) > 255) {
                    alpha = 255;
                }
                ljiil.setAlpha(alpha);
                final int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float)view.getLeft(), (float)view.getTop(), (float)view.getRight(), (float)view.getBottom(), Region$Op.DIFFERENCE);
                }
                canvas.drawRect((float)this.getPaddingLeft(), (float)this.getPaddingTop(), (float)(this.getWidth() - this.getPaddingRight()), (float)(this.getHeight() - this.getPaddingBottom()), this.LJIIL);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, n);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable ljil = this.LJIL;
        if (ljil != null && ljil.isStateful() && (false | ljil.setState(drawableState))) {
            this.invalidate();
        }
    }
    
    public final List<View> getDependencySortedChildren() {
        this.LIZIZ();
        return Collections.unmodifiableList((List<? extends View>)this.LJIIIIZZ);
    }
    
    public final 07p getLastWindowInsets() {
        return this.LJ;
    }
    
    public int getNestedScrollAxes() {
        return this.LJJI.LIZ();
    }
    
    public Drawable getStatusBarBackground() {
        return this.LJIL;
    }
    
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), this.getPaddingTop() + this.getPaddingBottom());
    }
    
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), this.getPaddingLeft() + this.getPaddingRight());
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LIZ(false);
        if (this.LJIJJLI) {
            if (this.LJIJJ == null) {
                this.LJIJJ = new f();
            }
            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.LJIJJ);
        }
        if (this.LJ == null && ((View)this).getFitsSystemWindows()) {
            ((View)this).requestApplyInsets();
        }
        this.LJIILLIIL = true;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LIZ(false);
        if (this.LJIJJLI && this.LJIJJ != null) {
            this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.LJIJJ);
        }
        final View ljiji = this.LJIJI;
        if (ljiji != null) {
            this.onStopNestedScroll(ljiji);
        }
        this.LJIILLIIL = false;
    }
    
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJFF && this.LJIL != null) {
            final 07p lj = this.LJ;
            if (lj != null) {
                final int lizj = lj.LIZ.LJI().LIZJ;
                if (lizj > 0) {
                    this.LJIL.setBounds(0, 0, this.getWidth(), lizj);
                    this.LJIL.draw(canvas);
                }
            }
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.LIZ(true);
        }
        final boolean liz = this.LIZ(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.LIZ(true);
        }
        return liz;
    }
    
    public void onLayout(final boolean b, int i, int layoutDirection, int size, final int n) {
        layoutDirection = ((View)this).getLayoutDirection();
        View view;
        b liz;
        for (size = this.LJIIIIZZ.size(), i = 0; i < size; ++i) {
            view = this.LJIIIIZZ.get(i);
            if (view.getVisibility() != 8) {
                liz = ((e)view.getLayoutParams()).LIZ;
                if (liz == null || !liz.onLayoutChild(this, view, layoutDirection)) {
                    this.LIZIZ(view, layoutDirection);
                }
            }
        }
    }
    
    public void onMeasure(final int n, final int n2) {
        this.LIZIZ();
        final int childCount = this.getChildCount();
        int i = 0;
    Label_0085:
        while (true) {
            while (i < childCount) {
                final View child = this.getChildAt(i);
                final 05l<View> ljiiiz = this.LJIIIZ;
                for (int size = ljiiiz.LIZIZ.size(), j = 0; j < size; ++j) {
                    final ArrayList list = ljiiiz.LIZIZ.LIZJ(j);
                    if (list != null && list.contains(child)) {
                        final boolean b = true;
                        break Label_0085;
                    }
                }
                ++i;
                continue;
                boolean b = false;
                if (b != this.LJIJJLI) {
                    if (b) {
                        if (this.LJIILLIIL) {
                            if (this.LJIJJ == null) {
                                this.LJIJJ = new f();
                            }
                            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.LJIJJ);
                        }
                        this.LJIJJLI = true;
                    }
                    else {
                        if (this.LJIILLIIL && this.LJIJJ != null) {
                            this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.LJIJJ);
                        }
                        this.LJIJJLI = false;
                    }
                }
                final int paddingLeft = this.getPaddingLeft();
                final int paddingTop = this.getPaddingTop();
                final int paddingRight = this.getPaddingRight();
                final int paddingBottom = this.getPaddingBottom();
                final int layoutDirection = ((View)this).getLayoutDirection();
                boolean b2;
                if (layoutDirection == 1) {
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                final int mode = View$MeasureSpec.getMode(n);
                final int size2 = View$MeasureSpec.getSize(n);
                final int mode2 = View$MeasureSpec.getMode(n2);
                final int size3 = View$MeasureSpec.getSize(n2);
                int suggestedMinimumWidth = this.getSuggestedMinimumWidth();
                int suggestedMinimumHeight = this.getSuggestedMinimumHeight();
                boolean b3;
                if (this.LJ != null && ((View)this).getFitsSystemWindows()) {
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                final int size4 = this.LJIIIIZZ.size();
                int n3 = 0;
                int combineMeasuredStates;
                int max;
                int max2;
            Label_0585:
                for (int k = 0; k < size4; ++k, n3 = combineMeasuredStates, suggestedMinimumHeight = max, suggestedMinimumWidth = max2) {
                    final View view = this.LJIIIIZZ.get(k);
                    combineMeasuredStates = n3;
                    max = suggestedMinimumHeight;
                    max2 = suggestedMinimumWidth;
                    if (view.getVisibility() != 8) {
                        final e e = (e)view.getLayoutParams();
                        while (true) {
                            Label_0651: {
                                if (e.LJ < 0 || mode == 0) {
                                    break Label_0651;
                                }
                                final int liziz = this.LIZIZ(e.LJ);
                                final int n4 = Gravity.getAbsoluteGravity(LIZLLL(e.LIZJ), layoutDirection) & 0x7;
                                Label_0623: {
                                    if (n4 == 3) {
                                        if (!b2) {
                                            break Label_0623;
                                        }
                                    }
                                    else if (n4 == 5) {
                                        if (b2) {
                                            break Label_0623;
                                        }
                                    }
                                    else if (n4 == 5) {
                                        if (b2) {
                                            break Label_0651;
                                        }
                                    }
                                    else if (n4 != 3 || !b2) {
                                        break Label_0651;
                                    }
                                    final int n5 = Math.max(0, liziz - paddingLeft);
                                    break Label_0368;
                                }
                                final int n5 = Math.max(0, size2 - paddingRight - liziz);
                                int measureSpec;
                                int measureSpec2;
                                if (b3 && !view.getFitsSystemWindows()) {
                                    final int liziz2 = this.LJ.LIZ.LJI().LIZIZ;
                                    final int lizlll = this.LJ.LIZ.LJI().LIZLLL;
                                    final int lizj = this.LJ.LIZ.LJI().LIZJ;
                                    final int lj = this.LJ.LIZ.LJI().LJ;
                                    measureSpec = View$MeasureSpec.makeMeasureSpec(size2 - (liziz2 + lizlll), mode);
                                    measureSpec2 = View$MeasureSpec.makeMeasureSpec(size3 - (lizj + lj), mode2);
                                }
                                else {
                                    measureSpec = n;
                                    measureSpec2 = n2;
                                }
                                final b liz = e.LIZ;
                                if (liz == null || !liz.onMeasureChild(this, view, measureSpec, n5, measureSpec2, 0)) {
                                    this.LIZ(view, measureSpec, n5, measureSpec2, 0);
                                }
                                max2 = Math.max(suggestedMinimumWidth, paddingLeft + paddingRight + view.getMeasuredWidth() + e.leftMargin + e.rightMargin);
                                max = Math.max(suggestedMinimumHeight, paddingTop + paddingBottom + view.getMeasuredHeight() + e.topMargin + e.bottomMargin);
                                combineMeasuredStates = View.combineMeasuredStates(n3, view.getMeasuredState());
                                continue Label_0585;
                            }
                            final int n5 = 0;
                            continue;
                        }
                    }
                }
                this.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, n, 0xFF000000 & n3), View.resolveSizeAndState(suggestedMinimumHeight, n2, n3 << 16));
                return;
            }
            final boolean b = false;
            continue Label_0085;
        }
    }
    
    public boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n3 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            boolean b2 = n3 != 0;
            if (child.getVisibility() != 8) {
                final e e = (e)child.getLayoutParams();
                b2 = (n3 != 0);
                if (e.LIZ(0)) {
                    final b liz = e.LIZ;
                    b2 = (n3 != 0);
                    if (liz != null) {
                        b2 = ((n3 | (liz.onNestedFling(this, child, view, n, n2, b) ? 1 : 0)) != 0x0);
                    }
                }
            }
            ++i;
            n3 = (b2 ? 1 : 0);
        }
        if (n3 != 0) {
            this.LIZ(1);
        }
        return n3 != 0;
    }
    
    public boolean onNestedPreFling(final View view, final float n, final float n2) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n3 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            boolean b = n3 != 0;
            if (child.getVisibility() != 8) {
                final e e = (e)child.getLayoutParams();
                b = (n3 != 0);
                if (e.LIZ(0)) {
                    final b liz = e.LIZ;
                    b = (n3 != 0);
                    if (liz != null) {
                        b = ((n3 | (liz.onNestedPreFling(this, child, view, n, n2) ? 1 : 0)) != 0x0);
                    }
                }
            }
            ++i;
            n3 = (b ? 1 : 0);
        }
        return n3 != 0;
    }
    
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        this.LIZ(view, n, n2, array, 0);
    }
    
    public void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.LIZ(view, n, n2, n3, n4, 0);
    }
    
    public void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.LIZIZ(view, view2, n, 0);
    }
    
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof 1nH.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final 1nH.SavedState savedState = (1nH.SavedState)parcelable;
        super.onRestoreInstanceState(((AbsSavedState)savedState).LIZLLL);
        final SparseArray liz = savedState.LIZ;
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            final int id = child.getId();
            final b liz2 = this.LIZLLL(child).LIZ;
            if (id != -1 && liz2 != null) {
                parcelable = (Parcelable)liz.get(id);
                if (parcelable != null) {
                    liz2.onRestoreInstanceState(this, child, parcelable);
                }
            }
        }
    }
    
    public Parcelable onSaveInstanceState() {
        final 1nH.SavedState savedState = new 1nH.SavedState(super.onSaveInstanceState());
        final SparseArray liz = new SparseArray();
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final int id = child.getId();
            final b liz2 = ((e)child.getLayoutParams()).LIZ;
            if (id != -1 && liz2 != null) {
                final Parcelable onSaveInstanceState = liz2.onSaveInstanceState(this, child);
                if (onSaveInstanceState != null) {
                    liz.append(id, (Object)onSaveInstanceState);
                }
            }
        }
        savedState.LIZ = liz;
        return (Parcelable)savedState;
    }
    
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return this.LIZ(view, view2, n, 0);
    }
    
    public void onStopNestedScroll(final View view) {
        this.LIZ(view, 0);
    }
    
    public boolean onTouchEvent(MotionEvent obtain) {
        final int actionMasked = obtain.getActionMasked();
        while (true) {
            Label_0150: {
                int liz;
                if (this.LJIJ == null) {
                    liz = (this.LIZ(obtain, 1) ? 1 : 0);
                    final int n;
                    if ((n = liz) == 0) {
                        break Label_0150;
                    }
                }
                else {
                    liz = 0;
                }
                final b liz2 = ((e)this.LJIJ.getLayoutParams()).LIZ;
                int n = liz;
                if (liz2 == null) {
                    break Label_0150;
                }
                final boolean onTouchEvent = liz2.onTouchEvent(this, this.LJIJ, obtain);
                n = liz;
                final int n2 = onTouchEvent ? 1 : 0;
                boolean b;
                if (this.LJIJ == null) {
                    b = ((n2 | (super.onTouchEvent(obtain) ? 1 : 0)) != 0x0);
                }
                else {
                    b = (n2 != 0);
                    if (n != 0) {
                        final long uptimeMillis = SystemClock.uptimeMillis();
                        obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        super.onTouchEvent(obtain);
                        b = (n2 != 0);
                        if (obtain != null) {
                            obtain.recycle();
                            b = (n2 != 0);
                        }
                    }
                }
                if (actionMasked == 1 || actionMasked == 3) {
                    this.LIZ(false);
                }
                return b;
            }
            final int n2 = false ? 1 : 0;
            continue;
        }
    }
    
    public boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        final b liz = ((e)view.getLayoutParams()).LIZ;
        return (liz != null && liz.onRequestChildRectangleOnScreen(this, view, rect, b)) || super.requestChildRectangleOnScreen(view, rect, b);
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        super.requestDisallowInterceptTouchEvent(b);
        if (b && !this.LJIILL) {
            this.LIZ(false);
            this.LJIILL = true;
        }
    }
    
    public void setFitsSystemWindows(final boolean fitsSystemWindows) {
        super.setFitsSystemWindows(fitsSystemWindows);
        this.LIZJ();
    }
    
    public void setOnHierarchyChangeListener(final ViewGroup$OnHierarchyChangeListener lji) {
        this.LJI = lji;
    }
    
    public void setStatusBarBackground(Drawable ljil) {
        final Drawable ljil2 = this.LJIL;
        if (ljil2 != ljil) {
            Drawable mutate = null;
            if (ljil2 != null) {
                ljil2.setCallback((Drawable$Callback)null);
            }
            if (ljil != null) {
                mutate = ljil.mutate();
            }
            if ((this.LJIL = mutate) != null) {
                if (mutate.isStateful()) {
                    this.LJIL.setState(this.getDrawableState());
                }
                08U.LIZIZ(this.LJIL, ((View)this).getLayoutDirection());
                ljil = this.LJIL;
                ljil.setVisible(this.getVisibility() == 0, false);
                this.LJIL.setCallback((Drawable$Callback)this);
            }
            ((View)this).postInvalidateOnAnimation();
        }
    }
    
    public void setStatusBarBackgroundColor(final int n) {
        this.setStatusBarBackground((Drawable)new ColorDrawable(n));
    }
    
    public void setStatusBarBackgroundResource(final int n) {
        Drawable drawable;
        if (n != 0) {
            drawable = this.getContext().getDrawable(n);
        }
        else {
            drawable = null;
        }
        this.setStatusBarBackground(drawable);
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean b = visibility == 0;
        final Drawable ljil = this.LJIL;
        if (ljil != null && ljil.isVisible() != b) {
            this.LJIL.setVisible(b, false);
        }
    }
    
    public boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.LJIL;
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(648);
        }
        
        b getBehavior();
    }
    
    public abstract static class b<V extends View>
    {
        static {
            Covode.recordClassIndex(649);
        }
        
        public b() {
        }
        
        public b(final Context context, final AttributeSet set) {
        }
        
        public static Object getTag(final View view) {
            return ((e)view.getLayoutParams()).LJIILL;
        }
        
        public static void setTag(final View view, final Object ljiill) {
            ((e)view.getLayoutParams()).LJIILL = ljiill;
        }
        
        public boolean blocksInteractionBelow(final 1nH 1nH, final V v) {
            return this.getScrimOpacity(1nH, v) > 0.0f;
        }
        
        public boolean getInsetDodgeRect(final 1nH 1nH, final V v, final Rect rect) {
            return false;
        }
        
        public int getScrimColor(final 1nH 1nH, final V v) {
            return -16777216;
        }
        
        public float getScrimOpacity(final 1nH 1nH, final V v) {
            return 0.0f;
        }
        
        public boolean layoutDependsOn(final 1nH 1nH, final V v, final View view) {
            return false;
        }
        
        public 07p onApplyWindowInsets(final 1nH 1nH, final V v, final 07p 07p) {
            return 07p;
        }
        
        public void onAttachedToLayoutParams(final e e) {
        }
        
        public boolean onDependentViewChanged(final 1nH 1nH, final V v, final View view) {
            return false;
        }
        
        public void onDependentViewRemoved(final 1nH 1nH, final V v, final View view) {
        }
        
        public void onDetachedFromLayoutParams() {
        }
        
        public boolean onInterceptTouchEvent(final 1nH 1nH, final V v, final MotionEvent motionEvent) {
            return false;
        }
        
        public boolean onLayoutChild(final 1nH 1nH, final V v, final int n) {
            return false;
        }
        
        public boolean onMeasureChild(final 1nH 1nH, final V v, final int n, final int n2, final int n3, final int n4) {
            return false;
        }
        
        public boolean onNestedFling(final 1nH 1nH, final V v, final View view, final float n, final float n2, final boolean b) {
            return false;
        }
        
        public boolean onNestedPreFling(final 1nH 1nH, final V v, final View view, final float n, final float n2) {
            return false;
        }
        
        public void onNestedPreScroll(final 1nH 1nH, final V v, final View view, final int n, final int n2, final int[] array) {
        }
        
        public void onNestedPreScroll(final 1nH 1nH, final V v, final View view, final int n, final int n2, final int[] array, final int n3) {
            if (n3 == 0) {
                this.onNestedPreScroll(1nH, v, view, n, n2, array);
            }
        }
        
        public void onNestedScroll(final 1nH 1nH, final V v, final View view, final int n, final int n2, final int n3, final int n4) {
        }
        
        public void onNestedScroll(final 1nH 1nH, final V v, final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
            if (n5 == 0) {
                this.onNestedScroll(1nH, v, view, n, n2, n3, n4);
            }
        }
        
        public void onNestedScroll(final 1nH 1nH, final V v, final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
            array[0] += n3;
            array[1] += n4;
            this.onNestedScroll(1nH, v, view, n, n2, n3, n4, n5);
        }
        
        public void onNestedScrollAccepted(final 1nH 1nH, final V v, final View view, final View view2, final int n) {
        }
        
        public void onNestedScrollAccepted(final 1nH 1nH, final V v, final View view, final View view2, final int n, final int n2) {
            if (n2 == 0) {
                this.onNestedScrollAccepted(1nH, v, view, view2, n);
            }
        }
        
        public boolean onRequestChildRectangleOnScreen(final 1nH 1nH, final V v, final Rect rect, final boolean b) {
            return false;
        }
        
        public void onRestoreInstanceState(final 1nH 1nH, final V v, final Parcelable parcelable) {
        }
        
        public Parcelable onSaveInstanceState(final 1nH 1nH, final V v) {
            return (Parcelable)View$BaseSavedState.EMPTY_STATE;
        }
        
        public boolean onStartNestedScroll(final 1nH 1nH, final V v, final View view, final View view2, final int n) {
            return false;
        }
        
        public boolean onStartNestedScroll(final 1nH 1nH, final V v, final View view, final View view2, final int n, final int n2) {
            return n2 == 0 && this.onStartNestedScroll(1nH, v, view, view2, n);
        }
        
        public void onStopNestedScroll(final 1nH 1nH, final V v, final View view) {
        }
        
        public void onStopNestedScroll(final 1nH 1nH, final V v, final View view, final int n) {
            if (n == 0) {
                this.onStopNestedScroll(1nH, v, view);
            }
        }
        
        public boolean onTouchEvent(final 1nH 1nH, final V v, final MotionEvent motionEvent) {
            return false;
        }
    }
    
    public @interface c {
        default static {
            Covode.recordClassIndex(650);
        }
        
        Class<? extends b> LIZ();
    }
    
    public final class d implements ViewGroup$OnHierarchyChangeListener
    {
        static {
            Covode.recordClassIndex(651);
        }
        
        public final void onChildViewAdded(final View view, final View view2) {
            if (1nH.this.LJI != null) {
                1nH.this.LJI.onChildViewAdded(view, view2);
            }
        }
        
        public final void onChildViewRemoved(final View view, final View view2) {
            1nH.this.LIZ(2);
            if (1nH.this.LJI != null) {
                1nH.this.LJI.onChildViewRemoved(view, view2);
            }
        }
    }
    
    public static class e extends ViewGroup$MarginLayoutParams
    {
        public b LIZ;
        public boolean LIZIZ;
        public int LIZJ;
        public int LIZLLL;
        public int LJ;
        public int LJFF;
        public int LJI;
        public int LJII;
        public int LJIIIIZZ;
        public int LJIIIZ;
        public View LJIIJ;
        public View LJIIJJI;
        public boolean LJIIL;
        public boolean LJIILIIL;
        public final Rect LJIILJJIL;
        public Object LJIILL;
        public boolean LJIILLIIL;
        public boolean LJIIZILJ;
        
        static {
            Covode.recordClassIndex(652);
        }
        
        public e(final int n, final int n2) {
            super(n, n2);
            this.LJ = -1;
            this.LJFF = -1;
            this.LJIILJJIL = new Rect();
        }
        
        public e(final e e) {
            super((ViewGroup$MarginLayoutParams)e);
            this.LJ = -1;
            this.LJFF = -1;
            this.LJIILJJIL = new Rect();
        }
        
        public e(final Context context, final AttributeSet set) {
            super(context, set);
            this.LJ = -1;
            this.LJFF = -1;
            this.LJIILJJIL = new Rect();
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16842931, 2130969784, 2130969785, 2130969786, 2130969836, 2130969850, 2130969851 });
            this.LIZJ = obtainStyledAttributes.getInteger(0, 0);
            this.LJFF = obtainStyledAttributes.getResourceId(1, -1);
            this.LIZLLL = obtainStyledAttributes.getInteger(2, 0);
            this.LJ = obtainStyledAttributes.getInteger(6, -1);
            this.LJI = obtainStyledAttributes.getInt(5, 0);
            this.LJII = obtainStyledAttributes.getInt(4, 0);
            final boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.LIZIZ = hasValue;
            if (hasValue) {
                this.LIZ = 1nH.LIZ(context, set, obtainStyledAttributes.getString(3));
            }
            obtainStyledAttributes.recycle();
            final b liz = this.LIZ;
            if (liz != null) {
                liz.onAttachedToLayoutParams(this);
            }
        }
        
        public e(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.LJ = -1;
            this.LJFF = -1;
            this.LJIILJJIL = new Rect();
        }
        
        public e(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
            this.LJ = -1;
            this.LJFF = -1;
            this.LJIILJJIL = new Rect();
        }
        
        public final void LIZ(final int n, final boolean b) {
            if (n != 0) {
                if (n == 1) {
                    this.LJIIZILJ = b;
                }
                return;
            }
            this.LJIILLIIL = b;
        }
        
        public final void LIZ(final b liz) {
            final b liz2 = this.LIZ;
            if (liz2 != liz) {
                if (liz2 != null) {
                    liz2.onDetachedFromLayoutParams();
                }
                this.LIZ = liz;
                this.LJIILL = null;
                this.LIZIZ = true;
                if (liz != null) {
                    liz.onAttachedToLayoutParams(this);
                }
            }
        }
        
        public final boolean LIZ(final int n) {
            if (n != 0) {
                return n == 1 && this.LJIIZILJ;
            }
            return this.LJIILLIIL;
        }
    }
    
    public final class f implements ViewTreeObserver$OnPreDrawListener
    {
        static {
            Covode.recordClassIndex(653);
        }
        
        public final boolean onPreDraw() {
            1nH.this.LIZ(0);
            return true;
        }
    }
    
    public static final class g implements Comparator<View>
    {
        static {
            Covode.recordClassIndex(654);
        }
    }
}
