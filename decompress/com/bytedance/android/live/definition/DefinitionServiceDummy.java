// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.definition;

import X.0AB;
import X.CTM;
import X.8si;
import com.bytedance.covode.number.Covode;

public class DefinitionServiceDummy implements IDefinitionService
{
    static {
        Covode.recordClassIndex(5900);
    }
    
    @Override
    public 8si<String, String> getAutoLevelDefinition() {
        return null;
    }
    
    @Override
    public 8si<String, String> getNextLowerLevelDefinition() {
        return null;
    }
    
    @Override
    public boolean isAudienceLowestDefinition() {
        return true;
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void reportAnchorDefinitionBtnShow(final String s) {
        CTM.LIZ((Object)s);
    }
    
    @Override
    public void reportAudienceDefinitionBtnShow(final String s, final String s2, final String s3) {
        CTM.LIZ((Object)s, (Object)s2, (Object)s3);
    }
    
    @Override
    public void reportAudienceDefinitionDialogSelectSuccess(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7) {
        CTM.LIZ((Object)s, (Object)s2, (Object)s3, (Object)s4, (Object)s5, (Object)s6, (Object)s7);
    }
    
    @Override
    public void reportAudienceDefinitionTipsShow(final String s, final String s2, final String s3) {
        CTM.LIZ((Object)s, (Object)s2, (Object)s3);
    }
    
    @Override
    public void reportAudienceRotateBtnClick(final String s, final long n, final String s2, final String s3) {
        CTM.LIZ((Object)s, (Object)s2, (Object)s3);
    }
    
    @Override
    public void reportAudienceRotateBtnShow(final String s) {
        CTM.LIZ((Object)s);
    }
    
    @Override
    public void showDefinitionSelectionDialog(final 0AB 0ab, final boolean b) {
        CTM.LIZ((Object)0ab);
    }
}
