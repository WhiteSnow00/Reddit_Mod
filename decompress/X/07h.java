// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.view.accessibility.AccessibilityRecord;

public final class 07h
{
    public final AccessibilityRecord LIZ;
    
    static {
        Covode.recordClassIndex(816);
    }
    
    public 07h(final Object o) {
        this.LIZ = (AccessibilityRecord)o;
    }
    
    public static 07h LIZ() {
        return new 07h(AccessibilityRecord.obtain());
    }
    
    public final void LIZ(final int itemCount) {
        this.LIZ.setItemCount(itemCount);
    }
    
    public final void LIZ(final boolean scrollable) {
        this.LIZ.setScrollable(scrollable);
    }
    
    public final void LIZIZ(final int fromIndex) {
        this.LIZ.setFromIndex(fromIndex);
    }
    
    public final void LIZJ(final int toIndex) {
        this.LIZ.setToIndex(toIndex);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof 07h)) {
            return false;
        }
        final 07h 07h = (07h)o;
        final AccessibilityRecord liz = this.LIZ;
        if (liz == null) {
            if (07h.LIZ != null) {
                return false;
            }
        }
        else if (!liz.equals(07h.LIZ)) {
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final AccessibilityRecord liz = this.LIZ;
        if (liz == null) {
            return 0;
        }
        return liz.hashCode();
    }
}
