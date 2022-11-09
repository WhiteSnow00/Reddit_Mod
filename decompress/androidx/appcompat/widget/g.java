// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.View;
import android.graphics.drawable.Drawable;
import r3.a;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.widget.CheckedTextView;

public final class g
{
    public final CheckedTextView a;
    public ColorStateList b;
    public PorterDuff$Mode c;
    public boolean d;
    public boolean e;
    public boolean f;
    
    public g(final CheckedTextView a) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.a = a;
    }
    
    public final void a() {
        final Drawable checkMarkDrawable = this.a.getCheckMarkDrawable();
        if (checkMarkDrawable != null && (this.d || this.e)) {
            final Drawable mutate = checkMarkDrawable.mutate();
            if (this.d) {
                r3.a.b.h(mutate, this.b);
            }
            if (this.e) {
                r3.a.b.i(mutate, this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(((View)this.a).getDrawableState());
            }
            this.a.setCheckMarkDrawable(mutate);
        }
    }
}
