// 
// Decompiled by Procyon v0.6.0
// 

package b80;

import androidx.constraintlayout.widget.ConstraintLayout;
import tg1.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.cardview.widget.CardView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.LinearLayout;
import com.reddit.vault.feature.vault.transaction.detail.widget.TransactionDetailPanel;
import android.view.View;
import x5.a;

public final class b implements a
{
    public final /* synthetic */ int a;
    public final View b;
    public final View c;
    public final View d;
    public final View e;
    public final Object f;
    
    public b(final View c, final TransactionDetailPanel d, final LinearLayout b, final TextView e, final ProgressBar f) {
        this.a = 7;
        this.c = c;
        this.d = (View)d;
        this.b = (View)b;
        this.e = (View)e;
        this.f = f;
    }
    
    public b(final CardView b, final TextView c, final RecyclerView e, final TextView d, final c f) {
        this.a = 3;
        this.b = (View)b;
        this.c = (View)c;
        this.e = (View)e;
        this.d = (View)d;
        this.f = f;
    }
    
    public final CardView a() {
        switch (this.a) {
            default: {
                return (CardView)this.b;
            }
            case 2: {
                return (CardView)this.b;
            }
        }
    }
    
    @Override
    public final View getRoot() {
        final int a = this.a;
        switch (a) {
            default: {
                return this.c;
            }
            case 6: {
                ConstraintLayout constraintLayout = null;
                switch (a) {
                    default: {
                        constraintLayout = (ConstraintLayout)this.b;
                        break;
                    }
                    case 5: {
                        constraintLayout = (ConstraintLayout)this.b;
                        break;
                    }
                }
                return (View)constraintLayout;
            }
            case 5: {
                ConstraintLayout constraintLayout2 = null;
                switch (a) {
                    default: {
                        constraintLayout2 = (ConstraintLayout)this.b;
                        break;
                    }
                    case 5: {
                        constraintLayout2 = (ConstraintLayout)this.b;
                        break;
                    }
                }
                return (View)constraintLayout2;
            }
            case 4: {
                return this.b;
            }
            case 3: {
                return (View)this.a();
            }
            case 2: {
                return (View)this.a();
            }
            case 1: {
                return this.b;
            }
            case 0: {
                return this.b;
            }
        }
    }
}
