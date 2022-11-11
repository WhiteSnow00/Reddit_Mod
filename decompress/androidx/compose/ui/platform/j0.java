// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.graphics.Canvas;
import o1.b;
import o1.c;
import sg2.e;
import android.view.View;
import o1.p;
import android.content.Context;
import android.view.ViewGroup;

public class j0 extends ViewGroup
{
    public boolean f;
    
    public j0(final Context context) {
        super(context);
        this.setClipChildren(false);
        ((View)this).setTag(2131429320, (Object)Boolean.TRUE);
    }
    
    public final void a(final p p3, final View view, final long n) {
        e.f((Object)p3, "canvas");
        e.f((Object)view, "view");
        final Canvas a = c.a;
        super.drawChild(((b)p3).a, view, n);
    }
    
    public void dispatchDraw(final Canvas canvas) {
        e.f((Object)canvas, "canvas");
        while (true) {
            for (int childCount = super.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = this.getChildAt(i);
                if (child == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                }
                if (((ViewLayer)child).m) {
                    final boolean b = true;
                    if (b) {
                        this.f = true;
                        try {
                            super.dispatchDraw(canvas);
                        }
                        finally {
                            this.f = false;
                        }
                    }
                    return;
                }
            }
            final boolean b = false;
            continue;
        }
    }
    
    public int getChildCount() {
        int childCount;
        if (this.f) {
            childCount = super.getChildCount();
        }
        else {
            childCount = 0;
        }
        return childCount;
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
    }
    
    public final void onMeasure(final int n, final int n2) {
        ((View)this).setMeasuredDimension(0, 0);
    }
}
