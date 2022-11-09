// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.copyrightreview;

import X.7B9;
import com.bytedance.android.livesdk.model.message.NotificationConfirmResponse;
import X.1dl;
import X.FBF;
import X.7Ay;
import com.bytedance.covode.number.Covode;

public interface ReviewApi
{
    default static {
        Covode.recordClassIndex(5621);
    }
    
    @7B9(LIZ = "/webcast/review/notification_confirm")
    FBF<1dl<NotificationConfirmResponse>> confirmCopyright(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "confirm_type") final int p1, @7Ay(LIZ = "confirm_value") final int p2);
    
    @7B9(LIZ = "/webcast/review/notify_of_confirm_copyright/")
    FBF<1dl<Void>> notifyOfConfirmCopyright(@7Ay(LIZ = "room_id") final long p0);
}
