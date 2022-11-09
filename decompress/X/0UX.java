// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 0ux
{
    GUEST_PREVIEW, 
    GUEST_USER_INFO;
    
    public boolean LIZIZ;
    public String LIZJ;
    
    static {
        Covode.recordClassIndex(9595);
    }
    
    public 0ux() {
        this.LIZIZ = true;
        this.LIZJ = "";
    }
    
    public final boolean getGoNextPage() {
        return this.LIZIZ;
    }
    
    public final String getSource() {
        return this.LIZJ;
    }
    
    public final void setGoNextPage(final boolean liziz) {
        this.LIZIZ = liziz;
    }
    
    public final void setSource(final String lizj) {
        CTM.LIZ((Object)lizj);
        this.LIZJ = lizj;
    }
}
