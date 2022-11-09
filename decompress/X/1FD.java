// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.KeyEvent;
import android.widget.ListAdapter;
import android.widget.HeaderViewListAdapter;
import android.view.MotionEvent;
import android.view.MenuItem;
import android.transition.Transition;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.PopupWindow;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class 1fd extends 13R implements 03o
{
    public static Method LIZIZ;
    public 03o LIZ;
    
    static {
        Covode.recordClassIndex(479);
        try {
            if (Build$VERSION.SDK_INT <= 28) {
                1fd.LIZIZ = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        }
        catch (final NoSuchMethodException ex) {}
    }
    
    public 1fd(final Context context, final int n, final int n2) {
        super(context, null, n, n2);
    }
    
    @Override
    public final 03b LIZ(final Context context, final boolean b) {
        final a a = new a(context, b);
        a.setHoverListener(this);
        return a;
    }
    
    public final void LIZ() {
        if (Build$VERSION.SDK_INT >= 23) {
            super.LJIJJLI.setEnterTransition((Transition)null);
        }
    }
    
    @Override
    public final void LIZ(final 12x 12x, final MenuItem menuItem) {
        final 03o liz = this.LIZ;
        if (liz != null) {
            liz.LIZ(12x, menuItem);
        }
    }
    
    @Override
    public final void LIZIZ(final 12x 12x, final MenuItem menuItem) {
        final 03o liz = this.LIZ;
        if (liz != null) {
            liz.LIZIZ(12x, menuItem);
        }
    }
    
    public final void LJII() {
        Label_0037: {
            if (Build$VERSION.SDK_INT > 28) {
                break Label_0037;
            }
            final Method liziz = 1fd.LIZIZ;
            if (liziz == null) {
                return;
            }
            try {
                liziz.invoke(super.LJIJJLI, false);
                return;
                super.LJIJJLI.setTouchModal(false);
            }
            catch (final Exception ex) {}
        }
    }
    
    public static final class a extends 03b
    {
        public final int LIZJ;
        public final int LIZLLL;
        public 03o LJ;
        public MenuItem LJFF;
        
        static {
            Covode.recordClassIndex(480);
        }
        
        public a(final Context context, final boolean b) {
            super(context, b);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.LIZJ = 21;
                this.LIZLLL = 22;
                return;
            }
            this.LIZJ = 22;
            this.LIZLLL = 21;
        }
        
        @Override
        public final boolean onHoverEvent(final MotionEvent motionEvent) {
            if (this.LJ != null) {
                final ListAdapter adapter = this.getAdapter();
                int headersCount;
                02j 02j;
                if (adapter instanceof HeaderViewListAdapter) {
                    final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    02j = (02j)headerViewListAdapter.getWrappedAdapter();
                }
                else {
                    headersCount = 0;
                    02j = (02j)adapter;
                }
                Object liz;
                final Object o = liz = null;
                if (motionEvent.getAction() != 10) {
                    final int pointToPosition = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
                    liz = o;
                    if (pointToPosition != -1) {
                        final int n = pointToPosition - headersCount;
                        liz = o;
                        if (n >= 0) {
                            liz = o;
                            if (n < 02j.getCount()) {
                                liz = 02j.LIZ(n);
                            }
                        }
                    }
                }
                final MenuItem ljff = this.LJFF;
                if (ljff != liz) {
                    final 12x liz2 = 02j.LIZ;
                    if (ljff != null) {
                        this.LJ.LIZ(liz2, ljff);
                    }
                    if ((this.LJFF = (MenuItem)liz) != null) {
                        this.LJ.LIZIZ(liz2, (MenuItem)liz);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
        
        public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
            final 12s 12s = (12s)this.getSelectedView();
            if (12s != null) {
                if (n == this.LIZJ) {
                    if (12s.isEnabled() && 12s.getItemData().hasSubMenu()) {
                        this.performItemClick((View)12s, this.getSelectedItemPosition(), this.getSelectedItemId());
                    }
                    return true;
                }
                if (n == this.LIZLLL) {
                    this.setSelection(-1);
                    ((02j)this.getAdapter()).LIZ.LIZ(false);
                    return true;
                }
            }
            return super.onKeyDown(n, keyEvent);
        }
        
        public final void setHoverListener(final 03o lj) {
            this.LJ = lj;
        }
    }
}
