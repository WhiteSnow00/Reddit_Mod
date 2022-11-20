// 
// Decompiled by Procyon v0.6.0
// 

package p72;

import android.view.View;
import com.reddit.ui.button.RedditButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import w5.a;

public final class c implements a
{
    public final ConstraintLayout a;
    public final ImageView b;
    public final RedditButton c;
    
    public c(final ConstraintLayout a, final ImageView b, final RedditButton c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final View getRoot() {
        return (View)this.a;
    }
}
