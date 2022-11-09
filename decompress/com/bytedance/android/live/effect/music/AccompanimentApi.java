// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.music;

import X.1L6;
import X.7B9;
import X.1L3;
import X.1dl;
import X.FBF;
import X.7Ay;
import com.bytedance.covode.number.Covode;

public interface AccompanimentApi
{
    default static {
        Covode.recordClassIndex(6422);
    }
    
    @7B9(LIZ = "/webcast/room/music/collection/songs/")
    FBF<1dl<1L3>> getAccompanimentsWithAlbumId(@7Ay(LIZ = "collection_id") final long p0, @7Ay(LIZ = "offset") final long p1, @7Ay(LIZ = "count") final long p2);
    
    @7B9(LIZ = "/webcast/room/music/")
    FBF<1dl<1L6>> getAlbums();
}
