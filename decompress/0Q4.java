// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 0q4
{
    APPLY_INVITE("switch_apply_to_invite", 2131829261, 2131829260, 2131829259), 
    APPLY_PAIR("switch_apply_to_random", 2131829264, 2131829263, 2131829262), 
    INVITE_APPLY("switch_invite_to_apply", 2131829276, 2131829275, 2131829273), 
    INVITE_PAIR("switch_invite_to_random", 2131829272, 2131829271, 2131829270);
    
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    
    static {
        Covode.recordClassIndex(8297);
    }
    
    public 0q4(final String liziz, final int lizj, final int lizlll, final int lj) {
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
    }
    
    public final int getButtonResId() {
        return this.LJ;
    }
    
    public final int getContentResId() {
        return this.LIZLLL;
    }
    
    public final String getLabel() {
        return this.LIZIZ;
    }
    
    public final int getTitleResId() {
        return this.LIZJ;
    }
}
