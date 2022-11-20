// 
// Decompiled by Procyon v0.6.0
// 

package z9;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.reddit.ui.button.RedditButton;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class a implements w5.a
{
    public final ConstraintLayout a;
    public final RedditButton b;
    public final RedditButton c;
    public final Group d;
    public final TextView e;
    public final EditText f;
    public final TextView g;
    
    public a(final ConstraintLayout a, final RedditButton b, final RedditButton c, final Group d, final TextView e, final EditText f, final TextView g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final View getRoot() {
        return (View)this.a;
    }
}
