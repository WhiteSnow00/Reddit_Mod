// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.ListAdapter;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import android.graphics.Rect;
import android.widget.ListView;

public class 03b extends ListView
{
    public boolean LIZ;
    public b LIZIZ;
    public final Rect LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public Field LJIIIIZZ;
    public a LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public 08M LJIIL;
    public 14q LJIILIIL;
    
    static {
        Covode.recordClassIndex(461);
    }
    
    public 03b(final Context context, final boolean ljiijji) {
        super(context, (AttributeSet)null, 2130969491);
        this.LIZJ = new Rect();
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = 0;
        this.LJIIJJI = ljiijji;
        this.setCacheColorHint(0);
        try {
            (this.LJIIIIZZ = AbsListView.class.getDeclaredField("mIsChildViewEnabled")).setAccessible(true);
        }
        catch (final NoSuchFieldException ex) {
            0II.LIZ(ex);
        }
    }
    
    private void LIZ() {
        final Drawable selector = this.getSelector();
        if (selector != null && this.LIZ && this.isPressed()) {
            selector.setState(this.getDrawableState());
        }
    }
    
    private void setSelectorEnabled(final boolean liziz) {
        final a ljiiiz = this.LJIIIZ;
        if (ljiiiz != null) {
            ljiiiz.LIZIZ = liziz;
        }
    }
    
