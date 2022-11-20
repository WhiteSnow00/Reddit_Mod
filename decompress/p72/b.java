// 
// Decompiled by Procyon v0.6.0
// 

package p72;

import android.view.View;
import com.reddit.ui.button.RedditButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import w5.a;

public final class b implements a
{
    public final ConstraintLayout a;
    public final TextView b;
    public final RedditButton c;
    public final RedditButton d;
    public final TextView e;
    
    public b(final ConstraintLayout a, final TextView b, final RedditButton c, final RedditButton d, final TextView e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final View getRoot() {
        return (View)this.a;
    }
}
