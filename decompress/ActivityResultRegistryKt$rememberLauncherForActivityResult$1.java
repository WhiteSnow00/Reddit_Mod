// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity.compose;

import androidx.activity.result.c;
import d.b;
import pg2.j;
import z0.e1;
import f.a;
import androidx.activity.result.f;
import kotlin.Metadata;
import z0.p;
import z0.q;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1 extends Lambda implements l<q, p>
{
    public final /* synthetic */ f $activityResultRegistry;
    public final /* synthetic */ a<Object, Object> $contract;
    public final /* synthetic */ e1<l<Object, j>> $currentOnResult;
    public final /* synthetic */ String $key;
    public final /* synthetic */ d.a<Object> $realLauncher;
    
    public ActivityResultRegistryKt$rememberLauncherForActivityResult$1(final d.a<Object> $realLauncher, final f $activityResultRegistry, final String $key, final a<Object, Object> $contract, final e1<? extends l<Object, j>> $currentOnResult) {
        this.$realLauncher = $realLauncher;
        this.$activityResultRegistry = $activityResultRegistry;
        this.$key = $key;
        this.$contract = $contract;
        this.$currentOnResult = (e1<l<Object, j>>)$currentOnResult;
        super(1);
    }
    
    public final p invoke(final q q) {
        ah2.f.f((Object)q, "$this$DisposableEffect");
        this.$realLauncher.a = (c)this.$activityResultRegistry.d(this.$key, (a)this.$contract, (androidx.activity.result.b)new b(this.$currentOnResult));
        return (p)new ActivityResultRegistryKt$rememberLauncherForActivityResult$1$a((d.a)this.$realLauncher);
    }
}
