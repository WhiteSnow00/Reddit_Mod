// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.feed;

import com.google.gson.Gson;
import com.bytedance.covode.number.Covode;
import com.google.gson.m;
import com.bytedance.android.livesdk.model.FeedBannerContainer;
import com.google.gson.a.c;
import com.bytedance.android.livesdk.model.Extra;

public class FeedExtra extends Extra
{
    @c(LIZ = "cost")
    public long LIZ;
    @c(LIZ = "unread_extra")
    public String LIZIZ;
    public transient LogPb LIZJ;
    @c(LIZ = "max_time")
    public long LIZLLL;
    @c(LIZ = "min_time")
    public long LJ;
    @c(LIZ = "req_id")
    public String LJFF;
    @c(LIZ = "banner")
    public FeedBannerContainer LJI;
    @c(LIZ = "total")
    public int LJII;
    @c(LIZ = "style")
    public int LJIIIIZZ;
    @c(LIZ = "hashtag_text")
    public String LJIIIZ;
    @c(LIZ = "log_pb")
    public m LJIIJ;
    
    static {
        Covode.recordClassIndex(4933);
    }
    
    public final m LIZ() {
        if (this.LIZJ != null) {
            final m ljiil = new Gson().LIZ((Object)this.LIZJ).LJIIL();
            this.LJIIJ = ljiil;
            this.LIZJ = null;
            return ljiil;
        }
        return this.LJIIJ;
    }
    
    public static final class LogPb
    {
        @c(LIZ = "impr_id")
        public String LIZ;
        @c(LIZ = "session_id")
        public long LIZIZ;
        
        static {
            Covode.recordClassIndex(4934);
        }
    }
}
