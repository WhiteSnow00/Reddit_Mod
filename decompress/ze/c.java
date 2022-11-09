// 
// Decompiled by Procyon v0.6.0
// 

package ze;

import android.view.View;
import android.view.ViewGroup;
import android.util.Property;

public final class c extends Property<ViewGroup, Float>
{
    public static final c a;
    
    static {
        a = new c();
    }
    
    public c() {
        super((Class)Float.class, "childrenAlpha");
    }
    
    public final Object get(final Object o) {
        Float value = (Float)((View)o).getTag(2131430199);
        if (value == null) {
            value = 1.0f;
        }
        return value;
    }
    
    public final void set(final Object o, final Object o2) {
        final ViewGroup viewGroup = (ViewGroup)o;
        final float floatValue = (float)o2;
        ((View)viewGroup).setTag(2131430199, (Object)floatValue);
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
