// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import java.util.Collections;
import java.util.List;
import jt.a;

public final class AdGroup
{
    public static final a<AdGroup, AdGroup.AdGroup$Builder> ADAPTER;
    public final String bid_type;
    public final Long bid_value;
    public final String cap_type;
    public final String configured_status;
    public final Long daily_cap_value;
    public final List<String> devices;
    public final String effective_status;
    public final Long end_timestamp;
    public final Long frequency;
    public final List<String> frequeny_caps_json;
    public final String goal_type;
    public final Long goal_value;
    public final String id;
    public final Long lifetime_cap_value;
    public final Long max_recommended_bid;
    public final Long min_recommended_bid;
    public final String name;
    public final String placements;
    public final String priority;
    public final Long reach;
    public final Long recommended_bid;
    public final List<String> schedule_json;
    public final Long start_timestamp;
    public final String supported_views;
    public final Boolean use_default_frequency_cap;
    
    static {
        ADAPTER = (a)new AdGroup.AdGroup$AdGroupAdapter((AdGroup$1)null);
    }
    
    private AdGroup(final AdGroup.AdGroup$Builder adGroup$Builder) {
        this.id = AdGroup.AdGroup$Builder.access$100(adGroup$Builder);
        this.start_timestamp = AdGroup.AdGroup$Builder.access$200(adGroup$Builder);
        this.end_timestamp = AdGroup.AdGroup$Builder.access$300(adGroup$Builder);
        this.priority = AdGroup.AdGroup$Builder.access$400(adGroup$Builder);
        this.bid_type = AdGroup.AdGroup$Builder.access$500(adGroup$Builder);
        this.bid_value = AdGroup.AdGroup$Builder.access$600(adGroup$Builder);
        this.goal_type = AdGroup.AdGroup$Builder.access$700(adGroup$Builder);
        this.goal_value = AdGroup.AdGroup$Builder.access$800(adGroup$Builder);
        final List access$900 = AdGroup.AdGroup$Builder.access$900(adGroup$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$900 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)AdGroup.AdGroup$Builder.access$900(adGroup$Builder));
        }
        this.schedule_json = unmodifiableList;
        this.cap_type = AdGroup.AdGroup$Builder.access$1000(adGroup$Builder);
        this.lifetime_cap_value = AdGroup.AdGroup$Builder.access$1100(adGroup$Builder);
        this.daily_cap_value = AdGroup.AdGroup$Builder.access$1200(adGroup$Builder);
        List<String> unmodifiableList2;
        if (AdGroup.AdGroup$Builder.access$1300(adGroup$Builder) == null) {
            unmodifiableList2 = null;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)AdGroup.AdGroup$Builder.access$1300(adGroup$Builder));
        }
        this.frequeny_caps_json = unmodifiableList2;
        this.use_default_frequency_cap = AdGroup.AdGroup$Builder.access$1400(adGroup$Builder);
        this.configured_status = AdGroup.AdGroup$Builder.access$1500(adGroup$Builder);
        this.effective_status = AdGroup.AdGroup$Builder.access$1600(adGroup$Builder);
        this.name = AdGroup.AdGroup$Builder.access$1700(adGroup$Builder);
        this.recommended_bid = AdGroup.AdGroup$Builder.access$1800(adGroup$Builder);
        this.reach = AdGroup.AdGroup$Builder.access$1900(adGroup$Builder);
        this.frequency = AdGroup.AdGroup$Builder.access$2000(adGroup$Builder);
        this.min_recommended_bid = AdGroup.AdGroup$Builder.access$2100(adGroup$Builder);
        this.max_recommended_bid = AdGroup.AdGroup$Builder.access$2200(adGroup$Builder);
        List<String> unmodifiableList3;
        if (AdGroup.AdGroup$Builder.access$2300(adGroup$Builder) == null) {
            unmodifiableList3 = list;
        }
        else {
            unmodifiableList3 = Collections.unmodifiableList((List<? extends String>)AdGroup.AdGroup$Builder.access$2300(adGroup$Builder));
        }
        this.devices = unmodifiableList3;
        this.supported_views = AdGroup.AdGroup$Builder.access$2400(adGroup$Builder);
        this.placements = AdGroup.AdGroup$Builder.access$2500(adGroup$Builder);
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
        if (!(o instanceof AdGroup)) {
            return false;
        }
        final AdGroup adGroup = (AdGroup)o;
        final String id = this.id;
        final String id2 = adGroup.id;
        if (id == id2 || (id != null && id.equals(id2))) {
            final Long start_timestamp = this.start_timestamp;
            final Long start_timestamp2 = adGroup.start_timestamp;
            if (start_timestamp == start_timestamp2 || (start_timestamp != null && start_timestamp.equals(start_timestamp2))) {
                final Long end_timestamp = this.end_timestamp;
                final Long end_timestamp2 = adGroup.end_timestamp;
                if (end_timestamp == end_timestamp2 || (end_timestamp != null && end_timestamp.equals(end_timestamp2))) {
                    final String priority = this.priority;
                    final String priority2 = adGroup.priority;
                    if (priority == priority2 || (priority != null && priority.equals(priority2))) {
                        final String bid_type = this.bid_type;
                        final String bid_type2 = adGroup.bid_type;
                        if (bid_type == bid_type2 || (bid_type != null && bid_type.equals(bid_type2))) {
                            final Long bid_value = this.bid_value;
                            final Long bid_value2 = adGroup.bid_value;
                            if (bid_value == bid_value2 || (bid_value != null && bid_value.equals(bid_value2))) {
                                final String goal_type = this.goal_type;
                                final String goal_type2 = adGroup.goal_type;
                                if (goal_type == goal_type2 || (goal_type != null && goal_type.equals(goal_type2))) {
                                    final Long goal_value = this.goal_value;
                                    final Long goal_value2 = adGroup.goal_value;
                                    if (goal_value == goal_value2 || (goal_value != null && goal_value.equals(goal_value2))) {
                                        final List<String> schedule_json = this.schedule_json;
                                        final List<String> schedule_json2 = adGroup.schedule_json;
                                        if (schedule_json == schedule_json2 || (schedule_json != null && schedule_json.equals(schedule_json2))) {
                                            final String cap_type = this.cap_type;
                                            final String cap_type2 = adGroup.cap_type;
                                            if (cap_type == cap_type2 || (cap_type != null && cap_type.equals(cap_type2))) {
                                                final Long lifetime_cap_value = this.lifetime_cap_value;
                                                final Long lifetime_cap_value2 = adGroup.lifetime_cap_value;
                                                if (lifetime_cap_value == lifetime_cap_value2 || (lifetime_cap_value != null && lifetime_cap_value.equals(lifetime_cap_value2))) {
                                                    final Long daily_cap_value = this.daily_cap_value;
                                                    final Long daily_cap_value2 = adGroup.daily_cap_value;
                                                    if (daily_cap_value == daily_cap_value2 || (daily_cap_value != null && daily_cap_value.equals(daily_cap_value2))) {
                                                        final List<String> frequeny_caps_json = this.frequeny_caps_json;
                                                        final List<String> frequeny_caps_json2 = adGroup.frequeny_caps_json;
                                                        if (frequeny_caps_json == frequeny_caps_json2 || (frequeny_caps_json != null && frequeny_caps_json.equals(frequeny_caps_json2))) {
                                                            final Boolean use_default_frequency_cap = this.use_default_frequency_cap;
                                                            final Boolean use_default_frequency_cap2 = adGroup.use_default_frequency_cap;
                                                            if (use_default_frequency_cap == use_default_frequency_cap2 || (use_default_frequency_cap != null && use_default_frequency_cap.equals(use_default_frequency_cap2))) {
                                                                final String configured_status = this.configured_status;
                                                                final String configured_status2 = adGroup.configured_status;
                                                                if (configured_status == configured_status2 || (configured_status != null && configured_status.equals(configured_status2))) {
                                                                    final String effective_status = this.effective_status;
                                                                    final String effective_status2 = adGroup.effective_status;
                                                                    if (effective_status == effective_status2 || (effective_status != null && effective_status.equals(effective_status2))) {
                                                                        final String name = this.name;
                                                                        final String name2 = adGroup.name;
                                                                        if (name == name2 || (name != null && name.equals(name2))) {
                                                                            final Long recommended_bid = this.recommended_bid;
                                                                            final Long recommended_bid2 = adGroup.recommended_bid;
                                                                            if (recommended_bid == recommended_bid2 || (recommended_bid != null && recommended_bid.equals(recommended_bid2))) {
                                                                                final Long reach = this.reach;
                                                                                final Long reach2 = adGroup.reach;
                                                                                if (reach == reach2 || (reach != null && reach.equals(reach2))) {
                                                                                    final Long frequency = this.frequency;
                                                                                    final Long frequency2 = adGroup.frequency;
                                                                                    if (frequency == frequency2 || (frequency != null && frequency.equals(frequency2))) {
                                                                                        final Long min_recommended_bid = this.min_recommended_bid;
                                                                                        final Long min_recommended_bid2 = adGroup.min_recommended_bid;
                                                                                        if (min_recommended_bid == min_recommended_bid2 || (min_recommended_bid != null && min_recommended_bid.equals(min_recommended_bid2))) {
                                                                                            final Long max_recommended_bid = this.max_recommended_bid;
                                                                                            final Long max_recommended_bid2 = adGroup.max_recommended_bid;
                                                                                            if (max_recommended_bid == max_recommended_bid2 || (max_recommended_bid != null && max_recommended_bid.equals(max_recommended_bid2))) {
                                                                                                final List<String> devices = this.devices;
                                                                                                final List<String> devices2 = adGroup.devices;
                                                                                                if (devices == devices2 || (devices != null && devices.equals(devices2))) {
                                                                                                    final String supported_views = this.supported_views;
                                                                                                    final String supported_views2 = adGroup.supported_views;
                                                                                                    if (supported_views == supported_views2 || (supported_views != null && supported_views.equals(supported_views2))) {
                                                                                                        final String placements = this.placements;
                                                                                                        final String placements2 = adGroup.placements;
                                                                                                        boolean b2 = b;
                                                                                                        if (placements == placements2) {
                                                                                                            return b2;
                                                                                                        }
                                                                                                        if (placements != null && placements.equals(placements2)) {
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
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String id = this.id;
        int hashCode = 0;
        int hashCode2;
        if (id == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = id.hashCode();
        }
        final Long start_timestamp = this.start_timestamp;
        int hashCode3;
        if (start_timestamp == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = start_timestamp.hashCode();
        }
        final Long end_timestamp = this.end_timestamp;
        int hashCode4;
        if (end_timestamp == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = end_timestamp.hashCode();
        }
        final String priority = this.priority;
        int hashCode5;
        if (priority == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = priority.hashCode();
        }
        final String bid_type = this.bid_type;
        int hashCode6;
        if (bid_type == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = bid_type.hashCode();
        }
        final Long bid_value = this.bid_value;
        int hashCode7;
        if (bid_value == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = bid_value.hashCode();
        }
        final String goal_type = this.goal_type;
        int hashCode8;
        if (goal_type == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = goal_type.hashCode();
        }
        final Long goal_value = this.goal_value;
        int hashCode9;
        if (goal_value == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = goal_value.hashCode();
        }
        final List<String> schedule_json = this.schedule_json;
        int hashCode10;
        if (schedule_json == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = schedule_json.hashCode();
        }
        final String cap_type = this.cap_type;
        int hashCode11;
        if (cap_type == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = cap_type.hashCode();
        }
        final Long lifetime_cap_value = this.lifetime_cap_value;
        int hashCode12;
        if (lifetime_cap_value == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = lifetime_cap_value.hashCode();
        }
        final Long daily_cap_value = this.daily_cap_value;
        int hashCode13;
        if (daily_cap_value == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = daily_cap_value.hashCode();
        }
        final List<String> frequeny_caps_json = this.frequeny_caps_json;
        int hashCode14;
        if (frequeny_caps_json == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = frequeny_caps_json.hashCode();
        }
        final Boolean use_default_frequency_cap = this.use_default_frequency_cap;
        int hashCode15;
        if (use_default_frequency_cap == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = use_default_frequency_cap.hashCode();
        }
        final String configured_status = this.configured_status;
        int hashCode16;
        if (configured_status == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = configured_status.hashCode();
        }
        final String effective_status = this.effective_status;
        int hashCode17;
        if (effective_status == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = effective_status.hashCode();
        }
        final String name = this.name;
        int hashCode18;
        if (name == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = name.hashCode();
        }
        final Long recommended_bid = this.recommended_bid;
        int hashCode19;
        if (recommended_bid == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = recommended_bid.hashCode();
        }
        final Long reach = this.reach;
        int hashCode20;
        if (reach == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = reach.hashCode();
        }
        final Long frequency = this.frequency;
        int hashCode21;
        if (frequency == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = frequency.hashCode();
        }
        final Long min_recommended_bid = this.min_recommended_bid;
        int hashCode22;
        if (min_recommended_bid == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = min_recommended_bid.hashCode();
        }
        final Long max_recommended_bid = this.max_recommended_bid;
        int hashCode23;
        if (max_recommended_bid == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = max_recommended_bid.hashCode();
        }
        final List<String> devices = this.devices;
        int hashCode24;
        if (devices == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = devices.hashCode();
        }
        final String supported_views = this.supported_views;
        int hashCode25;
        if (supported_views == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = supported_views.hashCode();
        }
        final String placements = this.placements;
        if (placements != null) {
            hashCode = placements.hashCode();
        }
        return (((((((((((((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode15) * -2128831035 ^ hashCode16) * -2128831035 ^ hashCode17) * -2128831035 ^ hashCode18) * -2128831035 ^ hashCode19) * -2128831035 ^ hashCode20) * -2128831035 ^ hashCode21) * -2128831035 ^ hashCode22) * -2128831035 ^ hashCode23) * -2128831035 ^ hashCode24) * -2128831035 ^ hashCode25) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AdGroup{id=");
        k.append(this.id);
        k.append(", start_timestamp=");
        k.append(this.start_timestamp);
        k.append(", end_timestamp=");
        k.append(this.end_timestamp);
        k.append(", priority=");
        k.append(this.priority);
        k.append(", bid_type=");
        k.append(this.bid_type);
        k.append(", bid_value=");
        k.append(this.bid_value);
        k.append(", goal_type=");
        k.append(this.goal_type);
        k.append(", goal_value=");
        k.append(this.goal_value);
        k.append(", schedule_json=");
        k.append(this.schedule_json);
        k.append(", cap_type=");
        k.append(this.cap_type);
        k.append(", lifetime_cap_value=");
        k.append(this.lifetime_cap_value);
        k.append(", daily_cap_value=");
        k.append(this.daily_cap_value);
        k.append(", frequeny_caps_json=");
        k.append(this.frequeny_caps_json);
        k.append(", use_default_frequency_cap=");
        k.append(this.use_default_frequency_cap);
        k.append(", configured_status=");
        k.append(this.configured_status);
        k.append(", effective_status=");
        k.append(this.effective_status);
        k.append(", name=");
        k.append(this.name);
        k.append(", recommended_bid=");
        k.append(this.recommended_bid);
        k.append(", reach=");
        k.append(this.reach);
        k.append(", frequency=");
        k.append(this.frequency);
        k.append(", min_recommended_bid=");
        k.append(this.min_recommended_bid);
        k.append(", max_recommended_bid=");
        k.append(this.max_recommended_bid);
        k.append(", devices=");
        k.append(this.devices);
        k.append(", supported_views=");
        k.append(this.supported_views);
        k.append(", placements=");
        return b.j(k, this.placements, "}");
    }
    
    public void write(final e e) throws IOException {
        AdGroup.ADAPTER.write(e, (Object)this);
    }
}
