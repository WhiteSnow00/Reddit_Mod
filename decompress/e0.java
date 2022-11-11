// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.widget.Adapter;
import android.widget.AdapterView;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import java.lang.reflect.Field;
import android.widget.AbsListView;
import v3.a;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.ListAdapter;
import android.graphics.drawable.Drawable;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import e4.f;
import android.graphics.Rect;
import android.widget.ListView;

public class e0 extends ListView
{
    public final Rect f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public d l;
    public boolean m;
    public boolean n;
    public boolean o;
    public e4.f p;
    public f q;
    
    public e0(final Context context, final boolean n) {
        super(context, (AttributeSet)null, 2130968933);
        this.f = new Rect();
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.n = n;
        ((AbsListView)this).setCacheColorHint(0);
    }
    
    private void setSelectorEnabled(final boolean g) {
        final d l = this.l;
        if (l != null) {
            l.g = g;
        }
    }
    
    public final int a(final int n, final int n2) {
        final int listPaddingTop = ((AbsListView)this).getListPaddingTop();
        final int listPaddingBottom = ((AbsListView)this).getListPaddingBottom();
        int dividerHeight = this.getDividerHeight();
        final Drawable divider = this.getDivider();
        final ListAdapter adapter = this.getAdapter();
        int n3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return n3;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        final int count = ((Adapter)adapter).getCount();
        int n4;
        int i = n4 = 0;
        View view = null;
        while (i < count) {
            final int itemViewType = ((Adapter)adapter).getItemViewType(i);
            int n5;
            if (itemViewType != (n5 = n4)) {
                view = null;
                n5 = itemViewType;
            }
            final View view2 = ((Adapter)adapter).getView(i, view, (ViewGroup)this);
            ViewGroup$LayoutParams layoutParams;
            if ((layoutParams = view2.getLayoutParams()) == null) {
                layoutParams = ((ViewGroup)this).generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            final int height = layoutParams.height;
            int n6;
            if (height > 0) {
                n6 = View$MeasureSpec.makeMeasureSpec(height, 1073741824);
            }
            else {
                n6 = View$MeasureSpec.makeMeasureSpec(0, 0);
            }
            view2.measure(n, n6);
            view2.forceLayout();
            int n7 = n3;
            if (i > 0) {
                n7 = n3 + dividerHeight;
            }
            n3 = n7 + view2.getMeasuredHeight();
            if (n3 >= n2) {
                return n2;
            }
            ++i;
            n4 = n5;
            view = view2;
        }
        return n3;
    }
    
    public final boolean b(final MotionEvent motionEvent, int k) {
        final int actionMasked = motionEvent.getActionMasked();
        final int n = 0;
        boolean b = false;
        Label_0607: {
            Label_0053: {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            b = true;
                            k = n;
                            break Label_0607;
                        }
                        break Label_0053;
                    }
                    else {
                        b = true;
                    }
                }
                else {
                    b = false;
                }
                final int pointerIndex = motionEvent.findPointerIndex(k);
                if (pointerIndex >= 0) {
                    k = (int)motionEvent.getX(pointerIndex);
                    final int n2 = (int)motionEvent.getY(pointerIndex);
                    final int pointToPosition = ((AbsListView)this).pointToPosition(k, n2);
                    if (pointToPosition == -1) {
                        k = 1;
                        break Label_0607;
                    }
                    final View child = ((ViewGroup)this).getChildAt(pointToPosition - ((AdapterView)this).getFirstVisiblePosition());
                    final float n3 = (float)k;
                    final float n4 = (float)n2;
                    this.o = true;
                    a.a((View)this, n3, n4);
                    if (!((View)this).isPressed()) {
                        ((View)this).setPressed(true);
                    }
                    ((AbsListView)this).layoutChildren();
                    k = this.k;
                    if (k != -1) {
                        final View child2 = ((ViewGroup)this).getChildAt(k - ((AdapterView)this).getFirstVisiblePosition());
                        if (child2 != null && child2 != child && child2.isPressed()) {
                            child2.setPressed(false);
                        }
                    }
                    this.k = pointToPosition;
                    a.a(child, n3 - child.getLeft(), n4 - child.getTop());
                    if (!child.isPressed()) {
                        child.setPressed(true);
                    }
                    final Drawable selector = ((AbsListView)this).getSelector();
                    if (selector != null && pointToPosition != -1) {
                        k = 1;
                    }
                    else {
                        k = 0;
                    }
                    if (k != 0) {
                        selector.setVisible(false, false);
                    }
                    final Rect f = this.f;
                    f.set(child.getLeft(), child.getTop(), child.getRight(), child.getBottom());
                    f.left -= this.g;
                    f.top -= this.h;
                    f.right += this.i;
                    f.bottom += this.j;
                    boolean b2 = false;
                    Label_0414: {
                        if (v3.a.b()) {
                            b2 = c.a((AbsListView)this);
                        }
                        else {
                            final Field a = e.a;
                            if (a != null) {
                                try {
                                    b2 = a.getBoolean(this);
                                    break Label_0414;
                                }
                                catch (final IllegalAccessException ex) {
                                    ex.printStackTrace();
                                }
                            }
                            b2 = false;
                        }
                    }
                    if (child.isEnabled() != b2) {
                        final boolean b3 = b2 ^ true;
                        if (v3.a.b()) {
                            c.b((AbsListView)this, b3);
                        }
                        else {
                            final Field a2 = e.a;
                            if (a2 != null) {
                                try {
                                    a2.set(this, b3);
                                }
                                catch (final IllegalAccessException ex2) {
                                    ex2.printStackTrace();
                                }
                            }
                        }
                        if (pointToPosition != -1) {
                            ((View)this).refreshDrawableState();
                        }
                    }
                    if (k != 0) {
                        final Rect f2 = this.f;
                        final float exactCenterX = f2.exactCenterX();
                        final float exactCenterY = f2.exactCenterY();
                        selector.setVisible(((View)this).getVisibility() == 0, false);
                        r3.a.b.e(selector, exactCenterX, exactCenterY);
                    }
                    final Drawable selector2 = ((AbsListView)this).getSelector();
                    if (selector2 != null && pointToPosition != -1) {
                        r3.a.b.e(selector2, n3, n4);
                    }
                    this.setSelectorEnabled(false);
                    ((View)this).refreshDrawableState();
                    if (actionMasked == 1) {
                        ((AdapterView)this).performItemClick(child, pointToPosition, ((AdapterView)this).getItemIdAtPosition(pointToPosition));
                    }
                    b = true;
                    k = 0;
                    break Label_0607;
                }
            }
            b = false;
            k = n;
        }
        if (!b || k != 0) {
            ((View)this).setPressed(this.o = false);
            this.drawableStateChanged();
            final View child3 = ((ViewGroup)this).getChildAt(this.k - ((AdapterView)this).getFirstVisiblePosition());
            if (child3 != null) {
                child3.setPressed(false);
            }
        }
        if (b) {
            if (this.p == null) {
                this.p = new e4.f((ListView)this);
            }
            final e4.f p2 = this.p;
            final boolean u = ((e4.a)p2).u;
            ((e4.a)p2).u = true;
            ((e4.a)p2).onTouch((View)this, motionEvent);
        }
        else {
            final e4.f p3 = this.p;
            if (p3 != null) {
                if (((e4.a)p3).u) {
                    ((e4.a)p3).d();
                }
                ((e4.a)p3).u = false;
            }
        }
        return b;
    }
    
    public final void dispatchDraw(final Canvas canvas) {
        if (!this.f.isEmpty()) {
            final Drawable selector = ((AbsListView)this).getSelector();
            if (selector != null) {
                selector.setBounds(this.f);
                selector.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }
    
    public final void drawableStateChanged() {
        if (this.q != null) {
            return;
        }
        super.drawableStateChanged();
        this.setSelectorEnabled(true);
        final Drawable selector = ((AbsListView)this).getSelector();
        if (selector != null && this.o && ((View)this).isPressed()) {
            selector.setState(((View)this).getDrawableState());
        }
    }
    
    public final boolean hasFocus() {
        return this.n || super.hasFocus();
    }
    
    public final boolean hasWindowFocus() {
        return this.n || super.hasWindowFocus();
    }
    
    public final boolean isFocused() {
        return this.n || super.isFocused();
    }
    
    public final boolean isInTouchMode() {
        return (this.n && this.m) || super.isInTouchMode();
    }
    
    public final void onDetachedFromWindow() {
        this.q = null;
        super.onDetachedFromWindow();
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.q == null) {
            ((View)this).post((Runnable)(this.q = new f()));
        }
        final boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            ((AdapterView)this).setSelection(-1);
        }
        else {
            final int pointToPosition = ((AbsListView)this).pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != ((AdapterView)this).getSelectedItemPosition()) {
                final View child = ((ViewGroup)this).getChildAt(pointToPosition - ((AdapterView)this).getFirstVisiblePosition());
                if (child.isEnabled()) {
                    ((View)this).requestFocus();
                    if (sdk_INT >= 30 && b.d) {
                        try {
                            b.a.invoke(this, pointToPosition, child, Boolean.FALSE, -1, -1);
                            b.b.invoke(this, pointToPosition);
                            b.c.invoke(this, pointToPosition);
                        }
                        catch (final InvocationTargetException ex) {
                            ex.printStackTrace();
                        }
                        catch (final IllegalAccessException ex2) {
                            ex2.printStackTrace();
                        }
                    }
                    else {
                        ((AbsListView)this).setSelectionFromTop(pointToPosition, child.getTop() - ((View)this).getTop());
                    }
                }
                final Drawable selector = ((AbsListView)this).getSelector();
                if (selector != null && this.o && ((View)this).isPressed()) {
                    selector.setState(((View)this).getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.k = ((AbsListView)this).pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
        }
        final f q = this.q;
        if (q != null) {
            final e0 f = q.f;
            f.q = null;
            ((View)f).removeCallbacks((Runnable)q);
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setListSelectionHidden(final boolean m) {
        this.m = m;
    }
    
    public void setSelector(final Drawable drawable) {
        d l;
        if (drawable != null) {
            l = new d(drawable);
        }
        else {
            l = null;
        }
        super.setSelector((Drawable)(this.l = l));
        final Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.g = rect.left;
        this.h = rect.top;
        this.i = rect.right;
        this.j = rect.bottom;
    }
    
    public static final class a
    {
        public static void a(final View view, final float n, final float n2) {
            view.drawableHotspotChanged(n, n2);
        }
    }
    
    public static final class b
    {
        public static Method a;
        public static Method b;
        public static Method c;
        public static boolean d;
        
        static {
            try {
                final Class<Integer> type = Integer.TYPE;
                final Class<Boolean> type2 = Boolean.TYPE;
                final Class<Float> type3 = Float.TYPE;
                (e0.b.a = AbsListView.class.getDeclaredMethod("positionSelector", type, View.class, type2, type3, type3)).setAccessible(true);
                (e0.b.b = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", type)).setAccessible(true);
                (e0.b.c = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", type)).setAccessible(true);
                e0.b.d = true;
            }
            catch (final NoSuchMethodException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public static final class c
    {
        public static boolean a(final AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }
        
        public static void b(final AbsListView absListView, final boolean selectedChildViewEnabled) {
            absListView.setSelectedChildViewEnabled(selectedChildViewEnabled);
        }
    }
    
    public static final class d extends i.a
    {
        public boolean g;
        
        public d(final Drawable drawable) {
            super(drawable);
            this.g = true;
        }
        
        public final void draw(final Canvas canvas) {
            if (this.g) {
                super.draw(canvas);
            }
        }
        
        public final void setHotspot(final float n, final float n2) {
            if (this.g) {
                super.setHotspot(n, n2);
            }
        }
        
        public final void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
            if (this.g) {
                super.setHotspotBounds(n, n2, n3, n4);
            }
        }
        
        public final boolean setState(final int[] state) {
            return this.g && super.setState(state);
        }
        
        public final boolean setVisible(final boolean b, final boolean b2) {
            return this.g && super.setVisible(b, b2);
        }
    }
    
    public static final class e
    {
        public static final Field a;
        
        static {
            Field declaredField = null;
            try {
                final Field field = declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
                declaredField = field;
            }
            catch (final NoSuchFieldException ex) {
                ex.printStackTrace();
            }
            a = declaredField;
        }
    }
    
    public final class f implements Runnable
    {
        public final /* synthetic */ e0 f;
        
        @Override
        public final void run() {
            final e0 f = e0.this;
            f.q = null;
            f.drawableStateChanged();
        }
    }
}
