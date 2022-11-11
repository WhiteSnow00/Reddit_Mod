// 
// Decompiled by Procyon v0.6.0
// 

package e4;

import android.widget.AbsListView;
import android.widget.ListView;

public final class g
{
    public static boolean a(final ListView listView, final int n) {
        return ((AbsListView)listView).canScrollList(n);
    }
    
    public static void b(final ListView listView, final int n) {
        ((AbsListView)listView).scrollListBy(n);
    }
}
