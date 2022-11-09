// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import kt.b;
import java.io.IOException;
import kt.e;
import jt.a;

public final class ATC
{
    public static final a<ATC, Builder> ADAPTER;
    public final Long budget_remaining;
    public final String decision_channel;
    public final String decision_reason;
    public final String decision_reason_detail;
    public final String decision_value;
    public final String notification_group;
    public final Long pn_index;
    
    static {
        ADAPTER = (a)new ATCAdapter(null);
    }
    
    private ATC(final Builder builder) {
        this.decision_value = Builder.access$100(builder);
        this.decision_reason = Builder.access$200(builder);
        this.decision_reason_detail = Builder.access$300(builder);
        this.decision_channel = Builder.access$400(builder);
        this.notification_group = Builder.access$500(builder);
        this.budget_remaining = Builder.access$600(builder);
        this.pn_index = Builder.access$700(builder);
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
        final StringBuilder k = a.k("ATC{decision_value=");
        k.append(this.decision_value);
        k.append(", decision_reason=");
        k.append(this.decision_reason);
        k.append(", decision_reason_detail=");
        k.append(this.decision_reason_detail);
        k.append(", decision_channel=");
        k.append(this.decision_channel);
        k.append(", notification_group=");
        k.append(this.notification_group);
        k.append(", budget_remaining=");
        k.append(this.budget_remaining);
        k.append(", pn_index=");
        return a.h(k, this.pn_index, "}");
    }
    
    public void write(final e e) throws IOException {
        ATC.ADAPTER.write(e, (Object)this);
    }
    
    public static final class ATCAdapter implements a<ATC, Builder>
    {
        private ATCAdapter() {
        }
        
        public ATC read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ATC read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 10) {
                            builder.pn_index(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 10) {
                            builder.budget_remaining(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 11) {
                            builder.notification_group(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 11) {
                            builder.decision_channel(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 11) {
                            builder.decision_reason_detail(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.decision_reason(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.decision_value(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final ATC atc) throws IOException {
            e.a0();
            if (atc.decision_value != null) {
                e.N(1, (byte)11);
                e.Z(atc.decision_value);
                e.O();
            }
            if (atc.decision_reason != null) {
                e.N(2, (byte)11);
                e.Z(atc.decision_reason);
                e.O();
            }
            if (atc.decision_reason_detail != null) {
                e.N(3, (byte)11);
                e.Z(atc.decision_reason_detail);
                e.O();
            }
            if (atc.decision_channel != null) {
                e.N(4, (byte)11);
                e.Z(atc.decision_channel);
                e.O();
            }
            if (atc.notification_group != null) {
                e.N(5, (byte)11);
                e.Z(atc.notification_group);
                e.O();
            }
            if (atc.budget_remaining != null) {
                e.N(6, (byte)10);
                a.r(atc.budget_remaining, e);
            }
            if (atc.pn_index != null) {
                e.N(7, (byte)10);
                a.r(atc.pn_index, e);
            }
            e.P();
            e.b0();
        }
    }
    
    public static final class Builder implements jt.b<ATC>
    {
        private Long budget_remaining;
        private String decision_channel;
        private String decision_reason;
        private String decision_reason_detail;
        private String decision_value;
        private String notification_group;
        private Long pn_index;
        
        public Builder() {
        }
        
        public Builder(final ATC atc) {
            this.decision_value = atc.decision_value;
            this.decision_reason = atc.decision_reason;
            this.decision_reason_detail = atc.decision_reason_detail;
            this.decision_channel = atc.decision_channel;
            this.notification_group = atc.notification_group;
            this.budget_remaining = atc.budget_remaining;
            this.pn_index = atc.pn_index;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.decision_value;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.decision_reason;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.decision_reason_detail;
        }
        
        public static /* synthetic */ String access$400(final Builder builder) {
            return builder.decision_channel;
        }
        
        public static /* synthetic */ String access$500(final Builder builder) {
            return builder.notification_group;
        }
        
        public static /* synthetic */ Long access$600(final Builder builder) {
            return builder.budget_remaining;
        }
        
        public static /* synthetic */ Long access$700(final Builder builder) {
            return builder.pn_index;
        }
        
        public Builder budget_remaining(final Long budget_remaining) {
            this.budget_remaining = budget_remaining;
            return this;
        }
        
        public ATC build() {
            return new ATC(this, null);
        }
        
        public Builder decision_channel(final String decision_channel) {
            this.decision_channel = decision_channel;
            return this;
        }
        
        public Builder decision_reason(final String decision_reason) {
            this.decision_reason = decision_reason;
            return this;
        }
        
        public Builder decision_reason_detail(final String decision_reason_detail) {
            this.decision_reason_detail = decision_reason_detail;
            return this;
        }
        
        public Builder decision_value(final String decision_value) {
            this.decision_value = decision_value;
            return this;
        }
        
        public Builder notification_group(final String notification_group) {
            this.notification_group = notification_group;
            return this;
        }
        
        public Builder pn_index(final Long pn_index) {
            this.pn_index = pn_index;
            return this;
        }
        
        public void reset() {
            this.decision_value = null;
            this.decision_reason = null;
            this.decision_reason_detail = null;
            this.decision_channel = null;
            this.notification_group = null;
            this.budget_remaining = null;
            this.pn_index = null;
        }
    }
}
