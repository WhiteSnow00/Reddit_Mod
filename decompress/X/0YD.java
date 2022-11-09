// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public @interface 0yd {
    default static {
        Covode.recordClassIndex(10423);
    }
    
    a LIZ();
    
    String LIZIZ() default "";
    
    public enum a
    {
        BROADCAST("broadcast"), 
        FEED("feed"), 
        GIFT("gift"), 
        LINK_MIC("link_mic"), 
        OTHER("other"), 
        RANK_LIST("rank_list"), 
        REPORT("report"), 
        ROOM("room");
        
        public final String key;
        
        static {
            Covode.recordClassIndex(10424);
        }
        
        public a(final String key) {
            this.key = key;
        }
    }
}
