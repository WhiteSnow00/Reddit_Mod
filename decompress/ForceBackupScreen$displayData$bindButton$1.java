// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.forcebackup;

import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;
import ha2.a$a;
import ha2.a$b;
import sg2.e;
import kotlin.Metadata;
import hg2.j;
import ha2.a;
import android.widget.Button;
import rg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006" }, d2 = { "Landroid/widget/Button;", "button", "Lha2/a;", "buttonModel", "Lhg2/j;", "invoke", "(Landroid/widget/Button;Lha2/a;)V", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class ForceBackupScreen$displayData$bindButton$1 extends Lambda implements p<Button, a, j>
{
    public static final ForceBackupScreen$displayData$bindButton$1 INSTANCE;
    
    static {
        INSTANCE = new ForceBackupScreen$displayData$bindButton$1();
    }
    
    public ForceBackupScreen$displayData$bindButton$1() {
        super(2);
    }
    
    public final void invoke(final Button button, final a a) {
        e.f((Object)button, "button");
        e.f((Object)a, "buttonModel");
        if (e.a((Object)a, (Object)a$b.a)) {
            ((View)button).setVisibility(8);
        }
        else if (a instanceof a$a) {
            ((TextView)button).setText(((a$a)a).a);
            ((View)button).setOnClickListener((View$OnClickListener)new com.reddit.vault.feature.vault.forcebackup.a(a));
            ((View)button).setVisibility(0);
        }
    }
}
