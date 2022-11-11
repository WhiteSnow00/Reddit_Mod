// 
// Decompiled by Procyon v0.6.0
// 

package sb2;

import kotlin.NoWhenBranchMatchedException;
import sg2.e;
import com.reddit.widget.bottomnav.BottomNavView;
import com.reddit.screen.bottomnav.BottomNavTab;

public final class c
{
    public static BottomNavView.Item.Type a(final BottomNavTab bottomNavTab) {
        e.f((Object)bottomNavTab, "tab");
        final int n = a.a[((Enum)bottomNavTab).ordinal()];
        BottomNavView.Item.Type type;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        type = BottomNavView.Item.Type.Inbox;
                    }
                    else {
                        type = BottomNavView.Item.Type.MatrixChat;
                    }
                }
                else {
                    type = BottomNavView.Item.Type.Chat;
                }
            }
            else {
                type = BottomNavView.Item.Type.Discover;
            }
        }
        else {
            type = BottomNavView.Item.Type.Home;
        }
        return type;
    }
}
