// 
// Decompiled by Procyon v0.6.0
// 

package kb2;

import ng2.e;
import com.reddit.webembed.webview.WebEmbedWebView;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;

public final class d implements View$OnAttachStateChangeListener
{
    public final View f;
    public final WebEmbedWebView g;
    
    public d(final View f, final WebEmbedWebView g) {
        this.f = f;
        this.g = g;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        e.f((Object)view, "v");
        this.f.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        final WebEmbedWebView webEmbedWebView = (WebEmbedWebView)this.f;
        ((View)this.g).requestApplyInsets();
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        e.f((Object)view, "v");
    }
}
