// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.y;
import ng2.e;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u00c6\u0003J%\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/chat/model/ReportMessageDetails;", "", "sendbirdChatMessage", "Lcom/reddit/domain/chat/model/ReportMessageFields;", "sendbirdEphemeralChatLog", "", "(Lcom/reddit/domain/chat/model/ReportMessageFields;Ljava/util/List;)V", "getSendbirdChatMessage", "()Lcom/reddit/domain/chat/model/ReportMessageFields;", "getSendbirdEphemeralChatLog", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ReportMessageDetails
{
    private final ReportMessageFields sendbirdChatMessage;
    private final List<ReportMessageFields> sendbirdEphemeralChatLog;
    
    public ReportMessageDetails(final ReportMessageFields sendbirdChatMessage, final List<ReportMessageFields> sendbirdEphemeralChatLog) {
        e.f((Object)sendbirdChatMessage, "sendbirdChatMessage");
        this.sendbirdChatMessage = sendbirdChatMessage;
        this.sendbirdEphemeralChatLog = sendbirdEphemeralChatLog;
    }
    
    public static ReportMessageDetails copy$default(final ReportMessageDetails reportMessageDetails, ReportMessageFields sendbirdChatMessage, List sendbirdEphemeralChatLog, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            sendbirdChatMessage = reportMessageDetails.sendbirdChatMessage;
        }
        if ((n & 0x2) != 0x0) {
            sendbirdEphemeralChatLog = reportMessageDetails.sendbirdEphemeralChatLog;
        }
        return reportMessageDetails.copy(sendbirdChatMessage, sendbirdEphemeralChatLog);
    }
    
    public final ReportMessageFields component1() {
        return this.sendbirdChatMessage;
    }
    
    public final List<ReportMessageFields> component2() {
        return this.sendbirdEphemeralChatLog;
    }
    
    public final ReportMessageDetails copy(final ReportMessageFields reportMessageFields, final List<ReportMessageFields> list) {
        e.f((Object)reportMessageFields, "sendbirdChatMessage");
        return new ReportMessageDetails(reportMessageFields, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReportMessageDetails)) {
            return false;
        }
        final ReportMessageDetails reportMessageDetails = (ReportMessageDetails)o;
        return e.a((Object)this.sendbirdChatMessage, (Object)reportMessageDetails.sendbirdChatMessage) && e.a((Object)this.sendbirdEphemeralChatLog, (Object)reportMessageDetails.sendbirdEphemeralChatLog);
    }
    
    public final ReportMessageFields getSendbirdChatMessage() {
        return this.sendbirdChatMessage;
    }
    
    public final List<ReportMessageFields> getSendbirdEphemeralChatLog() {
        return this.sendbirdEphemeralChatLog;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.sendbirdChatMessage.hashCode();
        final List<ReportMessageFields> sendbirdEphemeralChatLog = this.sendbirdEphemeralChatLog;
        int hashCode2;
        if (sendbirdEphemeralChatLog == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = sendbirdEphemeralChatLog.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final y a = y10.e.a;
        String json;
        if ((json = y10.e.a.a((Class)ReportMessageDetails.class).toJson((Object)this)) == null) {
            json = "";
        }
        return json;
    }
}
