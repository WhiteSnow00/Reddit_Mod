// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import p1.h;
import ng2.e;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u00c6\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/chat/model/ReportMessage;", "", "reason", "", "message", "Lcom/reddit/domain/chat/model/ReportMessageFields;", "details", "", "(Ljava/lang/String;Lcom/reddit/domain/chat/model/ReportMessageFields;Ljava/util/List;)V", "getDetails", "()Ljava/util/List;", "getMessage", "()Lcom/reddit/domain/chat/model/ReportMessageFields;", "getReason", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ReportMessage
{
    private final List<ReportMessageFields> details;
    private final ReportMessageFields message;
    private final String reason;
    
    public ReportMessage(final String reason, final ReportMessageFields message, final List<ReportMessageFields> details) {
        e.f((Object)reason, "reason");
        e.f((Object)message, "message");
        this.reason = reason;
        this.message = message;
        this.details = details;
    }
    
    public static ReportMessage copy$default(final ReportMessage reportMessage, String reason, ReportMessageFields message, List details, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            reason = reportMessage.reason;
        }
        if ((n & 0x2) != 0x0) {
            message = reportMessage.message;
        }
        if ((n & 0x4) != 0x0) {
            details = reportMessage.details;
        }
        return reportMessage.copy(reason, message, details);
    }
    
    public final String component1() {
        return this.reason;
    }
    
    public final ReportMessageFields component2() {
        return this.message;
    }
    
    public final List<ReportMessageFields> component3() {
        return this.details;
    }
    
    public final ReportMessage copy(final String s, final ReportMessageFields reportMessageFields, final List<ReportMessageFields> list) {
        e.f((Object)s, "reason");
        e.f((Object)reportMessageFields, "message");
        return new ReportMessage(s, reportMessageFields, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReportMessage)) {
            return false;
        }
        final ReportMessage reportMessage = (ReportMessage)o;
        return e.a((Object)this.reason, (Object)reportMessage.reason) && e.a((Object)this.message, (Object)reportMessage.message) && e.a((Object)this.details, (Object)reportMessage.details);
    }
    
    public final List<ReportMessageFields> getDetails() {
        return this.details;
    }
    
    public final ReportMessageFields getMessage() {
        return this.message;
    }
    
    public final String getReason() {
        return this.reason;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.reason.hashCode();
        final int hashCode2 = this.message.hashCode();
        final List<ReportMessageFields> details = this.details;
        int hashCode3;
        if (details == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = details.hashCode();
        }
        return (hashCode2 + hashCode * 31) * 31 + hashCode3;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("ReportMessage(reason=");
        t.append(this.reason);
        t.append(", message=");
        t.append(this.message);
        t.append(", details=");
        return h.d(t, (List)this.details, ')');
    }
}
