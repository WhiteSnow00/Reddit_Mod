// 
// Decompiled by Procyon v0.6.0
// 

package u70;

import com.reddit.themes.RedditThemedActivity;
import h72.c;
import h72.k$b;
import android.content.Context;
import m5.a;
import ng2.e;
import android.view.View;
import com.reddit.debug.logging.DataLoggingActivity;
import com.reddit.debug.logging.DataLoggingActivity$a;
import android.view.View$OnLongClickListener;

public final class b implements View$OnLongClickListener
{
    public final DataLoggingActivity$a f;
    public final int g;
    public final DataLoggingActivity h;
    
    public b(final DataLoggingActivity$a f, final int g, final DataLoggingActivity h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final boolean onLongClick(final View view) {
        final DataLoggingActivity$a f = this.f;
        final int g = this.g;
        final DataLoggingActivity h = this.h;
        e.f((Object)f, "this$0");
        e.f((Object)h, "this$1");
        final DataLoggingActivity.d d = f.l.get(g);
        i10.a.l0((Context)h, a.k(new Object[] { d.b, d.g, d.c }, 3, "%d. %s: %s", "format(format, *args)"), DataLoggingActivity.q0(h, d.e));
        final StringBuilder sb = new StringBuilder();
        sb.append("Copied event #");
        sb.append(d.b);
        sb.append(" to clipboard.");
        c.c((RedditThemedActivity)h, k$b.a((Context)h, (CharSequence)sb.toString()), 0, 0, (mg2.a)null, 28);
        return true;
    }
}
