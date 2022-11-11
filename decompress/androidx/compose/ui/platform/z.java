// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode$b;
import android.view.View$MeasureSpec;
import java.util.Iterator;
import java.util.Set;
import sg2.e;
import android.view.View;
import android.view.ViewParent;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import android.view.ViewGroup;

public final class z extends ViewGroup
{
    public final HashMap<AndroidViewHolder, LayoutNode> f;
    public final HashMap<LayoutNode, AndroidViewHolder> g;
    
    public z(final Context context) {
        super(context);
        this.setClipChildren(false);
        this.f = new HashMap<AndroidViewHolder, LayoutNode>();
        this.g = new HashMap<LayoutNode, AndroidViewHolder>();
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return true;
    }
    
    public final HashMap<AndroidViewHolder, LayoutNode> getHolderToLayoutNode() {
        return this.f;
    }
    
    public final HashMap<LayoutNode, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.g;
    }
    
    public final void onDescendantInvalidated(final View view, final View view2) {
        e.f((Object)view, "child");
        e.f((Object)view2, "target");
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final Set<AndroidViewHolder> keySet = this.f.keySet();
        e.e((Object)keySet, "holderToLayoutNode.keys");
        for (final AndroidViewHolder androidViewHolder : keySet) {
            ((View)androidViewHolder).layout(((View)androidViewHolder).getLeft(), ((View)androidViewHolder).getTop(), ((View)androidViewHolder).getRight(), ((View)androidViewHolder).getBottom());
        }
    }
    
    public final void onMeasure(int u, int v) {
        final int mode = View$MeasureSpec.getMode(u);
        final int n = 1;
        if (mode != 1073741824) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int n2;
        if (View$MeasureSpec.getMode(v) == 1073741824) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            ((View)this).setMeasuredDimension(View$MeasureSpec.getSize(u), View$MeasureSpec.getSize(v));
            final Set<AndroidViewHolder> keySet = this.f.keySet();
            e.e((Object)keySet, "holderToLayoutNode.keys");
            for (final AndroidViewHolder androidViewHolder : keySet) {
                u = androidViewHolder.u;
                if (u != Integer.MIN_VALUE) {
                    v = androidViewHolder.v;
                    if (v == Integer.MIN_VALUE) {
                        continue;
                    }
                    ((View)androidViewHolder).measure(u, v);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final void requestLayout() {
        this.cleanupLayoutState((View)this);
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final LayoutNode layoutNode = this.f.get(child);
            if (child.isLayoutRequested() && layoutNode != null) {
                final LayoutNode$b y = LayoutNode.Y;
                layoutNode.R(false);
            }
        }
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
