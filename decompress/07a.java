// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.covode.number.Covode;

public final class 07a
{
    static {
        Covode.recordClassIndex(806);
    }
    
    public static boolean LIZ(final AccessibilityManager accessibilityManager, final a a) {
        return a != null && accessibilityManager.removeTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)new b(a));
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(807);
        }
        
        void LIZ(final boolean p0);
    }
    
    public static final class b implements AccessibilityManager$TouchExplorationStateChangeListener
    {
        public final a LIZ;
        
        static {
            Covode.recordClassIndex(808);
        }
        
        public b(final a liz) {
            this.LIZ = liz;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && this.LIZ.equals(((b)o).LIZ));
        }
        
        @Override
        public final int hashCode() {
            return this.LIZ.hashCode();
        }
        
        public final void onTouchExplorationStateChanged(final boolean b) {
            this.LIZ.LIZ(b);
        }
    }
}
