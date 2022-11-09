// 
// Decompiled by Procyon v0.6.0
// 

package g5;

import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.f;
import b4.c;
import android.view.View;
import a4.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;

public final class e extends h0
{
    public final RecyclerView b;
    public final a c;
    public final e$a d;
    
    public e(final RecyclerView b) {
        super(b);
        this.c = super.getItemDelegate();
        this.d = new a() {
            @Override
            public final void onInitializeAccessibilityNodeInfo(final View view, final c c) {
                e.this.c.onInitializeAccessibilityNodeInfo(view, c);
                final int childAdapterPosition = e.this.b.getChildAdapterPosition(view);
                final RecyclerView.Adapter adapter = e.this.b.getAdapter();
                if (!(adapter instanceof f)) {
                    return;
                }
                final Preference m = ((f)adapter).m(childAdapterPosition);
                if (m == null) {
                    return;
                }
                m.w(c);
            }
            
            @Override
            public final boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
                return e.this.c.performAccessibilityAction(view, n, bundle);
            }
        };
        this.b = b;
    }
    
    public final a getItemDelegate() {
        return this.d;
    }
}
