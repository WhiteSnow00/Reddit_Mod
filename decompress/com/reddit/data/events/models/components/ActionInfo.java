// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class ActionInfo
{
    public static final a<ActionInfo, ActionInfo.ActionInfo$Builder> ADAPTER;
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
        ADAPTER = (a)new ActionInfo.ActionInfo$ActionInfoAdapter((ActionInfo$1)null);
    }
    
    private ActionInfo(final ActionInfo.ActionInfo$Builder actionInfo$Builder) {
        this.page_type = ActionInfo.ActionInfo$Builder.access$100(actionInfo$Builder);
        this.pane_name = ActionInfo.ActionInfo$Builder.access$200(actionInfo$Builder);
        this.position = ActionInfo.ActionInfo$Builder.access$300(actionInfo$Builder);
        this.success = ActionInfo.ActionInfo$Builder.access$400(actionInfo$Builder);
        this.count = ActionInfo.ActionInfo$Builder.access$500(actionInfo$Builder);
        this.retried = ActionInfo.ActionInfo$Builder.access$600(actionInfo$Builder);
        this.reason = ActionInfo.ActionInfo$Builder.access$700(actionInfo$Builder);
        this.setting_value = ActionInfo.ActionInfo$Builder.access$800(actionInfo$Builder);
        this.type = ActionInfo.ActionInfo$Builder.access$900(actionInfo$Builder);
        this.relative_position = ActionInfo.ActionInfo$Builder.access$1000(actionInfo$Builder);
        this.referral_id = ActionInfo.ActionInfo$Builder.access$1100(actionInfo$Builder);
        this.pane_section = ActionInfo.ActionInfo$Builder.access$1200(actionInfo$Builder);
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
        final StringBuilder r = a.r("ActionInfo{page_type=");
        r.append(this.page_type);
        r.append(", pane_name=");
        r.append(this.pane_name);
        r.append(", position=");
        r.append(this.position);
        r.append(", success=");
        r.append(this.success);
        r.append(", count=");
        r.append(this.count);
        r.append(", retried=");
        r.append(this.retried);
        r.append(", reason=");
        r.append(this.reason);
        r.append(", setting_value=");
        r.append(this.setting_value);
        r.append(", type=");
        r.append(this.type);
        r.append(", relative_position=");
        r.append(this.relative_position);
        r.append(", referral_id=");
        r.append(this.referral_id);
        r.append(", pane_section=");
        return a.o(r, this.pane_section, "}");
    }
    
    public void write(final e e) throws IOException {
        ActionInfo.ADAPTER.write(e, (Object)this);
    }
}
