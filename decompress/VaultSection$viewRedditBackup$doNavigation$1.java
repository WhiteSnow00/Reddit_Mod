// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.settings.adapter.data.section;

import com.reddit.vault.navigation.NavStyle;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen;
import p92.g;
import ab2.a$b;
import x82.r0;
import p92.b;
import com.reddit.vault.domain.repository.RedditBackupState;
import x82.p0;
import x82.b0;
import x82.p0$c;
import kotlin.Metadata;
import hg2.j;
import rg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lhg2/j;", "invoke", "()V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class VaultSection$viewRedditBackup$doNavigation$1 extends Lambda implements a<j>
{
    public final /* synthetic */ x82.a $address;
    public final /* synthetic */ VaultSection this$0;
    
    public VaultSection$viewRedditBackup$doNavigation$1(final x82.a $address, final VaultSection this$0) {
        this.$address = $address;
        this.this$0 = this$0;
        super(0);
    }
    
    public final void invoke() {
        final b0 b0 = new b0(this.$address, (p0)new p0$c("settings"), false, true, false, true, false);
        if (this.this$0.c.q() == RedditBackupState.BACKED_UP) {
            this.this$0.i.x((g)new b((r0)b0, true), (MasterKeyScreen.a)null, (ab2.a)new a$b(0), (a)null);
        }
        else {
            this.this$0.i.m(b0, NavStyle.PUSH);
        }
    }
}
