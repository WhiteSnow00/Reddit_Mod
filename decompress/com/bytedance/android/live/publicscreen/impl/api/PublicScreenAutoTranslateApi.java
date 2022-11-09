// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.publicscreen.impl.api;

import X.7BN;
import X.7BB;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse$Data;
import X.1dl;
import X.FBF;
import X.5zN;
import X.10t;
import com.bytedance.covode.number.Covode;

public interface PublicScreenAutoTranslateApi
{
    default static {
        Covode.recordClassIndex(10759);
    }
    
    @7BB(LIZ = "/webcast/room/mget_translation/")
    @7BN(LIZ = { "Content-Type: application/json" })
    FBF<1dl<MGetTranslationResponse$Data>> translate(@5zN final 10t p0);
}
