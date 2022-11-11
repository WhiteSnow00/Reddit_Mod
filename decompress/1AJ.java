// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import com.google.gson.a.c;

public final class 1aJ extends 9Mp
{
    @c(LIZ = "layout_type")
    public String LIZ;
    @c(LIZ = "users")
    public ArrayList<1aK> LIZIZ;
    
    static {
        Covode.recordClassIndex(9832);
    }
    
    public 1aJ(final String liz, final ArrayList<1aK> liziz) {
        CTM.LIZ((Object)liz, (Object)liziz);
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final 0k8 LIZ() {
        final String liz = this.LIZ;
        switch (liz.hashCode()) {
            case -2111025230: {
                if (liz.equals("float_fix")) {
                    return 0k8.FLOATING_FIX;
                }
                break;
            }
            case 3181382: {
                if (liz.equals("grid")) {
                    return 0k8.GRID;
                }
                break;
            }
            case 97526364: {
                if (liz.equals("float")) {
                    return 0k8.FLOATING;
                }
                break;
            }
            case 318387100: {
                if (liz.equals("grid_fix")) {
                    return 0k8.GRID_FIX;
                }
                break;
            }
        }
        return 0k8.NORMAL;
    }
    
    public final void LIZ(final String liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ };
    }
}
