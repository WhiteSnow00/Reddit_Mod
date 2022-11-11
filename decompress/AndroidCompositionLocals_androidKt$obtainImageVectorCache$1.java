// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.content.ComponentCallbacks;
import ah2.f;
import android.content.Context;
import kotlin.Metadata;
import z0.p;
import z0.q;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class AndroidCompositionLocals_androidKt$obtainImageVectorCache$1 extends Lambda implements l<q, p>
{
    public final /* synthetic */ w $callbacks;
    public final /* synthetic */ Context $context;
    
    public AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(final Context $context, final w $callbacks) {
        this.$context = $context;
        this.$callbacks = $callbacks;
        super(1);
    }
    
    public final p invoke(final q q) {
        f.f((Object)q, "$this$DisposableEffect");
        this.$context.getApplicationContext().registerComponentCallbacks((ComponentCallbacks)this.$callbacks);
        return new p() {
            public final /* synthetic */ Context a = AndroidCompositionLocals_androidKt$obtainImageVectorCache$1.this.$context;
            public final /* synthetic */ w b = AndroidCompositionLocals_androidKt$obtainImageVectorCache$1.this.$callbacks;
            
            @Override
            public final void dispose() {
                this.a.getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks)this.b);
            }
        };
    }
}
