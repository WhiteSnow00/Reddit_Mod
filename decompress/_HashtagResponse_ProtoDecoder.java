// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model;

import com.bytedance.android.livesdk.model._GameTag_ProtoDecoder;
import com.bytedance.android.livesdk.model._Hashtag_ProtoDecoder;
import X.0Tb;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import java.util.ArrayList;
import X.0Ta;
import com.bytedance.covode.number.Covode;
import X.0TU;

public final class _HashtagResponse_ProtoDecoder implements 0TU<HashtagResponse>
{
    static {
        Covode.recordClassIndex(4910);
    }
    
    public static HashtagResponse LIZ(final 0Ta 0Ta) {
        final HashtagResponse hashtagResponse = new HashtagResponse();
        hashtagResponse.obsHashTag = new ArrayList<Hashtag>();
        hashtagResponse.gameTagList = new ArrayList<GameTag>();
        hashtagResponse.hashtags = new ArrayList<Hashtag>();
        final long liz = 0Ta.LIZ();
        while (true) {
            final int liziz = 0Ta.LIZIZ();
            if (liziz == -1) {
                break;
            }
            if (liziz != 1) {
                if (liziz != 2) {
                    if (liziz != 3) {
                        if (liziz != 4) {
                            0Tb.LIZJ(0Ta);
                        }
                        else {
                            hashtagResponse.obsHashTag.add(_Hashtag_ProtoDecoder.LIZ(0Ta));
                        }
                    }
                    else {
                        hashtagResponse.gameHashTag = _Hashtag_ProtoDecoder.LIZ(0Ta);
                    }
                }
                else {
                    hashtagResponse.gameTagList.add(_GameTag_ProtoDecoder.LIZ(0Ta));
                }
            }
            else {
                hashtagResponse.hashtags.add(_Hashtag_ProtoDecoder.LIZ(0Ta));
            }
        }
        0Ta.LIZ(liz);
        return hashtagResponse;
    }
}
