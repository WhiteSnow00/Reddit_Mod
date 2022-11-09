// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class Clickable_androidKt$isComposeRootInScrollableContainer$1 extends Lambda implements a<Boolean>
{
    public final /* synthetic */ View $view;
    
    public Clickable_androidKt$isComposeRootInScrollableContainer$1(final View $view) {
        this.$view = $view;
        super(0);
    }
    
    public final Boolean invoke() {
        final View $view = this.$view;
        final int b = c.b;
        ViewGroup viewGroup;
        for (ViewParent viewParent = $view.getParent(); viewParent != null && viewParent instanceof ViewGroup; viewParent = ((View)viewGroup).getParent()) {
            viewGroup = (ViewGroup)viewParent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }
}
