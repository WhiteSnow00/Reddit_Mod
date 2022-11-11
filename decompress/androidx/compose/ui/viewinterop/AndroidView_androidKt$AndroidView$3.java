// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.viewinterop;

import rg2.a;
import sg2.e;
import h1.b;
import kotlin.Metadata;
import z0.p;
import z0.q;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class AndroidView_androidKt$AndroidView$3 extends Lambda implements l<q, p>
{
    public final /* synthetic */ String $stateKey;
    public final /* synthetic */ b $stateRegistry;
    public final /* synthetic */ e2.p<ViewFactoryHolder<Object>> $viewFactoryHolderRef;
    
    public AndroidView_androidKt$AndroidView$3(final b $stateRegistry, final String $stateKey, final e2.p<ViewFactoryHolder<Object>> $viewFactoryHolderRef) {
        this.$stateRegistry = $stateRegistry;
        this.$stateKey = $stateKey;
        this.$viewFactoryHolderRef = $viewFactoryHolderRef;
        super(1);
    }
    
    public final p invoke(final q q) {
        e.f((Object)q, "$this$DisposableEffect");
        return (p)new AndroidView_androidKt$AndroidView$3$a(this.$stateRegistry.d(this.$stateKey, (a<?>)new AndroidView_androidKt$AndroidView$3$valueProvider$1((e2.p)this.$viewFactoryHolderRef)));
    }
}
