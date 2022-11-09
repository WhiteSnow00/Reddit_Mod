// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 0ao
{
    DisconnectTypeAutoDetectionClickStartLive(3000, "interrupt auto speed detection because click start live"), 
    DisconnectTypeAutoDetectionExitPreviewPage(3002, "interrupt auto speed detection because exit preview page"), 
    DisconnectTypeAutoDetectionOpenDefinitionDialog(3001, "interrupt auto speed detection because open definition dialog"), 
    DisconnectTypeAutoDetectionPermissionRecycled(3003, "interrupt manually speed detection because close speed detection dialog"), 
    DisconnectTypeBroadcastBlocked(4001, "broadcast blocked"), 
    DisconnectTypeDetectionWithIllegalParameters(3502, "Speed test with illegal parameters"), 
    DisconnectTypeManuallyDetectionClickCancel(3500, "interrupt manually speed detection because click cancel"), 
    DisconnectTypeManuallyDetectionCloseDialog(3501, "interrupt manually speed detection because close speed detection dialog"), 
    DisconnectTypeNormalExit(1000, "normal disconnect"), 
    DisconnectTypeServerError(1001, "server error"), 
    DisconnectTypeWaitReportTimeOut(4000, "wait report timeout");
    
    public final int LIZIZ;
    public final String LIZJ;
    
    static {
        Covode.recordClassIndex(5533);
    }
    
    public 0ao(final int liziz, final String lizj) {
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final int getCode() {
        return this.LIZIZ;
    }
    
    public final String getMessage() {
        return this.LIZJ;
    }
}
