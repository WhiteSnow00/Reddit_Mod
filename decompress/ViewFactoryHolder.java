// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.viewinterop;

import rg2.a;
import androidx.compose.ui.platform.AbstractComposeView;
import sg2.e;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import z0.g;
import android.content.Context;
import hg2.j;
import rg2.l;
import android.view.View;

public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder
{
    public l<? super T, j> A;
    public T y;
    public l<? super Context, ? extends T> z;
    
    public ViewFactoryHolder(final Context context, final g g, final NestedScrollDispatcher nestedScrollDispatcher) {
        e.f((Object)context, "context");
        e.f((Object)nestedScrollDispatcher, "dispatcher");
        super(context, g, nestedScrollDispatcher);
        this.A = AndroidView_androidKt.a;
    }
    
    public final l<Context, T> getFactory() {
        return (l<Context, T>)this.z;
    }
    
    public final T getTypedView$ui_release() {
        return this.y;
    }
    
    public final l<T, j> getUpdateBlock() {
        return (l<T, j>)this.A;
    }
    
    public View getViewRoot() {
        return (View)this;
    }
    
    public final void setFactory(final l<? super Context, ? extends T> z) {
        this.z = z;
        if (z != null) {
            final Context context = ((View)this).getContext();
            e.e((Object)context, "context");
            this.setView$ui_release((View)(this.y = (T)z.invoke(context)));
        }
    }
    
    public final void setTypedView$ui_release(final T y) {
        this.y = y;
    }
    
    public final void setUpdateBlock(final l<? super T, j> a) {
        e.f((Object)a, "value");
        this.A = a;
        this.setUpdate((a)new ViewFactoryHolder$updateBlock.ViewFactoryHolder$updateBlock$1(this));
    }
}
