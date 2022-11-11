// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.dialogoeventbserver;

import X.F5g;
import X.2P9;
import X.SRS;
import X.GOu;
import X.CTM;
import com.bytedance.covode.number.Covode;
import X.0CH;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.1JM;
import X.15z;
import X.Gh3;
import X.051;
import X.0Bq;

public final class LiveDialogStatusEventObserverManager extends 0Bq
{
    public static final LiveDialogStatusEventObserverManager.a LJ;
    public final 051<Gh3> LIZ;
    public final 15z<1JM> LIZIZ;
    public final DataChannel LIZJ;
    public final 0CH LIZLLL;
    
    static {
        Covode.recordClassIndex(6143);
        LJ = new LiveDialogStatusEventObserverManager.a((byte)0);
    }
    
    public LiveDialogStatusEventObserverManager(final DataChannel lizj, final 0CH lizlll) {
        CTM.LIZ((Object)lizj, (Object)lizlll);
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LIZ = new 051<Gh3>();
        this.LIZIZ = new 15z<1JM>();
        lizj.LIZ(lizlll, (Class)GOu.class, (SRS)new SRS<Gh3, 2P9>() {
            static {
                Covode.recordClassIndex(6144);
            }
        });
    }
    
    public final Gh3 LIZ() {
        final int liziz = this.LIZ.LIZIZ();
        if (liziz == 0) {
            return null;
        }
        return this.LIZ.LIZLLL(liziz - 1);
    }
    
    @Override
    public final void onCleared() {
        super.onCleared();
        this.LIZ.LIZJ();
    }
}
