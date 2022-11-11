// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;

public class RectDocDetResult
{
    public RectDocDetRatio rectDocDetRatio;
    public RectDocDetTargetArea rectDocDetTargetArea;
    public int resultStatus;
    
    static {
        Covode.recordClassIndex(2813);
    }
    
    public RectDocDetResult() {
        this.resultStatus = -1;
    }
    
    public RectDocDetResult(final RectDocDetTargetArea rectDocDetTargetArea, final RectDocDetRatio rectDocDetRatio) {
        this.rectDocDetTargetArea = rectDocDetTargetArea;
        this.rectDocDetRatio = rectDocDetRatio;
    }
    
    public RectDocDetRatio getRectDocDetRatio() {
        return this.rectDocDetRatio;
    }
    
    public RectDocDetTargetArea getRectDocDetTargetArea() {
        return this.rectDocDetTargetArea;
    }
    
    public int getResultStatus() {
        return this.resultStatus;
    }
}
