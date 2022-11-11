// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.FrameLayout;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

public interface 0kY
{
    default static {
        Covode.recordClassIndex(7142);
    }
    
    void LIZ();
    
    void LIZ(final 1NP p0);
    
    void LIZ(final Fld p0, final int p1, final int p2);
    
    void LIZ(final SRS<? super Rect, 2P9> p0);
    
    void LIZ(final FrameLayout p0, final int p1, final int p2, final int p3);
    
    void LIZ(final String p0);
    
    Rect LIZIZ();
    
    public enum a
    {
        FEED("feed"), 
        SEARCH("search");
        
        public final String LIZIZ;
        
        static {
            Covode.recordClassIndex(7143);
        }
        
        public a(final String liziz) {
            this.LIZIZ = liziz;
        }
        
        @Override
        public final String toString() {
            return this.LIZIZ;
        }
    }
}
