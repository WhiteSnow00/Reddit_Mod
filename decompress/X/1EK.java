// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.user.TextBadge;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import com.bytedance.android.live.base.model.user.BadgeStruct;

public final class 1eK extends 0zr<1eP> implements 101
{
    public final int LIZ;
    public final BadgeStruct LIZIZ;
    public final Context LIZJ;
    
    static {
        Covode.recordClassIndex(10644);
    }
    
    public 1eK(final int liz, final BadgeStruct liziz, final Context lizj) {
        CTM.LIZ((Object)lizj);
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    @Override
    public final BadgeStruct LIZ() {
        return this.LIZIZ;
    }
    
    @Override
    public final int LIZIZ() {
        return this.LIZ;
    }
    
    @Override
    public final String LIZJ() {
        final BadgeStruct liziz = this.LIZIZ;
        if (liziz != null) {
            return liziz.LJII;
        }
        return null;
    }
}
