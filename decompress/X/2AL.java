// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.ImageModel;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import com.bytedance.android.live.base.model.user.BadgeStruct;

public final class 2AL extends 1mu<1eN> implements 101
{
    public final int LIZLLL;
    public final BadgeStruct LJ;
    public final Context LJFF;
    public final Runnable LJI;
    
    static {
        Covode.recordClassIndex(10650);
    }
    
    public 2AL(final int lizlll, final Handler handler, final ImageModel imageModel, final SRS<? super 1eL<1eN>, 2P9> srs, final BadgeStruct lj, final Context ljff, final Runnable lji) {
        CTM.LIZ((Object)handler, (Object)imageModel, (Object)srs, (Object)ljff);
        super(handler, imageModel, srs);
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
        this.LJI = lji;
    }
    
    @Override
    public final BadgeStruct LIZ() {
        return this.LJ;
    }
    
    @Override
    public final int LIZIZ() {
        return this.LIZLLL;
    }
    
    @Override
    public final String LIZJ() {
        final BadgeStruct lj = this.LJ;
        if (lj != null) {
            return lj.LJII;
        }
        return null;
    }
}
