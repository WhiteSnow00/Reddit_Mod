// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.android;

import android.text.TextPaint;
import kotlin.LazyThreadSafetyMode;
import pg2.f;

public final class a
{
    public final f a;
    public final f b;
    public final f c;
    
    public a(final int n, final CharSequence charSequence, final q2.a a) {
        ah2.f.f((Object)charSequence, "charSequence");
        ah2.f.f((Object)a, "textPaint");
        final LazyThreadSafetyMode none = LazyThreadSafetyMode.NONE;
        this.a = kotlin.a.a(none, (zg2.a)new LayoutIntrinsics$boringMetrics$2(n, charSequence, a));
        this.b = kotlin.a.a(none, (zg2.a)new LayoutIntrinsics$minIntrinsicWidth$2(charSequence, a));
        this.c = kotlin.a.a(none, (zg2.a)new LayoutIntrinsics$maxIntrinsicWidth$2(this, charSequence, a));
    }
}
