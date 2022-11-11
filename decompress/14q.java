// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.covode.number.Covode;
import android.widget.ListView;

public final class 14q extends 08h
{
    public final ListView LJII;
    
    static {
        Covode.recordClassIndex(923);
    }
    
    public 14q(final ListView ljii) {
        super((View)ljii);
        this.LJII = ljii;
    }
    
    @Override
    public final void LIZ(final int n) {
        this.LJII.scrollListBy(n);
    }
    
    @Override
    public final boolean LIZIZ(final int n) {
        final ListView ljii = this.LJII;
        final int count = ljii.getCount();
        if (count == 0) {
            return false;
        }
        final int childCount = ljii.getChildCount();
        final int firstVisiblePosition = ljii.getFirstVisiblePosition();
        if (n > 0) {
            if (firstVisiblePosition + childCount >= count && ljii.getChildAt(childCount - 1).getBottom() <= ljii.getHeight()) {
                return false;
            }
        }
        else {
            if (n >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && ljii.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
