// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import java.util.WeakHashMap;
import a4.y1$b;
import android.os.Build$VERSION;
import android.view.View$OnAttachStateChangeListener;
import a4.f0;
import a4.p0;
import ah2.f;
import android.view.View;
import kotlin.Metadata;
import z0.p;
import z0.q;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class WindowInsetsHolder$Companion$current$1 extends Lambda implements l<q, p>
{
    public final /* synthetic */ b $insets;
    public final /* synthetic */ View $view;
    
    public WindowInsetsHolder$Companion$current$1(final b $insets, final View $view) {
        this.$insets = $insets;
        this.$view = $view;
        super(1);
    }
    
    public final p invoke(final q q) {
        f.f((Object)q, "$this$DisposableEffect");
        final b $insets = this.$insets;
        final View $view = this.$view;
        $insets.getClass();
        f.f((Object)$view, "view");
        if ($insets.q == 0) {
            final p0.p r = $insets.r;
            final WeakHashMap a = p0.a;
            p0.i.u($view, (f0)r);
            if ($view.isAttachedToWindow()) {
                $view.requestApplyInsets();
            }
            $view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)$insets.r);
            if (Build$VERSION.SDK_INT >= 30) {
                p0.n($view, (y1$b)$insets.r);
            }
        }
        ++$insets.q;
        return (p)new WindowInsetsHolder$Companion$current$1$a(this.$insets, this.$view);
    }
}
