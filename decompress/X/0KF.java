// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 0kf
{
    ACTIVITY(6);
    
    public static final a Companion;
    
    DAILY_RANK_INVITE(26), 
    FOLLOW_INVITE(1), 
    HOURLY_RANK_INVITE(21), 
    NONE(0), 
    RANDOM_LINK_MIC_INVITE(5), 
    RANDOM_LINK_MIC_RECOMMEND(7), 
    RECOMMEND_INVITE(2), 
    WEEKLY_RANK_INVITE(20), 
    WEEKLY_RISING_INVITE(23), 
    WEEKLY_ROOKIE_INVITE(24);
    
    public int LIZIZ;
    
    static {
        Covode.recordClassIndex(7163);
        Companion = new a((byte)0);
    }
    
    public 0kf(final int liziz) {
        this.LIZIZ = liziz;
    }
    
    public final int getType() {
        return this.LIZIZ;
    }
    
    public final void setType(final int liziz) {
        this.LIZIZ = liziz;
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(7164);
        }
        
        public final 0kf LIZ(final int n) {
            for (final 0kf none : 0kf.values()) {
                if (none.getType() == n) {
                    return none;
                }
            }
            return 0kf.NONE;
        }
    }
}
