// 
// Decompiled by Procyon v0.6.0
// 

package hf;

import android.graphics.Outline;
import android.view.View;
import com.google.android.material.chip.Chip;
import android.view.ViewOutlineProvider;

public final class a extends ViewOutlineProvider
{
    public final /* synthetic */ Chip a;
    
    public a(final Chip a) {
        this.a = a;
    }
    
    public final void getOutline(final View view, final Outline outline) {
        final com.google.android.material.chip.a j = this.a.j;
        if (j != null) {
            j.getOutline(outline);
        }
        else {
            outline.setAlpha(0.0f);
        }
    }
}
