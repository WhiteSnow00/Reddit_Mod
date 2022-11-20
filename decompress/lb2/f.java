// 
// Decompiled by Procyon v0.6.0
// 

package lb2;

import com.reddit.common.experiments.model.discover.DiscoverIconVariant;
import kotlin.NoWhenBranchMatchedException;
import ng2.e;
import com.reddit.domain.design.features.BottomNavMode;

public final class f
{
    public static final int a(final BottomNavMode bottomNavMode) {
        e.f((Object)bottomNavMode, "<this>");
        final int n = a.a[bottomNavMode.ordinal()];
        int n2;
        if (n != 1) {
            if (n != 2 && n != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n2 = 2131165370;
        }
        else {
            n2 = 2131165369;
        }
        return n2;
    }
    
    public final class a
    {
        public static final int[] a;
        public static final int[] b;
        
        static {
            final int[] a2 = new int[BottomNavMode.values().length];
            a2[BottomNavMode.WITH_LABELS.ordinal()] = 1;
            a2[BottomNavMode.WITHOUT_LABELS.ordinal()] = 2;
            a2[BottomNavMode.DYNAMIC.ordinal()] = 3;
            a = a2;
            final int[] b2 = new int[DiscoverIconVariant.values().length];
            b2[((Enum)DiscoverIconVariant.BINOCULARS).ordinal()] = 1;
            b2[((Enum)DiscoverIconVariant.TELESCOPE).ordinal()] = 2;
            b2[((Enum)DiscoverIconVariant.GLOBE).ordinal()] = 3;
            b2[((Enum)DiscoverIconVariant.COMMUNITY_TAB_ICON).ordinal()] = 4;
            b = b2;
        }
    }
}
