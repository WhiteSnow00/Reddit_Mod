// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.definition;

import X.0AB;
import X.8si;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IDefinitionService extends 0Vq
{
    default static {
        Covode.recordClassIndex(5901);
    }
    
    8si<String, String> getAutoLevelDefinition();
    
    8si<String, String> getNextLowerLevelDefinition();
    
    boolean isAudienceLowestDefinition();
    
    void reportAnchorDefinitionBtnShow(final String p0);
    
    void reportAudienceDefinitionBtnShow(final String p0, final String p1, final String p2);
    
    void reportAudienceDefinitionDialogSelectSuccess(final String p0, final String p1, final String p2, final String p3, final String p4, final String p5, final String p6);
    
    void reportAudienceDefinitionTipsShow(final String p0, final String p1, final String p2);
    
    void reportAudienceRotateBtnClick(final String p0, final long p1, final String p2, final String p3);
    
    void reportAudienceRotateBtnShow(final String p0);
    
    void showDefinitionSelectionDialog(final 0AB p0, final boolean p1);
}
