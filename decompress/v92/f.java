// 
// Decompiled by Procyon v0.6.0
// 

package v92;

import android.content.Context;
import mg2.a;
import com.reddit.vault.feature.vault.coins.PurchaseCoinsScreen;
import zd.b;
import ng2.e;
import na2.c;
import com.reddit.vault.feature.vault.transaction.detail.widget.TransactionDetailPanel;
import android.view.View;
import android.view.View$OnLongClickListener;

public final class f implements View$OnLongClickListener
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public f(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final boolean onLongClick(final View view) {
        switch (this.f) {
            default: {
                final TransactionDetailPanel transactionDetailPanel = (TransactionDetailPanel)this.g;
                final c c = (c)this.h;
                final int f = TransactionDetailPanel.f;
                e.f((Object)transactionDetailPanel, "this$0");
                e.f((Object)c, "$row");
                final Context context = ((View)transactionDetailPanel).getContext();
                e.e((Object)context, "context");
                final String string = ((View)transactionDetailPanel).getContext().getString(c.a);
                e.e((Object)string, "context.getString(row.title)");
                b.I(context, string, c.b);
                return true;
            }
            case 0: {
                final PurchaseCoinsScreen purchaseCoinsScreen = (PurchaseCoinsScreen)this.g;
                final a k0 = (a)this.h;
                e.f((Object)purchaseCoinsScreen, "this$0");
                e.f((Object)k0, "$listener");
                purchaseCoinsScreen.k0 = k0;
                purchaseCoinsScreen.l0.postDelayed((Runnable)purchaseCoinsScreen.m0, 50L);
                return false;
            }
        }
    }
}
