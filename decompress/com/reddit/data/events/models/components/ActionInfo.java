// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class ActionInfo
{
    public static final a<ActionInfo, Builder> ADAPTER;
    public final Long count;
    public final String page_type;
    public final String pane_name;
    public final String pane_section;
    public final Long position;
    public final String reason;
    public final String referral_id;
    public final Long relative_position;
    public final Boolean retried;
    public final String setting_value;
    public final Boolean success;
    public final String type;
    
    static {
        ADAPTER = (a)new ActionInfoAdapter(null);
    }
    
    private ActionInfo(final Builder builder) {
        this.page_type = Builder.access$100(builder);
        this.pane_name = Builder.access$200(builder);
        this.position = Builder.access$300(builder);
        this.success = Builder.access$400(builder);
        this.count = Builder.access$500(builder);
        this.retried = Builder.access$600(builder);
        this.reason = Builder.access$700(builder);
        this.setting_value = Builder.access$800(builder);
        this.type = Builder.access$900(builder);
        this.relative_position = Builder.access$1000(builder);
        this.referral_id = Builder.access$1100(builder);
        this.pane_section = Builder.access$1200(builder);
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
        if (!(o instanceof ActionInfo)) {
            return false;
        }
        final ActionInfo actionInfo = (ActionInfo)o;
        final String page_type = this.page_type;
        final String page_type2 = actionInfo.page_type;
        if (page_type == page_type2 || (page_type != null && page_type.equals(page_type2))) {
            final String pane_name = this.pane_name;
            final String pane_name2 = actionInfo.pane_name;
            if (pane_name == pane_name2 || (pane_name != null && pane_name.equals(pane_name2))) {
                final Long position = this.position;
                final Long position2 = actionInfo.position;
                if (position == position2 || (position != null && position.equals(position2))) {
                    final Boolean success = this.success;
                    final Boolean success2 = actionInfo.success;
                    if (success == success2 || (success != null && success.equals(success2))) {
                        final Long count = this.count;
                        final Long count2 = actionInfo.count;
                        if (count == count2 || (count != null && count.equals(count2))) {
                            final Boolean retried = this.retried;
                            final Boolean retried2 = actionInfo.retried;
                            if (retried == retried2 || (retried != null && retried.equals(retried2))) {
                                final String reason = this.reason;
                                final String reason2 = actionInfo.reason;
                                if (reason == reason2 || (reason != null && reason.equals(reason2))) {
                                    final String setting_value = this.setting_value;
                                    final String setting_value2 = actionInfo.setting_value;
                                    if (setting_value == setting_value2 || (setting_value != null && setting_value.equals(setting_value2))) {
                                        final String type = this.type;
                                        final String type2 = actionInfo.type;
                                        if (type == type2 || (type != null && type.equals(type2))) {
                                            final Long relative_position = this.relative_position;
                                            final Long relative_position2 = actionInfo.relative_position;
                                            if (relative_position == relative_position2 || (relative_position != null && relative_position.equals(relative_position2))) {
                                                final String referral_id = this.referral_id;
                                                final String referral_id2 = actionInfo.referral_id;
                                                if (referral_id == referral_id2 || (referral_id != null && referral_id.equals(referral_id2))) {
                                                    final String pane_section = this.pane_section;
                                                    final String pane_section2 = actionInfo.pane_section;
                                                    boolean b2 = b;
                                                    if (pane_section == pane_section2) {
                                                        return b2;
                                                    }
                                                    if (pane_section != null && pane_section.equals(pane_section2)) {
                                                        b2 = b;
                                                        return b2;
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        final String page_type = this.page_type;
        int hashCode = 0;
        int hashCode2;
        if (page_type == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = page_type.hashCode();
        }
        final String pane_name = this.pane_name;
        int hashCode3;
        if (pane_name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = pane_name.hashCode();
        }
        final Long position = this.position;
        int hashCode4;
        if (position == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = position.hashCode();
        }
        final Boolean success = this.success;
        int hashCode5;
        if (success == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = success.hashCode();
        }
        final Long count = this.count;
        int hashCode6;
        if (count == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = count.hashCode();
        }
        final Boolean retried = this.retried;
        int hashCode7;
        if (retried == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = retried.hashCode();
        }
        final String reason = this.reason;
        int hashCode8;
        if (reason == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = reason.hashCode();
        }
        final String setting_value = this.setting_value;
        int hashCode9;
        if (setting_value == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = setting_value.hashCode();
        }
        final String type = this.type;
        int hashCode10;
        if (type == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = type.hashCode();
        }
        final Long relative_position = this.relative_position;
        int hashCode11;
        if (relative_position == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = relative_position.hashCode();
        }
        final String referral_id = this.referral_id;
        int hashCode12;
        if (referral_id == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = referral_id.hashCode();
        }
        final String pane_section = this.pane_section;
        if (pane_section != null) {
            hashCode = pane_section.hashCode();
        }
        return ((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ActionInfo{page_type=");
        k.append(this.page_type);
        k.append(", pane_name=");
        k.append(this.pane_name);
        k.append(", position=");
        k.append(this.position);
        k.append(", success=");
        k.append(this.success);
        k.append(", count=");
        k.append(this.count);
        k.append(", retried=");
        k.append(this.retried);
        k.append(", reason=");
        k.append(this.reason);
        k.append(", setting_value=");
        k.append(this.setting_value);
        k.append(", type=");
        k.append(this.type);
        k.append(", relative_position=");
        k.append(this.relative_position);
        k.append(", referral_id=");
        k.append(this.referral_id);
        k.append(", pane_section=");
        return b.j(k, this.pane_section, "}");
    }
    
    public void write(final e e) throws IOException {
        ActionInfo.ADAPTER.write(e, (Object)this);
    }
    
    public static final class ActionInfoAdapter implements a<ActionInfo, Builder>
    {
        private ActionInfoAdapter() {
        }
        
        public ActionInfo read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public ActionInfo read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                switch (q.b) {
                    default: {
                        mt.a.a(e, a);
                        break;
                    }
                    case 12: {
                        if (a == 11) {
                            builder.pane_section(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 11: {
                        if (a == 11) {
                            builder.referral_id(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 10: {
                        if (a == 10) {
                            builder.relative_position(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 9: {
                        if (a == 11) {
                            builder.type(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 8: {
                        if (a == 11) {
                            builder.setting_value(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 7: {
                        if (a == 11) {
                            builder.reason(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 6: {
                        if (a == 2) {
                            builder.retried(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 5: {
                        if (a == 10) {
                            builder.count(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 4: {
                        if (a == 2) {
                            builder.success(e.b());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 3: {
                        if (a == 10) {
                            builder.position(e.v());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 2: {
                        if (a == 11) {
                            builder.pane_name(e.F());
                            break;
                        }
                        mt.a.a(e, a);
                        break;
                    }
                    case 1: {
                        if (a == 11) {
                            builder.page_type(e.F());
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
        
        public void write(final e e, final ActionInfo actionInfo) throws IOException {
            e.a0();
            if (actionInfo.page_type != null) {
                e.N(1, (byte)11);
                e.Z(actionInfo.page_type);
                e.O();
            }
            if (actionInfo.pane_name != null) {
                e.N(2, (byte)11);
                e.Z(actionInfo.pane_name);
                e.O();
            }
            if (actionInfo.position != null) {
                e.N(3, (byte)10);
                a.r(actionInfo.position, e);
            }
            if (actionInfo.success != null) {
                e.N(4, (byte)2);
                d.z(actionInfo.success, e);
            }
            if (actionInfo.count != null) {
                e.N(5, (byte)10);
                a.r(actionInfo.count, e);
            }
            if (actionInfo.retried != null) {
                e.N(6, (byte)2);
                d.z(actionInfo.retried, e);
            }
            if (actionInfo.reason != null) {
                e.N(7, (byte)11);
                e.Z(actionInfo.reason);
                e.O();
            }
            if (actionInfo.setting_value != null) {
                e.N(8, (byte)11);
                e.Z(actionInfo.setting_value);
                e.O();
            }
            if (actionInfo.type != null) {
                e.N(9, (byte)11);
                e.Z(actionInfo.type);
                e.O();
            }
            if (actionInfo.relative_position != null) {
                e.N(10, (byte)10);
                a.r(actionInfo.relative_position, e);
            }
            if (actionInfo.referral_id != null) {
                e.N(11, (byte)11);
                e.Z(actionInfo.referral_id);
                e.O();
            }
            if (actionInfo.pane_section != null) {
                e.N(12, (byte)11);
                e.Z(actionInfo.pane_section);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
    
    public static final class Builder implements jt.b<ActionInfo>
    {
        private Long count;
        private String page_type;
        private String pane_name;
        private String pane_section;
        private Long position;
        private String reason;
        private String referral_id;
        private Long relative_position;
        private Boolean retried;
        private String setting_value;
        private Boolean success;
        private String type;
        
        public Builder() {
        }
        
        public Builder(final ActionInfo actionInfo) {
            this.page_type = actionInfo.page_type;
            this.pane_name = actionInfo.pane_name;
            this.position = actionInfo.position;
            this.success = actionInfo.success;
            this.count = actionInfo.count;
            this.retried = actionInfo.retried;
            this.reason = actionInfo.reason;
            this.setting_value = actionInfo.setting_value;
            this.type = actionInfo.type;
            this.relative_position = actionInfo.relative_position;
            this.referral_id = actionInfo.referral_id;
            this.pane_section = actionInfo.pane_section;
        }
        
        public static /* synthetic */ String access$100(final Builder builder) {
            return builder.page_type;
        }
        
        public static /* synthetic */ Long access$1000(final Builder builder) {
            return builder.relative_position;
        }
        
        public static /* synthetic */ String access$1100(final Builder builder) {
            return builder.referral_id;
        }
        
        public static /* synthetic */ String access$1200(final Builder builder) {
            return builder.pane_section;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.pane_name;
        }
        
        public static /* synthetic */ Long access$300(final Builder builder) {
            return builder.position;
        }
        
        public static /* synthetic */ Boolean access$400(final Builder builder) {
            return builder.success;
        }
        
        public static /* synthetic */ Long access$500(final Builder builder) {
            return builder.count;
        }
        
        public static /* synthetic */ Boolean access$600(final Builder builder) {
            return builder.retried;
        }
        
        public static /* synthetic */ String access$700(final Builder builder) {
            return builder.reason;
        }
        
        public static /* synthetic */ String access$800(final Builder builder) {
            return builder.setting_value;
        }
        
        public static /* synthetic */ String access$900(final Builder builder) {
            return builder.type;
        }
        
        public ActionInfo build() {
            return new ActionInfo(this, null);
        }
        
        public Builder count(final Long count) {
            this.count = count;
            return this;
        }
        
        public Builder page_type(final String page_type) {
            this.page_type = page_type;
            return this;
        }
        
        public Builder pane_name(final String pane_name) {
            this.pane_name = pane_name;
            return this;
        }
        
        public Builder pane_section(final String pane_section) {
            this.pane_section = pane_section;
            return this;
        }
        
        public Builder position(final Long position) {
            this.position = position;
            return this;
        }
        
        public Builder reason(final String reason) {
            this.reason = reason;
            return this;
        }
        
        public Builder referral_id(final String referral_id) {
            this.referral_id = referral_id;
            return this;
        }
        
        public Builder relative_position(final Long relative_position) {
            this.relative_position = relative_position;
            return this;
        }
        
        public void reset() {
            this.page_type = null;
            this.pane_name = null;
            this.position = null;
            this.success = null;
            this.count = null;
            this.retried = null;
            this.reason = null;
            this.setting_value = null;
            this.type = null;
            this.relative_position = null;
            this.referral_id = null;
            this.pane_section = null;
        }
        
        public Builder retried(final Boolean retried) {
            this.retried = retried;
            return this;
        }
        
        public Builder setting_value(final String setting_value) {
            this.setting_value = setting_value;
            return this;
        }
        
        public Builder success(final Boolean success) {
            this.success = success;
            return this;
        }
        
        public Builder type(final String type) {
            this.type = type;
            return this;
        }
    }
}
