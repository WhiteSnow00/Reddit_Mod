// 
// Decompiled by Procyon v0.6.0
// 

package p72;

import android.view.View;
import android.widget.TextView;
import com.reddit.ui.button.RedditButton;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class a implements w5.a
{
    public final ConstraintLayout a;
    public final RedditButton b;
    public final RedditButton c;
    public final TextView d;
    public final TextView e;
    
    public a(final TextView d, final TextView e, final ConstraintLayout a, final RedditButton b, final RedditButton c) {
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
