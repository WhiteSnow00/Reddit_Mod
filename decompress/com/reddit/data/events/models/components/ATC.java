// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class ATC
{
    public static final a<ATC, ATC.ATC$Builder> ADAPTER;
    public final Long budget_remaining;
    public final String decision_channel;
    public final String decision_reason;
    public final String decision_reason_detail;
    public final String decision_value;
    public final String notification_group;
    public final Long pn_index;
    
    static {
        ADAPTER = (a)new ATC.ATC$ATCAdapter((ATC$1)null);
    }
    
    private ATC(final ATC.ATC$Builder atc$Builder) {
        this.decision_value = ATC.ATC$Builder.access$100(atc$Builder);
        this.decision_reason = ATC.ATC$Builder.access$200(atc$Builder);
        this.decision_reason_detail = ATC.ATC$Builder.access$300(atc$Builder);
        this.decision_channel = ATC.ATC$Builder.access$400(atc$Builder);
        this.notification_group = ATC.ATC$Builder.access$500(atc$Builder);
        this.budget_remaining = ATC.ATC$Builder.access$600(atc$Builder);
        this.pn_index = ATC.ATC$Builder.access$700(atc$Builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof ATC)) {
            return false;
        }
        final ATC atc = (ATC)o;
        final String decision_value = this.decision_value;
        final String decision_value2 = atc.decision_value;
        if (decision_value == decision_value2 || (decision_value != null && decision_value.equals(decision_value2))) {
            final String decision_reason = this.decision_reason;
            final String decision_reason2 = atc.decision_reason;
            if (decision_reason == decision_reason2 || (decision_reason != null && decision_reason.equals(decision_reason2))) {
                final String decision_reason_detail = this.decision_reason_detail;
                final String decision_reason_detail2 = atc.decision_reason_detail;
                if (decision_reason_detail == decision_reason_detail2 || (decision_reason_detail != null && decision_reason_detail.equals(decision_reason_detail2))) {
                    final String decision_channel = this.decision_channel;
                    final String decision_channel2 = atc.decision_channel;
                    if (decision_channel == decision_channel2 || (decision_channel != null && decision_channel.equals(decision_channel2))) {
                        final String notification_group = this.notification_group;
                        final String notification_group2 = atc.notification_group;
                        if (notification_group == notification_group2 || (notification_group != null && notification_group.equals(notification_group2))) {
                            final Long budget_remaining = this.budget_remaining;
                            final Long budget_remaining2 = atc.budget_remaining;
                            if (budget_remaining == budget_remaining2 || (budget_remaining != null && budget_remaining.equals(budget_remaining2))) {
                                final Long pn_index = this.pn_index;
                                final Long pn_index2 = atc.pn_index;
                                boolean b2 = b;
                                if (pn_index == pn_index2) {
                                    return b2;
                                }
                                if (pn_index != null && pn_index.equals(pn_index2)) {
                                    b2 = b;
                                    return b2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String decision_value = this.decision_value;
        int hashCode = 0;
        int hashCode2;
        if (decision_value == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = decision_value.hashCode();
        }
        final String decision_reason = this.decision_reason;
        int hashCode3;
        if (decision_reason == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = decision_reason.hashCode();
        }
        final String decision_reason_detail = this.decision_reason_detail;
        int hashCode4;
        if (decision_reason_detail == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = decision_reason_detail.hashCode();
        }
        final String decision_channel = this.decision_channel;
        int hashCode5;
        if (decision_channel == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = decision_channel.hashCode();
        }
        final String notification_group = this.notification_group;
        int hashCode6;
        if (notification_group == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = notification_group.hashCode();
        }
        final Long budget_remaining = this.budget_remaining;
        int hashCode7;
        if (budget_remaining == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = budget_remaining.hashCode();
        }
        final Long pn_index = this.pn_index;
        if (pn_index != null) {
            hashCode = pn_index.hashCode();
        }
        return (((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("ATC{decision_value=");
        r.append(this.decision_value);
        r.append(", decision_reason=");
        r.append(this.decision_reason);
        r.append(", decision_reason_detail=");
        r.append(this.decision_reason_detail);
        r.append(", decision_channel=");
        r.append(this.decision_channel);
        r.append(", notification_group=");
        r.append(this.notification_group);
        r.append(", budget_remaining=");
        r.append(this.budget_remaining);
        r.append(", pn_index=");
        return a.m(r, this.pn_index, "}");
    }
    
    public void write(final e e) throws IOException {
        ATC.ADAPTER.write(e, (Object)this);
    }
}