    public int LIZ(final int n, int listPaddingTop, int dividerHeight, final int n2, final int n3) {
        listPaddingTop = this.getListPaddingTop();
        final int listPaddingBottom = this.getListPaddingBottom();
        this.getListPaddingLeft();
        this.getListPaddingRight();
        dividerHeight = this.getDividerHeight();
        final Drawable divider = this.getDivider();
        final ListAdapter adapter = this.getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        listPaddingTop += listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        final int count = adapter.getCount();
        View view = null;
        int i = 0;
        int n4 = 0;
        int n5 = 0;
        while (i < count) {
            final int itemViewType = adapter.getItemViewType(i);
            int n6;
            if (itemViewType != (n6 = n4)) {
                view = null;
                n6 = itemViewType;
            }
            final View view2 = adapter.getView(i, view, (ViewGroup)this);
            ViewGroup$LayoutParams layoutParams;
            if ((layoutParams = view2.getLayoutParams()) == null) {
                layoutParams = this.generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            int n7;
            if (layoutParams.height > 0) {
                n7 = View$MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            }
            else {
                n7 = View$MeasureSpec.makeMeasureSpec(0, 0);
            }
            view2.measure(n, n7);
            view2.forceLayout();
            int n8 = listPaddingTop;
            if (i > 0) {
                n8 = listPaddingTop + dividerHeight;
            }
            listPaddingTop = n8 + view2.getMeasuredHeight();
            if (listPaddingTop >= n2) {
                if (n3 >= 0 && i > n3 && n5 > 0 && listPaddingTop != n2) {
                    return n5;
                }
                return n2;
            }
            else {
                int n9 = n5;
                if (n3 >= 0) {
                    n9 = n5;
                    if (i >= n3) {
                        n9 = listPaddingTop;
                    }
                }
                ++i;
                n4 = n6;
                view = view2;
                n5 = n9;
            }
        }
        return listPaddingTop;
    }
    
    public boolean LIZ(final MotionEvent motionEvent, int ljii) {
        final int actionMasked = motionEvent.getActionMasked();
        boolean b2 = false;
    Label_0023:
        while (true) {
            Label_0092: {
                Label_0089: {
                    while (true) {
                        boolean b = false;
                        Label_0077: {
                            if (actionMasked == 1) {
                                b = false;
                                break Label_0077;
                            }
                            if (actionMasked == 2) {
                                b = true;
                                break Label_0077;
                            }
                            if (actionMasked == 3) {
                                break Label_0089;
                            }
                            b2 = true;
                            if (this.LJIILIIL == null) {
                                this.LJIILIIL = new 14q(this);
                            }
                            this.LJIILIIL.LIZ(true);
                            this.LJIILIIL.onTouch((View)this, motionEvent);
                            return b2;
                        }
                        final int pointerIndex = motionEvent.findPointerIndex(ljii);
                        if (pointerIndex >= 0) {
                            ljii = (int)motionEvent.getX(pointerIndex);
                            final int n = (int)motionEvent.getY(pointerIndex);
                            final int pointToPosition = this.pointToPosition(ljii, n);
                            if (pointToPosition == -1) {
                                b2 = b;
                                if (!b) {
                                    break Label_0092;
                                }
                                b2 = b;
                                if (true) {
                                    b2 = b;
                                    break Label_0092;
                                }
                                continue Label_0023;
                            }
                            else {
                                final View child = this.getChildAt(pointToPosition - this.getFirstVisiblePosition());
                                final float n2 = (float)ljii;
                                final float n3 = (float)n;
                                this.LIZ = true;
                                this.drawableHotspotChanged(n2, n3);
                                if (!this.isPressed()) {
                                    this.setPressed(true);
                                }
                                this.layoutChildren();
                                ljii = this.LJII;
                                if (ljii != -1) {
                                    final View child2 = this.getChildAt(ljii - this.getFirstVisiblePosition());
                                    if (child2 != null && child2 != child && child2.isPressed()) {
                                        child2.setPressed(false);
                                    }
                                }
                                this.LJII = pointToPosition;
                                child.drawableHotspotChanged(n2 - child.getLeft(), n3 - child.getTop());
                                if (!child.isPressed()) {
                                    child.setPressed(true);
                                }
                                final Drawable selector = this.getSelector();
                                if (selector != null && pointToPosition != -1) {
                                    ljii = 1;
                                    selector.setVisible(false, false);
                                }
                                else {
                                    ljii = 0;
                                }
                                final Rect lizj = this.LIZJ;
                                lizj.set(child.getLeft(), child.getTop(), child.getRight(), child.getBottom());
                                lizj.left -= this.LIZLLL;
                                lizj.top -= this.LJ;
                                lizj.right += this.LJFF;
                                lizj.bottom += this.LJI;
                                try {
                                    final boolean boolean1 = this.LJIIIIZZ.getBoolean(this);
                                    if (child.isEnabled() != boolean1) {
                                        this.LJIIIIZZ.set(this, !boolean1);
                                        if (pointToPosition != -1) {
                                            this.refreshDrawableState();
                                        }
                                    }
                                }
                                catch (final IllegalAccessException ex) {
                                    0II.LIZ(ex);
                                }
                                if (ljii != 0) {
                                    final Rect lizj2 = this.LIZJ;
                                    final float exactCenterX = lizj2.exactCenterX();
                                    final float exactCenterY = lizj2.exactCenterY();
                                    selector.setVisible(this.getVisibility() == 0, false);
                                    selector.setHotspot(exactCenterX, exactCenterY);
                                }
                                final Drawable selector2 = this.getSelector();
                                if (selector2 != null && pointToPosition != -1) {
                                    selector2.setHotspot(n2, n3);
                                }
                                this.setSelectorEnabled(false);
                                this.refreshDrawableState();
                                if (actionMasked == 1) {
                                    this.performItemClick(child, pointToPosition, this.getItemIdAtPosition(pointToPosition));
                                }
                                continue;
                            }
                        }
                        break;
                    }
                }
                b2 = false;
            }
            this.setPressed(this.LIZ = false);
            this.drawableStateChanged();
            final View child3 = this.getChildAt(this.LJII - this.getFirstVisiblePosition());
            if (child3 != null) {
                child3.setPressed(false);
            }
            final 08M ljiil = this.LJIIL;
            if (ljiil != null) {
                ljiil.LIZIZ();
                this.LJIIL = null;
            }
            if (b2) {
                continue Label_0023;
            }
            break;
        }
        final 14q ljiiliil = this.LJIILIIL;
        boolean b3 = b2;
        if (ljiiliil != null) {
            ljiiliil.LIZ(false);
            b3 = b2;
            return b3;
        }
        return b3;
    }
    
    public void dispatchDraw(final Canvas canvas) {
        if (!this.LIZJ.isEmpty()) {
            final Drawable selector = this.getSelector();
            if (selector != null) {
                selector.setBounds(this.LIZJ);
                selector.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }
    
    public void drawableStateChanged() {
        if (this.LIZIZ != null) {
            return;
        }
        super.drawableStateChanged();
        this.setSelectorEnabled(true);
        this.LIZ();
    }
    
    public boolean hasFocus() {
        return this.LJIIJJI || super.hasFocus();
    }
    
    public boolean hasWindowFocus() {
        return this.LJIIJJI || super.hasWindowFocus();
    }
    
    public boolean isFocused() {
        return this.LJIIJJI || super.isFocused();
    }
    
    public boolean isInTouchMode() {
        return (this.LJIIJJI && this.LJIIJ) || super.isInTouchMode();
    }
    
    public void onDetachedFromWindow() {
        this.LIZIZ = null;
        super.onDetachedFromWindow();
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        if (Build$VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.LIZIZ == null) {
            final b liziz = new b();
            this.LIZIZ = liziz;
            liziz.LIZ.post((Runnable)liziz);
        }
        final boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            final int pointToPosition = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != this.getSelectedItemPosition()) {
                final View child = this.getChildAt(pointToPosition - this.getFirstVisiblePosition());
                if (child.isEnabled()) {
                    this.setSelectionFromTop(pointToPosition, child.getTop() - this.getTop());
                }
                this.LIZ();
            }
        }
        else {
            this.setSelection(-1);
        }
        return onHoverEvent;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LJII = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
        }
        final b liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ.LIZIZ = null;
            liziz.LIZ.removeCallbacks((Runnable)liziz);
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setListSelectionHidden(final boolean ljiij) {
        this.LJIIJ = ljiij;
    }
    
    public void setSelector(final Drawable drawable) {
        a ljiiiz;
        if (drawable != null) {
            ljiiiz = new a(drawable);
        }
        else {
            ljiiiz = null;
        }
        super.setSelector((Drawable)(this.LJIIIZ = ljiiiz));
        final Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.LIZLLL = rect.left;
        this.LJ = rect.top;
        this.LJFF = rect.right;
        this.LJI = rect.bottom;
    }
    
    public final class b implements Runnable
    {
        public final /* synthetic */ 03b LIZ;
        
        static {
            Covode.recordClassIndex(463);
        }
        
        @Override
        public final void run() {
            03b.this.LIZIZ = null;
            03b.this.drawableStateChanged();
        }
    }
    
    public static final class a extends 02O
    {
        public boolean LIZIZ;
        
        static {
            Covode.recordClassIndex(462);
        }
        
        public a(final Drawable drawable) {
            super(drawable);
            this.LIZIZ = true;
        }
        
        @Override
        public final void draw(final Canvas canvas) {
            if (this.LIZIZ) {
                super.draw(canvas);
            }
        }
        
        @Override
        public final void setHotspot(final float n, final float n2) {
            if (this.LIZIZ) {
                super.setHotspot(n, n2);
            }
        }
        
        @Override
        public final void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
            if (this.LIZIZ) {
                super.setHotspotBounds(n, n2, n3, n4);
            }
        }
        
        @Override
        public final boolean setState(final int[] state) {
            return this.LIZIZ && super.setState(state);
        }
        
        @Override
        public final boolean setVisible(final boolean b, final boolean b2) {
            return this.LIZIZ && super.setVisible(b, b2);
        }
    }
}
