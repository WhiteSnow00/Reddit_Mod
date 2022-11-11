// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import b4.c$c;
import b4.c;
import a4.y0;
import android.os.Build$VERSION;
import g5.f;
import p3.k;
import android.util.AttributeSet;
import android.content.Context;

public class PreferenceCategory extends PreferenceGroup
{
    public PreferenceCategory() {
        throw null;
    }
    
    public PreferenceCategory(final Context context, final AttributeSet set) {
        super(context, set, k.a(context, 2130969487, 16842892));
    }
    
    public final boolean P() {
        return super.j() ^ true;
    }
    
    public final boolean j() {
        return false;
    }
    
    public final void o(final f f) {
        super.o(f);
        if (Build$VERSION.SDK_INT >= 28) {
            y0.d(f.itemView);
        }
    }
    
    public final void w(final c c) {
        if (Build$VERSION.SDK_INT < 28) {
            final AccessibilityNodeInfo$CollectionItemInfo collectionItemInfo = c.a.getCollectionItemInfo();
            c$c c$c;
            if (collectionItemInfo != null) {
                c$c = new c$c(collectionItemInfo);
            }
            else {
                c$c = null;
            }
            if (c$c == null) {
                return;
            }
            c.p(b4.c$c.a(((AccessibilityNodeInfo$CollectionItemInfo)c$c.a).getRowIndex(), ((AccessibilityNodeInfo$CollectionItemInfo)c$c.a).getRowSpan(), ((AccessibilityNodeInfo$CollectionItemInfo)c$c.a).getColumnIndex(), ((AccessibilityNodeInfo$CollectionItemInfo)c$c.a).getColumnSpan(), true, ((AccessibilityNodeInfo$CollectionItemInfo)c$c.a).isSelected()));
        }
    }
}
