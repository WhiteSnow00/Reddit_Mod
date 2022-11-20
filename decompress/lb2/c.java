// 
// Decompiled by Procyon v0.6.0
// 

package lb2;

import kotlin.NoWhenBranchMatchedException;
import ng2.e;
import com.reddit.widget.bottomnav.BottomNavView$Item$Type;
import com.reddit.screen.bottomnav.BottomNavTab;

public final class c
{
    public static BottomNavView$Item$Type a(final BottomNavTab bottomNavTab) {
        e.f((Object)bottomNavTab, "tab");
        final int n = a.a[((Enum)bottomNavTab).ordinal()];
        BottomNavView$Item$Type bottomNavView$Item$Type;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bottomNavView$Item$Type = BottomNavView$Item$Type.Inbox;
                    }
                    else {
                        bottomNavView$Item$Type = BottomNavView$Item$Type.MatrixChat;
                    }
                }
                else {
                    bottomNavView$Item$Type = BottomNavView$Item$Type.Chat;
                }
            }
            else {
                bottomNavView$Item$Type = BottomNavView$Item$Type.Discover;
            }
        }
        else {
            bottomNavView$Item$Type = BottomNavView$Item$Type.Home;
        }
        return bottomNavView$Item$Type;
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[BottomNavTab.values().length];
            a2[((Enum)BottomNavTab.HOME).ordinal()] = 1;
            a2[((Enum)BottomNavTab.DISCOVER).ordinal()] = 2;
            a2[((Enum)BottomNavTab.CHAT).ordinal()] = 3;
            a2[((Enum)BottomNavTab.MATRIX).ordinal()] = 4;
            a2[((Enum)BottomNavTab.INBOX).ordinal()] = 5;
            a = a2;
        }
    }
}
