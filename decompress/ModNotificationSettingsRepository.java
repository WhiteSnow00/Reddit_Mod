// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.pnsettings;

import com.reddit.domain.model.UpdateResponse;
import com.reddit.domain.modtools.pnsettings.model.Row$Group;
import lg2.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/modtools/pnsettings/ModNotificationSettingsRepository;", "", "", "subredditId", "Lcom/reddit/domain/modtools/pnsettings/model/Row$Group;", "getSettingsLayout", "(Ljava/lang/String;Llg2/c;)Ljava/lang/Object;", "settingName", "", "enabled", "Lcom/reddit/domain/model/UpdateResponse;", "saveStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Llg2/c;)Ljava/lang/Object;", "", "value", "saveThreshold", "(Ljava/lang/String;Ljava/lang/String;ILlg2/c;)Ljava/lang/Object;", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public interface ModNotificationSettingsRepository
{
    Object getSettingsLayout(final String p0, final c<? super Row$Group> p1);
    
    Object saveStatus(final String p0, final String p1, final Boolean p2, final c<? super UpdateResponse> p3);
    
    Object saveThreshold(final String p0, final String p1, final int p2, final c<? super UpdateResponse> p3);
}
