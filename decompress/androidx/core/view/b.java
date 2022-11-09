// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.view;

import kotlin.sequences.SequencesKt__SequencesKt;
import jj2.k;
import androidx.compose.ui.platform.AbstractComposeView;
import zg2.p;
import tg2.c;
import jj2.n;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import java.util.WeakHashMap;
import android.view.View$OnLayoutChangeListener;
import a4.o1;
import android.view.View;
import a4.p0;
import ah2.f;
import zg2.l;
import android.view.ViewGroup;

public final class b
{
    public static final void a(final ViewGroup viewGroup, final l l) {
        f.f((Object)viewGroup, "<this>");
        final WeakHashMap a = p0.a;
        if (p0.g.c((View)viewGroup) && !((View)viewGroup).isLayoutRequested()) {
            l.invoke((Object)viewGroup);
        }
        else {
            ((View)viewGroup).addOnLayoutChangeListener((View$OnLayoutChangeListener)new o1(l));
        }
    }
    
    public static Bitmap b(final View view) {
        final Bitmap$Config argb_8888 = Bitmap$Config.ARGB_8888;
        f.f((Object)view, "<this>");
        f.f((Object)argb_8888, "config");
        final WeakHashMap a = p0.a;
        if (p0.g.c(view)) {
            final Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), argb_8888);
            f.e((Object)bitmap, "createBitmap(width, height, config)");
            final Canvas canvas = new Canvas(bitmap);
            canvas.translate(-(float)view.getScrollX(), -(float)view.getScrollY());
            view.draw(canvas);
            return bitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }
    
    public static final n c(final View view) {
        f.f((Object)view, "<this>");
        return new n((p)new ViewKt$allViews$1(view, null));
    }
    
    public static final k d(final AbstractComposeView abstractComposeView) {
        return SequencesKt__SequencesKt.N0((l)ViewKt$ancestors$1.INSTANCE, (Object)((View)abstractComposeView).getParent());
    }
}
