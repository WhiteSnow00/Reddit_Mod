// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.settings.adapter.data.section;

import com.reddit.vault.navigation.NavStyle;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen$a;
import j92.g;
import ua2.a$b;
import r82.r0;
import j92.b;
import com.reddit.vault.domain.repository.RedditBackupState;
import r82.p0;
import r82.b0;
import r82.p0$c;
import kotlin.Metadata;
import cg2.j;
import mg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lcg2/j;", "invoke", "()V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class VaultSection$viewRedditBackup$doNavigation$1 extends Lambda implements a<j>
{
    public final r82.a $address;
    public final VaultSection this$0;
    
    public VaultSection$viewRedditBackup$doNavigation$1(final r82.a $address, final VaultSection this$0) {
        this.$address = $address;
        this.this$0 = this$0;
        super(0);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return j.a;
    }
    
    public final void invoke() {
        final b0 b0 = new b0(this.$address, (p0)new p0$c("settings"), false, true, false, true, false);
        if (this.this$0.c.o() == RedditBackupState.BACKED_UP) {
            this.this$0.i.k(new b((r0)b0, true), null, (ua2.a)new a$b(0), null);
        }
        else {
            this.this$0.i.M(b0, NavStyle.PUSH);
        }
    }
}
