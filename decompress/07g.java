// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Bundle;
import java.util.List;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.bytedance.covode.number.Covode;

public final class 07g
{
    public final Object LIZ;
    
    static {
        Covode.recordClassIndex(813);
    }
    
    public 07g() {
        this.LIZ = new b(this);
    }
    
    public 07g(final Object liz) {
        this.LIZ = liz;
    }
    
    public static class a extends AccessibilityNodeProvider
    {
        static {
            Covode.recordClassIndex(814);
        }
        
        public AccessibilityNodeInfo createAccessibilityNodeInfo(final int n) {
            return null;
        }
        
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(final String s, final int n) {
            return null;
        }
        
        public boolean performAction(final int n, final int n2, final Bundle bundle) {
            return false;
        }
    }
    
    public static final class b extends a
    {
        static {
            Covode.recordClassIndex(815);
        }
        
        public b(final 07g 07g) {
        }
        
        public final AccessibilityNodeInfo findFocus(final int n) {
            return null;
        }
    }
}
