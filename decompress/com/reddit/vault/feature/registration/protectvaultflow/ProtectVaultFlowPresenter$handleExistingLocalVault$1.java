// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.protectvaultflow;

import x82.a;
import mg2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.vault.feature.registration.protectvaultflow.ProtectVaultFlowPresenter", f = "ProtectVaultFlowPresenter.kt", l = { 47 }, m = "handleExistingLocalVault")
final class ProtectVaultFlowPresenter$handleExistingLocalVault$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ProtectVaultFlowPresenter this$0;
    
    public ProtectVaultFlowPresenter$handleExistingLocalVault$1(final ProtectVaultFlowPresenter this$0, final lg2.c<? super ProtectVaultFlowPresenter$handleExistingLocalVault$1> c) {
        this.this$0 = this$0;
        super((lg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return ProtectVaultFlowPresenter.Dc(this.this$0, (a)null, (lg2.c)this);
    }
}
