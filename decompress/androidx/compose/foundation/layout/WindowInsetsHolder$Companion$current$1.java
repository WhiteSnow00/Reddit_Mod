// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import java.util.WeakHashMap;
import a4.p1$b;
import android.os.Build$VERSION;
import android.view.View$OnAttachStateChangeListener;
import a4.b0;
import a4.l0$i;
import a4.l0;
import ng2.e;
import android.view.View;
import kotlin.Metadata;
import z0.p;
import z0.q;
import mg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class WindowInsetsHolder$Companion$current$1 extends Lambda implements l<q, p>
{
    public final b $insets;
    public final View $view;
    
    public WindowInsetsHolder$Companion$current$1(final b $insets, final View $view) {
        this.$insets = $insets;
        this.$view = $view;
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((q)o);
    }
    
    public final p invoke(final q q) {
        e.f((Object)q, "$this$DisposableEffect");
        final b $insets = this.$insets;
        final View $view = this.$view;
        $insets.getClass();
        e.f((Object)$view, "view");
        if ($insets.q == 0) {
            final p0.p r = $insets.r;
            final WeakHashMap a = l0.a;
            l0$i.u($view, (b0)r);
            if ($view.isAttachedToWindow()) {
                $view.requestApplyInsets();
            }
            $view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)$insets.r);
            if (Build$VERSION.SDK_INT >= 30) {
                l0.n($view, (p1$b)$insets.r);
            }
        }
        ++$insets.q;
        return (p)new WindowInsetsHolder$Companion$current$1$a(this.$insets, this.$view);
    }
}
