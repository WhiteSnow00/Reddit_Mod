// 
// Decompiled by Procyon v0.6.0
// 

package aw0;

import sg2.e;
import android.widget.FrameLayout;
import android.graphics.Rect;
import com.reddit.livepost.widgets.ChatCommentBottomSheet;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;

public final class c implements View$OnAttachStateChangeListener
{
    public final /* synthetic */ View f;
    public final /* synthetic */ ChatCommentBottomSheet g;
    public final /* synthetic */ Rect h;
    
    public c(final FrameLayout f, final ChatCommentBottomSheet g, final Rect h) {
        this.f = (View)f;
        this.g = g;
        this.h = h;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        e.f((Object)view, "v");
        this.f.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        final FrameLayout frameLayout = (FrameLayout)this.f;
        ((View)ChatCommentBottomSheet.B(this.g).a).setClipBounds(this.h);
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        e.f((Object)view, "v");
    }
}
