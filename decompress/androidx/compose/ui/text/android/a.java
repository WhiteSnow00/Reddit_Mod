// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.android;

import android.text.TextPaint;
import kotlin.LazyThreadSafetyMode;
import sg2.e;
import hg2.f;

public final class a
{
    public final f a;
    public final f b;
    public final f c;
    
    public a(final int n, final CharSequence charSequence, final q2.a a) {
        e.f((Object)charSequence, "charSequence");
        e.f((Object)a, "textPaint");
        final LazyThreadSafetyMode none = LazyThreadSafetyMode.NONE;
        this.a = kotlin.a.a(none, (rg2.a)new LayoutIntrinsics$boringMetrics$2(n, charSequence, (TextPaint)a));
        this.b = kotlin.a.a(none, (rg2.a)new LayoutIntrinsics$minIntrinsicWidth$2(charSequence, (TextPaint)a));
        this.c = kotlin.a.a(none, (rg2.a)new LayoutIntrinsics$maxIntrinsicWidth$2(this, charSequence, (TextPaint)a));
    }
}
